package metafire.slothfacts;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author  Jessica Yang <jessicayzt@hotmail.com>
 * @version 1.0
 * @since   1.0
 */

public class MainActivity extends AppCompatActivity {

    ArrayList<String> slothFacts;

    /**
     * Called when the activity is first created.
     * @param  savedInstanceState the saved instance state used to load the activity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sloth_facts);
        slothFacts = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.sloth_facts)));
        Random random = new Random();
        int randomIntegerText = random.nextInt(slothFacts.size() - 1);

        TextView slothFactsTextView = (TextView) findViewById(R.id.slothFactsTextView);
        slothFactsTextView.setText(slothFacts.get(randomIntegerText));

        int randomIntegerImage = random.nextInt(37);

        ImageView slothFactsImageView = (ImageView) findViewById(R.id.slothFactsImageView);

        TypedArray slothFactsImages = getResources().obtainTypedArray(R.array.sloth_facts_images);

        slothFactsImageView.setImageResource(slothFactsImages.getResourceId(randomIntegerImage, -1));

        slothFactsImages.recycle();
    }

    /**
     * Called when the screen is clicked.
     * @param  view the view
     */

    public void onClickScreen(View view) {
        System.gc();

        ImageView slothFactsImageView = (ImageView) findViewById(R.id.slothFactsImageView);

        TypedArray slothFactsImages = getResources().obtainTypedArray(R.array.sloth_facts_images);
        Random random = new Random();
        int randomIntegerText = random.nextInt(slothFacts.size() - 1);
        TextView slothFactsTextView = (TextView) findViewById(R.id.slothFactsTextView);
        slothFactsTextView.setText(slothFacts.get(randomIntegerText));
        int randomIntegerImage = random.nextInt(37);
        Picasso.with(this).load(slothFactsImages.getResourceId(randomIntegerImage, -1)).into(slothFactsImageView);

        slothFactsImages.recycle();
    }
}
