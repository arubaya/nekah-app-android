package com.doomlastudio.nekahapp.profile;


import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ProfileParentItem extends ExpandableGroup<ProfileChildItem> {


    public ProfileParentItem(String title, List<ProfileChildItem> items) {
        super(title, items);
    }
}
