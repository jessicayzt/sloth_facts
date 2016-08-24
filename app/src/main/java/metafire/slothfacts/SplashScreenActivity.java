package metafire.slothfacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jessica on 7/9/2016.
 */

/**
 * @author  Jessica Yang <jessicayzt@hotmail.com>
 * @version 1.0
 * @since   1.2
 */

public class SplashScreenActivity extends AppCompatActivity {

    /**
     * Called when the activity is first created. Forwards user to main activity once it has loaded.
     * @param  savedInstanceState the saved instance state used to load the activity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
