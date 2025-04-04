package com.example.navigationmenu.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navigationmenu.R;

public class NotsAdapter extends RecyclerView.Adapter<NotsAdapter.ViewHolder> {

   private String[] notes;

   public  NotsAdapter(String[] list) {
       this.notes = list;
   }

    @NonNull
    @Override
    public NotsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.getTextView().setText(notes[position]);
    }



    @Override
    public int getItemCount() {
        return notes.length;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

       private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView;
        }

        public TextView getTextView(){
            return textView;
        }
    }
}
