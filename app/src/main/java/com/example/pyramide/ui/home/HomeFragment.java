package com.example.pyramide.ui.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;



import com.example.pyramide.MainActivity;


public class HomeFragment extends Fragment implements View.OnClickListener{

    //déclaration callBack
    private OnButtonClickedListener Callback;

    //création de l'interface
    public interface OnButtonClickedListener {
        void onButtonClicked(View view);
    }

    /*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            //return inflater.inflate(R.layout.fragment_home, container, false);

            //Inflate the layout of HomeFragment
            View result=inflater.inflate(R.layout.fragment_home, container, false);
            //Set onClickListener to button "SHOW ME DETAILS"
            result.findViewById(R.id.fragment_home_button).setOnClickListener(this);
            return result;
    }

    //@Override
    //public void onAttach(Context context) {
    public void onAttach(MainActivity context) {
        super.onAttach(context);

        // Call the method that creating callback after being attached to parent activity
        this.createCallbackToParentActivity();
    }

    //programation du click
        @Override
        public void onClick(View v) {
            Callback.onButtonClicked(v);
        }


    //Création du callBack pointant vers notre activité
    private void createCallbackToParentActivity(){
        try {
            //Parent activity will automatically subscribe to callback
            Callback = (OnButtonClickedListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString()+ " must implement OnButtonClickedListener");
        }
    }
}







