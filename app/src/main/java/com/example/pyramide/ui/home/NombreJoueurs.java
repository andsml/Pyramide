package com.example.pyramide.ui.home;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pyramide.R;

public class NombreJoueurs extends Fragment {

    private NombreJoueursViewModel mViewModel;

    public static NombreJoueurs newInstance() {
        return new NombreJoueurs();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.nombre_joueurs_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(NombreJoueursViewModel.class);
        // TODO: Use the ViewModel
    }
     /*private TextView message;
    private int nbClics = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre_joueurs);

        /*button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);

        message = findViewById(R.id.textMessage);
        newMessage();
    }


    public void onBoutonClic(View v) {
        nbClics++;
        newMessage();
    }

    private void newMessage() {
        message.setText(String.format("Vous êtes %d participants", nbClics));
    }
    public void buttonOnClick(View view)
    {
        switch(view.getId())
        {
            case R.id.button1:
                // Code for button 1 click
                break;

            case R.id.button2:
                // Code for button 2 click
                break;

            case R.id.button3:
                // Code for button 3 click
                break;
        }
    }*/
}