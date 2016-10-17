package com.example.administrator.fragmenttest.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fragmenttest.R;
import com.example.administrator.fragmenttest.databinding.ThirdFragmentItemBinding;
import com.example.administrator.fragmenttest.models.FragmentTitleBean;

/**
 * Created by Administrator on 2016/10/14.
 */

public class ThirdFragment extends Fragment {

    private static  ThirdFragmentItemBinding thirdFragmentItemBinding;
    private static FragmentTitleBean mBean;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        thirdFragmentItemBinding = DataBindingUtil.inflate(inflater, R.layout.third_fragment_item, container, false);
        thirdFragmentItemBinding.setTitle(mBean);
        return thirdFragmentItemBinding.getRoot();
    }

    /**
     * 初始化fragment或者传递参数
     *
     * @return
     */
    public static ThirdFragment newInstance(FragmentTitleBean bean) {
        ThirdFragment thirdFragment = new ThirdFragment();
        mBean = bean;
        return thirdFragment;
    }
}
