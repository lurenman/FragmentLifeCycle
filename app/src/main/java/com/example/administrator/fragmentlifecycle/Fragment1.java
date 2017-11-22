package com.example.administrator.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/8/20.
 */

public class Fragment1 extends Fragment {
    private static final String TAG = "Fragment1";
    private View rootView;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logger.e(TAG, "onAttach-------------------------------");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.e(TAG, "onCreate-------------------------------");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = View.inflate(getContext(), R.layout.fragment1_layout, null);
            Logger.e(TAG, "rootView--------------onCreate-------------------------------");
        } else {
            // 缓存的rootView需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个rootview已经有parent的错误。
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (parent != null)
            {
                parent.removeView(rootView);
            }
            Logger.e(TAG, "rootView else--------------onCreate-------------------------------");
        }

        Logger.e(TAG, "onCreateView-------------------------------");
        return rootView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Logger.e(TAG, "onActivityCreated-------------------------------");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Logger.e(TAG, "onViewCreated-------------------------------");
    }

    @Override
    public void onStart() {
        super.onStart();
        Logger.e(TAG, "onStart-------------------------------");
    }

    @Override
    public void onResume() {
        super.onResume();
        Logger.e(TAG, "onResume-------------------------------");
    }

    @Override
    public void onPause() {
        super.onPause();
        Logger.e(TAG, "onPause-------------------------------");
    }

    @Override
    public void onStop() {
        super.onStop();
        Logger.e(TAG, "onStop-------------------------------");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logger.e(TAG, "onDestroyView-------------------------------");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.e(TAG, "onDestroy-------------------------------");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Logger.e(TAG, "onDetach-------------------------------");
    }

}
