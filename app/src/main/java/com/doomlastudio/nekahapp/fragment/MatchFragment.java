package com.doomlastudio.nekahapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.doomlastudio.nekahapp.R;
import com.doomlastudio.nekahapp.userdata.DataModel;
import com.doomlastudio.nekahapp.userdata.DataUser;

import java.util.ArrayList;


public class MatchFragment extends Fragment {
    private ViewPager viewPager;
    private MatchFragmentAdapter adapter;
    private ArrayList<DataModel> list = new ArrayList<>();
    private Button mBtnLove, mBtnRefresh, mBtnNope;
    View v;

    public MatchFragment(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_match,container,false);
        list.addAll(DataUser.getListData());
        adapter = new MatchFragmentAdapter(list,getContext());
        viewPager = (ViewPager) v.findViewById(R.id.vp_match);

        mBtnLove = v.findViewById(R.id.btnLike);
        mBtnRefresh = v.findViewById(R.id.btnRefresh);
        mBtnNope = v.findViewById(R.id.btnNope);

        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true, new ViewPagerStack());
        viewPager.setOffscreenPageLimit(2);
        return v;

        }


    private class ViewPagerStack implements ViewPager.PageTransformer {
        @Override
        public void transformPage(@NonNull View page, float position) {
            if (position >= 0 ){
                page.setScaleX(0.8f);
                page.setScaleY(0.85f);
                page.setTranslationX(-page.getWidth() * position);
                page.setTranslationY(0 * position);
            }
        }
    }


}
