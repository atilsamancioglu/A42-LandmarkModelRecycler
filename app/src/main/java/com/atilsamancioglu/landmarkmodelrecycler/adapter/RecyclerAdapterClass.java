package com.atilsamancioglu.landmarkmodelrecycler.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.atilsamancioglu.landmarkmodelrecycler.model.Landmark;
import com.atilsamancioglu.landmarkmodelrecycler.view.DetailsActivity;
import com.atilsamancioglu.landmarkmodelrecycler.R;

import java.util.ArrayList;

public class RecyclerAdapterClass extends RecyclerView.Adapter<RecyclerAdapterClass.RecyclerViewHolder> {

    ArrayList<Landmark> arrayList;

    public RecyclerAdapterClass(ArrayList<Landmark> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        TextView recyclerTextView = holder.itemView.findViewById(R.id.recycler_row_textView);
        recyclerTextView.setText(arrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                intent.putExtra("landmark",arrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
