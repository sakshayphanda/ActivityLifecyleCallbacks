package com.sakshay.androidlifecycle;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText simpleET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "on create", Toast.LENGTH_SHORT).show();

        simpleET =(EditText) findViewById(R.id.et);
/*        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("hey");
        progressDialog.show();*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on pause ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "on restart ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on destroy ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on stop ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume ", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "onSaveInstanceState called(Screen rotated)", Toast.LENGTH_SHORT).show();
        outState.putString("simple",simpleET.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "onRestoreInstanceState : "+savedInstanceState.getString("simple"), Toast.LENGTH_SHORT).show();

    }
}
