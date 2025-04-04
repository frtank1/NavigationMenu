package com.example.navigationmenu.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationmenu.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        RecyclerView recyclerView= binding.recycleView;
        initRecycleView(recyclerView, getStringList());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void initRecycleView(RecyclerView recyclerView, String [] list){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        NotsAdapter notsAdapter = new NotsAdapter(list);
        recyclerView.setAdapter(notsAdapter);
    }


    public String[] getStringList(){
        return new String[] {"Астана", "Кошетау", "Алматы", "Костанай", "Павлодар", "Семипалатинск","Астана", "Кошетау", "Алматы", "Костанай", "Павлодар", "Семипалатинск","Астана", "Кошетау", "Алматы", "Костанай", "Павлодар", "Семипалатинск","Астана", "Кошетау", "Алматы", "Костанай", "Павлодар", "Семипалатинск","Астана", "Кошетау", "Алматы", "Костанай", "Павлодар", "Семипалатинск","Астана", "Кошетау", "Алматы", "Костанай", "Павлодар", "Семипалатинск"};
    }
}