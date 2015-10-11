package com.example.android.movies;

/**
 * Created by Doaa-pc on 10/6/2015.
 */
public class OverView implements ParentItemInterface {
    @Override
    public void setId(String id) {

    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public int getListType() {
        return overViewType;
    }

    public static int overViewType = 0;

    @Override
    public void setListType(int type) {

    }

    String overView;

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public String getOverView() {
        return this.overView;
    }
}
