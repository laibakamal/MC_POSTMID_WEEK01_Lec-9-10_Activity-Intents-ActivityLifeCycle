package com.example.mc_postmid_week01_lec9_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
               Intent intent = new Intent(MainActivity.this, MainActivity2.class);
               startActivity(intent);
            }
        });

    }



    @Override
    protected void onCreate()
    {
        
    }
    @Override protected void onStart() { super.onStart(); Log.d(TAG, "onStart Activity Main");
    }
    @Override protected void onResume() { super. onResume(); Log.d(TAG, " onResume Activity Main");
    }
    @Override protected void onPause() { super. onPause(); Log.d(TAG, " onPause Activity Main");
    }
    @Override protected void onStop() { super. onStop(); Log.d(TAG, " onStop Activity Main");
    }
    @Override protected void onDestroy() { super. onDestroy(); Log.d(TAG, " onDestroy Activity Main");
    }
}
