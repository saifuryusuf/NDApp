package org.syk.ndapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.syk.ndapp.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.etusername);
        password = (EditText) findViewById(R.id.etpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().toUpperCase().equals("QWERTY")){
                    login_sukses();
                }else {
                    Toast.makeText(getApplicationContext(),"password anda salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirim username ke tampilan berikutnya
        i.putExtra("USERNAME",user_login);
        startActivity(i);
    }
}
