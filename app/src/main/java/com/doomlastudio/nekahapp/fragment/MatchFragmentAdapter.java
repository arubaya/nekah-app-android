package com.doomlastudio.nekahapp.fragment;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;

import com.doomlastudio.nekahapp.R;
import com.doomlastudio.nekahapp.userdata.DataModel;

import java.util.ArrayList;

public class MatchFragmentAdapter extends PagerAdapter{

    Dialog detailDialog;
    private ArrayList<DataModel> models;


    public MatchFragmentAdapter(ArrayList<DataModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    private LayoutInflater layoutInflater;
    private Context context;



    @Override
    public int getCount() {return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (CardView) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_match_cardview,container,false);
        View btn = layoutInflater.inflate(R.layout.fragment_match,container,false);
        final DataModel model = models.get(position);
        final Button mBtnLove, mBtnRefresh, mBtnNope;

        ImageView imgProfile;
        TextView userName, userAge, userPlace;
        RelativeLayout relativeLayout;

        detailDialog = new Dialog(context);
        detailDialog.setContentView(R.layout.activity_detail_card_view);
        detailDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        imgProfile = view.findViewById(R.id.userPhoto);
        userName = view.findViewById(R.id.userName);
        userAge = view.findViewById(R.id.userAge);
        userPlace = view.findViewById(R.id.userPlace);
        relativeLayout = view.findViewById(R.id.itemMatch);

        mBtnRefresh = btn.findViewById(R.id.btnRefresh);
        mBtnNope = btn.findViewById(R.id.btnNope);
        mBtnLove = btn.findViewById(R.id.btnLike);

        imgProfile.setImageResource(models.get(position).getPhotoprofile());
        userName.setText(models.get(position).getNama());
        userAge.setText(models.get(position).getUmur());
        userPlace.setText(models.get(position).getTempat());
        container.addView(view);

        mBtnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You like , " + model.getNama(),Toast.LENGTH_SHORT).show();
            }
        });
        mBtnNope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You dislike, " + model.getNama(),Toast.LENGTH_SHORT).show();
            }
        });
        mBtnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBtnRefresh.setBackgroundResource(R.drawable.refresh_btn_click);
                Toast.makeText(context,"Can't Refresh",Toast.LENGTH_SHORT).show();
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Hai, " + model.getNama(),Toast.LENGTH_SHORT).show();
                TextView userNameJudul = detailDialog.findViewById(R.id.userNameDetail);
                TextView userNameDetail = detailDialog.findViewById(R.id.userName);
                TextView userAgeDetail = detailDialog.findViewById(R.id.userAge);
                TextView userHobbiesDetail = detailDialog.findViewById(R.id.userHobbies);
                TextView userProfessionDetail = detailDialog.findViewById(R.id.userProfession);
                TextView userDescDetail = detailDialog.findViewById(R.id.userDescription);

                userNameJudul.setText(models.get(position).getNama());
                userNameDetail.setText(models.get(position).getNama());
                userAgeDetail.setText(models.get(position).getUmur());
                userHobbiesDetail.setText(models.get(position).getHobi());
                userProfessionDetail.setText(models.get(position).getPekerjaan());
                userDescDetail.setText(models.get(position).getDeskripsi());
                detailDialog.show();
            }
        });

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}