package com.example.deber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void BtnEnviar (View view){
    EditText txcel =(EditText) findViewById(R.id.TxtCedula);
    EditText txtnom =(EditText) findViewById(R.id.TxtNombre);
    EditText txfec =(EditText) findViewById(R.id.TxtFecha);
    EditText txcui =(EditText) findViewById(R.id.TxtCuidad);
    EditText txtemail =(EditText) findViewById(R.id.TxtEmail);
    EditText txtef =(EditText) findViewById(R.id.TxtTelf);
    RadioButton rbMac =(RadioButton) findViewById(R.id.RbMasc);
    String Cel = txcel.getText().toString();
    String Nom = txtnom.getText().toString();
    String Fec = txfec.getText().toString();
    String Cui = txcui.getText().toString();
    String Email = txtemail.getText().toString();
    String Telf= txtef.getText().toString();
    String Genero =rbMac.isChecked()?"Masculino":"Femenino";
    RadioGroup RTG= (RadioGroup) findViewById(R.id.GrpGenero);
    if (Cel.isEmpty()){
        txcel.setError("Este campo no puede estar vacio");
    }
    else if (Nom.isEmpty()){
        txtnom.setError("Este campo no puede estar vacio");
    }
    else if (Fec.isEmpty()){
        txfec.setError("Este campo no puede estar vacio");
    }
    else if (Cui.isEmpty()){
        txcui.setError("Este campo no puede estar vacio");
    }
    else if (Email.isEmpty()){
        txtemail.setError("Este campo no puede estar vacio");
    }
    else if (Telf.isEmpty()){
        txtef.setError("Este campo no puede estar vacio");
    }
    else if (Nom.isEmpty()){
        txtnom.setError("Este campo no puede estar vacio");
    }
    else if (RTG.getCheckedRadioButtonId()==-1){
        Toast.makeText(this, "Este campo no puede estar vacio", Toast.LENGTH_SHORT).show();
    }
    else{
    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
    Bundle b = new Bundle();
    b.putString("Cedula",Cel);
    b.putString("Nombre",Nom);
    b.putString("Fecha",Fec);
    b.putString("Cuidad",Cui);
    b.putString("Correo",Email);
    b.putString("Telefono",Telf);
    b.putString("Genero",Genero);
    intent.putExtras(b);
    startActivity(intent);}
}
public void BtnLimpiar (View view){
    EditText txcel =(EditText) findViewById(R.id.TxtCedula);
    EditText txtnom =(EditText) findViewById(R.id.TxtNombre);
    EditText txfec =(EditText) findViewById(R.id.TxtFecha);
    EditText txcui =(EditText) findViewById(R.id.TxtCuidad);
    EditText txtemail =(EditText) findViewById(R.id.TxtEmail);
    EditText txtef =(EditText) findViewById(R.id.TxtTelf);
    RadioGroup RTG= (RadioGroup) findViewById(R.id.GrpGenero);
    txcel.setText("");
    txtnom.setText("");
    txfec.setText("");
    txcui.setText("");
    txtemail.setText("");
    txtef.setText("");
    RTG.clearCheck();


}

}