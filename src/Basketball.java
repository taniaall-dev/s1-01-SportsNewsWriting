public class Basketball extends News {
    public static final int PRICE_NEWS_COMPETITION_EUROLIGA = 75;
    public static final int PRICE_NEWS_CLUB = 75;
    public static final int SCORE_NEWS_COMPETITION = 3;
    public static final int SCORE_NEWS_CLUB = 1;
    private String competition;
    private String club;
    private int priceNews = 250;
    private int scoreNews = 4;

    public Basketball(String headline, String competicion, String club){
        super(headline, "Bàsquet");
        this.competition = competicion;
        this.club = club;
    }
    @Override
    public int calculatePriceNews() {

        if (competition.equals("Euroliga")){
            priceNews += PRICE_NEWS_COMPETITION_EUROLIGA;
        }
        if((club.equals("Barça")) || (club.equals("Madrid"))){
            priceNews += PRICE_NEWS_CLUB;
        }
        return priceNews;
    }

    @Override
    public int calculateScoreNews() {

        if(competition.equals("Euroliga") || competition.equals("ABC")){
            scoreNews += SCORE_NEWS_COMPETITION;
        }
        if(club.equals("Barça") || club.equals("Madrid")){
            scoreNews += SCORE_NEWS_CLUB;
        }
        return scoreNews;
    }
}
