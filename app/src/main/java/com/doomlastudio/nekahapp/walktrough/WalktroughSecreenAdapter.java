package com.doomlastudio.nekahapp.walktrough;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.doomlastudio.nekahapp.R;

public class WalktroughSecreenAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public WalktroughSecreenAdapter(Context context){
        this.context = context;
    }

    public  int[] slide_background = {
      R.drawable.splash1, R.drawable.splash2, R.drawable.splash3,

    };

    public String[] slide_heading = {
            "Find it",
            "Proposed to Him/Her",
            "Get Married"
    };

    public String[] slide_detail = {
            "Welcome to NekahApp and find your true love to get married",
            "Welcome to NekahApp and find your true love to get married",
            "Welcome to NekahApp and find your true love to get married"
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view,Object object) {
        return view == (RelativeLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_walktrough, container, false);

        TextView slideHeadingView = (TextView) view.findViewById(R.id.headingWalktrough);
        TextView slideDetailView = (TextView) view.findViewById(R.id.detailWalktrough);

        slideHeadingView.setText(slide_heading[position]);
        slideDetailView.setText(slide_detail[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
