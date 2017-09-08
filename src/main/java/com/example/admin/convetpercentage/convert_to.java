package com.example.admin.convetpercentage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PublicKey;


public class convert_to extends AppCompatActivity {
    Button n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_to);
        n = (Button) findViewById(R.id.next);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(convert_to.this , student_marks.class);
               double ans=onDivideClick();
                i.putExtra("y/x", +ans);
                startActivity(i);

            }
        });
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_convert_to, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public double onDivideClick() {
        double  result1;
        EditText a1 = (EditText) findViewById(R.id.enter_total_marks);
            EditText a2 = (EditText) findViewById(R.id.enter_recduction_marks);
            int x, y;
            x = Integer.parseInt(a1.getText().toString());
            y = Integer.parseInt(a2.getText().toString());
             result1 = (double)y /(double) x;


        return result1;
    }
}
