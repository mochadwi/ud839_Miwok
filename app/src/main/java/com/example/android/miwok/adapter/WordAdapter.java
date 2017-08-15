package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.model.Word;

import java.util.List;

/**
 * Created by mochadwi on 8/15/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int bgColor;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int bgColor) {
        super(context, 0, objects);
        this.bgColor = bgColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        ImageView ivPicture = (ImageView) v.findViewById(R.id.iv_value_picture);
        TextView tvMiwok = (TextView) v.findViewById(R.id.tv_value_miwok);
        TextView tvDefault = (TextView) v.findViewById(R.id.tv_value_default);

        // get the viewgroup by using base View
        View textContainer = v.findViewById(R.id.ll_container_word);
        // get current context of activity
        int color = ContextCompat.getColor(getContext(), bgColor);
        // set the background to its viewgroup
        textContainer.setBackgroundColor(color);

        Word item = getItem(position);

        if (item.hasImage()) {
            ivPicture.setImageResource(item.getImageResourceId());
            ivPicture.setVisibility(View.VISIBLE);
        } else {
            ivPicture.setVisibility(View.GONE);
        }

        tvMiwok.setText(item.getMiwokTranslation());
        tvDefault.setText(item.getDefaultTranslation());

        return v;
    }
}
