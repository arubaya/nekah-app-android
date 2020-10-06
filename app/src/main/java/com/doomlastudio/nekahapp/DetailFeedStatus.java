package com.doomlastudio.nekahapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.doomlastudio.nekahapp.fragment.FeedFragmentAdapter;

import static android.os.Build.VERSION_CODES.N;

public class DetailFeedStatus extends AppCompatActivity implements View.OnClickListener{

    ImageView photoProfile;
    TextView nama,status;
    Button like,comment,reply;
    public static final String Nama = "NAMA USER";
    public static final String Status = "STATUS";
    public static final String Like = "0";
    public static final String Photo = "R.id.img_photoFeed";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_feed_status);

        comment = findViewById(R.id.btnComment);
        comment.setOnClickListener(this);
        reply = findViewById(R.id.btnReply);
        reply.setOnClickListener(this);

        //Set Up Ambil data dari FeedFragmentAdapter
        final Intent feedstatus = new Intent(this, FeedFragmentAdapter.class);

        //ambil data foto
        photoProfile = findViewById(R.id.img_photoFeedDetail);
        int photo = getIntent().getIntExtra(Photo,R.id.img_photoFeed);
        photoProfile.setImageResource(photo);

        //ambil data nama
        nama = findViewById(R.id.text_NamaFeedStatus);
        final String NamaUser = getIntent().getStringExtra(Nama);
        nama.setText(NamaUser);

        //ambil data status
        status = findViewById(R.id.text_StatusFeedDetail);
        String Statususer = getIntent().getStringExtra(Status);
        status.setText(Statususer);

        //ambil data likebtn
        like = findViewById(R.id.btnLike);
        final int Likebtn = getIntent().getIntExtra(Like,0);
        if(Likebtn == 1){
            like.setBackgroundResource(R.drawable.icon_likeclicked);
        }
        else{
            like.setBackgroundResource(R.drawable.icon_dislike);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnComment:
                Toast.makeText(this,"Comment button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnReply:
                Toast.makeText(this,"Send Reply ",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
