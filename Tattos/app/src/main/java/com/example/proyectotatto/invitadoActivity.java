package com.example.proyectotatto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class invitadoActivity extends AppCompatActivity {

    Fragment InicioFragment, CartasFragment, InteriorCartasFragment;

    public void setFragmentVisibility(boolean isVisible) {
        if (isVisible) {
            getSupportFragmentManager().beginTransaction().show(CartasFragment).commit();
        } else {
            getSupportFragmentManager().beginTransaction().hide(CartasFragment).commit();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitado);

        InicioFragment = new InicioFragment();
        CartasFragment = new FragmentCartas();
        InteriorCartasFragment = new InteriorCarta1();

        // Replace the default fragment with FragmentCartas
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, CartasFragment)
                .commit();
    }
}
