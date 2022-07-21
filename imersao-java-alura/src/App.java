import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

     var connections = new AppConnections();
     var styles = new Styles();
     var parser = new JsonParser();
     var scanner = new Scanner(System.in);
    
        String body = connections.getMovies();

    List<Map<String, String>> listaDeFilmes = parser.parse(body);

        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println( styles.GREEN + "Titulo: " + filme.get("title") + styles.RESET);
            System.out.println("Url da capa: " + filme.get("image"));
            System.out.println( styles.RED +"Nota do IMDB: " + filme.get("imDbRating")+ styles.RESET);
            System.out.println("Dê a sua nota: ");
            double rating =  scanner.nextDouble();
        }
            

    }
}
