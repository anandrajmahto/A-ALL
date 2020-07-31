package com.armscreation.a_games.bingo;

import android.content.Intent;
import android.graphics.Color;
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
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25;
    int flag = 1;
    Button[] array = new Button[26];
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bingo);
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
                                    Intent intent = new Intent(MainActivity.this, Host.class);
                                    startActivity(intent);
                                }
                            });
                            clients.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(MainActivity.this, Join.class);
                                    startActivity(intent);
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


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(0);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(2);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(3);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(4);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(5);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(6);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(7);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(8);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(9);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(10);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(11);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(12);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(13);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(14);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(15);

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(16);

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(17);

            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(18);

            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(19);

            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(20);

            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(21);

            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(22);

            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(23);

            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(24);

            }
        });


    }

    public void check() {

        Thread myThread;
        myThread = new Thread() {
            @Override
            public void run() {
                try {
                    cleanO();
                    sleep(1000);
                    clean();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Toast.makeText(getApplicationContext(),"mesage",Toast.LENGTH_SHORT).show();
            }
        };
        Thread myThread1;
        myThread1 = new Thread() {
            @Override
            public void run() {
                try {
                    cleanX();
                    sleep(1000);
                    clean();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Toast.makeText(getApplicationContext(),"mesage",Toast.LENGTH_SHORT).show();
            }
        };
        Thread myThread3;
        myThread3 = new Thread() {
            @Override
            public void run() {
                try {

                    sleep(1000);
                    clean();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Toast.makeText(getApplicationContext(),"mesage",Toast.LENGTH_SHORT).show();
            }
        };


        if (button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();

            myThread.start();
        } else if (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();
            myThread.start();
        } else if (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();
            myThread.start();
        } else if (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();
            myThread.start();
        } else if (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();
            myThread.start();
        } else if (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();
            myThread.start();
        } else if (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();
            myThread.start();
        } else if (button7.getText().equals("O") && button5.getText().equals("O") && button3.getText().equals("O")) {
            Toast.makeText(getApplicationContext(), "O won", Toast.LENGTH_LONG).show();
            myThread.start();
        } else if (!button1.getText().equals(" ") &&
                !button2.getText().equals(" ") &&
                !button3.getText().equals(" ") &&
                !button4.getText().equals(" ") &&
                !button5.getText().equals(" ") &&
                !button6.getText().equals(" ") &&
                !button7.getText().equals(" ") &&
                !button8.getText().equals(" ") &&
                !button9.getText().equals(" ")) {
            Toast.makeText(getApplicationContext(), "Match Draw", Toast.LENGTH_LONG).show();
            myThread3.start();
        }


        if (button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();


            myThread1.start();
        } else if (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();
            myThread1.start();
        } else if (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();
            myThread1.start();
        } else if (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();
            myThread1.start();
        } else if (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();
            myThread1.start();
        } else if (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();
            myThread1.start();
        } else if (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();
            myThread1.start();
        } else if (button7.getText().equals("X") && button5.getText().equals("X") && button3.getText().equals("X")) {
            Toast.makeText(getApplicationContext(), "X won", Toast.LENGTH_LONG).show();
            myThread1.start();
        }

    }

    void clean() {
        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");

    }

    void cleanO() {
        button1.setText("O");
        button2.setText("O");
        button3.setText("O");
        button4.setText("O");
        button5.setText("O");
        button6.setText("O");
        button7.setText("O");
        button8.setText("O");
        button9.setText("O");
        button1.setTextColor(Color.parseColor("#A6FF0000"));
        button2.setTextColor(Color.parseColor("#A6FF0000"));
        button3.setTextColor(Color.parseColor("#A6FF0000"));
        button4.setTextColor(Color.parseColor("#A6FF0000"));
        button5.setTextColor(Color.parseColor("#A6FF0000"));
        button6.setTextColor(Color.parseColor("#A6FF0000"));
        button7.setTextColor(Color.parseColor("#A6FF0000"));
        button8.setTextColor(Color.parseColor("#A6FF0000"));
        button9.setTextColor(Color.parseColor("#A6FF0000"));


    }

    void cleanX() {
        button1.setText("X");
        button2.setText("X");
        button3.setText("X");
        button4.setText("X");
        button5.setText("X");
        button6.setText("X");
        button7.setText("X");
        button8.setText("X");
        button9.setText("X");
        button1.setTextColor(Color.parseColor("#A6FF0000"));
        button2.setTextColor(Color.parseColor("#A6FF0000"));
        button3.setTextColor(Color.parseColor("#A6FF0000"));
        button4.setTextColor(Color.parseColor("#A6FF0000"));
        button5.setTextColor(Color.parseColor("#A6FF0000"));
        button6.setTextColor(Color.parseColor("#A6FF0000"));
        button7.setTextColor(Color.parseColor("#A6FF0000"));
        button8.setTextColor(Color.parseColor("#A6FF0000"));
        button9.setTextColor(Color.parseColor("#A6FF0000"));
    }

        void btn(int j) {

            if (array[j].getText().equals(" ")) {

                array[j].setText(String.valueOf(flag));
                flag++;
            }
/**
 if (flag == 1 && array[j].getText().equals(" ")) {
 array[j].setText("X");
 flag = 2;
 check();
 array[j].setTextColor(Color.parseColor("#A6FF0000"));
 } else if (flag == 2 && array[j].getText().equals(" ")) {
 array[j].setText("O");
 flag = 1;
 check();
 array[j].setTextColor(Color.parseColor("#A6000000"));
 }
 **/

    }


}











