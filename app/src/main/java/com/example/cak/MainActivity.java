package com.example.cak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edmail, edpassword;
    String nama, password;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.Button);
        edmail=findViewById(R.id.editTextTextEmailAddress);
        edpassword=findViewById(R.id.editTextTextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edmail.getText().toString();
                password = edpassword.getText().toString();

                String email = "sigit";
                String password = "1234";

                if (nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Email dan Password wajib diisi",Toast.LENGTH_LONG);
                    t.show();

                }
                else{
                    if (nama.equals(email) && password.equals(password)){
                        Toast t = Toast.makeText(getApplicationContext()
                                ,"WAS SUCCESSFUL",Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a",nama.trim());

                        b.putString("b",password.trim());

                        Intent i = new Intent(getApplicationContext(),activityKedua.class);

                        i.putExtras(b);

                        startActivity(i);

                    }
                    else{
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Failed",Toast.LENGTH_LONG);
                    }
                }

            }
        });
    }
}