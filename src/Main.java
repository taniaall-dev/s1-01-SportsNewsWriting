import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){

        EditorialOffice editorialOffice = new EditorialOffice();
        byte choseOption;

        while (true){
            System.out.println("\n1. Introduir redactor");
            System.out.println("2. Eliminar redactor");
            System.out.println("3. Introduir notícia a un redactor");
            System.out.println("4. Eliminar notícia");
            System.out.println("5. Mostrar totes les notícies d’un redactor");
            System.out.println("6. Calcular puntuació d’una notícia");
            System.out.println("7. Calcular preu d’una notícia");
            System.out.println("0. Sortir del menu");

            System.out.println("Escolliu l'opció numèrica que necessiteu del menú següent:");
            choseOption = scanner.nextByte();
            scanner.nextLine();

            switch (choseOption) {
                case 1:
                    addEditor(editorialOffice);
                    break;
                case 2:
                    deleteEditor(editorialOffice);
                    break;
                case 3:
                    addNews(editorialOffice);
                    break;
                case 4:
                    deleteNewsEditorHeadline(editorialOffice);
                    break;
                case 5:
                    showNewsEditor(editorialOffice);
                    break;
                case 6:
                    calculateNewsScore(editorialOffice);
                    break;
                case 7:
                    calculateNewsPrice(editorialOffice);
                    break;
                case 0:
                    System.out.println("Has escollit sortir. Fins aviat");
                    return;
                default:
                    System.out.println("Opció no valida");
            }
        }
    }
    public static void addEditor(EditorialOffice editorialOffice){
        System.out.println("Has escogido introducir redactor");
        System.out.println("Introduce el nombre: ");
        String name = scanner.nextLine();
        System.out.println("Introduce el DNI:");
        String  nationalId = scanner.nextLine();
        Editor editor1 = new Editor(name, nationalId);
        editorialOffice.addEditor(editor1);
        System.out.println("S'ha desat un editor");
    }
    public static void deleteEditor(EditorialOffice editorialOffice){
        System.out.println("Has triat eliminar redactor");
        editorialOffice.showEditor();
        System.out.println("Tria el redactor a eliminar: ");
        int numSelectedEditor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("S'eliminarà el redactor número: " + numSelectedEditor);
        editorialOffice.deleteEditor(numSelectedEditor);
        System.out.println("Redactor eliminado");
    }
    public static void addNews(EditorialOffice editorialOffice){
        String type;
        String headline;
        String text;
        String competition;
        String club;
        String player;
        String tennisPlayer;
        String f1team;
        String motoGpTeam;

        System.out.println("Has triat introduir una notícia");
        System.out.println("Introdueix el tipus de notícia: ");
        System.out.println(" - Futbol\n - Bàsquet\n - Tennis\n - F1\n - Motociclisme");
        type = scanner.nextLine();
        System.out.println("Has escogido: " + type);
        System.out.println("Escull el redactor que escriu la notícia: ");
        editorialOffice.showEditor();
        int numSelectedEditor = scanner.nextInt();
        scanner.nextLine();
        Editor selectedEditor = editorialOffice.getEditor(numSelectedEditor);

        System.out.println("Introdueix el titular: ");
        headline = scanner.nextLine();

        System.out.println("Introdueix el text: ");
        text = scanner.nextLine();

        News news = null;

        switch (type.toLowerCase()) {
            case "futbol":

                System.out.println("Introdueix la competició: ");
                competition = scanner.nextLine();

                System.out.println("Introdueix el club: ");
                club = scanner.nextLine();

                System.out.println("Introdueix el jugador: ");
                player = scanner.nextLine();

                news = new Football(headline, competition, club, player);
                selectedEditor.addNews(news);
                news.setText(text);

                break;
            case "bàsquet":

                System.out.println("Introduce la competición: ");
                competition = scanner.nextLine();

                System.out.println("Introduce el club: ");
                club = scanner.nextLine();

                news = new Basketball(headline, competition, club);
                selectedEditor.addNews(news);
                news.setText(text);

                break;

            case "tennis":
                System.out.println("Introduce la competición: ");
                competition = scanner.nextLine();

                System.out.println("Introduce el tenista: ");
                tennisPlayer = scanner.nextLine();

                news = new Tennis(headline, competition, tennisPlayer);
                selectedEditor.addNews(news);
                news.setText(text);

                break;

            case "motociclisme":
                System.out.println("Introduce el equipo: ");
                motoGpTeam = scanner.nextLine();

                news = new Motorcycling(headline, motoGpTeam);
                selectedEditor.addNews(news);
                news.setText(text);
                break;

            case "f1":
                System.out.println("Introduce escuderia: ");
                f1team = scanner.nextLine();

                news = new F1(headline, f1team);
                selectedEditor.addNews(news);
                news.setText(text);
                break;

            default:
                System.out.println("El tipus de notícia no existeix");
        }
        if (news != null) {
            System.out.println("La notícia s'ha guardat correctament");
        }
    }
    public static void deleteNewsEditorHeadline(EditorialOffice editorialOffice){
        Editor selectedEditor;
        System.out.println("Has escogido eliminar noticia");
        editorialOffice.showEditor();
        System.out.println("Introdueix el número de qui va redactar la notícia que vols eliminar: ");
        int numSelectedEditor = scanner.nextInt();
        scanner.nextLine();
        selectedEditor = editorialOffice.getEditor(numSelectedEditor);
        selectedEditor.showNews();
        System.out.println("Introdueix el número de la notícia a eliminar: ");
        int numSelectedNews = scanner.nextInt();
        scanner.nextLine();
        selectedEditor.deleteNews(numSelectedNews);
        System.out.println("S'ha eliminat la notícia");
    }
    public static void showNewsEditor(EditorialOffice editorialOffice){
        Editor selectedEditor;
        System.out.println("Heu escollit mostrar totes les notícies d'un redactor");
        editorialOffice.showEditor();
        System.out.println("Introduce el número del redactor para mostrar todas las noticias");
        int numSelectedEditor = scanner.nextInt();
        scanner.nextLine();
        selectedEditor = editorialOffice.getEditor(numSelectedEditor);
        selectedEditor.showNews();
        System.out.println("S'han mostrat les notícies del redactor");
    }
    public static void calculateNewsScore(EditorialOffice editorialOffice){
        System.out.println("Has escogido calcular la puntuación de la noticia");
        ArrayList<News> allNews = editorialOffice.getNewsAllEditors();
        for(int i = 0; i < allNews.size(); i++){
            System.out.println(i + " - " + allNews.get(i).getHeadline());
        }
        System.out.println("Introduce el número de la noticia a la que quieres calcular la puntuación:");
        int selectedNews = scanner.nextInt();
        scanner.nextLine();
        News noticia = allNews.get(selectedNews);
        int calculatedScore = noticia.calculateScoreNews();
        System.out.println("La puntuación de la noticia es: " + calculatedScore);

    }
    public static void calculateNewsPrice(EditorialOffice editorialOffice){
        System.out.println("Has escogido calcular el precio de la noticia");
        ArrayList<News> allNews = editorialOffice.getNewsAllEditors();
        for(int i = 0; i < allNews.size(); i++){
            System.out.println(i + " - " + allNews.get(i).getHeadline());
        }
        System.out.println("Introduce el número de la noticia a la que quieres calcular el precio:");
        int selectedNews = scanner.nextInt();
        scanner.nextLine();
        News news = allNews.get(selectedNews);
        int newsPrice = news.calculatePriceNews();
        System.out.println("El precio de la noticia es: " + newsPrice);
    }

}
