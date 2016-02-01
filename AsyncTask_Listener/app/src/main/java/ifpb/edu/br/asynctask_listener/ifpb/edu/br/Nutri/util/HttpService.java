package ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.util;

/**
 * Created by Bruno on 01/02/2016.
 */

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpService {

    // IP da máquina onde se encontra o servidor.
    private static final String URL_CONTEXT = "http://ladoss.com.br:8443/nutrif/NutrIF_service/";

    public static HttpURLConnection sendPostRequest(String service, String method)
            throws MalformedURLException, IOException{

        HttpURLConnection connection = null;

        try {

            URL url = new URL(URL_CONTEXT + service);

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
            connection.connect();

        } catch (Exception e){
            System.out.println("HttpService: " + e.getMessage());
        }/*finally {
        }
            connection.disconnect();
        }*/

        return connection;
    }

    public void sendJsonPostRequest() {

    }

    public static String getHttpContent(HttpURLConnection connection) {

        StringBuilder builder = new StringBuilder();

        try {

            InputStream content = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    content, "iso-8859-1"), 8);

            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }

            content.close();

        } catch (IOException e) {

            Log.e("NotificationWearApp", "IOException: " + e);
        }

        return builder.toString();
    }
}
