package co.edu.unipiloto.lab_constraint_layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import co.edu.unipiloto.laboratorio2.R;

public class Boton2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton_dos);
    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, Boton3.class);
        startActivity(intent);
    }

}
