package com.example.pract5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pract5.databinding.Fragment3Binding;

public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment3Binding binding = Fragment3Binding.inflate(getLayoutInflater());

        binding.navButton3.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_Fragment3_to_Fragment1);
        });

        return binding.getRoot();
    }
}