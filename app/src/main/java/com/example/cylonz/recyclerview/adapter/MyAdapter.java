package com.example.cylonz.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cylonz.recyclerview.R;
import com.example.cylonz.recyclerview.model.User;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by Cylonz on 11/6/2559.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Realm realm = Realm.getDefaultInstance();;
    RealmQuery<User> query = realm.where(User.class);
    RealmResults<User> result1 = query.findAll();;
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cusview, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.txt1.setText("id:" + result1.get(position).getId());
            holder.txt2.setText("name:" + result1.get(position).getName());
            holder.txt3.setText("age:" + result1.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        int count=0;
        if(result1!=null){
            count=result1.size();
        }
        return count;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txt1;
        public TextView txt2;
        public TextView txt3;

        private MyViewHolder(View v) {
            super(v);
            this.txt1 = (TextView) v.findViewById(R.id.txt1);
            this.txt2 = (TextView) v.findViewById(R.id.txt2);
            this.txt3 = (TextView) v.findViewById(R.id.txt3);
        }
    }
}
