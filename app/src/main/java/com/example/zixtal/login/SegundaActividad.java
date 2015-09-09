package com.example.zixtal.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Zixtal on 09/09/2015.
 */
public class SegundaActividad extends AppCompatActivity {

    private TextView nom;
    private TextView ape;
    private TextView mat;
    private TextView mail;
    private TextView pas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);

        nom=(TextView)findViewById(R.id.txt_nom);
        ape=(TextView)findViewById(R.id.txtapll);
        mat=(TextView)findViewById(R.id.txtmatri);
        mail=(TextView)findViewById(R.id.txtemail);
        pas=(TextView)findViewById(R.id.txtpas);

        Intent i =getIntent();
        Bundle bundle = i.getExtras();

        if(bundle != null){
            String name=(String)bundle.get("Nombre");
            String lastn=(String)bundle.get("Apellido");
            String  dni=(String)bundle.get("Matricula");
            String  correo=(String)bundle.get("Email");
            String  contras=(String)bundle.get("Contra");

            nom.setText(name);
            ape.setText(lastn);
            mat.setText(dni);
            mail.setText(correo);
            pas.setText(contras);


        }
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
