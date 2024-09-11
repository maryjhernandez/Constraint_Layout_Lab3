package co.edu.unipiloto.lab_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.edu.unipiloto.laboratorio2.R;

public class Boton3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton_tres);
    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, Boton4.class);
        startActivity(intent);
    }

}
