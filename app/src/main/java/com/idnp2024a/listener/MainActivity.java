package com.idnp2024a.listener;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements RegisterFragment.OnFragmentInteractionListener {

    private TextView tvUsuarioInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tvUsuarioInfo = findViewById(R.id.tvUsuarioInfo);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentContainer, new RegisterFragment());
            transaction.commit();
        }
    }

    @Override
    public void onFragmentInteraction(Usuario usuario) {
        tvUsuarioInfo.setText(usuario.toString());
    }
}