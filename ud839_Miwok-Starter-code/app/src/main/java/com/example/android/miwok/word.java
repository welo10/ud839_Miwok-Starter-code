package com.example.android.miwok;

/**
 * Created by Waleed Ehab Badr on 9/29/2018.
 */

public class word {
    private String mdefault,mmiwok;
    public word (String ddefault , String miwok)
    {
        mdefault=ddefault;
        mmiwok=miwok;
    }
    public String getTransalton()
    {return mmiwok;}
    public String getDefault()
    {return mdefault;}
}
