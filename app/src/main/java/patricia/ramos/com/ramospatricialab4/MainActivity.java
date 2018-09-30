package patricia.ramos.com.ramospatricialab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Lab4","onCreate has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lab4","onStart has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lab4","onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lab4","onPause has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lab4","onStop has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lab4","onRestart has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lab4","Object is deallocated...");
    }

    public void display(View v) {
        Toast.makeText(this,"Button is clicked...", Toast.LENGTH_LONG);
    }

    public void display2(View v) {
        Snackbar.make(v,"Button is clicked...", Snackbar.LENGTH_LONG).show();
    }
}
