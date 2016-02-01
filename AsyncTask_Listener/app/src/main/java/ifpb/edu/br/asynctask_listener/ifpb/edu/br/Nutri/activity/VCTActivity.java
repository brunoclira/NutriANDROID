package ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import ifpb.edu.br.asynctask_listener.R;
import ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.asynctask.ImcButtonAsyncTask;

/**
 * Created by Bruno on 01/02/2016.
 * Porém, preciso ajeitar pq copiei do outro de Imc
 */
public class VCTActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vct);

        Button asyncTaskButton = (Button) findViewById(R.id.ButtonCalcular);
        asyncTaskButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText pesoEditText = (EditText) findViewById(R.id.EditTextPeso);
                String peso = pesoEditText.getText().toString();
                EditText alturaEditText = (EditText) findViewById(R.id.EditTextAltura);
                String altura = alturaEditText.getText().toString();

                JSONObject json = new JSONObject();
                try {
                    json.put("peso", Float.parseFloat(peso));
                    json.put("altura", Float.parseFloat(altura));
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                VctButtonAsyncTask vctButtonAsyncTask = new VctButtonAsyncTask(v.getContext());

                vctAsyncTask.execute(json.toString());

            }
        });


    }

}
