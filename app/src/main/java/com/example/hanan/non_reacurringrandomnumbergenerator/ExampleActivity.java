package com.example.hanan.non_reacurringrandomnumbergenerator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.pbdapps.hanan.library.NumberGenerator;


public class ExampleActivity extends ActionBarActivity {

    NumberGenerator numberGenerator;
    int initialOrganNum;
    TextView outPutText;
    Switch randomType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        numberGenerator = new NumberGenerator();

        outPutText = (TextView) findViewById(R.id.txtNumOutPut);
        randomType = (Switch) findViewById(R.id.switch1);

        findViewById(R.id.btnSetInitialOrgans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initialOrganNum = Integer.parseInt(((EditText) findViewById(R.id.edTxtSetOrganNum)).getText().toString());
                numberGenerator.setInitialOrganCount(initialOrganNum);
                outPutText.setText("");
            }
        });

        findViewById(R.id.btnGetNum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result;
                if (randomType.isChecked()) {
                    result = numberGenerator.getRandomNonReoccurringNumber();
                } else {
                    result = numberGenerator.getRandomNumber();
                }
                if (result != -1) {
                    String outPut = outPutText.getText().toString();
                    outPut += " " + result + ",";
                    outPutText.setText(outPut);
                } else {
                    Toast.makeText(view.getContext(), "Random Iteration over", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example, menu);
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
}
