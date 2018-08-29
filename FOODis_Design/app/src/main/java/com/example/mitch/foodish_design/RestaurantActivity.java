package com.example.mitch.foodish_design;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RestaurantActivity extends AppCompatActivity implements ReviewFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        for (int i = 0; i < 10; i++) {
            ReviewFragment rf = new ReviewFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.review_list, rf).commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void shareRestauratnClicked(View view) {
        Intent intent = new Intent(this, AddDishActivity.class);
        startActivity(intent);
    }
}
