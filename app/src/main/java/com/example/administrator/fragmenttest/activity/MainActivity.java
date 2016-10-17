package com.example.administrator.fragmenttest.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.fragmenttest.R;
import com.example.administrator.fragmenttest.databinding.ActivityMainBinding;
import com.example.administrator.fragmenttest.models.FragmentTitleBean;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private FragmentTitleBean bean = new FragmentTitleBean("one","two","three");
    private FragmentManager manager;
    private FirstFragment firstFragment;
    private Fragment mCurrentFragment;
    private SecondFragment secondFragment;
    private ThirdFragment thirdFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setTitle(bean);
        mainBinding.setTitleOnclick(new TitleOnclick());
        manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        firstFragment = FirstFragment.newInstance(bean);
        fragmentTransaction.add(R.id.ft_container, firstFragment,"FirstFragment");
        mCurrentFragment = firstFragment;
        fragmentTransaction.commit();
    }

    public class TitleOnclick{
        public void firstOnclick(View view){
            FragmentTransaction fragmentTransaction = manager.beginTransaction();
            if(firstFragment != null){
                fragmentTransaction.show(firstFragment);
            }

            if(mCurrentFragment != firstFragment){
                fragmentTransaction.hide(mCurrentFragment);
            }
            mCurrentFragment = firstFragment;
            fragmentTransaction.commit();
        }

        public void secondOnclick(View view){
            FragmentTransaction fragmentTransaction1 = manager.beginTransaction();
            if(secondFragment == null){
                secondFragment = SecondFragment.newInstance(bean);
                fragmentTransaction1.add(R.id.ft_container, secondFragment,"secondFragment");
//                fragmentTransaction.commit();
            }else if(!firstFragment.isAdded()){
                fragmentTransaction1.add(R.id.ft_container, secondFragment,"secondFragment");
            }

            if(null != mCurrentFragment){
                fragmentTransaction1.hide(mCurrentFragment);
            }

            fragmentTransaction1.show(secondFragment);
            mCurrentFragment = secondFragment;
            fragmentTransaction1.commit();

        }

        public void thirdOnclick(View view){
            FragmentTransaction fragmentTransaction2 = manager.beginTransaction();
            if(thirdFragment == null){
                thirdFragment = ThirdFragment.newInstance(bean);
                fragmentTransaction2.add(R.id.ft_container, thirdFragment,"thirdFragment");
            }else if(!firstFragment.isAdded()){
                fragmentTransaction2.add(R.id.ft_container, thirdFragment,"thirdFragment");
            }

            if(null != mCurrentFragment){
                fragmentTransaction2.hide(mCurrentFragment);
            }
            fragmentTransaction2.show(thirdFragment);
            mCurrentFragment = thirdFragment;
            fragmentTransaction2.commit();
        }
    }
}
