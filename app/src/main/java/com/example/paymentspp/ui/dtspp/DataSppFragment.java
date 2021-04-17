package com.example.paymentspp.ui.dtspp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.paymentspp.R;

public class DataSppFragment extends Fragment {

    private DataSppViewModel datasppViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        datasppViewModel =
                new ViewModelProvider(this).get(DataSppViewModel.class);
        View root = inflater.inflate(R.layout.data_spp, container, false);
        return root;
    }
}
