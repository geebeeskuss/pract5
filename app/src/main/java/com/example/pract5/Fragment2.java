package com.example.pract5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pract5.databinding.Fragment2Binding;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment2Binding binding = Fragment2Binding.inflate(getLayoutInflater());
        Bundle bundle = getArguments();
        if (bundle != null) {
            binding.dataTextView.setText(bundle.getString("BUNDLE_STRING_KEY"));
        }
        binding.navButton2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_Fragment2_to_Fragment3);
        });

        return binding.getRoot();
    }
}