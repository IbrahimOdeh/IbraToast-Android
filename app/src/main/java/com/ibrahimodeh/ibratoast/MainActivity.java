package com.ibrahimodeh.ibratoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ibrahimodeh.ibratoastlib.IbraToast;

public class MainActivity extends AppCompatActivity {

    private Button Success, Error, Info, Dark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Success = (Button) findViewById(R.id.SuccessToast);
        Error = (Button) findViewById(R.id.ErrorToast);
        Info = (Button) findViewById(R.id.InfoToast);
        Dark = (Button) findViewById(R.id.DarkSToast);


        Success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IbraToast.makeText(MainActivity.this, "Success !", Toast.LENGTH_SHORT, 1).show();
            }
        });

        Error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IbraToast.makeText(MainActivity.this, "Error !", Toast.LENGTH_SHORT, 2).show();
            }
        });

        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IbraToast.makeText(MainActivity.this, "Info", Toast.LENGTH_SHORT, 3).show();
            }
        });

        Dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IbraToast.makeText(MainActivity.this, "Dark Toast", Toast.LENGTH_SHORT, 4).show();
            }
        });
    }
}
