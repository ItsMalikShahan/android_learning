package com.example.androidpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DialogActivity extends AppCompatActivity implements ExampleDialog.ExampleDialogInterface {

    TextView userName, userPassword;
    Button openDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        userName = findViewById(R.id.tv_userName);
        userPassword = findViewById(R.id.tv_password);
        openDialog = findViewById(R.id.btn_openDialog);
        openDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    private void openDialog(){
       ExampleDialog exampleDialog = new ExampleDialog();
       exampleDialog.show(getSupportFragmentManager(),"exampleDialog");
    }

    @Override
    public void applyText(String username, String password) {
        userName.setText(username);
        userPassword.setText(password);
    }
}