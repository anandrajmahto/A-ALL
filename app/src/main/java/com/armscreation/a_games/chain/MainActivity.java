package com.armscreation.a_games.chain;

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
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25,button26 ,button27 ,button28 ,button29 ,button30 ,button31 ,button32 ,button33 ,button34 ,button35 ,button36 ,button37 ,button38 ,button39 ,button40 ,button41 ,button42 ,button43 ,button44 ,button45 ,button46 ,button47 ,button48 ,button49 ,button50;
    Button[] array = new Button[51];
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chain);

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
                            Toast.makeText(MainActivity.this, "Comming Soon", Toast.LENGTH_LONG).show();


                        }
                    });


                } else {

                    Toast.makeText(MainActivity.this, "Error Signing-in !!", Toast.LENGTH_LONG).show();

                }

            }

        });



        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);
        button40 = findViewById(R.id.button40);
        button41 = findViewById(R.id.button41);
        button42 = findViewById(R.id.button42);
        button43 = findViewById(R.id.button43);
        button44 = findViewById(R.id.button44);
        button45 = findViewById(R.id.button45);
        button46 = findViewById(R.id.button46);
        button47 = findViewById(R.id.button47);
        button48 = findViewById(R.id.button48);
        button49 = findViewById(R.id.button49);
        button50 = findViewById(R.id.button50);
        array[0] = button1;
        array[1] = button2;
        array[2] = button3;
        array[3] = button4;
        array[4] = button5;
        array[5] = button6;
        array[6] = button7;
        array[7] = button8;
        array[8] = button9;
        array[9] = button10;
        array[10] = button11;
        array[11] = button12;
        array[12] = button13;
        array[13] = button14;
        array[14] = button15;
        array[15] = button16;
        array[16] = button17;
        array[17] = button18;
        array[18] = button19;
        array[19] = button20;
        array[20] = button21;
        array[21] = button22;
        array[22] = button23;
        array[23] = button24;
        array[24] = button25;

    }


}











