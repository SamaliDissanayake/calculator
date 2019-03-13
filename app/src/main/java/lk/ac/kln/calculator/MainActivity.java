package lk.ac.kln.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numberone = 0;
    int numbertwo = 0;
    EditText FirstInput;
    EditText secondInput;
    TextView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstInput = findViewById(R.id.editText);
        secondInput = findViewById(R.id.editText2);
        resultView = findViewById(R.id.textView2);

    }
    /* tis method add two numbers and give the result
     * */

    protected void addNumbers(View view) {


        numberone = Integer.parseInt(FirstInput.getText().toString());
        numbertwo = Integer.parseInt(secondInput.getText().toString());

        int sum = numberone + numbertwo;
        resultView.setText(Integer.toString(sum));
    }
}
