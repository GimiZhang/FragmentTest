package com.example.administrator.fragmenttest.models;

/**
 * Created by Administrator on 2016/10/14.
 */

public class FragmentTitleBean {

    private String firstTitle;
    private String secondTitle;
    private String thirdTitle;

    public FragmentTitleBean(String firstTitle,String secondTitle,String thirdTitle){
        super();
        this.firstTitle = firstTitle;
        this.secondTitle = secondTitle;
        this.thirdTitle = thirdTitle;
    }

    public String getSecondTitle() {
        return secondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        this.secondTitle = secondTitle;
    }

    public String getThirdTitle() {
        return thirdTitle;
    }

    public void setThirdTitle(String thirdTitle) {
        this.thirdTitle = thirdTitle;
    }

    public String getFirstTitle() {
        return firstTitle;
    }

    public void setFirstTitle(String firstTitle) {
        this.firstTitle = firstTitle;
    }
}
