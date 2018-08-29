package com.example.mitch.foodish_design;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DishActivity extends AppCompatActivity implements DishReviewFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);

        Button b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DishActivity.this, AddDishActivity.class);
                startActivity(intent);
            }
        });

        for (int i = 0; i < 10; i++) {
            DishReviewFragment rf = new DishReviewFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.dish_review_layout, rf).commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
