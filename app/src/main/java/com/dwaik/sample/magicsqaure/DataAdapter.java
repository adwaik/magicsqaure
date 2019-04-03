package com.dwaik.sample.magicsqaure;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    private DataSource dataSource;

    public DataAdapter(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final DataViewHolder dataViewHolder, int i) {
        dataViewHolder.title.setText(String.valueOf(dataSource.getData().get(i)));
    }

    @Override
    public int getItemCount() {
        return (dataSource == null || dataSource.getData() == null) ?
                0 : dataSource.getData().size();
    }

    class DataViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        DataViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_item);
        }
    }
}
