package ljs.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;

import ljs.android.fragment.BaseFragment;
import ljs.refresh.JellyLayout;

public class JellyLayoutTestFragment extends BaseFragment implements View.OnTouchListener {
    @Override
    public Integer getLayoutId() {
        return R.layout.jellylayout_test;
    }

    JellyLayout jellyLayout;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        jellyLayout = view.findViewById(R.id.jelly_layout);
        jellyLayout.mHeaderHeight = view.getHeight();
        jellyLayout.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                jellyLayout.mPullHeight = event.getY();
                jellyLayout.setPointX(event.getX());
            case MotionEvent.ACTION_UP:
                break;
        }
        jellyLayout.postInvalidate();
        return true;
    }
}
