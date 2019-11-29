package com.example.ckeckboxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double prices[] = {9,10,8,6,7,8.5,7.5};
    RadioButton rbsmall,rbmedium,rblarge,rbdelivery,rbpickup;
    Spinner typesspinner;
    Button btnplaceorder;
    CheckBox cbbeef,cbpineapple,cbpeparoni,cbchicken,cbdrinks;
    EditText etTotal;

    static int i;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rbsmall=findViewById(R.id.small);
        rbmedium=findViewById(R.id.medium);
        rblarge=findViewById(R.id.large);
        rbdelivery=findViewById(R.id.delivery);
        rbpickup=findViewById(R.id.pickup);

        etTotal=findViewById(R.id.Total);

        typesspinner=findViewById(R.id.pizzatypesspinner);

        btnplaceorder=findViewById(R.id.placeorderbutton);

        cbbeef=findViewById(R.id.beef);
        cbpineapple=findViewById(R.id.pineapple);
        cbpeparoni=findViewById(R.id.paparoni);
        cbchicken=findViewById(R.id.chicken);
        cbdrinks=findViewById(R.id.drinks);



        List<String> types = new ArrayList<String>();
        types.add("Mozzarella.");
        types.add( "Mushrooms.");
        types.add( "Cheese blend.");
        types.add( "Green peppers.");
        types.add("Onions.");
        types.add("Bacon/back bacon.");
        types.add( "Ham.");

        ArrayAdapter<String> typeAdapter= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,types)  ;
        typeAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        typesspinner.setAdapter(typeAdapter);

        btnplaceorder.setOnClickListener(this);

        cbbeef.setOnClickListener(this);
        cbpineapple.setOnClickListener(this);
        cbpeparoni.setOnClickListener(this);
        cbchicken.setOnClickListener(this);
        cbdrinks.setOnClickListener(this);



       // i=position;

    }


    @Override
    public void onClick(View v) {
double price = Double.parseDouble(etTotal.getText().toString());
        switch(v.getId())
        {
            case R.id.beef:
                if(cbbeef.isChecked())
                    price +=1;
                else
                    price -=1;
                break;

            case R.id.chicken:

                break;

            case R.id.pineapple:

                break;

            case R.id.paparoni:

                break;

            case R.id.drinks:

                break;

        }

    }
}
