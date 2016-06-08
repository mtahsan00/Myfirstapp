package com.mtashan.cool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int random;
    Random randomGen = new Random();
    public static String message;
   public static String messagetwo;

    public int levelselect(View view){
        EditText leva = (EditText) findViewById(R.id.Level);
        String levas = leva.getText().toString();
        if(levas.matches("")){
            messagetwo = "please enter a valid response";
            Toast.makeText(getApplicationContext(), messagetwo, Toast.LENGTH_SHORT).show();
            return 1;
        }
        else{
            int levast = Integer.parseInt(leva.getText().toString());
            if(levast == 1){
                messagetwo = "You Have selected level one";
                Toast.makeText(getApplicationContext(), messagetwo, Toast.LENGTH_SHORT).show();
                return 21;
            }else if(levast == 2) {
                messagetwo = "You have selected level two";
                Toast.makeText(getApplicationContext(), messagetwo, Toast.LENGTH_SHORT).show();
                return 101;
            }else if(levast == 3){
                messagetwo = "You have selected level three";
                Toast.makeText(getApplicationContext(), messagetwo, Toast.LENGTH_SHORT).show();
                return 501;
            }else {
                messagetwo = "please enter a valid response";
                Toast.makeText(getApplicationContext(), messagetwo, Toast.LENGTH_SHORT).show();
                return 1;
            }
        }

    }

    public void clickFunction(View view) {
        EditText numba = (EditText) findViewById(R.id.Hey);
        String nambas = numba.getText().toString();
        if ( nambas.matches("")) {
                message = "please enter something";
        } else {
            int numbas = Integer.parseInt(numba.getText().toString());

            if (numbas > random) {
                message = "your number is too high";
            } else if (numbas < random) {
                message = "your number is too low";
            }  else {
                message = "Your Number is correct! Try again!";
                random = randomGen.nextInt(levelselect(view));
                System.out.println(random);
            }
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = randomGen.nextInt(1);
        System.out.print(random);

    }
}

