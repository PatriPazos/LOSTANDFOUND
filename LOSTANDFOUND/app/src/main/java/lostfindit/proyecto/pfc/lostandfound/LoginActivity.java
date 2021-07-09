package lostfindit.proyecto.pfc.lostandfound;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


import static lostfindit.proyecto.pfc.lostandfound.R.layout.activity_login;
import static lostfindit.proyecto.pfc.lostandfound.R.layout.usuario;



public class LoginActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(activity_login);
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,Usuario.class);
                startActivity(i);
            }
        });


    }
    public void onClickregistro(View view){
        Intent i = new Intent(LoginActivity.this, RegistryActivity.class);
        startActivity(i);

    }
}