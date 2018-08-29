package com.example.mitch.foodish_design;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TrendingFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        for (int i = 0; i < 10; i++) {
//            TrendingFragment tf = new TrendingFragment();
//            getSupportFragmentManager().beginTransaction().add(R.id.trending_list, tf).commit();
//        }

        Intent intent = new Intent(this, DishActivity.class);
        startActivity(intent);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
