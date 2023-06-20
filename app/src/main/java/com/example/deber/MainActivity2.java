package com.example.deber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtmostrar=(TextView) findViewById(R.id.TxtVer);
        Bundle b=this.getIntent().getExtras();
        txtmostrar.setText("Bienvenido \n"+"Nombre: "
                +b.getString("Nombre")+"\n"+"Cedula: "
                +b.getString("Cedula")+"\n"+"Fecha de Nacimiento: "
                +b.getString("Fecha")+"\n"+"Cuidad: "
                +b.getString("Cuidad")+"\n"+"Correo: "
                +b.getString("Correo")+"\n"+"Telefono: "
                +b.getString("Telefono")+"\n"+"Genero: "
                +b.getString("Genero"));


    }
}