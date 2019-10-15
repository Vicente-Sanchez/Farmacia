package com.example.farmacia.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.farmacia.R;

public class EiminarFragment extends Fragment {

    Button eliminar;
    //private SqlLite sqlite;
    EditText id;

    private EliminarViewModel eliminarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eliminarViewModel =
                ViewModelProviders.of(this).get(EliminarViewModel.class);
        View view = inflater.inflate(R.layout.fragment_eliminar, container, false);

        eliminar=(Button)view.findViewById(R.id.btnEliminar);
        id=(EditText)view.findViewById(R.id.eliminarid);
        /*
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlite=new SqlLite(getContext());
                sqlite.abrir();
                if (id.getText().toString()!=null){
                    sqlite.Eliminar(id.getText());
                    Toast.makeText(getContext(),"Registro Eliminado",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(),"Ingrese el campo de ID",Toast.LENGTH_SHORT).show();
                }
            }
        });

         */

        return view;
    }
}