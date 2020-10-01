package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String s1[],s2[];
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = getResources().getStringArray(R.array.fgarchetypes);
        s2 = getResources().getStringArray(R.array.description);

        fgadapter fgadapter = new fgadapter(this, s1,s2 );
    }
}