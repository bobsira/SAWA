package com.mtusawa.Share;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mtusawa.R;

/**
 * Created by bobsira on 3/31/18.
 */

public class NextActivity extends AppCompatActivity{
    private static final String TAG = "NextActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Log.d(TAG, "onCreate: got the chosen image: " + getIntent().getStringExtra(getString(R.string.selected_image)));
    }
}
