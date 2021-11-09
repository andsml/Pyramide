package com.example.pyramide.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.pyramide.NombreJoueurs;
import com.example.pyramide.R;
import com.example.pyramide.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private Button NouvPartie;
    //public Intent(MainActivity, NombreJoueurs);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

   /* Intent NombreJoueursIntent = new Intent().setClass(HomeFragment,NombreJoueurs.class);

    NouvPartie = (Button) findViewById(R.id.button);
    NouvPartie.setOnClickListener(new View.OnClickListener());

        @Override
        public void onClick(View v) {
            startActivity(NombreJoueursIntent);
        }  */

    }

    /*public void startActivity(Intent intent){ //pour démarer une activity

        NombreJoueurs;
    }*/


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}