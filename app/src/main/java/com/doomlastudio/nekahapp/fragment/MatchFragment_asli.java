package com.doomlastudio.nekahapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.doomlastudio.nekahapp.R;
import com.doomlastudio.nekahapp.userdata.DataModel;
import com.doomlastudio.nekahapp.userdata.DataUser;

import java.util.ArrayList;


public class MatchFragment_asli extends Fragment {

    private ViewPager viewPager;
    private MatchFragmentAdapter adapter;
    private ArrayList<DataModel> list = new ArrayList<>();
    private Button mBtnLove, mBtnRefresh, mBtnNope;
    View v;

    public MatchFragment_asli(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_match,container,false);
        list.addAll(DataUser.getListData());
        adapter = new MatchFragmentAdapter(list,getContext());
        viewPager = v.findViewById(R.id.vp_match);
        mBtnLove = v.findViewById(R.id.btnLike);
        mBtnRefresh = v.findViewById(R.id.btnRefresh);
        mBtnNope = v.findViewById(R.id.btnNope);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);
        viewPager.addOnPageChangeListener(viewListener);

        return v;
    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
