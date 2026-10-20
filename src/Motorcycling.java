public class Motorcycling extends News {
    public static final int PRICE_NEWS_MOTOGPTEAM = 50;
    public static final int SCORE_NEWS_MOTOGPTEAM = 3;
    private String motoGpTeam;
    private int priceNews = 100;
    private int scoreNews = 4;

    public Motorcycling (String headline, String motoGpTeam){
        super(headline, "Motociclisme");
        this.motoGpTeam = motoGpTeam;
    }

    @Override
    public int calculatePriceNews() {
        if(motoGpTeam.equals("Honda") || motoGpTeam.equals("Yamaha")){
            priceNews += PRICE_NEWS_MOTOGPTEAM;
        }
        return priceNews;
    }

    @Override
    public int calculateScoreNews() {
        if(motoGpTeam.equals("Honda") || motoGpTeam.equals("Yamaha")){
            scoreNews += SCORE_NEWS_MOTOGPTEAM;
        }
        return scoreNews;
    }
}
