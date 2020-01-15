package com.iashinsergei.mylibrary.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.iashinsergei.mylibrary.R;
import com.iashinsergei.mylibrary.model.BookRepos;
import com.iashinsergei.mylibrary.ui.adapters.RvHomeAdapter;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initRecyclerView(root);
        return root;
    }

    private void initRecyclerView(View view){
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_home);
        recyclerView.setLayoutManager(layoutManager);
        RvHomeAdapter adapter = new RvHomeAdapter(BookRepos.getInstance().getBookList(), getContext());
        recyclerView.setAdapter(adapter);
    }
}