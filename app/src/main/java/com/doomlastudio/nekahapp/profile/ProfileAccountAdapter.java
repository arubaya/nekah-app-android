package com.doomlastudio.nekahapp.profile;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.doomlastudio.nekahapp.R;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import java.util.ArrayList;
import java.util.List;

//
//
public class ProfileAccountAdapter extends ExpandableRecyclerViewAdapter<ParentViewHolder, ChildViewHolder> {

    //
    public ProfileAccountAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    //
    @Override
    public ParentViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile, parent, false);
        return new ParentViewHolder(view);
    }

    //
    @Override
    public ChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile_child, parent, false);
        return new ChildViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ChildViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final ProfileChildItem profileChildItem = (ProfileChildItem) group.getItems().get(childIndex);
        holder.bind(profileChildItem);

    }

    @Override
    public void onBindGroupViewHolder(ParentViewHolder holder, int flatPosition, ExpandableGroup group) {
        final ProfileParentItem profileParentItem = (ProfileParentItem) group;
        holder.bind(profileParentItem);
    }

}
