package br.com.basicsistemas.controlefinanceiro;


import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.widget.TextView;



public class Principal extends MenuPrincipal {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       //textoPrincipal.setText(R.string.lb_campo_ola_mundo);

    }




}
