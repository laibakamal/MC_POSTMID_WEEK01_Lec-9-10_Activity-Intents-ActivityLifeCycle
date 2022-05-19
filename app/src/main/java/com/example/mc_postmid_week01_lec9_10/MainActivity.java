package com.example.mc_postmid_week01_lec9_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent;
                switch (view.getId())
                {
                    case R.id.buttonOpenSecodActivity:
                        intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                        break;
                    case R.id.buttonCallingIntent:
                        Uri uri = Uri.parse("tel:+923001234567");
                        intent = new Intent(Intent.ACTION_DIAL, uri);
                        startActivity(intent);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + view.getId());
                }
            }
        });

    }
}
