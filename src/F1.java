public class F1 extends News {
    public static final int PRICE_NEWS_F1TEAM = 50;
    public static final int SCORE_NEWS_F1TEAM = 2;
    private String f1team;

    public F1 (String headline, String f1team){
        super(headline, "F1");
        this.f1team = f1team;
    }

    @Override
    public int calculatePriceNews() {
        int priceNews = 100;

        if (f1team.equals("Ferrari") || f1team.equals("Mercedes")){
            priceNews += PRICE_NEWS_F1TEAM;
        }
        return priceNews;
    }

    @Override
    public int calculateScoreNews() {
        int scoreNews = 4;

        if (f1team.equals("Ferrari") || f1team.equals("Mercedes")){
            scoreNews += SCORE_NEWS_F1TEAM;
        }
        return scoreNews;
    }
}
