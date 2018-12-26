package com.musk.adjust;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.adjust.sdk.Adjust;

public class TestActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    protected void onResume() {
        super.onResume();
        Adjust.onResume();
    }
    protected void onPause() {
        super.onPause();
        Adjust.onPause();
    }
}
