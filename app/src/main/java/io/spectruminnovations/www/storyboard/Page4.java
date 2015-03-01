package io.spectruminnovations.www.storyboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Page4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);


        Button an_sms_button = (Button) findViewById(R.id.page_4_sms_button);

        an_sms_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                String phoneNumber = "6505551234"; //Modify this, areacode & number, no spaces
                String smsMessage = "Hello from my app : )";

                Uri myUri = Uri.parse("sms:" + phoneNumber);
                Intent intent = new Intent(Intent.ACTION_SENDTO, myUri);
                intent.putExtra("sms_body", smsMessage);
                startActivity(intent);

            }

        });

        Button next_page_button = (Button) findViewById(R.id.goto_page_5_button);

        next_page_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                Intent intent = new Intent(Page4.this, Page5.class);
                startActivity(intent);

            }

        });
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page4, menu);
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
