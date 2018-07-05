package ljs.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import ljs.android.fragment.BaseFragment;
import ljs.refresh.PullToRefreshLayout;

public class PullToRefreshLayoutTest extends BaseFragment {
    @Override
    public Integer getLayoutId() {
        return R.layout.pull_to_refresh_test;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        PullToRefreshLayout pullToRefreshLayout = view.findViewById(R.id.pull_to_refresh);
        pullToRefreshLayout.setPullToRefreshListener(pull -> pull.setRefreshing(false));
    }
}
