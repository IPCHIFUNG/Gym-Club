package com.zifung.gymclub;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class SignupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signup_btn_clicked(View view) {

    }

    public void return_btn_clicked(View view) {
        this.finish();
    }


}
