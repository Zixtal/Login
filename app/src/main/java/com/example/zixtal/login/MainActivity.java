package com.example.zixtal.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tv_nombre;
    private EditText tv_apellido;
    private EditText tv_matricula;
    private EditText tv_email;
    private EditText tv_contra;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_nombre=(EditText)findViewById(R.id.tb_nom);
        tv_apellido=(EditText)findViewById(R.id.tb_apll);
        tv_matricula=(EditText)findViewById(R.id.tb_matri);
        tv_email=(EditText)findViewById(R.id.tb_email);
        tv_contra=(EditText)findViewById(R.id.tb_pas);
        login=(Button)findViewById(R.id.boton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),com.example.zixtal.login.SegundaActividad.class);
                String nombre=tv_nombre.getText().toString();
                String apellido=tv_apellido.getText().toString();
                String matricula=tv_matricula.getText().toString();
                String email=tv_email.getText().toString();
                String  contra=tv_contra.getText().toString();

                i.putExtra("Nombre",nombre);
                i.putExtra("Apellido",apellido);
                i.putExtra("Matricula",matricula);
                i.putExtra("Email",email);
                i.putExtra("Contra",contra);

                System.out.println("prueba" + nombre + " " + apellido + " " + matricula + " " + email+" "+contra);
                startActivity(i);

            }
        });

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
