package ljs.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import ljs.refresh.JellyRefreshLayout;
import ljs.refresh.PullToRefreshLayout;

public class MainActivity extends AppCompatActivity {

    private JellyRefreshLayout mJellyLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(uk.co.imallan.jellyrefreshlayout.R.layout.activity_main);
        Toolbar toolbar = findViewById(uk.co.imallan.jellyrefreshlayout.R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Jelly");
        mJellyLayout = findViewById(uk.co.imallan.jellyrefreshlayout.R.id.jelly_refresh);
        mJellyLayout.setPullToRefreshListener(new PullToRefreshLayout.PullToRefreshListener() {
            @Override
            public void onRefresh(PullToRefreshLayout pullToRefreshLayout) {
                pullToRefreshLayout.setRefreshing(false);
            }
        });
        View loadingView = LayoutInflater.from(this).inflate(uk.co.imallan.jellyrefreshlayout.R.layout.view_loading, null);
        mJellyLayout.setLoadingView(loadingView);
    }
}
