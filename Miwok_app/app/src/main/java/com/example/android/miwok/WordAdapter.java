package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Acer on 2017-09-13.
 */

public class WordAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Word> words;
    private int mColourResourceID;

    public WordAdapter(Context context, int layout, ArrayList<Word> words, int mColourResourceID) {
        this.context = context;
        this.layout = layout;
        this.words = words;
        this.mColourResourceID = mColourResourceID;
    }

    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView miwok_text_view, default_text_view;
        ImageView imageView;
        LinearLayout text_container;
        int mAudioResourceID;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Word word = words.get(i);
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.miwok_text_view = (TextView) view.findViewById(R.id.miwok_text_view);
            holder.default_text_view = (TextView) view.findViewById(R.id.default_text_view);
            holder.text_container = (LinearLayout) view.findViewById(R.id.text_container);
            holder.imageView = (ImageView) view.findViewById(R.id.imageView);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        if (word.hasImage()) {
            holder.imageView.setImageResource(View.VISIBLE);
            holder.imageView.setImageResource(word.getImage());
        } else {
            holder.imageView.setVisibility(View.GONE);
        }

        holder.miwok_text_view.setText(word.getmMiwokTranslation());
        holder.default_text_view.setText(word.getmDefaultTranslation());


        int color = ContextCompat.getColor(getContext(), mColourResourceID);
        holder.text_container.setBackgroundColor(color);

        return view;
    }
}
