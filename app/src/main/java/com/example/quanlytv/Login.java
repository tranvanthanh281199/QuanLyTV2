package com.example.quanlytv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends AppCompatActivity {
    private Button btnLogin, btnHuy;
    private EditText txtUser, txtPass;
    Dialog dialog;
    TextView txtDK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUser=(EditText)findViewById(R.id.txtUser);
        txtPass=(EditText)findViewById(R.id.txtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtUser.getText().toString().equals("admin") && txtPass.getText().toString().equals("admin")) {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnHuy = (Button) findViewById(R.id.btnHuy);
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtUser.setText("");
                txtPass.setText("");
            }
        });

        txtDK = (TextView) findViewById(R.id.txtDK);
        txtDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDK();
                }

        });
    }

    public void showDK(){
        dialog = new Dialog(Login.this, R.style.AppTheme_PopupOverlay);
        dialog.setTitle("title");
        dialog.setContentView(R.layout.activity_dang_ky_tk);
        dialog.show();
        Window window = dialog.getWindow();
        window.setLayout(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
    }
}
