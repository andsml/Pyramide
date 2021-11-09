package com.example.pyramide;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pyramide.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //MainFragmentHC mainFragment=(MainFragmentHC)findViewById(R.id.list_fragment);

    }


/*
    protected void onStop(){

    }*/

}