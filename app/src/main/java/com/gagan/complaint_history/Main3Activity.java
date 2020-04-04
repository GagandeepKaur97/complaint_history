package com.gagan.complaint_history;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        form = findViewById(R.id.txtForm);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();


        complaintdetails C2 = (complaintdetails) extras.getSerializable("object");





        form.setText("*********COMPLAINT FORM*******" +
                "**********\n"+"Name of Complainer:    "+C2.getSuffix()+ " "+C2.getFirstname()+" "+C2.getLastname()+"\nEmployment status:    "+C2.getEmpstatus()+"\nDesignation:    "+C2.getDesignation()+"\nStreet no:    "+C2.getStreetNo()+"\nStreet Name:    "+C2.getStreetName()+"\nProvince:    "+
                C2.getEmpstatus()+"\nCity:    "+C2.getCity()+"\nCountry:    "+C2.getCountry()+"\nPostal code:    "+C2.getPostalcode()+"\nEmail:    "+C2.getEmailid()+"\nCountry Code:    "+C2.getCountryCode()
                +"\nCell Number:    "+C2.getCellNumber()+"\nComplaint Issue Date:    "+C2.getIssuedate()+"\nIssues:    "+C2.getIssuetype()+"\nSeverity:    "+C2.getSevirty()+"\nDetailed Description:    "+C2.getDetailedDesc());
        form.setTextColor(Color.BLACK);
        form.setTextSize(18);





    }
}
