package com.armscreation.a_games.chainpro;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.armscreation.a_games.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth fAuth;
    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, button40, button41, button42, button43, button44, button45, button46, button47, button48, button49, button50,
            button51, button52, button53, button54, button55, button56, button57, button58, button59, button60, button61, button62, button63, button64, button65, button66, button67, button68, button69, button70, button71, button72, button73, button74, button75, button76, button77, button78, button79, button80, button81, button82, button83, button84, button85, button86, button87, button88, button89, button90, button91, button92, button93, button94, button95, button96, button97, button98, button99, button100,
            button101, button102, button103, button104, button105, button106, button107, button108, button109, button110, button111, button112, button113, button114, button115, button116, button117, button118, button119, button120, button121, button122, button123, button124, button125, button126, button127, button128, button129, button130, button131, button132, button133, button134, button135, button136, button137, button138, button139, button140, button141, button142, button143, button144, button145, button146, button147, button148, button149, button150;
    ImageButton[] array = new ImageButton[151];
    TextView PlayerTurn;
    TableLayout tableLayout;


    private FirebaseAuth mAuth;


    private int turn;
    private boolean green, red, blue;
    private int Users;
    private boolean RedOut, GreenOut, BlueOut;
    private int Colour_box_no;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//hide the top dock
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.demo);
       // final Button btn_multiplayer = findViewById(R.id.btn_multiplayer);
      //  btn_multiplayer.setVisibility(View.INVISIBLE);
        mAuth = FirebaseAuth.getInstance();
        fAuth = FirebaseAuth.getInstance();
        mAuth.signInAnonymously().addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Log.d("TAG", "signInAnonymously:onComplete:" + task.isSuccessful());
                if (task.isSuccessful()) {
               /**

                    //  btn_multiplayer.setVisibility(View.VISIBLE);
                    btn_multiplayer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(MainActivity.this, "Comming Soon", Toast.LENGTH_LONG).show();


                        }
                    });

**/
                } else {

                    Toast.makeText(MainActivity.this, "Error Signing-in !!", Toast.LENGTH_LONG).show();

                }

            }

        });

        SingleChoice();
        initialize();
        onclicklistners();
        //   turnchk();
       //colourSwitch();


    }

    private void SingleChoice() {
        final String[] listItems = {"2", "3"};

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Choose Player");

        builder.setItems(listItems, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Users = Integer.parseInt(listItems[which]);
                turnchk();
                ////colourSwitch(0);
                // Toast.makeText(MainActivity.this, " Value: " + listItems[which], Toast.LENGTH_LONG).show();

            }
        });

        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }

    private void onclicklistners() {

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(0);
                btn(0);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(1);
                btn(1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(2);
                btn(2);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(3);
                btn(3);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(4);
                btn(4);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(5);
                btn(5);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(6);
                btn(6);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(7);
                btn(7);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(8);
                btn(8);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(9);
                btn(9);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(10);
                btn(10);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(11);
                btn(11);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(12);
                btn(12);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(13);
                btn(13);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(14);
                btn(14);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(15);
                btn(15);

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(16);
                btn(16);

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(17);
                btn(17);

            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(18);
                btn(18);

            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(19);
                btn(19);

            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(20);
                btn(20);

            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(21);
                btn(21);

            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(22);
                btn(22);

            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(23);
                btn(23);

            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(24);
                btn(24);

            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(25);
                btn(25);

            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(26);
                btn(26);

            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(27);
                btn(27);

            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(28);
                btn(28);

            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(29);
                btn(29);

            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(30);
                btn(30);

            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(31);
                btn(31);

            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(32);
                btn(32);

            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(33);
                btn(33);

            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(34);
                btn(34);

            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(35);
                btn(35);

            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(36);
                btn(36);

            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(37);
                btn(37);

            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(38);
                btn(38);

            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(39);
                btn(39);

            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(40);
                btn(40);

            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(41);
                btn(41);

            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(42);
                btn(42);

            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(43);
                btn(43);

            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(44);
                btn(44);

            }
        });
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(45);
                btn(45);

            }
        });
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(46);
                btn(46);

            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(47);
                btn(47);

            }
        });
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(48);
                btn(48);

            }
        });
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(49);
                btn(49);

            }
        });
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(50);
                btn(50);
            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(51);
                btn(51);
            }
        });
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(52);
                btn(52);
            }
        });
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(53);
                btn(53);
            }
        });
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(54);
                btn(54);
            }
        });
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(55);
                btn(55);
            }
        });
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(56);
                btn(56);
            }
        });
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(57);
                btn(57);
            }
        });
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(58);
                btn(58);
            }
        });
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(59);
                btn(59);
            }
        });
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(60);
                btn(60);
            }
        });
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(61);
                btn(61);
            }
        });
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(62);
                btn(62);
            }
        });
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(63);
                btn(63);
            }
        });
        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(64);
                btn(64);
            }
        });
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(65);
                btn(65);
            }
        });
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(66);
                btn(66);
            }
        });
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(67);
                btn(67);
            }
        });
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(68);
                btn(68);
            }
        });
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(69);
                btn(69);
            }
        });
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(70);
                btn(70);
            }
        });
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(71);
                btn(71);
            }
        });
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(72);
                btn(72);
            }
        });
        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(73);
                btn(73);
            }
        });
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(74);
                btn(74);
            }
        });
        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(75);
                btn(75);
            }
        });
        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(76);
                btn(76);
            }
        });
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(77);
                btn(77);
            }
        });
        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(78);
                btn(78);
            }
        });
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(79);
                btn(79);
            }
        });
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(80);
                btn(80);
            }
        });
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(81);
                btn(81);
            }
        });
        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(82);
                btn(82);
            }
        });
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(83);
                btn(83);
            }
        });
        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(84);
                btn(84);
            }
        });
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(85);
                btn(85);
            }
        });
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(86);
                btn(86);
            }
        });
        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(87);
                btn(87);
            }
        });
        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(88);
                btn(88);
            }
        });
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(89);
                btn(89);
            }
        });
        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(90);
                btn(90);
            }
        });
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(91);
                btn(91);
            }
        });
        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(92);
                btn(92);
            }
        });
        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(93);
                btn(93);
            }
        });
        button95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(94);
                btn(94);
            }
        });
        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(95);
                btn(95);
            }
        });
        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(96);
                btn(96);
            }
        });
        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(97);
                btn(97);
            }
        });
        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(98);
                btn(98);
            }
        });
        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(99);
                btn(99);
            }
        });
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(100);
                btn(100);
            }
        });
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(101);
                btn(101);
            }
        });
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(102);
                btn(102);
            }
        });
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(103);
                btn(103);
            }
        });
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(104);
                btn(104);
            }
        });
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(105);
                btn(105);
            }
        });
        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(106);
                btn(106);
            }
        });
        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(107);
                btn(107);
            }
        });
        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(108);
                btn(108);
            }
        });
        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(109);
                btn(109);
            }
        });
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(110);
                btn(110);
            }
        });
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(111);
                btn(111);
            }
        });
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(112);
                btn(112);
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(113);
                btn(113);
            }
        });
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(114);
                btn(114);
            }
        });
        button116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(115);
                btn(115);
            }
        });
        button117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(116);
                btn(116);
            }
        });
        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(117);
                btn(117);
            }
        });
        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(118);
                btn(118);
            }
        });
        button120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(119);
                btn(119);
            }
        });
        button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(120);
                btn(120);
            }
        });
        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(121);
                btn(121);
            }
        });
        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(122);
                btn(122);
            }
        });
        button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(123);
                btn(123);
            }
        });
        button125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(124);
                btn(124);
            }
        });
        button126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(125);
                btn(125);
            }
        });
        button127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(126);
                btn(126);
            }
        });
        button128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(127);
                btn(127);
            }
        });
        button129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(128);
                btn(128);
            }
        });
        button130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(129);
                btn(129);
            }
        });
        button131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(130);
                btn(130);
            }
        });
        button132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(131);
                btn(131);
            }
        });
        button133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(132);
                btn(132);
            }
        });
        button134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(133);
                btn(133);
            }
        });
        button135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(134);
                btn(134);
            }
        });
        button136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(135);
                btn(135);
            }
        });
        button137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(136);
                btn(136);
            }
        });
        button138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(137);
                btn(137);
            }
        });
        button139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(138);
                btn(138);
            }
        });
        button140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(139);
                btn(139);
            }
        });
        button141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(140);
                btn(140);
            }
        });
        button142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(141);
                btn(141);
            }
        });
        button143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(142);
                btn(142);
            }
        });
        button144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(143);
                btn(143);
            }
        });
        button145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(144);
                btn(144);
            }
        });
        button146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(145);
                btn(145);
            }
        });
        button147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(146);
                btn(146);
            }
        });
        button148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(147);
                btn(147);
            }
        });
        button149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colourSwitch(148);
                btn(148);
            }
        });
        button150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(149);
            }
        });


    }

    void btn(final int j) {

        //turn 1=red
        //turn 2=green

        if (Users == 2) {
            if (turn == 1 && array[j].getTag().equals(" ")) {
                red = true;
                array[j].setBackgroundResource(R.drawable.red);
                //  array[j].setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary), android.graphics.PorterDuff.Mode.MULTIPLY);
                //  array[j].setColorFilter(Color.rgb(10,12,12));
                //  array[j].setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                array[j].setTag("red");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals(" ")) {
                green = true;
                array[j].setBackgroundResource(R.drawable.green);
                array[j].setTag("green");
                turn = 1;
            } else if (turn == 1 && array[j].getTag().equals("red")) {
                array[j].setBackgroundResource(R.drawable.red2);
                array[j].setTag("red2");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals("green")) {
                array[j].setBackgroundResource(R.drawable.green2);
                array[j].setTag("green2");
                turn = 1;
            } else if (turn == 1 && array[j].getTag().equals("red2")) {
                array[j].setBackgroundResource(R.drawable.red3);
                array[j].setTag("red3");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals("green2")) {
                array[j].setBackgroundResource(R.drawable.green3);
                array[j].setTag("green3");
                turn = 1;
            } else if (turn == 1 && array[j].getTag().equals("red3")) {
                array[j].setBackgroundResource(R.drawable.red4);
                array[j].setTag("red4");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals("green3")) {
                array[j].setBackgroundResource(R.drawable.green4);
                array[j].setTag("green4");
                turn = 1;
            }
        } else if (Users == 3) {
            if (turn == 1 && array[j].getTag().equals(" ")) {
                red = true;
                array[j].setBackgroundResource(R.drawable.red);
                //  array[j].setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary), android.graphics.PorterDuff.Mode.MULTIPLY);
                //  array[j].setColorFilter(Color.rgb(10,12,12));
                //  array[j].setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                array[j].setTag("red");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals(" ")) {
                green = true;
                array[j].setBackgroundResource(R.drawable.green);
                array[j].setTag("green");
                turn = 3;
            } else if (turn == 3 && array[j].getTag().equals(" ")) {
                blue = true;
                array[j].setBackgroundResource(R.drawable.blue);
                array[j].setTag("blue");
                turn = 1;
            } else if (turn == 1 && array[j].getTag().equals("red")) {
                array[j].setBackgroundResource(R.drawable.red2);
                array[j].setTag("red2");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals("green")) {
                array[j].setBackgroundResource(R.drawable.green2);
                array[j].setTag("green2");
                turn = 3;
            } else if (turn == 3 && array[j].getTag().equals("blue")) {
                array[j].setBackgroundResource(R.drawable.blue2);
                array[j].setTag("blue2");
                turn = 1;
            } else if (turn == 1 && array[j].getTag().equals("red2")) {
                array[j].setBackgroundResource(R.drawable.red3);
                array[j].setTag("red3");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals("green2")) {
                array[j].setBackgroundResource(R.drawable.green3);
                array[j].setTag("green3");
                turn = 3;
            } else if (turn == 3 && array[j].getTag().equals("blue2")) {
                array[j].setBackgroundResource(R.drawable.blue3);
                array[j].setTag("blue3");
                turn = 1;
            } else if (turn == 1 && array[j].getTag().equals("red3")) {
                array[j].setBackgroundResource(R.drawable.red4);
                array[j].setTag("red4");
                turn = 2;
            } else if (turn == 2 && array[j].getTag().equals("green3")) {
                array[j].setBackgroundResource(R.drawable.green4);
                array[j].setTag("green4");
                turn = 3;
            } else if (turn == 3 && array[j].getTag().equals("blue3")) {
                array[j].setBackgroundResource(R.drawable.blue4);
                array[j].setTag("blue4");
                turn = 1;
            }
        }
        check();
        turnchk();
        resultchk();
        // resultchkOut();
    }

    private void resultchk() {

        boolean statusred = true, statusgreen = true, statusblue = true;
        for (int i = 0; i <= 149; i++) {
            if ((array[i].getTag().equals("red") || array[i].getTag().equals("red2") || array[i].getTag().equals("red3") || array[i].getTag().equals("red4") || array[i].getTag().equals(" "))) {
                // Toast.makeText(this, "Red Wins", Toast.LENGTH_SHORT).show();

                if (i == 149 && statusred) {

                    if (Users == 2) {
                        if (green && red) {
                            for (int j = 0; j < 150; j++) {
                                array[j].setTag(" ");
                                array[j].setBackgroundResource(R.drawable.toe);
                            }
                            Toast.makeText(this, "Red Wins", Toast.LENGTH_SHORT).show();
                            green = false;
                            red = false;

                        }
                    } else if (Users == 3) {
                        if (green && red && blue) {
                            for (int j = 0; j < 150; j++) {
                                array[j].setTag(" ");
                                array[j].setBackgroundResource(R.drawable.toe);
                            }
                            Toast.makeText(this, "Red Wins", Toast.LENGTH_SHORT).show();
                            green = false;
                            red = false;
                            blue = false;
                            RedOut = false;
                            GreenOut = false;
                            BlueOut = false;

                        }
                    }

                }
            } else {
                statusred = false;
            }

            if ((array[i].getTag().equals("green") || array[i].getTag().equals("green2") || array[i].getTag().equals("green3") || array[i].getTag().equals("green4") || array[i].getTag().equals(" "))) {
                //Toast.makeText(this, "Green Wins", Toast.LENGTH_SHORT).show();

                if (i == 149 && statusgreen) {
                    if (Users == 2) {
                        if (green && red) {
                            for (int j = 0; j < 150; j++) {
                                array[j].setTag(" ");
                                array[j].setBackgroundResource(R.drawable.toe);
                            }

                            Toast.makeText(this, "Green Wins", Toast.LENGTH_SHORT).show();
                            green = false;
                            red = false;
                        }
                    } else if (Users == 3) {
                        if (green && red && blue) {
                            for (int j = 0; j < 150; j++) {
                                array[j].setTag(" ");
                                array[j].setBackgroundResource(R.drawable.toe);
                            }

                            Toast.makeText(this, "Green Wins", Toast.LENGTH_SHORT).show();
                            green = false;
                            red = false;
                            blue = false;
                            RedOut = false;
                            GreenOut = false;
                            BlueOut = false;
                        }
                    }
                }
            } else {
                statusgreen = false;
            }

            if ((array[i].getTag().equals("blue") || array[i].getTag().equals("blue2") || array[i].getTag().equals("blue3") || array[i].getTag().equals("blue4") || array[i].getTag().equals(" "))) {
                //Toast.makeText(this, "Green Wins", Toast.LENGTH_SHORT).show();

                if (i == 149 && statusblue) {
                    if (Users == 3) {
                        if (green && red && blue) {
                            for (int j = 0; j < 150; j++) {
                                array[j].setTag(" ");
                                array[j].setBackgroundResource(R.drawable.toe);
                            }

                            Toast.makeText(this, "Blue Wins", Toast.LENGTH_SHORT).show();
                            green = false;
                            red = false;
                            blue = false;
                            RedOut = false;
                            GreenOut = false;
                            BlueOut = false;
                        }
                    }
                }
            } else {
                statusblue = false;
            }


        }


    }

    private void check() {
        resultchk();
        // resultchkOut();

        check2(0, 1, 10);
        check2(9, 8, 19);
        check2(140, 141, 130);
        check2(149, 148, 139);

        check3(1, 0, 2, 11);
        check3(2, 1, 3, 12);
        check3(3, 2, 4, 13);
        check3(4, 3, 5, 14);
        check3(5, 4, 6, 15);
        check3(6, 5, 7, 16);
        check3(7, 6, 8, 17);
        check3(8, 7, 9, 18);

        check3(141, 140, 131, 142);
        check3(142, 141, 143, 132);
        check3(143, 142, 144, 133);
        check3(144, 143, 145, 134);
        check3(145, 144, 146, 135);
        check3(146, 145, 147, 136);
        check3(147, 146, 148, 137);
        check3(148, 147, 149, 138);

        check3(10, 0, 11, 20);
        check3(20, 10, 21, 30);
        check3(30, 20, 31, 40);
        check3(40, 30, 41, 50);
        check3(50, 40, 51, 60);
        check3(60, 50, 61, 70);
        check3(70, 60, 71, 80);
        check3(80, 70, 81, 90);
        check3(90, 80, 91, 100);
        check3(100, 90, 101, 110);
        check3(110, 100, 111, 120);
        check3(120, 110, 121, 130);
        check3(130, 120, 131, 140);
        check3(19, 9, 18, 29);
        check3(29, 19, 28, 39);

        check3(39, 29, 38, 49);
        check3(49, 39, 48, 59);
        check3(59, 49, 58, 69);
        check3(69, 59, 68, 79);
        check3(79, 69, 78, 89);
        check3(89, 79, 88, 99);
        check3(99, 89, 98, 109);
        check3(109, 99, 108, 119);
        check3(119, 109, 118, 129);
        check3(129, 119, 128, 139);
        check3(139, 129, 138, 149);


        for (int a = 11, b = 1, c = 12, d = 21, e = 10; a <= 18; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 21, b = 11, c = 22, d = 31, e = 20; a <= 28; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 31, b = 21, c = 32, d = 41, e = 30; a <= 38; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 41, b = 31, c = 42, d = 51, e = 40; a <= 48; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 51, b = 41, c = 52, d = 61, e = 50; a <= 58; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 61, b = 51, c = 62, d = 71, e = 60; a <= 68; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 71, b = 61, c = 72, d = 81, e = 70; a <= 78; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 81, b = 71, c = 82, d = 91, e = 80; a <= 88; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 91, b = 81, c = 92, d = 101, e = 90; a <= 98; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 101, b = 91, c = 102, d = 111, e = 100; a <= 108; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 111, b = 101, c = 112, d = 121, e = 110; a <= 118; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 121, b = 111, c = 122, d = 131, e = 120; a <= 128; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }
        for (int a = 131, b = 121, c = 132, d = 141, e = 130; a <= 138; a++, b++, c++, d++, e++) {
            check4(a, b, c, d, e);
        }

    }

    private void resultchkOut() {
        boolean statusred = false, statusgreen = false, statusblue = false;
        for (int i = 0; i <= 149; i++) {
            if (Users == 3 && red && green && blue) {
                if ((array[i].getTag().equals("red") || array[i].getTag().equals("red2") || array[i].getTag().equals("red3") || array[i].getTag().equals("red4"))) {
                    statusred = true;
                }
                if ((array[i].getTag().equals("green") || array[i].getTag().equals("green2") || array[i].getTag().equals("green3") || array[i].getTag().equals("green4"))) {
                    statusgreen = true;
                    // Toast.makeText(this, "Red Wins", Toast.LENGTH_SHORT).show();
                }
                if ((array[i].getTag().equals("blue") || array[i].getTag().equals("blue2") || array[i].getTag().equals("blue3") || array[i].getTag().equals("blue4"))) {
                    statusblue = true;
                    // Toast.makeText(this, "Red Wins", Toast.LENGTH_SHORT).show();
                }
            }

        }
        if (Users == 3 && red && green && blue) {
            if (!statusred) {
                RedOut = true;
            }
            if (!statusgreen) {
                GreenOut = true;
            }
            if (!statusblue) {
                BlueOut = true;
            }
        }
    }

    private void check4(int i, int i1, int i2, int i3, int i4) {


        //red check button i
        if (array[i].getTag().equals("red4")) {
            //button i1 check
            if (array[i1].getTag().equals("red") || array[i1].getTag().equals("green")) {
                array[i1].setBackgroundResource(R.drawable.red2);
                array[i1].setTag("red2");

            } else if (array[i1].getTag().equals("red2") || array[i1].getTag().equals("green2")) {
                array[i1].setBackgroundResource(R.drawable.red3);
                array[i1].setTag("red3");
            } else if (array[i1].getTag().equals("red3") || array[i1].getTag().equals("green3")) {
                array[i1].setBackgroundResource(R.drawable.red4);
                array[i1].setTag("red4");
            } else if (array[i1].getTag().equals("red4") || array[i1].getTag().equals("green4")) {
                array[i1].setBackgroundResource(R.drawable.toe);
                array[i1].setTag(" ");
            } else {
                array[i1].setBackgroundResource(R.drawable.red);
                array[i1].setTag("red");

            }
            //button i2 check
            if (array[i2].getTag().equals("red") || array[i2].getTag().equals("green")) {
                array[i2].setBackgroundResource(R.drawable.red2);
                array[i2].setTag("red2");
            } else if (array[i2].getTag().equals("red2") || array[i2].getTag().equals("green2")) {
                array[i2].setBackgroundResource(R.drawable.red3);
                array[i2].setTag("red3");
            } else if (array[i2].getTag().equals("red3") || array[i2].getTag().equals("green3")) {
                array[i2].setBackgroundResource(R.drawable.red4);
                array[i2].setTag("red4");
            } else if (array[i2].getTag().equals("red4") || array[i2].getTag().equals("green4")) {
                array[i2].setBackgroundResource(R.drawable.toe);
                array[i2].setTag(" ");
            } else {
                array[i2].setBackgroundResource(R.drawable.red);
                array[i2].setTag("red");

            }
            //button i3 check
            if (array[i3].getTag().equals("red") || array[i3].getTag().equals("green")) {
                array[i3].setBackgroundResource(R.drawable.red2);
                array[i3].setTag("red2");
            } else if (array[i3].getTag().equals("red2") || array[i3].getTag().equals("green2")) {
                array[i3].setBackgroundResource(R.drawable.red3);
                array[i3].setTag("red3");
            } else if (array[i3].getTag().equals("red3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.red4);
                array[i3].setTag("red4");
            } else if (array[i3].getTag().equals("red4") || array[i3].getTag().equals("green4")) {
                array[i3].setBackgroundResource(R.drawable.toe);
                array[i3].setTag(" ");
            } else {
                array[i3].setBackgroundResource(R.drawable.red);
                array[i3].setTag("red");

            }
            //button i4 check
            if (array[i4].getTag().equals("red") || array[i4].getTag().equals("green")) {
                array[i4].setBackgroundResource(R.drawable.red2);
                array[i4].setTag("red2");
            } else if (array[i4].getTag().equals("red2") || array[i4].getTag().equals("green2")) {
                array[i4].setBackgroundResource(R.drawable.red3);
                array[i4].setTag("red3");
            } else if (array[i4].getTag().equals("red3") || array[i4].getTag().equals("red3")) {
                array[i4].setBackgroundResource(R.drawable.red4);
                array[i4].setTag("red4");
            } else if (array[i4].getTag().equals("red4") || array[i4].getTag().equals("green4")) {
                array[i4].setBackgroundResource(R.drawable.toe);
                array[i4].setTag(" ");
            } else {
                array[i4].setBackgroundResource(R.drawable.red);
                array[i4].setTag("red");

            }

            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");

            check();
        }
        //green check button i
        else if (array[i].getTag().equals("green4")) {
            //button i1 check
            if (array[i1].getTag().equals("green") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.green2);
                array[i1].setTag("green2");
            } else if (array[i1].getTag().equals("green2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.green3);
                array[i1].setTag("green3");
            } else if (array[i1].getTag().equals("green3") || array[i1].getTag().equals("red3")) {
                array[i1].setBackgroundResource(R.drawable.green4);
                array[i1].setTag("green4");
            } else if (array[i1].getTag().equals("green4") || array[i1].getTag().equals("red4")) {
                array[i1].setBackgroundResource(R.drawable.toe);
                array[i1].setTag(" ");
            } else {
                array[i1].setBackgroundResource(R.drawable.green);
                array[i1].setTag("green");

            }
            //button i2 check
            if (array[i2].getTag().equals("green") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.green2);
                array[i2].setTag("green2");
            } else if (array[i2].getTag().equals("green2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.green3);
                array[i2].setTag("green3");
            } else if (array[i2].getTag().equals("green3") || array[i2].getTag().equals("red3")) {
                array[i2].setBackgroundResource(R.drawable.green4);
                array[i2].setTag("green4");
            } else if (array[i2].getTag().equals("green4") || array[i2].getTag().equals("red4")) {
                array[i2].setBackgroundResource(R.drawable.toe);
                array[i2].setTag(" ");
            } else {
                array[i2].setBackgroundResource(R.drawable.green);
                array[i2].setTag("green");

            }
            //button i3 check
            if (array[i3].getTag().equals("green") || array[i3].getTag().equals("red")) {
                array[i3].setBackgroundResource(R.drawable.green2);
                array[i3].setTag("green2");
            } else if (array[i3].getTag().equals("green2") || array[i3].getTag().equals("red2")) {
                array[i3].setBackgroundResource(R.drawable.green3);
                array[i3].setTag("green3");
            } else if (array[i3].getTag().equals("green3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.green4);
                array[i3].setTag("green4");
            } else if (array[i3].getTag().equals("green4") || array[i3].getTag().equals("red4")) {
                array[i3].setBackgroundResource(R.drawable.toe);
                array[i3].setTag(" ");
            } else {
                array[i3].setBackgroundResource(R.drawable.green);
                array[i3].setTag("green");

            }
            //button i4 check
            if (array[i4].getTag().equals("green") || array[i4].getTag().equals("red")) {
                array[i4].setBackgroundResource(R.drawable.green2);
                array[i4].setTag("green2");
            } else if (array[i4].getTag().equals("green2") || array[i4].getTag().equals("red2")) {
                array[i4].setBackgroundResource(R.drawable.green3);
                array[i4].setTag("green3");
            } else if (array[i4].getTag().equals("green3") || array[i4].getTag().equals("red3")) {
                array[i4].setBackgroundResource(R.drawable.green4);
                array[i4].setTag("green4");
            } else if (array[i4].getTag().equals("green4") || array[i4].getTag().equals("red4")) {
                array[i4].setBackgroundResource(R.drawable.toe);
                array[i4].setTag(" ");
            } else {
                array[i4].setBackgroundResource(R.drawable.green);
                array[i4].setTag("green");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }

        //blue check button i
        else if (array[i].getTag().equals("blue4")) {
            //button i1 check
            if (array[i1].getTag().equals("blue") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.blue2);
                array[i1].setTag("blue2");
            } else if (array[i1].getTag().equals("blue2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.blue3);
                array[i1].setTag("blue3");
            } else if (array[i1].getTag().equals("blue3") || array[i1].getTag().equals("red3")) {
                array[i1].setBackgroundResource(R.drawable.blue4);
                array[i1].setTag("blue4");
            } else if (array[i1].getTag().equals("blue4") || array[i1].getTag().equals("red4")) {
                array[i1].setBackgroundResource(R.drawable.toe);
                array[i1].setTag(" ");
            } else {
                array[i1].setBackgroundResource(R.drawable.blue);
                array[i1].setTag("blue");

            }
            //button i2 check
            if (array[i2].getTag().equals("blue") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.blue2);
                array[i2].setTag("blue2");
            } else if (array[i2].getTag().equals("blue2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.blue3);
                array[i2].setTag("blue3");
            } else if (array[i2].getTag().equals("blue3") || array[i2].getTag().equals("red3")) {
                array[i2].setBackgroundResource(R.drawable.blue4);
                array[i2].setTag("blue4");
            } else if (array[i2].getTag().equals("blue4") || array[i2].getTag().equals("red4")) {
                array[i2].setBackgroundResource(R.drawable.toe);
                array[i2].setTag(" ");
            } else {
                array[i2].setBackgroundResource(R.drawable.blue);
                array[i2].setTag("blue");

            }
            //button i3 check
            if (array[i3].getTag().equals("blue") || array[i3].getTag().equals("red")) {
                array[i3].setBackgroundResource(R.drawable.blue2);
                array[i3].setTag("blue2");
            } else if (array[i3].getTag().equals("blue2") || array[i3].getTag().equals("red2")) {
                array[i3].setBackgroundResource(R.drawable.blue3);
                array[i3].setTag("blue3");
            } else if (array[i3].getTag().equals("blue3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.blue4);
                array[i3].setTag("blue4");
            } else if (array[i3].getTag().equals("blue4") || array[i3].getTag().equals("red4")) {
                array[i3].setBackgroundResource(R.drawable.toe);
                array[i3].setTag(" ");
            } else {
                array[i3].setBackgroundResource(R.drawable.blue);
                array[i3].setTag("blue");

            }
            //button i4 check
            if (array[i4].getTag().equals("blue") || array[i4].getTag().equals("red")) {
                array[i4].setBackgroundResource(R.drawable.blue2);
                array[i4].setTag("blue2");
            } else if (array[i4].getTag().equals("blue2") || array[i4].getTag().equals("red2")) {
                array[i4].setBackgroundResource(R.drawable.blue3);
                array[i4].setTag("blue3");
            } else if (array[i4].getTag().equals("blue3") || array[i4].getTag().equals("red3")) {
                array[i4].setBackgroundResource(R.drawable.blue4);
                array[i4].setTag("blue4");
            } else if (array[i4].getTag().equals("blue4") || array[i4].getTag().equals("red4")) {
                array[i4].setBackgroundResource(R.drawable.toe);
                array[i4].setTag(" ");
            } else {
                array[i4].setBackgroundResource(R.drawable.blue);
                array[i4].setTag("blue");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }
    }

    private void check3(int i, int i1, int i2, int i3) {

        //red check button i
        if (array[i].getTag().equals("red3")) {
            //button i1 check
            if (array[i1].getTag().equals("red") || array[i1].getTag().equals("green")) {
                array[i1].setBackgroundResource(R.drawable.red2);
                array[i1].setTag("red2");

            } else if (array[i1].getTag().equals("red2") || array[i1].getTag().equals("green2")) {
                array[i1].setBackgroundResource(R.drawable.red3);
                array[i1].setTag("red3");
            } else if (array[i1].getTag().equals("red3") || array[i1].getTag().equals("green3")) {
                array[i1].setBackgroundResource(R.drawable.red4);
                array[i1].setTag("red4");
            } else {
                array[i1].setBackgroundResource(R.drawable.red);
                array[i1].setTag("red");

            }
            //button i2 check
            if (array[i2].getTag().equals("red") || array[i2].getTag().equals("green")) {
                array[i2].setBackgroundResource(R.drawable.red2);
                array[i2].setTag("red2");
            } else if (array[i2].getTag().equals("red2") || array[i2].getTag().equals("green2")) {
                array[i2].setBackgroundResource(R.drawable.red3);
                array[i2].setTag("red3");
            } else if (array[i2].getTag().equals("red3") || array[i2].getTag().equals("green3")) {
                array[i2].setBackgroundResource(R.drawable.red4);
                array[i2].setTag("red4");
            } else {
                array[i2].setBackgroundResource(R.drawable.red);
                array[i2].setTag("red");

            }
            //button i3 check
            if (array[i3].getTag().equals("red") || array[i3].getTag().equals("green")) {
                array[i3].setBackgroundResource(R.drawable.red2);
                array[i3].setTag("red2");
            } else if (array[i3].getTag().equals("red2") || array[i3].getTag().equals("green2")) {
                array[i3].setBackgroundResource(R.drawable.red3);
                array[i3].setTag("red3");
            } else if (array[i3].getTag().equals("red3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.red4);
                array[i3].setTag("red4");
            } else {
                array[i3].setBackgroundResource(R.drawable.red);
                array[i3].setTag("red");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");

            check();
        }
        //green check button i
        else if (array[i].getTag().equals("green3")) {
            //button i1 check
            if (array[i1].getTag().equals("green") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.green2);
                array[i1].setTag("green2");
            } else if (array[i1].getTag().equals("green2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.green3);
                array[i1].setTag("green3");
            } else if (array[i1].getTag().equals("green3") || array[i1].getTag().equals("red3")) {
                array[i1].setBackgroundResource(R.drawable.green4);
                array[i1].setTag("green4");
            } else {
                array[i1].setBackgroundResource(R.drawable.green);
                array[i1].setTag("green");

            }
            //button i2 check
            if (array[i2].getTag().equals("green") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.green2);
                array[i2].setTag("green2");
            } else if (array[i2].getTag().equals("green2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.green3);
                array[i2].setTag("green3");
            } else if (array[i2].getTag().equals("green3") || array[i2].getTag().equals("red3")) {
                array[i2].setBackgroundResource(R.drawable.green4);
                array[i2].setTag("green4");
            } else {
                array[i2].setBackgroundResource(R.drawable.green);
                array[i2].setTag("green");

            }
            //button i3 check
            if (array[i3].getTag().equals("green") || array[i3].getTag().equals("red")) {
                array[i3].setBackgroundResource(R.drawable.green2);
                array[i3].setTag("green2");
            } else if (array[i3].getTag().equals("green2") || array[i3].getTag().equals("red2")) {
                array[i3].setBackgroundResource(R.drawable.green3);
                array[i3].setTag("green3");
            } else if (array[i3].getTag().equals("green3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.green4);
                array[i3].setTag("green4");
            } else {
                array[i3].setBackgroundResource(R.drawable.green);
                array[i3].setTag("green");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }
        //blue check button i
        else if (array[i].getTag().equals("blue3")) {
            //button i1 check
            if (array[i1].getTag().equals("blue") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.blue2);
                array[i1].setTag("blue2");
            } else if (array[i1].getTag().equals("blue2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.blue3);
                array[i1].setTag("blue3");
            } else if (array[i1].getTag().equals("blue3") || array[i1].getTag().equals("red3")) {
                array[i1].setBackgroundResource(R.drawable.blue4);
                array[i1].setTag("blue4");
            } else {
                array[i1].setBackgroundResource(R.drawable.blue);
                array[i1].setTag("blue");

            }
            //button i2 check
            if (array[i2].getTag().equals("blue") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.blue2);
                array[i2].setTag("blue2");
            } else if (array[i2].getTag().equals("blue2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.blue3);
                array[i2].setTag("blue3");
            } else if (array[i2].getTag().equals("blue3") || array[i2].getTag().equals("red3")) {
                array[i2].setBackgroundResource(R.drawable.blue4);
                array[i2].setTag("blue4");
            } else {
                array[i2].setBackgroundResource(R.drawable.blue);
                array[i2].setTag("blue");

            }
            //button i3 check
            if (array[i3].getTag().equals("blue") || array[i3].getTag().equals("red")) {
                array[i3].setBackgroundResource(R.drawable.blue2);
                array[i3].setTag("blue2");
            } else if (array[i3].getTag().equals("blue2") || array[i3].getTag().equals("red2")) {
                array[i3].setBackgroundResource(R.drawable.blue3);
                array[i3].setTag("blue3");
            } else if (array[i3].getTag().equals("blue3") || array[i3].getTag().equals("red3")) {
                array[i3].setBackgroundResource(R.drawable.blue4);
                array[i3].setTag("blue4");
            } else {
                array[i3].setBackgroundResource(R.drawable.blue);
                array[i3].setTag("blue");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }
    }

    private void check2(int i, int i1, int i2) {


        //red check button i
        if (array[i].getTag().equals("red2")) {
            //button i1 check
            if (array[i1].getTag().equals("red") || array[i1].getTag().equals("green")) {
                array[i1].setBackgroundResource(R.drawable.red2);
                array[i1].setTag("red2");

            } else if (array[i1].getTag().equals("red2") || array[i1].getTag().equals("green2")) {
                array[i1].setBackgroundResource(R.drawable.red3);
                array[i1].setTag("red3");
            } else {
                array[i1].setBackgroundResource(R.drawable.red);
                array[i1].setTag("red");

            }
            //button i2 check
            if (array[i2].getTag().equals("red") || array[i2].getTag().equals("green")) {
                array[i2].setBackgroundResource(R.drawable.red2);
                array[i2].setTag("red2");
            } else if (array[i2].getTag().equals("red2") || array[i2].getTag().equals("green2")) {
                array[i2].setBackgroundResource(R.drawable.red3);
                array[i2].setTag("red3");
            } else {
                array[i2].setBackgroundResource(R.drawable.red);
                array[i2].setTag("red");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();

        }
        //green check button i
        else if (array[i].getTag().equals("green2")) {
            //button i1 check
            if (array[i1].getTag().equals("green") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.green2);
                array[i1].setTag("green2");
            } else if (array[i1].getTag().equals("green2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.green3);
                array[i1].setTag("green3");
            } else {
                array[i1].setBackgroundResource(R.drawable.green);
                array[i1].setTag("green");

            }
            //button i2 check
            if (array[i2].getTag().equals("green") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.green2);
                array[i2].setTag("green2");
            } else if (array[i2].getTag().equals("green2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.green3);
                array[i2].setTag("green3");
            } else {
                array[i2].setBackgroundResource(R.drawable.green);
                array[i2].setTag("green");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }//blue check button i
        else if (array[i].getTag().equals("blue2")) {
            //button i1 check
            if (array[i1].getTag().equals("blue") || array[i1].getTag().equals("red")) {
                array[i1].setBackgroundResource(R.drawable.blue2);
                array[i1].setTag("blue2");
            } else if (array[i1].getTag().equals("blue2") || array[i1].getTag().equals("red2")) {
                array[i1].setBackgroundResource(R.drawable.blue3);
                array[i1].setTag("blue3");
            } else {
                array[i1].setBackgroundResource(R.drawable.blue);
                array[i1].setTag("blue");

            }
            //button i2 check
            if (array[i2].getTag().equals("blue") || array[i2].getTag().equals("red")) {
                array[i2].setBackgroundResource(R.drawable.blue2);
                array[i2].setTag("blue2");
            } else if (array[i2].getTag().equals("blue2") || array[i2].getTag().equals("red2")) {
                array[i2].setBackgroundResource(R.drawable.blue3);
                array[i2].setTag("blue3");
            } else {
                array[i2].setBackgroundResource(R.drawable.blue);
                array[i2].setTag("blue");

            }
            array[i].setBackgroundResource(R.drawable.toe);
            array[i].setTag(" ");
            check();
        }

    }

    private void turnchk() {
        //turn check
        //colourSwitch(0);
        if (Users == 2) {
            if (turn == 1) {


                for (int i = 0; i < 150; i++) {
                    array[i].setImageResource(R.drawable.border_red);
                }
                // tableLayout.setBackgroundResource(R.drawable.border_red);
                //  imageView.setBackgroundResource(R.drawable.background_red);
                //   Toast.makeText(this, "Red's turn", Toast.LENGTH_SHORT).show();
            } else if (turn == 2) {


                for (int i = 0; i < 150; i++) {
                    array[i].setImageResource(R.drawable.border_green);
                }
                // tableLayout.setBackgroundResource(R.drawable.border_green);
                //   imageView.setBackgroundResource(R.drawable.background_green);
                //  Toast.makeText(this, "Green's turn", Toast.LENGTH_SHORT).show();
            }
        } else if (Users == 3) {
            resultchkOut();
            if (turn == 1) {
                if (RedOut) {
                    turn = 2;
                    turnchk();
                } else {

                    //  tableLayout.setBackgroundResource(R.drawable.border_red);
                    for (int i = 0; i < 150; i++) {
                        array[i].setImageResource(R.drawable.border_red);
                    }//  imageView.setBackgroundResource(R.drawable.background_red);
                    //   Toast.makeText(this, "Red's turn", Toast.LENGTH_SHORT).show();
                }
            } else if (turn == 2) {
                if (GreenOut) {
                    turn = 3;
                    turnchk();
                } else {

                    //tableLayout.setBackgroundResource(R.drawable.border_green);
                    for (int i = 0; i < 150; i++) {
                        array[i].setImageResource(R.drawable.border_green);
                    }
                    //   imageView.setBackgroundResource(R.drawable.background_green);
                    //  Toast.makeText(this, "Green's turn", Toast.LENGTH_SHORT).show();
                }
            } else if (turn == 3) {
                if (BlueOut) {
                    turn = 1;
                    turnchk();
                } else {

                    // tableLayout.setBackgroundResource(R.drawable.border_blue);
                    for (int i = 0; i < 150; i++) {
                        array[i].setImageResource(R.drawable.border_blue);
                    }
                    //   imageView.setBackgroundResource(R.drawable.background_green);
                    //  Toast.makeText(this, "Green's turn", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void initialize() {


        turn = 1;
        green = false;
        red = false;
        blue = false;
        RedOut = false;
        GreenOut = false;
        BlueOut = false;
        tableLayout = findViewById(R.id.tableLayout2);
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
        button51 = findViewById(R.id.button51);
        button52 = findViewById(R.id.button52);
        button53 = findViewById(R.id.button53);
        button54 = findViewById(R.id.button54);
        button55 = findViewById(R.id.button55);
        button56 = findViewById(R.id.button56);
        button57 = findViewById(R.id.button57);
        button58 = findViewById(R.id.button58);
        button59 = findViewById(R.id.button59);
        button60 = findViewById(R.id.button60);
        button61 = findViewById(R.id.button61);
        button62 = findViewById(R.id.button62);
        button63 = findViewById(R.id.button63);
        button64 = findViewById(R.id.button64);
        button65 = findViewById(R.id.button65);
        button66 = findViewById(R.id.button66);
        button67 = findViewById(R.id.button67);
        button68 = findViewById(R.id.button68);
        button69 = findViewById(R.id.button69);
        button70 = findViewById(R.id.button70);
        button71 = findViewById(R.id.button71);
        button72 = findViewById(R.id.button72);
        button73 = findViewById(R.id.button73);
        button74 = findViewById(R.id.button74);
        button75 = findViewById(R.id.button75);
        button76 = findViewById(R.id.button76);
        button77 = findViewById(R.id.button77);
        button78 = findViewById(R.id.button78);
        button79 = findViewById(R.id.button79);
        button80 = findViewById(R.id.button80);
        button81 = findViewById(R.id.button81);
        button82 = findViewById(R.id.button82);
        button83 = findViewById(R.id.button83);
        button84 = findViewById(R.id.button84);
        button85 = findViewById(R.id.button85);
        button86 = findViewById(R.id.button86);
        button87 = findViewById(R.id.button87);
        button88 = findViewById(R.id.button88);
        button89 = findViewById(R.id.button89);
        button90 = findViewById(R.id.button90);
        button91 = findViewById(R.id.button91);
        button92 = findViewById(R.id.button92);
        button93 = findViewById(R.id.button93);
        button94 = findViewById(R.id.button94);
        button95 = findViewById(R.id.button95);
        button96 = findViewById(R.id.button96);
        button97 = findViewById(R.id.button97);
        button98 = findViewById(R.id.button98);
        button99 = findViewById(R.id.button99);
        button100 = findViewById(R.id.button100);
        button101 = findViewById(R.id.button101);
        button102 = findViewById(R.id.button102);
        button103 = findViewById(R.id.button103);
        button104 = findViewById(R.id.button104);
        button105 = findViewById(R.id.button105);
        button106 = findViewById(R.id.button106);
        button107 = findViewById(R.id.button107);
        button108 = findViewById(R.id.button108);
        button109 = findViewById(R.id.button109);
        button110 = findViewById(R.id.button110);
        button111 = findViewById(R.id.button111);
        button112 = findViewById(R.id.button112);
        button113 = findViewById(R.id.button113);
        button114 = findViewById(R.id.button114);
        button115 = findViewById(R.id.button115);
        button116 = findViewById(R.id.button116);
        button117 = findViewById(R.id.button117);
        button118 = findViewById(R.id.button118);
        button119 = findViewById(R.id.button119);
        button120 = findViewById(R.id.button120);
        button121 = findViewById(R.id.button121);
        button122 = findViewById(R.id.button122);
        button123 = findViewById(R.id.button123);
        button124 = findViewById(R.id.button124);
        button125 = findViewById(R.id.button125);
        button126 = findViewById(R.id.button126);
        button127 = findViewById(R.id.button127);
        button128 = findViewById(R.id.button128);
        button129 = findViewById(R.id.button129);
        button130 = findViewById(R.id.button130);
        button131 = findViewById(R.id.button131);
        button132 = findViewById(R.id.button132);
        button133 = findViewById(R.id.button133);
        button134 = findViewById(R.id.button134);
        button135 = findViewById(R.id.button135);
        button136 = findViewById(R.id.button136);
        button137 = findViewById(R.id.button137);
        button138 = findViewById(R.id.button138);
        button139 = findViewById(R.id.button139);
        button140 = findViewById(R.id.button140);
        button141 = findViewById(R.id.button141);
        button142 = findViewById(R.id.button142);
        button143 = findViewById(R.id.button143);
        button144 = findViewById(R.id.button144);
        button145 = findViewById(R.id.button145);
        button146 = findViewById(R.id.button146);
        button147 = findViewById(R.id.button147);
        button148 = findViewById(R.id.button148);
        button149 = findViewById(R.id.button149);
        button150 = findViewById(R.id.button150);
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
        array[25] = button26;
        array[26] = button27;
        array[27] = button28;
        array[28] = button29;
        array[29] = button30;
        array[30] = button31;
        array[31] = button32;
        array[32] = button33;
        array[33] = button34;
        array[34] = button35;
        array[35] = button36;
        array[36] = button37;
        array[37] = button38;
        array[38] = button39;
        array[39] = button40;
        array[40] = button41;
        array[41] = button42;
        array[42] = button43;
        array[43] = button44;
        array[44] = button45;
        array[45] = button46;
        array[46] = button47;
        array[47] = button48;
        array[48] = button49;
        array[49] = button50;
        array[50] = button51;
        array[51] = button52;
        array[52] = button53;
        array[53] = button54;
        array[54] = button55;
        array[55] = button56;
        array[56] = button57;
        array[57] = button58;
        array[58] = button59;
        array[59] = button60;
        array[60] = button61;
        array[61] = button62;
        array[62] = button63;
        array[63] = button64;
        array[64] = button65;
        array[65] = button66;
        array[66] = button67;
        array[67] = button68;
        array[68] = button69;
        array[69] = button70;
        array[70] = button71;
        array[71] = button72;
        array[72] = button73;
        array[73] = button74;
        array[74] = button75;
        array[75] = button76;
        array[76] = button77;
        array[77] = button78;
        array[78] = button79;
        array[79] = button80;
        array[80] = button81;
        array[81] = button82;
        array[82] = button83;
        array[83] = button84;
        array[84] = button85;
        array[85] = button86;
        array[86] = button87;
        array[87] = button88;
        array[88] = button89;
        array[89] = button90;
        array[90] = button91;
        array[91] = button92;
        array[92] = button93;
        array[93] = button94;
        array[94] = button95;
        array[95] = button96;
        array[96] = button97;
        array[97] = button98;
        array[98] = button99;
        array[99] = button100;
        array[100] = button101;
        array[101] = button102;
        array[102] = button103;
        array[103] = button104;
        array[104] = button105;
        array[105] = button106;
        array[106] = button107;
        array[107] = button108;
        array[108] = button109;
        array[109] = button110;
        array[110] = button111;
        array[111] = button112;
        array[112] = button113;
        array[113] = button114;
        array[114] = button115;
        array[115] = button116;
        array[116] = button117;
        array[117] = button118;
        array[118] = button119;
        array[119] = button120;
        array[120] = button121;
        array[121] = button122;
        array[122] = button123;
        array[123] = button124;
        array[124] = button125;
        array[125] = button126;
        array[126] = button127;
        array[127] = button128;
        array[128] = button129;
        array[129] = button130;
        array[130] = button131;
        array[131] = button132;
        array[132] = button133;
        array[133] = button134;
        array[134] = button135;
        array[135] = button136;
        array[136] = button137;
        array[137] = button138;
        array[138] = button139;
        array[139] = button140;
        array[140] = button141;
        array[141] = button142;
        array[142] = button143;
        array[143] = button144;
        array[144] = button145;
        array[145] = button146;
        array[146] = button147;
        array[147] = button148;
        array[148] = button149;
        array[149] = button150;
        for (int i = 0; i < 150; i++) {
            array[i].setTag(" ");
            /**
             final int finalI = i;
             Runnable runnable = new Runnable() {
            @Override public void run() {
            array[finalI].animate().rotationBy(360).withEndAction(this).setDuration(6000).setInterpolator(new LinearInterpolator()).start();
            }
            };
             array[finalI].animate().rotationBy(360).withEndAction(runnable).setDuration(6000).setInterpolator(new LinearInterpolator()).start();
             **/
        }
        for (int i = 0; i < 150; i++) {

            // array[i].setBackgroundColor(Color.rgb(100, 100, 50));

        }


    }

    void colourSwitch(final int j) {

        final int min = 1;
        final int max = 168;

        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i;

            public void run() {
                for (i = j; i < 150; i++) {
                    Colour_box_no = i;
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            array[i].setBackgroundColor(Color.rgb(new Random().nextInt((max - min) + 1) + min, new Random().nextInt((max - min) + 1) + min, new Random().nextInt((max - min) + 1) + min));
                            if (i != 0) {

                                if (array[i - 1].getTag().equals(" ")) {
                                    array[i - 1].setBackgroundResource(R.drawable.toe);
                                } else if (array[i - 1].getTag().equals("red")) {
                                    array[i - 1].setBackgroundResource(R.drawable.red);
                                } else if (array[i - 1].getTag().equals("green")) {
                                    array[i - 1].setBackgroundResource(R.drawable.green);
                                } else if (array[i - 1].getTag().equals("blue")) {
                                    array[i - 1].setBackgroundResource(R.drawable.blue);
                                } else if (array[i - 1].getTag().equals("red2")) {
                                    array[i - 1].setBackgroundResource(R.drawable.red2);
                                } else if (array[i - 1].getTag().equals("blue2")) {
                                    array[i - 1].setBackgroundResource(R.drawable.blue2);
                                } else if (array[i - 1].getTag().equals("green2")) {
                                    array[i - 1].setBackgroundResource(R.drawable.green2);
                                } else if (array[i - 1].getTag().equals("red3")) {
                                    array[i - 1].setBackgroundResource(R.drawable.red3);
                                } else if (array[i - 1].getTag().equals("blue3")) {
                                    array[i - 1].setBackgroundResource(R.drawable.blue3);
                                } else if (array[i - 1].getTag().equals("green3")) {
                                    array[i - 1].setBackgroundResource(R.drawable.green3);
                                } else if (array[i - 1].getTag().equals("red4")) {
                                    array[i - 1].setBackgroundResource(R.drawable.red4);
                                } else if (array[i - 1].getTag().equals("blue4")) {
                                    array[i - 1].setBackgroundResource(R.drawable.blue4);
                                } else if (array[i - 1].getTag().equals("green4")) {
                                    array[i - 1].setBackgroundResource(R.drawable.green4);
                                }
                            }
                            if (i == 149) {

                                if (array[i].getTag().equals(" ")) {
                                    array[i].setBackgroundResource(R.drawable.toe);
                                } else if (array[i].getTag().equals("red")) {
                                    array[i].setBackgroundResource(R.drawable.red);
                                } else if (array[i].getTag().equals("green")) {
                                    array[i].setBackgroundResource(R.drawable.green);
                                } else if (array[i].getTag().equals("blue")) {
                                    array[i].setBackgroundResource(R.drawable.blue);
                                } else if (array[i].getTag().equals("red2")) {
                                    array[i].setBackgroundResource(R.drawable.red2);
                                } else if (array[i].getTag().equals("blue2")) {
                                    array[i].setBackgroundResource(R.drawable.blue2);
                                } else if (array[i].getTag().equals("green2")) {
                                    array[i].setBackgroundResource(R.drawable.green2);
                                } else if (array[i].getTag().equals("red3")) {
                                    array[i].setBackgroundResource(R.drawable.red3);
                                } else if (array[i].getTag().equals("blue3")) {
                                    array[i].setBackgroundResource(R.drawable.blue3);
                                } else if (array[i].getTag().equals("green3")) {
                                    array[i].setBackgroundResource(R.drawable.green3);
                                } else if (array[i].getTag().equals("red4")) {
                                    array[i].setBackgroundResource(R.drawable.red4);
                                } else if (array[i].getTag().equals("blue4")) {
                                    array[i].setBackgroundResource(R.drawable.blue4);
                                } else if (array[i].getTag().equals("green4")) {
                                    array[i].setBackgroundResource(R.drawable.green4);
                                }
                            }
                        }
                    }, 0);
                    //Add some downtime

                    SystemClock.sleep(60);

                }
            }
        };
        new Thread(runnable).start();
    }

}
