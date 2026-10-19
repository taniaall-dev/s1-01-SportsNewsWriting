public class Tennis extends News {
    public static final int PRICE_NEWS_TENNIS_PLAYER = 100;
    public static final int SCORE_NEWS_TENNIS_PLAYER = 3;
    private String competition;
    private String tennisPlayer;
    private int priceNews = 150;
    private int scoreNews = 4;

    public Tennis (String headline, String competition, String tennisPlayer){
        super(headline, "Tenis");
        this.competition = competition;
        this.tennisPlayer = tennisPlayer;
    }

    @Override
    public int calculatePriceNews() {
        if (tennisPlayer.equals("Federer") || tennisPlayer.equals("Nadal") || tennisPlayer.equals("Djokovic")){
            priceNews += PRICE_NEWS_TENNIS_PLAYER;
        }
        return priceNews;
    }

    @Override
    public int calculateScoreNews() {
        if (tennisPlayer.equals("Federer") || tennisPlayer.equals("Nadal") || tennisPlayer.equals("Djokovic")){
            scoreNews += SCORE_NEWS_TENNIS_PLAYER;
        }
        return scoreNews;
    }
}
