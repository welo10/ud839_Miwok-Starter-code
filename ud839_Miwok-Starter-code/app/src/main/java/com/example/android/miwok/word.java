package com.example.android.miwok;

/**
 * Created by Waleed Ehab Badr on 9/29/2018.
 */

public class word {
    private String mdefault,mmiwok;
    private int mpic=-1;
    public word (String ddefault , String miwok) {
        mdefault = ddefault;
        mmiwok = miwok;
    }
    public word (String ddefault , String miwok,int pic)
    {
        mdefault=ddefault;
        mmiwok=miwok;
        mpic=pic;
    }
    public String getTransalton()
    {return mmiwok;}
    public String getDefault()
    {return mdefault;}
    public int getpic(){
        return mpic;
    }
    public boolean hasimg(){
        return mpic!=-1;
    }
}
