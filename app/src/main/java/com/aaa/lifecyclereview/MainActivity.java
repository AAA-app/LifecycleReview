package com.aaa.lifecyclereview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cycle);

        setTitle("Life cycle");

        textView = findViewById(R.id.text_view_lifecycle);
        // test for orientation change
        if (savedInstanceState != null) {
            textView.setText(savedInstanceState.getString("textToBundle"));
        }

        Log.e("lifecycle method: ", "onCreate()");
        textView.append("onCreate() " + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle method: ", "onStart()");
        textView.append("onStart() " + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle method: ", "onResume()");
        textView.append("onResume() " + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle method: ", "onPause()");
        textView.append("onPause() " + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle method: ", "onStop()");
        textView.append("onStop() " + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle method: ", "onDestroy()");
        textView.append("onDestroy() " + "\n");
    }

    // save data for orientation change
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("textToBundle", textView.getText().toString());
        Log.e("lifecycle method: ", "onSaveInstanceState()");
        textView.append("onSaveInstanceState() " + "\n");
    }
}

