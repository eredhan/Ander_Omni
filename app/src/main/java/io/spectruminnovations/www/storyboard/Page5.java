package io.spectruminnovations.www.storyboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Page5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);


        Button make_a_call_button = (Button) findViewById(R.id.call_button);

        make_a_call_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                String phoneNumber = "4153552838"; //replace with target number, no spaces
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }

        });

        Button next_page = (Button) findViewById(R.id.page_5_goto_next);

        next_page.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            // write something to do if clicked below
            Intent intent = new Intent(Page5.this, Page1.class );
            startActivity(intent);
        }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page5, menu);
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
