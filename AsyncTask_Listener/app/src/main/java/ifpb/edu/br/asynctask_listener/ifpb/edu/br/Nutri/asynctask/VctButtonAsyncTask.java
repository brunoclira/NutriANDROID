package ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.util.HttpService;
import ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.util.Response;

/**
 * Created by Bruno on 01/02/2016.
 * Porém, preciso ajeitar pq copiei do outro de Imc
 */

public class VctButtonAsyncTask extends AsyncTask<String, Void, Response> {

    Context context;

    public ImcButtonAsyncTask(Context context) {
        // TODO Auto-generated constructor stub
        this.context = context;
    }

    @Override
    protected void onPreExecute(){
        Log.i("LoginAsyncTask: ", "onPreExecute");

    }

    @Override
    protected Response doInBackground(String... params) {

        HttpURLConnection connection = null;
        Response response;
        int statusCodeHttp = 0;
        String contentValue = null;

        try {
            connection = HttpService.sendPostRequest("calcularIMC", "POST");
            contentValue = HttpService.getHttpContent(connection);
            statusCodeHttp = connection.getResponseCode();
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        response = new Response(statusCodeHttp, contentValue);

        Log.i("LoginAsyncTask: ", "doInBackGround");

        return response;
    }

    @Override
    protected void onPostExecute(Response response){
        Log.i("LoginAsyncTask: ", "onPostExecute");

        try {
            JSONObject json = new JSONObject(response.getContentValue());
            String imc = json.getString("valor");
            Toast.makeText(context, imc, Toast.LENGTH_LONG).show();

        } catch (JSONException e) {
            Log.e("LoginAsyncTask", "JSONException: " + e.getMessage());
        }
    }

}

