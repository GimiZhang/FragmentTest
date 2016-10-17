package com.example.administrator.fragmenttest.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fragmenttest.R;
import com.example.administrator.fragmenttest.databinding.FirstFragmentItemBinding;
import com.example.administrator.fragmenttest.models.FragmentTitleBean;

/**
 * Created by Administrator on 2016/10/14.
 */

public class FirstFragment extends Fragment {

    private static FirstFragmentItemBinding fragmentItemBinding;
    private static FragmentTitleBean mBean;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentItemBinding = DataBindingUtil.inflate(inflater, R.layout.first_fragment_item, container, false);
        fragmentItemBinding.setTitle(mBean);
        return fragmentItemBinding.getRoot();
    }

    /**
     * 初始化fragment或者传递参数
     *
     * @return
     */
    public static FirstFragment newInstance(FragmentTitleBean bean) {
        FirstFragment firstFragment = new FirstFragment();
        mBean = bean;
        return firstFragment;
    }
}
