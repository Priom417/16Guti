package com.example.dipto.priom;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button twoPlayer, singlePlayer, onlinePlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        twoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                Intent i = new Intent(context,TwoPlayer.class);
                startActivity(i);
            }
        });
    }
    private void initialize(){
        twoPlayer = findViewById(R.id.twoPlayerBtn);
        singlePlayer = findViewById(R.id.singlePlayerBtn);
        onlinePlayer = findViewById(R.id.onlinePlayerBtn);
    }
}
