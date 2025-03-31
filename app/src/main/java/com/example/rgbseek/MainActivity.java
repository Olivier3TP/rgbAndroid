package com.example.rgbseek;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int red = 0, green = 0, blue = 0;

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

        TextView colorView = findViewById(R.id.colorView);
        SeekBar seekRed = findViewById(R.id.seekBarRed);
        SeekBar seekGreen = findViewById(R.id.seekBarGreen);
        SeekBar seekBlue = findViewById(R.id.seekBarBlue);
        EditText editRed = findViewById(R.id.editTextNumberRed);
        EditText editGreen = findViewById(R.id.editTextNumberGreen);
        EditText editBlue = findViewById(R.id.editTextNumberBlue);
        EditText rgbValues = findViewById(R.id.rgbValues);

        seekRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red = progress;
                int color = Color.rgb(red, green, blue);
                colorView.setBackgroundColor(color);
                editRed.setText(String.valueOf(red));
                rgbValues.setText("RGB:" + red + "," + green + "," + blue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green = progress;
                int color = Color.rgb(red, green, blue);
                colorView.setBackgroundColor(color);
                editGreen.setText(String.valueOf(green));
                rgbValues.setText("RGB:" + red + "," + green + "," + blue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue = progress;
                int color = Color.rgb(red, green, blue);
                colorView.setBackgroundColor(color);
                editBlue.setText(String.valueOf(blue));
                rgbValues.setText("RGB:" + red + "," + green + "," + blue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}