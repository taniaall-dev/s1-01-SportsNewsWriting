public class Football extends News {
    /// USAR CONSTANTES PARA EVITAR NUMEROS MÁGICOS
    public static final int PRICE_NEWS_COMPETITION_LIGA = 100;
    public static final int PRICE_NEWS_CLUB = 100;
    public static final int PRICE_NEWS_PLAYER = 50;
    public static final int SCORE_NEWS_COMPETITION_LIGA_CAMPEONES = 3;
    public static final int SCORE_NEWS_COMPETITION_LIGA = 2;
    public static final int SCORE_NEWS_CLUB_PLAYER = 1;
    private String competition;
    private String club;
    private String player;
    private int priceNews = 300;
    private int scoreNews = 5;

    public Football (String headline, String competition, String club, String player){
        super(headline, "Futbol");
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public int calculatePriceNews() {

        if (competition.equals("Liga de Campeones")){
            priceNews += PRICE_NEWS_COMPETITION_LIGA;
        }
        if((club.equals("Barça")) || (club.equals("Madrid"))){
            priceNews += PRICE_NEWS_CLUB;
        }
        if((player.equals("Ferran Torres")) || (player.equals("Benzema"))){
            priceNews += PRICE_NEWS_PLAYER;
        }
        return priceNews;
    }

    @Override
    public int calculateScoreNews() {

        if(competition.equals("Liga de Campeones")){
            scoreNews += SCORE_NEWS_COMPETITION_LIGA_CAMPEONES;
        }
        if(competition.equals("Liga")){
            scoreNews += SCORE_NEWS_COMPETITION_LIGA;
        }
        if(club.equals("Barça") || (club.equals("Madrid")) || (player.equals("Ferran Torres")) || (player.equals("Benzema"))){
            scoreNews += SCORE_NEWS_CLUB_PLAYER;
        }
        return scoreNews;
    }
}
