package com.example.administrator.fragmentlifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/20.
 */

public class Fragment1 extends Fragment {
    private static final String TAG = "Fragment1";
    private View rootView;
    private TextView tv_title;
    protected Activity mActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mActivity = (Activity)context;
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
            tv_title = (TextView) rootView.findViewById(R.id.tv_title);
            initEvents();
            Logger.e(TAG, "rootView--------------onCreate-------------------------------");
        } else {
            // 缓存的rootView需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个rootview已经有parent的错误。
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (parent != null) {
                parent.removeView(rootView);
            }
            Logger.e(TAG, "rootView else--------------onCreate-------------------------------");
        }

        Logger.e(TAG, "onCreateView-------------------------------");
        return rootView;

    }

    private void initEvents() {
        tv_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mActivity, ResultActivity.class);
                startActivityForResult(intent,0);
            }
        });
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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "onActivityResult:fragment1-------- " );
        if (requestCode==0)
        {
            int result = data.getIntExtra("Result", 0);
            Toast.makeText(mActivity, ""+result, Toast.LENGTH_SHORT).show();
        }

    }
}
