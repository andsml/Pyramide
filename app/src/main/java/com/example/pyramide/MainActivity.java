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

    private ActivityMainBinding binding;
    private Button NouvPartie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NouvPartie=(Button)findViewById(R.id.button);
      /*  NouvPartie.setOnClickListener(new View.OnClickListener());
        NouvPartie.setOnClickListener(this);*/

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(binding.navView, navController);
    }

 /*   public Intent(MainActivity, NombreJoueurs );

        @Override
        public void onClick(View v) {
            Intent NombreJoeursIntent = new Intent(MainActivity.this, NombreJoueurs.class);
            startActivity(NombreJoeursIntent);
        }

    public void startActivity(Intent intent){ //pour démarer une activity

    }*/
}