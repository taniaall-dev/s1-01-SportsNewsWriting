public class Basketball extends News {
    public static final int PRICE_NEWS_COMPETITION_EUROLIGA = 75;
    public static final int PRICE_NEWS_CLUB = 75;
    public static final int SCORE_NEWS_COMPETITION_EUROLIGA = 3;
    public static final int SCORE_NEWS_COMPETITION_ACB = 2;
    public static final int SCORE_NEWS_CLUB = 1;
    private String competition;
    private String club;

    public Basketball(String headline, String competicion, String club){
        super(headline, "Bàsquet");
        this.competition = competicion;
        this.club = club;
    }
    @Override
    public int calculatePriceNews() {
        int priceNews = 250;

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
        int scoreNews = 4;

        if(competition.equals("Euroliga")){
            scoreNews += SCORE_NEWS_COMPETITION_EUROLIGA;
        }
        if(competition.equals("ACB")){
            scoreNews += SCORE_NEWS_COMPETITION_ACB;
        }
        if(club.equals("Barça") || club.equals("Madrid")){
            scoreNews += SCORE_NEWS_CLUB;
        }
        return scoreNews;
    }
}
