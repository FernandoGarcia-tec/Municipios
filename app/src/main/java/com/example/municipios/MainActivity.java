package com.example.municipios;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.municipios.datos.Municipio;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spM;
    private ArrayList<Municipio> arrayMunicipio = new ArrayList<Municipio>();
    //
    private Municipio mpio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Relaccionar el spimer
        spM = (Spinner) findViewById(R.id.spMunicipios);
        //Llenar la lista de municipios
        llenarMunicipios();

        // Configurar el spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.municipios, android.R.layout.simple_expandable_list_item_1);
        // Asignar el adapter el spinner
        spM.setAdapter(adapter);
        //Listener
        spM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String cad = arrayMunicipio.get(i).getNombre() + "\n"
                        + arrayMunicipio.get(i).getPoblacion() + "\n"+
                        arrayMunicipio.get(i).getExtension() + "\n"+
                        arrayMunicipio.get(i).getUrl();
                //Enviar a impirmir

                printDatosMunicipio(cad);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    /**
     * Metodo para imprimir los datos del municipio
     * @param cad
     */
    private void printDatosMunicipio(String cad) {
        AlertDialog.Builder vent = new AlertDialog.Builder(this);

        //Agregamos los parámetros a la ventana
        vent.setTitle("Error");
        vent.setIcon(R.drawable.infoicon);
        vent.setMessage(cad);

        vent.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Ocultamos la ventana
                dialog.dismiss();

            }
        });
        vent.show();

        vent.show();
    }

    /**
     * Metodo para llenar la informacion de los objetos municipios
     */
    private void llenarMunicipios() {
        //Armeria
        Municipio armeria = new Municipio();
        armeria.setNombre("Armeria");
        armeria.setExtension("341.6 km");
        armeria.setPoblacion("27,626 habitantes");
        armeria.setEscudo("armeria.png");
        armeria.setUrl("https://www.armeria.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(armeria);

        //Colima
        Municipio colima = new Municipio();
        colima.setNombre("Colima");
        colima.setExtension("668.1 km");
        colima.setPoblacion("146,904 habitantes");
        colima.setEscudo("colima.png");
        colima.setUrl("https://www.colima.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(colima);

        //Comala
        Municipio comala = new Municipio();
        comala.setNombre("Comala");
        comala.setExtension("341.6 km");
        comala.setPoblacion("27,626 habitantes");
        comala.setEscudo("comala.png");
        comala.setUrl("https://www.comala.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(comala);

        //Coquimatlan
        Municipio coquimatlan = new Municipio();
        coquimatlan.setNombre("Coquimatlan");
        coquimatlan.setExtension("341.6 km");
        coquimatlan.setPoblacion("27,626 habitantes");
        coquimatlan.setEscudo("coquimatlan.png");
        coquimatlan.setUrl("https://www.coquimatlan.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(coquimatlan);

        //cauhtemoc
        Municipio cauhtemoc = new Municipio();
        cauhtemoc.setNombre("Cauhtemoc");
        cauhtemoc.setExtension("341.6 km");
        cauhtemoc.setPoblacion("27,626 habitantes");
        cauhtemoc.setEscudo("cauhtemoc.png");
        cauhtemoc.setUrl("https://www.cauhtemoc.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(cauhtemoc);

        //ixtlahuacan
        Municipio ixtlahuacan = new Municipio();
        ixtlahuacan.setNombre("Ixtlahuacan");
        ixtlahuacan.setExtension("341.6 km");
        ixtlahuacan.setPoblacion("27,626 habitantes");
        ixtlahuacan.setEscudo("ixtlahuacan.png");
        ixtlahuacan.setUrl("https://www.ixtlahuacan.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(ixtlahuacan);

        //manzanillo
        Municipio manzanillo = new Municipio();
        manzanillo.setNombre("Manzanillo");
        manzanillo.setExtension("341.6 km");
        manzanillo.setPoblacion("27,626 habitantes");
        manzanillo.setEscudo("manzanillo.png");
        manzanillo.setUrl("https://www.manzanillo.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(manzanillo);

        //minatitlan
        Municipio minatitlan = new Municipio();
        minatitlan.setNombre("Minatitlan");
        minatitlan.setExtension("341.6 km");
        minatitlan.setPoblacion("27,626 habitantes");
        minatitlan.setEscudo("minatitlan.png");
        minatitlan.setUrl("https://www.minatitlan.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(minatitlan);

        //tecoman
        Municipio tecoman = new Municipio();
        tecoman.setNombre("Tecoman");
        tecoman.setExtension("341.6 km");
        tecoman.setPoblacion("27,626 habitantes");
        tecoman.setEscudo("tecoman.png");
        tecoman.setUrl("https://www.tecoman.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(tecoman);

        //villa de alvarez
        Municipio villadealvarez = new Municipio();
        villadealvarez.setNombre("Villa de Alvarez");
        villadealvarez.setExtension("341.6 km");
        villadealvarez.setPoblacion("27,626 habitantes");
        villadealvarez.setEscudo("villadealvarez.png");
        villadealvarez.setUrl("https://www.villadealvarez.gob.mx/");
        //intruccimos el objeto en el arraylist
        arrayMunicipio.add(villadealvarez);









    }
}

