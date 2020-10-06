package com.doomlastudio.nekahapp.profile;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.doomlastudio.nekahapp.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class ParentViewHolder extends GroupViewHolder {
    private TextView namaParent;
    private ImageView arrow;


    public ParentViewHolder(View itemView) {
        super(itemView);
        namaParent = itemView.findViewById(R.id.tv_parentName);
        arrow = itemView.findViewById(R.id.ic_expand);
    }

    public void bind (ProfileParentItem profileParentItem){
        namaParent.setText(profileParentItem.getTitle());
    }


    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        arrow.setAnimation(rotate);
    }

}
