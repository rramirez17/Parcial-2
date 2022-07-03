package com.example.parcial_n2_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EspecieActivity extends AppCompatActivity {
    private TextView tvtitulo, tvdescripcion;
    private ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especie);

        tvtitulo = (TextView) findViewById(R.id.tvtitulo);
        tvdescripcion = (TextView) findViewById(R.id.tvdescripcion);
        imagen = (ImageView) findViewById(R.id.imagenCulebra);

        Intent intent = getIntent();
        String titulo = intent.getExtras().getString("Titulo");
        String descripcion = intent.getExtras().getString("Descripcion");
        String categoria = intent.getExtras().getString("Categoria");
        int image = intent.getExtras().getInt("Miniatura");

        tvtitulo.setText(titulo);
        tvdescripcion.setText(descripcion);
        imagen.setImageResource(image);

    }
}