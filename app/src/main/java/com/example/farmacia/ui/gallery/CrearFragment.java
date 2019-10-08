package com.example.farmacia.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
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

public class CrearFragment extends Fragment {

    private CrearViewModel crearViewModel;
    EditText nombre,edad,servicio,fech,id;
    String a,b,sex;
    Button btnGuardar,btnLimpiar;
   // public SqlLite sqlite;
    RadioButton btnmasc, btnfem;
    RadioGroup sexo;
    boolean checked=false;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        crearViewModel =
                ViewModelProviders.of(this).get(CrearViewModel.class);
        View view = inflater.inflate(R.layout.fragment_crear, container, false);

        sexo =(RadioGroup)view.findViewById(R.id.radiosexocrear);
        id=(EditText)view.findViewById(R.id.txtidcrear);
        nombre=(EditText)view.findViewById(R.id.txtnombrecrear);
        edad=(EditText)view.findViewById(R.id.txtedadcrear);
        servicio=(EditText)view.findViewById(R.id.txtserviciocrear);
        fech=(EditText)view.findViewById(R.id.txtfechacrear);
        btnmasc=(RadioButton)view.findViewById(R.id.btnmasculinocrear);
        btnfem=(RadioButton)view.findViewById(R.id.btnfemeninocrear);
        btnGuardar=(Button)view.findViewById(R.id.btnguardarcrear);
        btnLimpiar=(Button)view.findViewById(R.id.btnguardarcrear);
       /*
        sqlite=new SqlLite(getContext());
        sqlite.abrir();
*/



        sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                switch (checkId){
                    case R.id.btnmasculinocrear:
                        sex="Masculino";
                        break;
                    case R.id.btnfemeninocrear:
                        sex="Femenino";
                        break;
                    default:
                        sex="Opción Invalida";
                        break;
                }
            }
        });

/*
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!id.getText().toString().equals("")&&
                        !nombre.getText().toString().equals("")&&
                        !servicio.getText().toString().equals("")&&
                        !edad.getText().toString().equals("")&&
                        !fech.getText().toString().equals("")){
                    Toast.makeText(getContext(),a+""+b+""+
                            nombre.getText().toString().toUpperCase()+""+
                            sex+""+fech.getText().toString()+""+
                            servicio.getText().toString().toUpperCase()+""+
                            edad.getText().toString().toUpperCase(),Toast.LENGTH_LONG).show();
                    if (sqlite.addRegistroProducto(Integer.parseInt(id.getText().toString()),a,b,nombre.getText().toString().toUpperCase(),sex,fech.getText().toString(),habit.getText().toString().toUpperCase(),alim.getText().toString().toUpperCase())){
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
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id.setText("");
                nombre.setText("");
                fech.setText("");
                servicio.setText("");
                edad.setText(0);
                sexo.setId(0);

            }
        });

 */
        return view;
    }
}