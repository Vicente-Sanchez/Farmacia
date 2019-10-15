package com.example.farmacia.ui.slideshow;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.farmacia.R;

public class ModificarFragment extends Fragment {

    EditText nombre,edad,servicio,fech,id;
    String a,b,sex;
    Button btnGuardar,btnbuscar;
    // public SqlLite sqlite;
    RadioButton btnmasc, btnfem;
    RadioGroup sexo;

    private ModificarViewModel modificarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modificarViewModel =
                ViewModelProviders.of(this).get(ModificarViewModel.class);
        View view = inflater.inflate(R.layout.fragment_modificar, container, false);

        sexo =(RadioGroup)view.findViewById(R.id.radiosexomod);
        id=(EditText)view.findViewById(R.id.txtidmod);
        nombre=(EditText)view.findViewById(R.id.txtnombremod);
        edad=(EditText)view.findViewById(R.id.txtedadmod);
        servicio=(EditText)view.findViewById(R.id.txtserviciomod);
        fech=(EditText)view.findViewById(R.id.txtfechamod);
        btnmasc=(RadioButton)view.findViewById(R.id.btnmasculinomod);
        btnfem=(RadioButton)view.findViewById(R.id.btnfemeninomod);
        btnGuardar=(Button)view.findViewById(R.id.btnguardarmod);
        btnbuscar=(Button)view.findViewById(R.id.btnbuscarmod);

        sexo.setVisibility(View.INVISIBLE);
        nombre.setVisibility(View.INVISIBLE);
        edad.setVisibility(View.INVISIBLE);
        servicio.setVisibility(View.INVISIBLE);
        btnmasc.setVisibility(View.INVISIBLE);
        fech.setVisibility(View.INVISIBLE);
        btnGuardar.setVisibility(View.INVISIBLE);
        btnfem.setVisibility(View.INVISIBLE);

        /*
        sqlite=new SqlLite(getContext());
        sqlite.abrir();

         */

        sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                switch (checkId){
                    case R.id.btnmasculinomod:
                        sex="Macho";
                        break;
                    case R.id.btnfemeninomod:
                        sex="Hembra";
                        break;
                    default:
                        sex="Opción Invalida";
                        break;
                }
            }
        });

        /*
        btnbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!id.getText().toString().equals("")){
                    if (sqlite.getCant(Integer.parseInt(id.getText().toString())).getCount()==1){
                        sexo.setVisibility(View.VISIBLE);
                        nombre.setVisibility(View.VISIBLE);
                        edad.setVisibility(View.VISIBLE);
                        servicio.setVisibility(View.VISIBLE);
                        btnmasc.setVisibility(View.VISIBLE);
                        fech.setVisibility(View.VISIBLE);
                        btnGuardar.setVisibility(View.VISIBLE);
                        btnfem.setVisibility(View.VISIBLE);
                        id.setActivated(false);

                        int f=Integer.parseInt(id.getText().toString());
                        Cursor cursor =sqlite.getCant(f);
                        String g1=null,g2=null,g3=null,g4=null;
                        if (cursor.moveToFirst()){
                            do {
                                g1=cursor.getString(3);
                                g2=cursor.getString(5);
                                g3=cursor.getString(6);
                                g4=cursor.getString(7);

                            }while(cursor.moveToNext());
                        }
                        nombre.setText(g1.toString());
                        fech.setText(g3.toString());
                        servicio.setText(g4.toString());
                       // fech.setText(g2.toString());
                    }else{
                        Toast.makeText(getContext(),"Error: no existe ese ID"+"",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getContext(),"Error no has puesto un id"+"",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!id.getText().toString().equals("")&&
                        !nombre.getText().toString().equals("")&&
                        !servicio.getText().toString().equals("")&&
                        !fech.getText().toString().equals("")){
                    Toast.makeText(getContext(),a+""+b+""+
                            nombre.getText().toString().toUpperCase()+""+
                            sex+""+fech.getText().toString()+""+
                            servicio.getText().toString().toUpperCase()+""+
                            edad.getText().toString().toUpperCase(),Toast.LENGTH_LONG).show();
                    if (sqlite.updateRegProd(Integer.parseInt(id.getText().toString()),a,b,nombre.getText().toString().toUpperCase(),sex,fech.getText().toString(),habit.getText().toString().toUpperCase(),alim.getText().toString().toUpperCase()).equals("Usuario Modificado")){
                        //recuperar id del ultimo registro
                        Toast.makeText(getContext(),"Registro añadido",Toast.LENGTH_SHORT).show();
                        id.setText("");
                        nombre.setText("");
                        fech.setText("");
                        servicio.setText("");
                        edad.setId(0);
                        sexo.setId(0);
                    }else{
                        Toast.makeText(getContext(),"Error,compruebe que los datos son correctos", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getContext(),"Error,no puede haber campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });

         */
        return view;
    }

}