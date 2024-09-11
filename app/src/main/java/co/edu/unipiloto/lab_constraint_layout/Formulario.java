package co.edu.unipiloto.lab_constraint_layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import co.edu.unipiloto.laboratorio2.R;

public class Formulario extends AppCompatActivity {

    private EditText editTextNombreProyecto, editTextDescripcion, editTextResponsable, editTextPresupuesto;
    private Spinner spinnerLocalidad;
    private Button btnPublicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz_formulario);

        // Vincular los elementos de la interfaz con las variables
        editTextNombreProyecto = findViewById(R.id.proyecto_name);
        editTextDescripcion = findViewById(R.id.proyecto_descripcion);
        editTextResponsable = findViewById(R.id.proyecto_responsable);
        editTextPresupuesto = findViewById(R.id.proyecto_presupuesto);
        spinnerLocalidad = findViewById(R.id.localidad_spinner);
        btnPublicar = findViewById(R.id.botonPublicar);

        // Configurar la acción para el botón "Publicar"
        btnPublicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados por el usuario
                String nombreProyecto = editTextNombreProyecto.getText().toString();
                String descripcion = editTextDescripcion.getText().toString();
                String responsable = editTextResponsable.getText().toString();
                String presupuesto = editTextPresupuesto.getText().toString();
                String localidad = spinnerLocalidad.getSelectedItem().toString();

                // Validar que todos los campos estén completos
                if (nombreProyecto.isEmpty() || descripcion.isEmpty() || responsable.isEmpty() || presupuesto.isEmpty() || localidad.isEmpty()) {
                    Toast.makeText(Formulario.this, "Por favor, complete todos los campos.", Toast.LENGTH_SHORT).show();
                } else {
                    // Procesar los datos (puedes modificar esta parte para enviar los datos a un servidor o base de datos)
                    String mensaje = "Proyecto: " + nombreProyecto + "\n" +
                            "Descripción: " + descripcion + "\n" +
                            "Responsable: " + responsable + "\n" +
                            "Presupuesto: " + presupuesto + "\n" +
                            "Localidad: " + localidad;

                    // Mostrar un mensaje temporal con los datos ingresados
                    Toast.makeText(Formulario.this, "Proyecto publicado:\n" + mensaje, Toast.LENGTH_LONG).show();

                    // Aquí puedes añadir lógica para guardar los datos o enviarlos a un servidor
                }
            }
        });
    }
}

