package br.com.digitalhouse.fragmentsapp.fragments;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.digitalhouse.fragmentsapp.R;

public class Fragmento1 extends Fragment {

    public Fragmento1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // contem espaço onde o fragmento fica atrelado
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        Button btnMessage = view.findViewById(R.id.btnMensagem);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Botão clicado", Snackbar.LENGTH_SHORT).show();
            }
        });



        return view;
    }


}
