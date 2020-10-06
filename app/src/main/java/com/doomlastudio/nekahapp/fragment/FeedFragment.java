package com.doomlastudio.nekahapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doomlastudio.nekahapp.R;
import com.doomlastudio.nekahapp.userstatus.StatusData;
import com.doomlastudio.nekahapp.userstatus.StatusModel;

import java.util.ArrayList;


public class FeedFragment extends Fragment {

    View v;
    private RecyclerView rvFeed;
    private ArrayList<StatusModel>list = new ArrayList<>();

    public FeedFragment(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list.addAll(StatusData.getListData());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_feed,container,false);
        rvFeed = (RecyclerView) v.findViewById(R.id.rv_feed);
        FeedFragmentAdapter feedFragmentAdapter = new FeedFragmentAdapter(getContext(),list);
        rvFeed.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvFeed.setAdapter(feedFragmentAdapter);
        return v;



    }


}