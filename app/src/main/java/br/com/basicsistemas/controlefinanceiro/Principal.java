package br.com.basicsistemas.controlefinanceiro;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {


    TextView textoPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       textoPrincipal.setText(R.string.lb_campo_ola_mundo);

    }


   public boolean onCreateOptionsMenu(Menu menu){

       // Ativando Menu principal para a tela inicial do aplicativo.

       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
   }

}
