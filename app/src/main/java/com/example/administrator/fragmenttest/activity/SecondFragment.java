package com.example.administrator.fragmenttest.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fragmenttest.R;
import com.example.administrator.fragmenttest.databinding.SecondFragmentItemBinding;
import com.example.administrator.fragmenttest.models.FragmentTitleBean;

/**
 * Created by Administrator on 2016/10/14.
 */

public class SecondFragment extends Fragment {

    private static SecondFragmentItemBinding secondFragmentItemBinding;
    private static FragmentTitleBean mBean;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        secondFragmentItemBinding = DataBindingUtil.inflate(inflater, R.layout.second_fragment_item, container, false);
        secondFragmentItemBinding.setTitle(mBean);
        return secondFragmentItemBinding.getRoot();
    }

    /**
     * 初始化fragment或者传递参数
     *
     * @return
     */
    public static SecondFragment newInstance(FragmentTitleBean bean) {
        SecondFragment secondFragment = new SecondFragment();
        mBean = bean;
        return secondFragment;
    }
}
