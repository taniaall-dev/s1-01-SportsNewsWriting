import java.util.ArrayList;

public class EditorialOffice {
   ArrayList<Editor> editors = new ArrayList<>();

   public Editor getEditor (int numEditor){
       return editors.get(numEditor);
   }

    // añadir redactor
    public void addEditor(Editor editor){
       editors.add(editor);
    }

    public void showEditor(){
       for(int i = 0; i < editors.size(); i++){
           System.out.println(i + " - " + editors.get(i).getName());
       }
    }

    public void deleteEditor(int deleteEditor){
       editors.remove(deleteEditor);
    }

    public ArrayList<News> getNewsAllEditors(){
        ArrayList<News> news = new ArrayList<>();
        for(int i = 0; i < editors.size(); i++){
            ArrayList <News> editorNews = editors.get(i).getNews();
            for(int j = 0; j < editorNews.size(); j++){
                news.add(editorNews.get(j));
            }
        }
        return news;
    }

}
