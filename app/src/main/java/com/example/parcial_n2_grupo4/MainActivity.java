package com.example.parcial_n2_grupo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Culebra> culebra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        culebra = new ArrayList<>();
        culebra.add(new Culebra("Víbora de Cascabel Pigmea", "Las Víboras de Cascabel Pigmeas tienen usualmente entre 15 y 23 pulgadas de largo, habitan en cerros de arena y planicies costeras. Se pueden encontrar diferentes especies en Carolina del Norte y sur, Georgia y Tennessee ",R.drawable.culebra1 ));
        culebra.add(new Culebra("Serpiente Cabeza de Cobre Americana", "Las serpientes Cabeza de Cobre Americanas crecen alrededor de 53 pulgadas de largo, la mordedura puede ser extremadamente dolorosa. Estas serpientes viven cerca de lugares muy boscosos a través del estado.",R.drawable.culebra2 ));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, culebra);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(myAdapter);
    }
}
