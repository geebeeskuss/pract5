package com.example.pract5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pract5.databinding.Fragment1Binding;

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment1Binding binding = Fragment1Binding.inflate(getLayoutInflater());

        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_STRING_KEY", "Данные от первого фрагмента");

        binding.navButton1.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(
                    R.id.action_Fragment1_to_Fragment2,
                    bundle
            );
        });

        return binding.getRoot();
    }
}