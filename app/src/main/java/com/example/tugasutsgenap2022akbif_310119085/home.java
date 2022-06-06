package com.example.tugasutsgenap2022akbif_310119085;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.example.tugasutsgenap2022akbif_310119085.ui.List.ListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasutsgenap2022akbif_310119085.databinding.ActivityHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class home extends AppCompatActivity {


private ActivityHomeBinding binding;

    RecyclerView recyclerView;
    FloatingActionButton tambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityHomeBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());
     getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.mocha)));
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_profile, R.id.navigation_list, R.id.navigation_app_info)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_home);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


    }

}