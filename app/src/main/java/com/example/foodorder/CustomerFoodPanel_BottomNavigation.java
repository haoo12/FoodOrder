package com.example.foodorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodorder.customerFoodPanel.CustomerCartFragment;
import com.example.foodorder.customerFoodPanel.CustomerHomeFragment;
import com.example.foodorder.customerFoodPanel.CustomerOrdersFragment;
import com.example.foodorder.customerFoodPanel.CustomerProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

//public class CustomerFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_customer_foof_panel_bottom_navigation);
//        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
//        navigationView.setOnNavigationItemSelectedListener(this);
//        String name = getIntent().getStringExtra("PAGE");
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        if (name != null) {
//            if (name.equalsIgnoreCase("HOMEPAGE")) {
//                loadfragment(new CustomerHomeFragment());
//            } else if (name.equalsIgnoreCase("PREPARINGPAGE")) {
//                loadfragment(new CustomerTrackFragment());
//            } else if (name.equalsIgnoreCase("DELIVERYORDERPAGE")) {
//                loadfragment(new CustomerTrackFragment());
//            }else if (name.equalsIgnoreCase("Thankyoupage")) {
//                loadfragment(new CustomerHomeFragment());
//            }
//        }else {
//            loadfragment(new CustomerHomeFragment());
//        }
//    }
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//        Fragment fragment = null;
//        if (item.getItemId() == R.id.cust_Home) {
//            fragment = new CustomerHomeFragment();
//        }
//        if (item.getItemId() == R.id.cart) {
//            fragment = new CustomerCartFragment();
//        }
//        if (item.getItemId() == R.id.cust_profile) {
//            fragment = new CustomerProfileFragment();
//        }
//        if (item.getItemId() == R.id.Cust_order) {
//            fragment = new CustomerOrdersFragment();
//        }
//        if (item.getItemId() == R.id.cart) {
//            fragment = new CustomerCartFragment();
//        }
//        return loadfragment(fragment);
//
//    }
//
//    private boolean loadfragment(Fragment fragment) {
//
//        if(fragment != null){
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
//            return true;
//        }
//        return false;
//    }
//}
public class CustomerFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel_bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        if (item.getItemId() == R.id.cust_Home) {
            fragment = new CustomerHomeFragment();
        }
        if (item.getItemId() == R.id.cart) {
            fragment = new CustomerCartFragment();
        }
        if (item.getItemId() == R.id.cust_profile) {
            fragment = new CustomerProfileFragment();
        }
        if (item.getItemId() == R.id.Cust_order) {
            fragment = new CustomerOrdersFragment();
        }
        if (item.getItemId() == R.id.cart) {
            fragment = new CustomerCartFragment();
        }
        return loadcheffragment(fragment);

    }

    private boolean loadcheffragment(Fragment fragment) {

        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }
}