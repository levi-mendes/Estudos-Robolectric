package com.example.levimendes.firstapponbqr;

import android.widget.Button;
import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.*;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertEquals;

/**
 * Created by levimendes on 13/10/2017.
 */
@RunWith(RobolectricGradleTestRunner.class)
//@Config(constants = BuildConfig.class, manifest = Config.NONE)
@Config(sdk = 21)
public class MainActivityTest {

    @Test
    public void deve_mudar_o_campo_texto_para_levi_mendes() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        Button btOk = (Button) activity.findViewById(R.id.btOk);
        btOk.performClick();
        TextView textView = (TextView) activity.findViewById(R.id.textView);
        assertEquals("Hello World!", textView.getText().toString());
    }
}
