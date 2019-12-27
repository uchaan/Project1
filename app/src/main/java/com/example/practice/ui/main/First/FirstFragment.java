package com.example.practice.ui.main.First;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    RecyclerView rv;
    RecyclerAdapter ra;
    int count = 0;

    private FirstViewModel mViewModel;
    private ArrayList<Dictionary> Items;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        rv =  view.findViewById(R.id.recycler);
        rv.addItemDecoration(new DividerItemDecoration(view.getContext(), 1));

        Items = new ArrayList<>();
        ra = new RecyclerAdapter(Items);
        rv.setAdapter(ra);
        FloatingActionButton fab = view.findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;

                Dictionary date;
                date = new Dictionary(count +" ","Apple","사과" );
                Items.add(date); // RecyclerView의 마지막 줄에 삽입

                ra.notifyDataSetChanged();
            }});

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FirstViewModel.class);
        // TODO: Use the ViewModel

    }

}
