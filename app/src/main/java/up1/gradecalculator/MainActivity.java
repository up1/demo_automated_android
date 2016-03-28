package up1.gradecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText scoreEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreEditText = (EditText) findViewById(R.id.score);
        resultTextView = (TextView) findViewById(R.id.result);
    }

    public void convertScoreToGrade(View view) {
        int score = Integer.parseInt(scoreEditText.getText().toString());
        String resultMessage = "You got grade ";
        if(score >= 80) {
            resultMessage += "A";
        } else if(score >=70) {
            resultMessage += "B";
        } else if(score >= 60) {
            resultMessage += "C";
        } else if(score >= 50) {
            resultMessage += "D";
        } else {
            resultMessage += "F";
        }
        resultTextView.setText(resultMessage);
    }
}
