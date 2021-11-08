package com.example.yrjatarea6jsontodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    TextView nombre, color, comida, numero;
    EditText Json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtNombre);
        color = findViewById(R.id.txtColor);
        comida = findViewById(R.id.txtComida);
        numero = findViewById(R.id.txtNumero);
        Json = findViewById(R.id.txtJson);
    }

    public void convertirClase(View v){
        Gson gson = new Gson();
        String cgson = Json.getText().toString();
        Datos datos = gson.fromJson(cgson,Datos.class);
        nombre.setText("Nombre: " + datos.getNombre());
        color.setText("Color favorito: " + datos.getColorFavorito());
        comida.setText("Comida favorita: " + datos.getComidaFavorita());
        numero.setText("Número favorito: " + datos.getNumFavorito());
    }
}