package com.example.foodorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodorder.chefFoodPanel.ChefHomeFragment;
import com.example.foodorder.chefFoodPanel.ChefOrderFragment;
import com.example.foodorder.chefFoodPanel.ChefPendingOrderFragment;
import com.example.foodorder.chefFoodPanel.ChefProfileFragment;
import com.example.foodorder.customerFoodPanel.CustomerHomeFragment;
import com.example.foodorder.customerFoodPanel.CustomerTrackFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ChefFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_food_panel_bottom_navigation);
        Toolbar toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        BottomNavigationView navigationView = findViewById(R.id.chef_bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
        String name = getIntent().getStringExtra("PAGE");
        if (name != null) {
            if (name.equalsIgnoreCase("ORDERPAGE")) {
                loadcheffragment(new ChefPendingOrderFragment());
            } else if (name.equalsIgnoreCase("CONFIRMPAGE")) {
                loadcheffragment(new ChefOrderFragment());
            } else if (name.equalsIgnoreCase("ACCEPTORDERPAGE")) {
                loadcheffragment(new ChefOrderFragment());
            }else if (name.equalsIgnoreCase("DELIVEREDPAGE")) {
                loadcheffragment(new ChefOrderFragment());
            }
        }else {
            loadcheffragment(new CustomerHomeFragment());
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.chefHome) {
            fragment = new ChefHomeFragment();
        } else if (itemId == R.id.PendingOrders) {
            fragment = new ChefPendingOrderFragment();
        } else if (itemId == R.id.Orders) {
            fragment = new ChefOrderFragment();
        } else if (itemId == R.id.chefProfile) {
            fragment = new ChefProfileFragment();
        }
        return loadcheffragment(fragment);
    }

    private boolean loadcheffragment(Fragment fragment) {

        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();
            return true;
        }
        return false;
    }
}