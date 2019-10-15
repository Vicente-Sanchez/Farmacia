package com.example.farmacia.ui.share;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.farmacia.R;

import java.util.ArrayList;

public class ListarFragment extends Fragment {

    private ListarViewModel listarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        listarViewModel =
                ViewModelProviders.of(this).get(ListarViewModel.class);
        View view = inflater.inflate(R.layout.fragment_listar, container, false);
/*
        ListView l=(ListView)view.findViewById(R.id.lista);
        SqlLite sqlite;
        //base de datos
        sqlite=new SqlLite(getContext());
        sqlite.abrir();
        Cursor cursor = sqlite.getRegistroProd();
        ArrayList<String> reg= sqlite.getProd(cursor);

        ArrayAdapter<String> adaptador= new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,reg);

        l.setAdapter(adaptador);

 */
        return view;
    }
}