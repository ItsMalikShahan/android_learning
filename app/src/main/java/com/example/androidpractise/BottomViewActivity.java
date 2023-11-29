package com.example.androidpractise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomViewActivity extends AppCompatActivity {

    BottomNavigationView bottomViewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_view);
        bottomViewActivity = findViewById(R.id.bnv_bottomActivity);
        bottomViewActivity.setOnNavigationItemSelectedListener(newListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener newListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.i_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.i_favorite:
                            selectedFragment = new FavoriteFragment();
                            break;
                        case R.id.i_search:
                            selectedFragment = new SearchFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment)
                            .commit();
                    return true;
                }

            };
}