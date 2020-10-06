package com.doomlastudio.nekahapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doomlastudio.nekahapp.AboutApps;
import com.doomlastudio.nekahapp.DetailFeedStatus;
import com.doomlastudio.nekahapp.HomeActivity;
import com.doomlastudio.nekahapp.R;
import com.doomlastudio.nekahapp.userstatus.StatusModel;

import java.util.ArrayList;

public class FeedFragmentAdapter extends RecyclerView.Adapter <FeedFragmentAdapter.FeedFragmentHolder> {


    Context mContext;
    private ArrayList<StatusModel>liststatus;

    public FeedFragmentAdapter(Context mContext, ArrayList<StatusModel> liststatus) {
        this.mContext = mContext;
        this.liststatus = liststatus;
    }

    @NonNull
    @Override
    public FeedFragmentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_feed_list, parent, false);
        final FeedFragmentHolder feedFragmentHolder = new FeedFragmentHolder(view);
        return new FeedFragmentHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final FeedFragmentHolder holder, final int position) {
        final StatusModel model = liststatus.get(position);

        final Intent statusdetail = new Intent(mContext, DetailFeedStatus.class);
        final String check[] = {"false"};

        holder.tvStatus.setText(model.getStatus());
        holder.tvName.setText(model.getNama());
        holder.imgPhoto.setImageResource(model.getPhotoprofile());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"Feed status " + model.getNama(),Toast.LENGTH_SHORT).show();
                statusdetail.putExtra(DetailFeedStatus.Nama,model.getNama());
                statusdetail.putExtra(DetailFeedStatus.Status,model.getStatus());
                statusdetail.putExtra(DetailFeedStatus.Photo,model.getPhotoprofile());
                mContext.startActivity(statusdetail);
            }
        });
        holder.mLikeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check[0] == "false"){
                    holder.mLikeBtn.setBackgroundResource(R.drawable.icon_likeclicked);
                    statusdetail.putExtra(DetailFeedStatus.Like,1);
                    check[0] = "true";
                }
                else{
                    holder.mLikeBtn.setBackgroundResource(R.drawable.icon_dislike);
                    statusdetail.putExtra(DetailFeedStatus.Like,0);
                    check[0] = "false";
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return liststatus.size();
    }

    public static class FeedFragmentHolder extends RecyclerView.ViewHolder{
        RelativeLayout relativeLayout;
        TextView tvName, tvStatus;
        ImageView imgPhoto;
        Button mLikeBtn;

        public FeedFragmentHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.itemFeed);
            tvName = itemView.findViewById(R.id.tv_nameFeed);
            tvStatus = itemView.findViewById(R.id.tv_statusFeed);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_photoFeed);
            mLikeBtn = itemView.findViewById(R.id.likeStatus);

        }
    }
}
