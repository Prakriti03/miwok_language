package com.example.android.miwok;

import android.app.Activity;
import android.app.ActivityOptions;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    ImageView imageView;
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord=getItem(position);
        TextView miwokTextView=listItemView.findViewById(R.id.miwok_textView);
        miwokTextView.setText(currentWord.getmMiwokTranslation());
        TextView defaultTextView=listItemView.findViewById(R.id.default_textView);
        defaultTextView.setText(currentWord.getmDefaultTranslation());
        imageView=listItemView.findViewById(R.id.imageView);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageId());
        }else{
            imageView.setVisibility(View.GONE);
        }
        final MediaPlayer mediaPlayer=MediaPlayer.create(getContext(),currentWord.getAudioId());
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //     Toast.makeText(getContext(),"pressed",Toast.LENGTH_SHORT).show();
                  mediaPlayer.start();

            }
        });




        return listItemView;
    }
}
