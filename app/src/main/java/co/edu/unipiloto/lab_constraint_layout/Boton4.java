package co.edu.unipiloto.lab_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.edu.unipiloto.laboratorio2.R;

public class Boton4 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton_cuatro);
    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, Correo.class);
        startActivity(intent);
    }
}
