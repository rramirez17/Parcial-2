package com.example.parcial_n2_grupo4;

/*  Parcial 2
 *   Integrantes:    Raúl Ramírez
 *                   Angela Pellecchia
 *                   Holger González
 *                   Gaspar González
 *                   David Camarena
 *   Grupo 1SF142
 *
 * */

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout f1;

    List<Culebra> culebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = findViewById(R.id.fondo);

        Timer tiempo = new Timer();
        MyTimer mitiempo = new MyTimer();
        tiempo.schedule(mitiempo, 4000, 4000);

        culebra = new ArrayList<>();
        culebra.add(new Culebra("Víbora de Cascabel Pigmea", "Las Víboras de Cascabel Pigmeas tienen usualmente entre 15 y 23 pulgadas de largo, habitan en cerros de arena y planicies costeras. Se pueden encontrar diferentes especies en Carolina del Norte y sur, Georgia y Tennessee ", R.drawable.culebra1));
        culebra.add(new Culebra("Serpiente Cabeza de Cobre Americana", "Las serpientes Cabeza de Cobre Americanas crecen alrededor de 53 pulgadas de largo, la mordedura puede ser extremadamente dolorosa. Estas serpientes viven cerca de lugares muy boscosos a través del estado.", R.drawable.culebra2));
        culebra.add(new Culebra("Crotalus cerastes laterorepens", "Crotalus cerastes es una víbora que alcanza los 500 a 800 mm de longitud total. Su característica más distintiva son las supraoculares en forma de cuernos, puntiagudas y hacia arriba, que les dan el nombre de \"cornudas.\" ", R.drawable.cascabel));
        culebra.add(new Culebra("Eunectes murinus", "La especie de anaconda más grande del mundo es la anaconda verde o Eunectes murinus. Habita en Sudamérica y su tamaño puede rondar los cuatro metros de largo, pero se han encontrado algunos ejemplares que superan esta medida.", R.drawable.anaconda_verde));
        culebra.add(new Culebra("Cascabel muda", "A diferencia de la serpiente cascabel, la serpiente cascabel muda solo se puede encontrar en Centroamérica y Sudamérica. Es bastante peligrosa no solo por su tamaño, sino también por su letal veneno. Su tamaño puede alcanzar un máximo de cuatro metros, pero normalmente ronda los dos.", R.drawable.cascabel_muda));
        culebra.add(new Culebra("Boa constrictor", "Es una de las serpientes más conocidas, originaria del continente americano. Su tamaño es realmente impresionante, puede alcanzar hasta los cinco metros de largo en la edad adulta, una de las serpientes más grandes del mundo.", R.drawable.boa_constrictor));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, culebra);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(myAdapter);
    }

    private class MyTimer extends TimerTask {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Random random = new Random();
                    int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    f1.setBackgroundColor(color);
                }
            });
        }
    }
}
