package sreimerdevelopment.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{

    private Button btnSingle;
    private Button btnStandalone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingle = (Button) findViewById(R.id.btnPlaySingleVideo);
        btnStandalone = (Button) findViewById(R.id.btnStandalone);

        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch(view.getId()) {
            case R.id.btnPlaySingleVideo:
                intent = new Intent(MainActivity.this, StandaloneActivity.class);
                break;
            case R.id.btnStandalone:
                intent = new Intent(MainActivity.this, StandaloneActivity.class);
                break;
            default:
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
