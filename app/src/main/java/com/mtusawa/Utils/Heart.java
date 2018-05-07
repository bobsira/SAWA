package com.mtusawa.Utils;

import android.util.Log;
import android.widget.ImageView;

/**
 * Created by bobsira on 5/7/18.
 */

public class Heart {
    private static final String TAG = "Heart";

    public ImageView heartWhite, heartRed;

    public Heart(ImageView heartWhite, ImageView heartRed) {
        this.heartWhite = heartWhite;
        this.heartRed = heartRed;
    }

    public void toggleLike(){
        Log.d(TAG, "toggleLike: toggling heart.");


    }
}
