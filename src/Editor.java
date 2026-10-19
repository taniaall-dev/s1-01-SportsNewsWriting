import java.util.ArrayList;

public class Editor {
    private String name;
    private String nationalId;
    private static int salary = 1500;
    ArrayList<News> news = new ArrayList<>();

    public Editor(String name, String nationalId){
        this.name = name;
        this.nationalId = nationalId;
    }

    public void addNews(News news){
        this.news.add(news);
    }

    public void deleteNews(int newsPosition){
        news.remove(newsPosition);
    }

    public void showNews(int newsPosition){
        for(int i = 0; i < news.size(); i++){
            System.out.println(i + " - " + news.get(i).getHeadline());
        }
    }

    public ArrayList<News> getNews() {
        return news;
    }

    public String getName(){
        return name;
    }

    public static int getSalary(){
        return salary;
    }

    public static void setSalary(int salary){
        Editor.salary = salary;
    }
}
