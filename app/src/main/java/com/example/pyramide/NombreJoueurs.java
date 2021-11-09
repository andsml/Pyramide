package com.example.pyramide;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class NombreJoueurs extends AppCompatActivity {

    private TextView message;
    private int nbClics = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre_joueurs);

        /*button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);*/

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
   /* public void buttonOnClick(View view)
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