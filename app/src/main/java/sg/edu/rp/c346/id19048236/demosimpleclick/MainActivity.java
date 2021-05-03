package sg.edu.rp.c346.id19048236.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btnclick;
    EditText eText;
    TextView tDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick= findViewById(R.id.buttonDisplay);
        eText=findViewById(R.id.editTextInput);
        tDisplay=findViewById(R.id.textViewDisplay);
        tbtn=findViewById(R.id.toggleButton);
        rgGender=findViewById(R.id.radioGroup);

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //method 1 hard way

            /*if (tbtn.isChecked()){
                    eText.setEnabled(true);
                }
                else{
                    eText.setEnabled(false);
                }*/

                //method 2 easy way

                eText.setEnabled(tbtn.isChecked());


            }
        });

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput= eText.getText().toString();

                if (rgGender.getCheckedRadioButtonId()==R.id.radioButtonGenderMale){
                    userInput="He says "+userInput;
                }else{
                    userInput="She says "+userInput;
                }
                tDisplay.setText(userInput);
            }
        });
    }
}