package com.test1.yusef.hackapp;



import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yusef on 10/16/2015.
 */
public class Home_Fragment extends Fragment {
        View rootview;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            rootview = inflater.inflate(R.layout.home_layout, container, false);
            return rootview;
        }
    }
