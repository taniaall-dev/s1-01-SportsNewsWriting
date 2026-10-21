public class Motorcycling extends News {
    private static final int PRICE_NEWS_MOTOGPTEAM = 50;
    private static final int SCORE_NEWS_MOTOGPTEAM = 3;
    private String motoGpTeam;

    public Motorcycling (String headline, String motoGpTeam){
        super(headline, "Motociclisme");
        this.motoGpTeam = motoGpTeam;
    }

    @Override
    public int calculatePriceNews() {
        int priceNews = 100;
        if(motoGpTeam.equals("Honda") || motoGpTeam.equals("Yamaha")){
            priceNews += PRICE_NEWS_MOTOGPTEAM;
        }
        return priceNews;
    }

    @Override
    public int calculateScoreNews() {
        int scoreNews = 3;
        if(motoGpTeam.equals("Honda") || motoGpTeam.equals("Yamaha")){
            scoreNews += SCORE_NEWS_MOTOGPTEAM;
        }
        return scoreNews;
    }
}
