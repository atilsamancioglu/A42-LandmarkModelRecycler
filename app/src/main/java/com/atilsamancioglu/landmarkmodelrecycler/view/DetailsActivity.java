package com.atilsamancioglu.landmarkmodelrecycler.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.atilsamancioglu.landmarkmodelrecycler.R;
import com.atilsamancioglu.landmarkmodelrecycler.model.Landmark;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.imageView);
        TextView nameText = findViewById(R.id.nameText);
        TextView countryText = findViewById(R.id.countryText);

        Intent intent = getIntent();
        Landmark landmark = (Landmark) intent.getSerializableExtra("landmark");

        imageView.setImageResource(landmark.drawableId);
        nameText.setText(landmark.name);
        countryText.setText(landmark.country);

    }
}