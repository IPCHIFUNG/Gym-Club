package com.zifung.gymclub;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

import com.zifung.gymclub.user.UserInfo;

public class LoginActivity extends Activity {

    private UserInfo user_info;

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user_info = (UserInfo) getApplication();
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
    }

    public void login_btn_clicked(View view) {
        user_info.setUserName(username.getText().toString());
        user_info.setPassword(password.getText().toString());
        Intent intent = new Intent(  LoginActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        LoginActivity.this.finish();
    }

    public void sign_up_btn_clicked(View view) {
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
    }

}
