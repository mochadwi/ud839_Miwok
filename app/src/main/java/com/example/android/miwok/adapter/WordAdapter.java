package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.model.Word;

import java.util.List;

/**
 * Created by mochadwi on 8/15/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        TextView tvMiwok = (TextView) v.findViewById(R.id.tv_value_miwok);
        TextView tvDefault = (TextView) v.findViewById(R.id.tv_value_default);

        Word item = getItem(position);

        tvMiwok.setText(item.getMiwokTranslation());
        tvDefault.setText(item.getDefaultTranslation());

        return v;
    }
}
