package com.example.datatable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

import ir.androidexception.datatable.DataTable;
import ir.androidexception.datatable.model.DataTableHeader;
import ir.androidexception.datatable.model.DataTableRow;

public class MainActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataTable dataTable = findViewById(R.id.data_table) ;
        context = getApplicationContext();

        DataTableHeader header = new DataTableHeader.Builder()
                .item("field name", 1)
                .item("field name", 1)
                .item("field name", 1)
                .item("field name", 1)

    .build();

        ArrayList<DataTableRow> rows = new ArrayList<>();
        // define 200 fake rows for table
        for(int i=0;i<200;i++) {
            Random r = new Random();
            int random = r.nextInt(i+1);
            int randomDiscount = r.nextInt(20);
            DataTableRow row = new DataTableRow.Builder()
                    .value("Product #" + i)
                    .value(String.valueOf(random))
                    .value(String.valueOf(random*1000).concat("$"))
                    .value(String.valueOf(randomDiscount).concat("%"))

            .build();
            rows.add(row);
        }

        //dataTable.setTypeface(typeface);
        dataTable.setHeader(header);
        dataTable.setRows(rows);
        dataTable.inflate(context);




    }
}
