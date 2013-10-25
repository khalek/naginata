package se.khalek.naginata;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RootActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		String content = String.format(getString(R.string.hello_world), getString(R.string.app_name));

		TextView text = (TextView) findViewById(R.id.text);
		text.setText(content);
    }
}
