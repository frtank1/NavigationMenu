package com.example.navigationmenu.ui.dashboard;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationmenu.R;

import java.util.List;

public class DashBordAdpater extends RecyclerView.Adapter <DashBordAdpater.ViewHolder> {

    private List<DashBoardData> dashList;
    public DashBordAdpater(List<DashBoardData> List){
        this.dashList = List;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dashList.size();

    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imgView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title_card);
            imgView = itemView.findViewById(R.id.img);

        }

        public TextView getTextView(){
            return textView;
        }
    }


}
