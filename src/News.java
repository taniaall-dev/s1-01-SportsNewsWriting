public abstract class News {
    private String headline;
    private String text;
    private int score;
    private int price;
    private String type;
    private Editor editor;

    public News(String headline, String type){
        this.headline = headline;
        this.text = "";
        this.type = type;
    }

    public String getHeadline() {
        return headline;
    }
    public void setText(String text) {
        this.text = text;
    }

    public abstract int calculatePriceNews();
    public abstract int calculateScoreNews();


}
