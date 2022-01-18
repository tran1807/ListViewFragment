package com.example.listviewfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t=manager.beginTransaction();
        Myfrag1 m1 = new Myfrag1();
        t.add(R.id.frame1,m1);
        t.commit();
    }

    public void fl(String s) {
        FragmentManager manager1 = getSupportFragmentManager();
        FragmentTransaction t1=manager1.beginTransaction();
        Myfrag2 m22= new Myfrag2();
        Bundle b2= new Bundle();
        b2.putString("s",s);
        m22.setArguments(b2);
        t1.replace(R.id.frame1,m22);
        t1.commit();

    }
}