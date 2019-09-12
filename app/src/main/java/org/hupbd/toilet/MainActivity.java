package org.hupbd.toilet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signin(View view) {
        Toast.makeText(getApplicationContext(),"টিপো ক্যান !",Toast.LENGTH_SHORT)
                .show();
    }

    public void Facebook(View view) {
        Toast.makeText(getApplicationContext(),"টিপো ক্যান !",Toast.LENGTH_SHORT)
                .show();
    }

    public void Google(View view) {
        Toast.makeText(getApplicationContext(),"টিপো ক্যান !",Toast.LENGTH_SHORT)
                .show();
    }

    public void Github(View view) {
        Toast.makeText(getApplicationContext(),"টিপো ক্যান !",Toast.LENGTH_SHORT)
                .show();
    }
}
