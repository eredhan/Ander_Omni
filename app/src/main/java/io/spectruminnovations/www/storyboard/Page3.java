package io.spectruminnovations.www.storyboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Page3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);



        Button the_github_button = (Button) findViewById(R.id.button_github);

        the_github_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Android-at-The-Library"));
                startActivity(i);
            }

        });

        Button button_for_the_maps = (Button) findViewById(R.id.button_map);

        button_for_the_maps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Mission+Bay+Library/@37.775268,-122.393179,15z/data=!4m2!3m1!1s0x0:0x1cb0b20e79bf1367?sa=X&ei=gKToVOnSH4_UoATItYDoDg&ved=0CIABEPwSMAs"));
                startActivity(i);
            }

        });

        Button next_page_button = (Button) findViewById(R.id.button_page_4);

        next_page_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // write something to do if clicked below

                Intent intent = new Intent(Page3.this, Page4.class);
                startActivity(intent);
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page3, menu);
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
