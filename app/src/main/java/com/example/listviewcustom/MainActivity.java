package com.example.listviewcustom;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> beallitasok = new ArrayList<>();
    private List<String> beallitasLeirasok = new ArrayList<>();
    private List<Integer> kepek = new ArrayList<>(Arrays.asList(R.drawable.bluetooth, R.drawable.storage, R.drawable.wallpaper, R.drawable.screen_rotation));
    private LayoutInflater inf;
    private Context ctx;
    private ListView custom_listview;
    private ImageView kep_hely;
    private Text beallitas_nev;
    private Text beallitas_leiras;
    public CustomAdapter (LayoutInflater inf, List<String> beallitasok, List<String> beallitasLeirasok, List<Integer> kepek) {
        this.inf = LayoutInflater.from(ctx);
        this.beallitasok = beallitasok;
        this.kepek = kepek;
        this.beallitasLeirasok = beallitasLeirasok;
    };

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

        beallitasok.add("Bluetooth");
        beallitasok.add("Images");
        CustomAdapter adapter = new CustomAdapter(this, beallitasok, kepek, beallitasLeirasok);
    }
}