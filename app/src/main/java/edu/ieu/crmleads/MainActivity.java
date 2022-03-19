package edu.ieu.crmleads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private LeadsFragment fragmentClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentClientes = (LeadsFragment) getSupportFragmentManager()
                .findFragmentById(R.id.main_activity_container);
        if(fragmentClientes == null){
            fragmentClientes = new LeadsFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_activity_container, fragmentClientes)
                    .commit();
        }
    }
}