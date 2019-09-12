package br.com.basicsistemas.controlefinanceiro;


import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.widget.TextView;



public class Principal extends MenuPrincipal {


    TextView textoPrincipal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       textoPrincipal = findViewById(R.id.texto_principal);

       textoPrincipal.setText("Controle");

    }




}
