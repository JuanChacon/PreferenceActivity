package edu.tecii.android.preferenceactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class AppPreferencesActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_app_preferences);
        addPreferencesFromResource(R.xml.myapppreferences);
    }
}
