package com.example.kyleschmidt.mynanodegreeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button movieClick = (Button) findViewById(R.id.movies);
        movieClick.setOnClickListener(this);

        Button stocksClick = (Button) findViewById(R.id.stocks);
        stocksClick.setOnClickListener(this);

        Button biggerClick = (Button) findViewById(R.id.bigger);
        biggerClick.setOnClickListener(this);

        Button materialClick = (Button) findViewById(R.id.material);
        materialClick.setOnClickListener(this);

        Button ubiquitousClick = (Button) findViewById(R.id.ubiquitous);
        ubiquitousClick.setOnClickListener(this);

        Button capstoneClick = (Button) findViewById(R.id.capstone);
        capstoneClick.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        String result = "This will open your app called: ";
        switch (v.getId()){
            case R.id.movies:
                result += getString(R.string.movies);
                break;
            case R.id.stocks:
                result += getString(R.string.stocks);
                break;
            case R.id.bigger:
                result += getString(R.string.bigger);
                break;
            case R.id.material:
                result += getString(R.string.material);
                break;
            case R.id.ubiquitous:
                result += getString(R.string.ubiquitous);
                break;
            case R.id.capstone:
                result += getString(R.string.capstone);
                break;
            default:break;

        }
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}
