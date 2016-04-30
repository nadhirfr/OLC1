package id.rozam.olc1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private static final String TAG = "MainActivity-nya";
    //private static final String TAG = this.getClass().getSimpleName();
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHello = (TextView) findViewById(R.id.txtHello);
        txtHello.setText("Ini ganti");
    }

    @Override
    protected void onStart() {
        int a = 1;
        Log.d(TAG, "onStart = " + String.valueOf(a));
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "On resume terpanggil");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "On pause terpanggil");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: onStop terpanggil");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: onDestroy terpanggil");
        super.onDestroy();
    }
}
