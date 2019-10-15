package com.example.farmacia.ui.tools;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.farmacia.R;

public class CreditosFragment extends Fragment {

    private CreditosViewModel creditosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        creditosViewModel =
                ViewModelProviders.of(this).get(CreditosViewModel.class);
        View view = inflater.inflate(R.layout.fragment_creditos, container, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        builder.setMessage("Desarrollado por:\n\t Jaimes Levario Luis Enrique \n" +
                "\t Manjarrez Torres Luis Antonio \n"+
                "\t Sánchez Nava Vicente \n"+
                "\t Aplicaciones Móviles\n" +
                "\t Profesora: PULIDO ALBA ROCIO ELIZABETH")
                .setTitle("Créditos")
                .setCancelable(false)
                .setNeutralButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
        return inflater.inflate(R.layout.fragment_creditos, container, false);

    }
}