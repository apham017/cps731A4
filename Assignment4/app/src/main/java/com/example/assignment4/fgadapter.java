package com.example.assignment4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class fgadapter extends RecyclerView.Adapter<fgadapter.fgviewholder> {
    String d1[], d2[];
    Context context;
    public fgadapter(Context ct, String s1[], String s2[]){
    context = ct;
    d1 = s1;
    d2 = s2;
    }

    @NonNull
    @Override
    public fgviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.rows, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull fgviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class fgviewholder extends RecyclerView.ViewHolder{
        public fgviewholder (@NonNull View itemView){
            super(itemView);
        }

    }
}
