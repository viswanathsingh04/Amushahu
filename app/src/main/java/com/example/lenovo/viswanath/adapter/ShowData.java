package com.example.lenovo.viswanath.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.viswanath.R;
import com.example.lenovo.viswanath.model.Data;

import java.util.List;

/**
 * Created by lenovo on 1/6/2018.
 */

public class ShowData extends RecyclerView.Adapter<ShowData.MyViewHolder> {
    List<Data> data;
    Context context;

    public ShowData(Context context, List<Data> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public ShowData.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.displaydata, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ShowData.MyViewHolder holder, int position) {
        Data data1 = data.get(position);
        holder.textView1.setText(data1.getDistributor_name());
        holder.textView2.setText(data1.getCluster_name());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView1, textView2;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.textView1);
            textView2 = (TextView) itemView.findViewById(R.id.textView2);
        }
    }
}
