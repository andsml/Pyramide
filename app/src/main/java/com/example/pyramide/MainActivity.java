package com.example.pyramide;

import android.os.Bundle;
import com.example.pyramide.ui.home.HomeFragment;

import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements HomeFragment.OnButtonClickedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClicked(View view){
        Log.e(getClass().getSimpleName(),"Button clicked !");
    }

}