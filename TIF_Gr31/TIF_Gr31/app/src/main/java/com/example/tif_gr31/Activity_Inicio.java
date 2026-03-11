package com.example.tif_gr31;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /// Botones
        Button BtnRegistrarComida=findViewById(R.id.BtnRegisComida);
        Button BtnEstadisticas=findViewById(R.id.BtnEstadisticas);
        Button BtnRecomendaciones=findViewById(R.id.BtnRecomendaciones);
        Button BtnHistorial=findViewById(R.id.BtnHistorial);
        Button BtnPerfil=findViewById(R.id.BtnPerfil);


        ///Evento click para cada boton
        BtnRegistrarComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Inicio.this,Activity_RegistrarComida.class);
                startActivity(intent);


            }
        });

        BtnEstadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Inicio.this,Activity_Estadisticas.class);
                startActivity(intent);


            }
        });

        BtnRecomendaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Activity_Inicio.this,Activity_Recomendaciones.class);
                startActivity(intent);


            }
        });

        BtnHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Inicio.this,Activity_Historial.class);
                startActivity(intent);


            }
        });

        BtnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Inicio.this,Activity_Perfil.class);
                startActivity(intent);


            }
        });




    }
}