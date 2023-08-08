package com.example.guessnumber;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import  java.util.Random;



public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    Random rand;
    int rand_int1;

    public  int Randomize(){

        rand = new Random();
        rand_int1 = rand.nextInt(20)+1;
        return rand_int1;

    }
    public  void guess(View view){


        String s = editText.getText().toString();
        //int a = Integer.parseInt(s);
        if(s.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter a number", Toast.LENGTH_SHORT).show();
        }
        else
        if(rand_int1 < Integer.parseInt(s)){
            Toast.makeText(MainActivity.this,"Greater than desired no.",Toast.LENGTH_LONG).show();
        }
        else if(rand_int1 > Integer.parseInt(s)) {
            Toast.makeText(MainActivity.this,"Less than desired no.",Toast.LENGTH_LONG).show();
        }

        else{
            Toast.makeText(MainActivity.this,"You've guessed it! TRY AGAIN!!!!",Toast.LENGTH_LONG).show();

            rand_int1=Randomize();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById (R.id.button);
        editText = findViewById (R.id.editText);

        rand = new Random();
        rand_int1 = Randomize();

    }
}