public class Tennis extends News {
    private static final int PRICE_NEWS_TENNIS_PLAYER = 100;
    private static final int SCORE_NEWS_TENNIS_PLAYER = 3;
    private String competition;
    private String tennisPlayer;

    public Tennis (String headline, String competition, String tennisPlayer){
        super(headline, "Tenis");
        this.competition = competition;
        this.tennisPlayer = tennisPlayer;
    }

    @Override
    public int calculatePriceNews() {
        int priceNews = 150;

        if (tennisPlayer.equals("Federer") || tennisPlayer.equals("Nadal") || tennisPlayer.equals("Djokovic")){
            priceNews += PRICE_NEWS_TENNIS_PLAYER;
        }
        return priceNews;
    }

    @Override
    public int calculateScoreNews() {
        int scoreNews = 4;

        if (tennisPlayer.equals("Federer") || tennisPlayer.equals("Nadal") || tennisPlayer.equals("Djokovic")){
            scoreNews += SCORE_NEWS_TENNIS_PLAYER;
        }
        return scoreNews;
    }
}
