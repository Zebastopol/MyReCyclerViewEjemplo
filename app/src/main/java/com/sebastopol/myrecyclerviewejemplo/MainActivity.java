package com.sebastopol.myrecyclerviewejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Personaje> listDatos = new ArrayList<>();
    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //AQÍ DEBEN SER AGREGADOS LOS ELEMENTOS DE LA LISTA PENDIENTES POR AGREGAR
        listDatos.add(new Personaje(R.drawable.uno,"Fruta 1", "Fruta linda 1 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.dos,"Fruta 2", "Fruta linda 2 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.tres,"Fruta 3", "Fruta linda 3 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.cuatro,"Fruta 4", "Fruta linda 4 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.cinco,"Fruta 5", "Fruta linda 5 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.seis,"Fruta 6", "Fruta linda 6 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.siete,"Fruta 7", "Fruta linda 7 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.ocho,"Fruta 8", "Fruta linda 8 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.uno,"Fruta 1", "Fruta linda 1 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.dos,"Fruta 2", "Fruta linda 2 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.tres,"Fruta 3", "Fruta linda 3 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.cuatro,"Fruta 4", "Fruta linda 4 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.cinco,"Fruta 5", "Fruta linda 5 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.seis,"Fruta 6", "Fruta linda 6 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.siete,"Fruta 7", "Fruta linda 7 - me gusta la fruta"));
        listDatos.add(new Personaje(R.drawable.ocho,"Fruta 8", "Fruta linda 8 - me gusta la fruta"));

        AdaptadordeDatos adaptadordeDatos = new AdaptadordeDatos(listDatos, this);
        myRecyclerView.setAdapter(adaptadordeDatos);
    }
}