package ljs.test;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void jellyLayoutTest(View view) {
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new JellyLayoutTestFragment()).commit();
    }

    public void jellyRefreshTest(View view) {
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new JellyRefreshTestFragment()).commit();
    }

    public void pullToRefreshLayoutTest(View view) {
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new PullToRefreshLayoutTest()).commit();
    }

    private AlertDialog.Builder dialog(View view) {
        return new AlertDialog.Builder(this).setView(view);
    }
}
