package com.example.sampah_ku;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TukarPoinBerhasil extends Fragment {

    Button btnTransaksi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tukar_poin_berhasil, container, false);
        View v = inflater.inflate(R.layout.fragment_tukar_poin_berhasil, container, false);

        btnTransaksi = v.findViewById(R.id.btn_lht_dftr_transc);

        btnTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DashboardTransaksi dashboardTransaksi = new DashboardTransaksi();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.mainLayout, dashboardTransaksi).commit();

            }
        });

        return v;
    }
}