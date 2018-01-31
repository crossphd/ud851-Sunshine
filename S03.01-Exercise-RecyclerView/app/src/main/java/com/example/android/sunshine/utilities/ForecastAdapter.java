package com.example.android.sunshine.utilities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

/**
 * Created by chris on 1/25/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    public ForecastAdapter(){}

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view){
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }

    }

    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
    // COMPLETED (15) Add a class file called ForecastAdapter
    // COMPLETED (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // COMPLETED (23) Create a private string array called mWeatherData

    // COMPLETED (47) Create the default constructor (we will pass in parameters in a later lesson)

    // COMPLETED (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // COMPLETED (17) Extend RecyclerView.ViewHolder

    // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
    // COMPLETED (18) Create a public final TextView variable called mWeatherTextView

    // COMPLETED (19) Create a constructor for this class that accepts a View as a parameter
    // COMPLETED (20) Call super(view) within the constructor for ForecastAdapterViewHolder
    // COMPLETED (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
    // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }


    // COMPLETED (24) Override onCreateViewHolder
    // COMPLETED (25) Within onCreateViewHolder, inflate the list item xml into a view
    // COMPLETED (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

    // COMPLETED (27) Override onBindViewHolder
    // COMPLETED (28) Set the text of the TextView to the weather for this list item's position

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData == null){
            return 0;
        }
        return mWeatherData.length;
    }

    // COMPLETED (29) Override getItemCount
    // COMPLETED (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    // COMPLETED (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // COMPLETED (32) After you save mWeatherData, call notifyDataSetChanged

    public void setWeather(String[] weatherdata){
        mWeatherData = weatherdata;
        notifyDataSetChanged();
    }
    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
}
