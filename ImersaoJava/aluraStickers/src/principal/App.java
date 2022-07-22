/**
 * 
 */
package principal;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

import entidade.GeradoraDeFigurinhas;
import entidade.JsonParser;


/**
 * @author tatianirodrigues
 *
 */
public class App{

	public static void main(String[] args) throws Exception {

		String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
		URI endereco = URI.create(url);
		var client = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();

		
		var parser = new JsonParser();
		List<Map<String, String>> listaDeFilmes = parser.parse(body);

	
		var geradora = new GeradoraDeFigurinhas();
		for (Map<String,String> filme : listaDeFilmes) {

			String urlImagem = filme.get("image");
			String titulo = filme.get("title");

			InputStream inputStream = new URL(urlImagem).openStream();
			String nomeArquivo = titulo + ".png";

			geradora.cria(inputStream, nomeArquivo);

			System.out.println(titulo);
			System.out.println();
		}
	}
}
