package ifpb.edu.br.asynctask_listener.ifpb.edu.br.Nutri.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import ifpb.edu.br.asynctask_listener.R;

public class MainActivity extends AppCompatActivity {

    TextView botaotelaIMC;
    TextView botaotelaVCT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mudar a página para a do IMC
        botaotelaIMC = (TextView) findViewById(R.id.TextViewIMC);
        botaotelaIMC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent telaIMC = new Intent(MainActivity.this, IMCActivity.class);
                startActivity(telaIMC);
                //finish();
            }

        });

        //Mudar a página para a do VCT
        botaotelaVCT = (TextView) findViewById(R.id.TextViewVCT);
        botaotelaVCT.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent telaVCT= new Intent(MainActivity.this, VCTActivity.class);
                startActivity(telaVCT);
            }

        });

        /*Button statusButton = (Button) findViewById(R.id.ButtonCalcular);
        statusButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("MainActivity", "Clique no botão da AsyncTask");

                ServerButtonAsyncTask serverButtonAsyncTask =
                        new ServerButtonAsyncTask(v.getContext());

                serverButtonAsyncTask.execute();

            }
        });*/


        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
