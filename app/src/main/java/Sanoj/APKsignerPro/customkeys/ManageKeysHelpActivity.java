package Sanoj.APKsignerPro.customkeys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import Sanoj.logging.LoggerManager;
import Sanoj.logging.android.AndroidLogger;
import Sanoj.logging.android.AndroidLoggerFactory;
import Sanoj.APKsignerPro.R;

public class ManageKeysHelpActivity extends Activity {

    AndroidLogger logger = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        LoggerManager.setLoggerFactory(new AndroidLoggerFactory());

        logger = (AndroidLogger)LoggerManager.getLogger(this.getClass().getName());
        // enable toasts for info level logging.  toasts are default for error and warnings.
        logger.setToastContext(getBaseContext());
        logger.setInfoToastEnabled(true);

        setContentView(R.layout.manage_keys_help);

        ((TextView)findViewById(R.id.P4)).setVisibility(View.GONE);

        Button button = (Button)findViewById(R.id.OkButton);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}