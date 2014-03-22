package es.appmaster.viewpagerdemo;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Settings Activity
 *
 * @author manolovn
 */
public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}
