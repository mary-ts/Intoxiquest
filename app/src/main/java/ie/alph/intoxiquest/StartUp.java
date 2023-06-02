package ie.alph.intoxiquest;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class StartUp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);
    }

    public void OnClickStart(View view) {
        Intent intent = new Intent(StartUp.this, MainActivity.class);
        startActivity(intent);
    }
}
