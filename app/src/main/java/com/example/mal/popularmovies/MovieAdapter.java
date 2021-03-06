package com.example.mal.popularmovies;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mal on 7/5/2016.
 */
public class MovieAdapter extends ArrayAdapter{

    private Context context;

    public MovieAdapter(Activity context, List<Movie> movies){
        super(context, 0, movies);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Log.d("AAAA", "GETVIEW");
        Movie movie = (Movie) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_movie, parent, false);
        }

        ImageView posterView = (ImageView) convertView.findViewById(R.id.list_item_poster);
        Picasso.with(context).load(movie.posterpath).into(posterView);

        return convertView;
    }
}
