package com.example.admin.convetpercentage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class student_marks extends AppCompatActivity {
Button d;
    double m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_student_marks);
         d=(Button) findViewById(R.id.done);
         m=(getIntent().getExtras().getDouble("y/x"));
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View q) {
                onClickMultiply(m);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_marks, menu);
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
    public void onClickMultiply(double result2 )
    {
       {

            EditText a3 = (EditText) findViewById(R.id.student_marks);
            int z;
            z = Integer.parseInt(a3.getText().toString());

            double result3 = z * result2;
           int result4=(int)result3;
           if((result3-result4)<=0.5)
           {
               TextView t=(TextView)findViewById(R.id.tvfinalresult);
               t.setText(""+result4);

           }
           else
           {
               TextView t=(TextView)findViewById(R.id.tvfinalresult);
               int result5=result4+1;
               t.setText(""+(result5));
           }



       }

        }
    }
