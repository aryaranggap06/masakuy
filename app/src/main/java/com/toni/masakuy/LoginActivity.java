package com.toni.masakuy;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener {

    SignInButton signInButton;
    private GoogleApiClient googleApiClient;
    TextView textView;
    private static final int RC_SIGN_IN = 1;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_logingoogle);

        //final EditText mUsername, mEmail, mPass;
        //Button btnRegis;
        //final FirebaseAuth fAuth;

            //mUsername = findViewById(R.id.mUsername);
            //mEmail = findViewById(R.id.mEmail);
            //mPass = findViewById(R.id.mPass);

            //btnRegis = findViewById(R.id.btn_login);

            //fAuth = FirebaseAuth.getInstance();

            //btnRegis.setOnClickListener(new View.OnClickListener() {
              //  @Override
                //public void onClick(View v) {
                  //  Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    //startActivity(intent);
                    //finish();
                //}
           // });

        GoogleSignInOptions gso =  new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        googleApiClient=new GoogleApiClient.Builder(this)
                .enableAutoManage(this,this)
                .addApi(Auth.GOOGLE_SIGN_IN_API,gso)
                .build();

        signInButton=(SignInButton)findViewById(R.id.sign_in_button);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleApiClient);
                startActivityForResult(intent,RC_SIGN_IN);
            }
        });

            //btnRegis.setOnClickListener(new View.OnClickListener() {
              //  @Override
                //public void onClick(View v) {
                  //String email = mEmail.getText().toString().trim();
                    //String password = mPass.getText().toString().trim();
                    //String username = mUsername.getText().toString().trim();

                    //if(TextUtils.isEmpty(username)) {
                        //mEmail.setError("Mohon Isi Username !");
                    //}

                    //if(TextUtils.isEmpty(email)) {
                        //mEmail.setError("Mohon Isi Email !");
                    //}

                    //if(TextUtils.isEmpty(password)) {
                        //mPass.setError("Mohon Isi Password !");
                    //}

                    //fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        //@Override
                        //public void onComplete(@NonNull Task<AuthResult> task) {
                            //if(task.isSuccessful()) {
                               // Toast.makeText(LoginActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                                //startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                            //}
                            //else {
                                //Toast.makeText(LoginActivity.this, "Error !"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            //}
                        //}
                    //});
               // }
           // });

//        Button btnlogin = findViewById(R.id.btn_login);
//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        //if(fAuth.getCurrentUser() != null) {
          //  startActivity(new Intent(getApplicationContext(), MenuActivity.class));
        //}

        //Button btnregis = findViewById(R.id.btn_register);

        //btnregis.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                //startActivity(intent);
                //finish();
           // }
        //});

    }

    private void handleSignInResult(GoogleSignInResult result) {
        if(result.isSuccess()){
            gotoMenu();
        }else{
            Toast.makeText(getApplicationContext(),"Sign in cancel",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RC_SIGN_IN){
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
        }
    }


    private void gotoMenu(){
        Intent intent=new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this," ", Toast.LENGTH_LONG).show();

    }
}