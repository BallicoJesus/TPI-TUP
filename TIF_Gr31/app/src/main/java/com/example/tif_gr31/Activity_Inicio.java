package com.example.tif_gr31;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/// ----------------------------------------------------------------------------///

public class Activity_Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this); // permite que la app use toda la pantalla
        setContentView(R.layout.activity_inicio); // carga el layout XML

        // Ajusta padding para barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /// Referencias a los botones del layout
        Button BtnRegistrarComida = findViewById(R.id.BtnRegisComida);
        LinearLayout BtnEstadisticas = findViewById(R.id.BtnEstadisticas);
        LinearLayout BtnRecomendaciones = findViewById(R.id.BtnRecomendaciones);
        LinearLayout BtnHistorial = findViewById(R.id.BtnHistorial);
        LinearLayout BtnPerfil = findViewById(R.id.BtnPerfil);

        /// Navegacion a pantalla Registrar comida
        BtnRegistrarComida.setOnClickListener(v -> {
            Intent intent = new Intent(Activity_Inicio.this, Activity_RegistrarComida.class);
            startActivity(intent);
        });

        /// Navegacion a pantalla Estadisticas
        BtnEstadisticas.setOnClickListener(v -> {
            Intent intent = new Intent(Activity_Inicio.this, Activity_Estadisticas.class);
            startActivity(intent);
        });

        /// Navegacion a pantalla Recomendaciones
        BtnRecomendaciones.setOnClickListener(v -> {
            Intent intent = new Intent(Activity_Inicio.this, Activity_Recomendaciones.class);
            startActivity(intent);
        });

        /// Navegacion a pantalla Historial
        BtnHistorial.setOnClickListener(v -> {
            Intent intent = new Intent(Activity_Inicio.this, Activity_Historial.class);
            startActivity(intent);
        });

        /// Navegacion a pantalla Perfil
        BtnPerfil.setOnClickListener(v -> {
            Intent intent = new Intent(Activity_Inicio.this, Activity_Perfil.class);
            startActivity(intent);
        });
    }
}
