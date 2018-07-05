package ljs.test;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import ljs.android.fragment.BaseFragment;
import ljs.refresh.JellyRefreshLayout;

public class JellyRefreshTestFragment extends BaseFragment {
    @Override
    public Integer getLayoutId() {
        return R.layout.jelly_refresh_test_layout;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        JellyRefreshLayout jelly_refresh = view.findViewById(R.id.jelly_refresh);

        jelly_refresh.setPullToRefreshListener(pullToRefreshLayout -> new Handler().postDelayed(() -> pullToRefreshLayout.setRefreshing(false), 1000));

    }
}
