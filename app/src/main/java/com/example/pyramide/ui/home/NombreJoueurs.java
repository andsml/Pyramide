package com.example.pyramide.ui.home;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.pyramide.R;


public class NombreJoueurs extends Fragment implements View.OnClickListener{

    /*public static NombreJoueurs newInstance() {
        return new NombreJoueurs();
    }*/
    private TextView message;
    private int nbClics = 0;
    //Button button1 = (Button) findViewById(R.id.nombre_joueurs_fragment_plusbutton);
    Button button1;
    Button button2;


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.nombre_joueurs_fragment, container, false);
        return view;
       // return inflater.inflate(R.layout.nombre_joueurs_fragment, container, false);
    }
    /*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(NombreJoueursViewModel.class);
        // TODO: Use the ViewModel
    }*/


    public void onViewCreate(View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.nombre_joueurs_fragment);

        //initialisation buttons
        button1 = (Button) view.findViewById(R.id.nombre_joueurs_fragment_plusbutton);
        button2= (Button) view.findViewById(R.id.nombre_joueurs_fragment_moinsbutton);
        button1.setOnClickListener(NombreJoueurs.this);
        button2.setOnClickListener(NombreJoueurs.this);

        message = view.findViewById(R.id.nombre_joueurs_fragment_text);
        newMessage();
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case (R.id.nombre_joueurs_fragment_plusbutton):
                nbClics++;
                break;
            case (R.id.nombre_joueurs_fragment_moinsbutton):
                nbClics--;
                break;
        }
        newMessage();
    }

    public String newMessage() {
        return String.format("Vous êtes %d participants", nbClics);
    }
}