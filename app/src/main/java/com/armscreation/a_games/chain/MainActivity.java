package com.armscreation.a_games.chain;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.armscreation.a_games.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth fAuth;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chain);
        final Button servers = findViewById(R.id.host);
        final Button clients = findViewById(R.id.join);
        final Button btn_multiplayer = findViewById(R.id.btn_multiplayer);
        btn_multiplayer.setVisibility(View.INVISIBLE);
        mAuth = FirebaseAuth.getInstance();
        fAuth = FirebaseAuth.getInstance();


        mAuth.signInAnonymously().addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Log.d("TAG", "signInAnonymously:onComplete:" + task.isSuccessful());
                if (task.isSuccessful()) {
                    btn_multiplayer.setVisibility(View.VISIBLE);
                    btn_multiplayer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            btn_multiplayer.setVisibility(View.INVISIBLE);
                            servers.setVisibility(View.VISIBLE);
                            clients.setVisibility(View.VISIBLE);
                            servers.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                   // Intent intent = new Intent(MainActivity.this, Host.class);
                                  //  startActivity(intent);

                                    Toast.makeText(MainActivity.this, "Comming soon", Toast.LENGTH_SHORT).show();
                                }
                            });
                            clients.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                  //  Intent intent = new Intent(MainActivity.this, Join.class);
                                   // startActivity(intent);
                                    Toast.makeText(MainActivity.this, "Comming soon", Toast.LENGTH_SHORT).show();
                                }
                            });

                        }
                    });


                } else {
                    Button btn_reset = findViewById(R.id.btn_reset);
                    btn_reset.setVisibility(View.VISIBLE);
                    btn_reset.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    });
                    Toast.makeText(MainActivity.this, "Error Signing-in !!", Toast.LENGTH_LONG).show();

                }

            }

        });



    }





}











