package edu.tecii.android.preferenceactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLoad(View v){
        Intent i = new Intent(MainActivity.this,AppPreferencesActivity.class);
        startActivity(i);
    }

    public void onClickModify(View v) {
        EditText txtString = (EditText) findViewById(R.id.editText);
        SharedPreferences appPrefs = getSharedPreferences(
                "preferenceactivity", MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = appPrefs.edit();
        prefsEditor.putString("EditTextPref", txtString.getText().toString());
        prefsEditor.commit();
    }

    public void DisplayText(String str) {
        Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
    }

    public void onClickDisplay(View v){
        SharedPreferences appPrefs = getSharedPreferences(
                "preferenceactivity", MODE_PRIVATE);
        DisplayText(appPrefs.getString("EditTextPref", ""));
    }
}
