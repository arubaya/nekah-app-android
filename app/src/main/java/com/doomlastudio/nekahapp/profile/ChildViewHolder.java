package com.doomlastudio.nekahapp.profile;

import android.view.View;
import android.widget.TextView;

import com.doomlastudio.nekahapp.R;

public class ChildViewHolder extends com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder {
    private TextView namaItem;
    private TextView detailItem;
    //private TextView parentDesc;

    public ChildViewHolder(View itemView) {
        super(itemView);

        namaItem = itemView.findViewById(R.id.tv_childName);
        detailItem = itemView.findViewById(R.id.tv_childDetail);
        //parentDesc = itemView.findViewById(R.id.tv_parentDesc);

    }

    public void bind(ProfileChildItem profileChildItem){
        namaItem.setText(profileChildItem.childName);
        detailItem.setText(profileChildItem.childDetail);
        //parentDesc.setText(profileChildItem.parentDesc);

    }
}
