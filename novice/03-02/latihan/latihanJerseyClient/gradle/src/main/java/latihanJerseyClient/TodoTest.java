/**
 * dg. Ini adalah web service Jax rs client untuk mengakses Jax rx server
 * Terdapat untuk kategory media type : text/xml, application/xml dan application/json
 */

package latihanJerseyClient;
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;

public class TodoTest {
    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(getBaseURI());

        // Mendapatkan XML
        String xmlResponse = target.path("rest").path("todo").request().accept(MediaType.TEXT_XML).get(String.class);

        // Mendapatkan XML bagi aplikasi
        String xmlAppResponse =target.path("rest").path("todo").request().accept(MediaType.APPLICATION_XML).get(String.class);

        // dg. Latihan untuk mendapatkan JSON bagi aplikasi
        String jsonAppResponse =target.path("rest").path("todo").request().accept(MediaType.APPLICATION_JSON).get(String.class);

        // Untuk respon JSON juga tambahkan pustaka Jackson ke aplikasi web kita
        // Dalam hal ini kita juga mengubah registrasi client menjadi
        // ClientConfig config = new ClientConfig().register(JacksonFeature.class);
        // Dapatkan JSON bagi Aplikasi
        // System.out.println(target.path("rest").path("todo").request()
        // .accept(MediaType.APPLICATION_JSON).get(String.class));
        System.out.println(xmlResponse);
        System.out.println(xmlAppResponse);
        System.out.println(jsonAppResponse);
        }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/latihanJerseyJAXB").build();
    }
}