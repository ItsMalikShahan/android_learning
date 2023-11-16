package com.example.androidpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity implements FragmentA.FragmentAListener, FragmentB.FragmentBListener {

    private FragmentA fragmentA;
    private FragmentB fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();




        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a,fragmentA)
                .replace(R.id.container_b, fragmentB)
                .commit();

//        TestFragment testFragment = TestFragment.getInstance("Hello", 123);
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragContainer,testFragment).commit();

    }

    @Override
    public void onInputASent(CharSequence inputText) {
        fragmentB.updateEditText(inputText);
    }

    @Override
    public void onInputBSent(CharSequence inputText) {
        fragmentA.updateEditText(inputText);
    }
}
