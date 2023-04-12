package com.example.testexel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;

import java.io.*;
import java.util.ArrayList;


//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.FillPatternType;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFColor;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text1);
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.READ_EXTERNAL_STORAGE },100);
//        }


        try {
//            File path = Environment.getExternalStorageDirectory();
//            InputStream inputStream = new FileInputStream(new File(path, "file.txt"));
            InputStream inputStream1=getAssets().open("myfile.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream1));
            String line;
            String line2 = "";
            ArrayList<String> data = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                // Process each line of the file here
//                System.out.println(line);
                data.add(line);
                line2 += line;
                line2 += "\n";

            }
            text.setText(line2);
            reader.close();



        } catch (IOException e) {
            text.setText(e.getMessage().toString());
        }



    }

}
