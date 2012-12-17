package fr.xebia.xndfandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import fr.xebia.xndfandroid.util.Connectivity;

public class XndfActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // This is to test the Connectivity util class, it can be removed
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Connected: " + Connectivity.isConnected());
        textView.append(" - Wifi: " + Connectivity.isWifiActivated());
        textView.append(" - Mobile: " + Connectivity.isMobileActivated());
    }
}
