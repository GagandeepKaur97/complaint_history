package com.gagan.complaint_history;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Main2Activity extends AppCompatActivity {
    private String[] suffix;
    private Spinner suffixsp;
    private String[] empstatus;
    private Spinner empstatussp;
    private String[] issue;
    private  Spinner issuesp ;
    private  String[] designation;
    private Spinner designationsp;


    private TextView firstname;

    private TextView lastname;
    private TextView streetno;
    private TextView streetname;
    private TextView province;
    private TextView city;
    private TextView country;
    private TextView postalcode;
    private TextView email;
    private TextView  countrycode;
    private TextView cellnumber;
    private TextView detaildescription;
    private Button Register;
    private TextView Datetxt;
    private SeekBar severity;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Register = findViewById(R.id.register);
        suffix = getResources().getStringArray(R.array.suffix);
        suffixsp = findViewById(R.id.spinner);
        empstatus = getResources().getStringArray(R.array.status);
        empstatussp = findViewById(R.id.status);
        designation = getResources().getStringArray(R.array.designation);
        designationsp = findViewById(R.id.designation);
        issue =getResources().getStringArray(R.array.issue);
        issuesp = findViewById(R.id.issue);
        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        streetno =findViewById(R.id.stno);
        streetname = findViewById(R.id.streetname);
        province =findViewById(R.id.provinance);
        city=findViewById(R.id.city);
        country = findViewById(R.id.country);
        postalcode=findViewById(R.id.postalcode);
        email=findViewById(R.id.email);
        countrycode  =findViewById(R.id.countrycode);
        cellnumber= findViewById(R.id.cellnumber);
        detaildescription=findViewById(R.id.description);
        Datetxt = findViewById(R.id.txtDate);
        severity = findViewById(R.id.severity);
       ArrayAdapter<String> mStringArrayAdapter = new ArrayAdapter<>(Main2Activity.this,android.R.layout.simple_spinner_dropdown_item,suffix);
        suffixsp.setAdapter(mStringArrayAdapter);
        suffixsp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,suffix[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Main2Activity.this,"onNothingSelected",Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter<String> eStringArrayAdapter = new ArrayAdapter<>(Main2Activity.this,android.R.layout.simple_spinner_dropdown_item,empstatus);
        empstatussp.setAdapter(eStringArrayAdapter);
        empstatussp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,empstatus[position], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Main2Activity.this,"onNothingSelected",Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter<String> dStringArrayAdapter = new ArrayAdapter<>(Main2Activity.this,android.R.layout.simple_spinner_dropdown_item,designation);
        designationsp.setAdapter(dStringArrayAdapter);
        designationsp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,designation[position], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Main2Activity.this,"onNothingSelected",Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter<String> iStringArrayAdapter = new ArrayAdapter<>(Main2Activity.this,android.R.layout.simple_spinner_dropdown_item,issue);
        issuesp.setAdapter(iStringArrayAdapter);
        issuesp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,issue[position], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Main2Activity.this,"onNothingSelected",Toast.LENGTH_SHORT).show();
            }
        });

        final Calendar myCalendar = Calendar.getInstance();


        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                Datetxt.setText(sdf.format(myCalendar.getTime()));

            }

        };

        Datetxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(Main2Activity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }

        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






                Intent mintent = new Intent(Main2Activity.this, Main3Activity.class);
                Bundle extras = new Bundle();

                extras.putString("SuFix",suffixsp.getSelectedItem().toString());
                extras.putString("firstName",firstname.getText().toString());
                extras.putString("lastName",lastname.getText().toString());
                extras.putString("empStatus",empstatussp.getSelectedItem().toString());
                extras.putString("Desgs",designationsp.getSelectedItem().toString());
                extras.putString("StreetNo",streetno.getText().toString());
                extras.putString("StreetName",streetname.getText().toString());
                extras.putString("Province",province.getText().toString());
                extras.putString("City",city.getText().toString());
                extras.putString("Country",country.getText().toString());
                extras.putString("Postalcode",postalcode.getText().toString());
                extras.putString("Email",email.getText().toString());
                extras.putString("Countrycode",countrycode.getText().toString());
                extras.putString("Cellnumber",cellnumber.getText().toString());
                extras.putString("pickedDate",Datetxt.getText().toString());
                extras.putFloat("seekbar",severity.getProgress());
                extras.putString("Issues",issuesp.getSelectedItem().toString());
                extras.putString("DetailDescription",detaildescription.getText().toString());
                mintent.putExtras(extras);
                startActivity(mintent);




            }
        });







    }
}
