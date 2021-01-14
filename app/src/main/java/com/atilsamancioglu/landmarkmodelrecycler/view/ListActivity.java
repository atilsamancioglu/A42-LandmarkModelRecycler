package com.atilsamancioglu.landmarkmodelrecycler.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.atilsamancioglu.landmarkmodelrecycler.R;
import com.atilsamancioglu.landmarkmodelrecycler.adapter.RecyclerAdapterClass;
import com.atilsamancioglu.landmarkmodelrecycler.model.Landmark;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Landmark> modelList = new ArrayList<Landmark>();

        modelList.add(new Landmark("Eiffel", "France",R.drawable.eiffel));
        modelList.add(new Landmark("Colosseum", "Italy",R.drawable.colosseum));
        modelList.add(new Landmark("London Bridge", "United Kingdom",R.drawable.londonbridge));
        modelList.add(new Landmark("Pisa", "Italy",R.drawable.pisa));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerAdapterClass recyclerAdapterClass = new RecyclerAdapterClass(modelList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(recyclerAdapterClass);
        recyclerView.setLayoutManager(layoutManager);

    }
}