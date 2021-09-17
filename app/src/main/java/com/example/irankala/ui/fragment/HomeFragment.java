package com.example.irankala.ui.fragment;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.irankala.R;
import com.example.irankala.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    FragmentHomeBinding mBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding= DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false);

        mBinding.containerRecyclers.addView(createRecycler());
        mBinding.containerRecyclers.addView(createRecycler());

        return mBinding.getRoot();
    }

    public RecyclerView createRecycler(){
        RecyclerView recyclerView=new RecyclerView(getContext());
        recyclerView.setBackgroundColor(
                getResources().getColor(R.color.design_default_color_error));

        RecyclerView.LayoutParams params=new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,500);
        params.setMargins(0,0,0,12);

        recyclerView.setLayoutParams(params);

        return recyclerView;
    }
}