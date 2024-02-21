package com.example.linearbtn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnR;
    private Button btnJ;
    private Button btnV;

    private TextView txtV, txtZ;

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJ = findViewById(R.id.btnJ);
        btnR = findViewById(R.id.btnR);
        btnV = findViewById(R.id.btnV);
        txtV = findViewById(R.id.txtV);
        layout = findViewById(R.id.layoutConstraint);
        txtZ = findViewById(R.id.textView3);
            btnJ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layout.setBackgroundColor(Color.YELLOW);
                    txtV.setText("Jaune");
                    txtV.setTextColor(Color.YELLOW);
                    txtV.setBackgroundColor(Color.BLACK);
                    txtZ.setBackgroundColor(Color.BLACK);
                    txtZ.setTextColor(Color.WHITE);
                    txtZ.setText("Vous avez cliqué sur le bouton Jaune");
                }
          });
            btnV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layout.setBackgroundColor(Color.GREEN);
                    txtV.setText("Vert");
                    txtV.setBackgroundColor(Color.BLACK);
                    txtV.setTextColor(Color.GREEN);
                    txtZ.setBackgroundColor(Color.BLACK);
                    txtZ.setTextColor(Color.WHITE);
                    txtZ.setText("Vous avez cliqué sur le bouton vert");
                }
            });
            btnR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layout.setBackgroundColor(Color.RED);
                    txtV.setText("Rouge");
                    txtV.setBackgroundColor(Color.BLACK);
                    txtV.setTextColor(Color.RED);
                    txtZ.setBackgroundColor(Color.BLACK);
                    txtZ.setTextColor(Color.WHITE);
                    txtZ.setText("Vous avez cliqué sur le bouton rouge");
                }
            });
    }
}