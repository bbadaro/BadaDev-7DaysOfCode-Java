import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


public class imdb {

    public void Top250Movies(){
        
        String APIkey = "k_4921tp2a";
        String idioma = "pt";
        


        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://imdb-api.com/"+idioma+"/API/Top250Movies/"+APIkey))
        .build();

        client.sendAsync(request, BodyHandlers.ofString())
         .thenApply(HttpResponse::body)
         .thenAccept(s -> {
            System.out.println(s);
         })
         .join();

        
   
        

    }
    
    
}
