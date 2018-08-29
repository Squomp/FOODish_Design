package com.example.mitch.foodish_design;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DishActivity extends AppCompatActivity implements DishReviewFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);

        for (int i = 0; i < 10; i++) {
            DishReviewFragment rf = new DishReviewFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.dish_review_layout, rf).commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
