package com.example.loginpage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName,editTextSurname,editTextAge,editTextCity;
    private CheckBox checkBox1,checkBox2,checkBox3;
    private RadioButton radioButtonF,radioButtonM;

    private String editName,editSurname,editAge,editCity;
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
        editTextName=(EditText) findViewById(R.id.editTextName);
        editTextSurname=(EditText) findViewById(R.id.editTextSurname);
        editTextAge=(EditText) findViewById(R.id.editTextAge);
        editTextCity=(EditText) findViewById(R.id.editTextCity);

        checkBox1=(CheckBox) findViewById(R.id.checkBoxHobby1);
        checkBox2=(CheckBox) findViewById(R.id.checkBoxHobby2);
        checkBox3=(CheckBox) findViewById(R.id.checkBoxHobby3);

        radioButtonF=(RadioButton) findViewById(R.id.radioBtnFemale);
        radioButtonM=(RadioButton) findViewById(R.id.radioBtnMale);

    }

    public void btnSignUp(View v){
        editName= editTextName.getText().toString();
        editSurname= editTextSurname.getText().toString();
        editAge= editTextAge.getText().toString();
        editCity= editTextCity.getText().toString();

        if( !TextUtils.isEmpty(editName)&&!TextUtils.isEmpty(editAge)&&!TextUtils.isEmpty(editCity)&&!TextUtils.isEmpty(editSurname) ) {

            System.out.println("Your Name: " + editName);
            System.out.println("Your Surname: " + editSurname);
            System.out.println("Your City: " + editCity);
            System.out.println("Your Age: " + editAge);
            System.out.println("------- Your Hobbies -------");
            if(checkBox1.isChecked())
                System.out.println(checkBox1.getText().toString());
            if(checkBox2.isChecked())
                System.out.println(checkBox2.getText().toString());
            if(checkBox3.isChecked())
                System.out.println(checkBox3.getText().toString());

            if(radioButtonM.isChecked())
                System.out.println("Your Gender: " + radioButtonM.getText().toString());
            else
                System.out.println("Your Gender: " + radioButtonF.getText().toString());
        }else
            System.out.println("Please enter your personal information completely.");

    }
}