package sg.edu.rp.c346.id20026745.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvAnswer;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvAnswer = findViewById(R.id.textView);
        btnBack = findViewById(R.id.button);

        Intent intent = getIntent();
        String code = intent.getStringExtra("moduleCode");
        String name = intent.getStringExtra("moduleName");
        int year = intent.getIntExtra("academicYear",0);
        int semester = intent.getIntExtra("semester",0);
        int credit = intent.getIntExtra("moduleCredit",0);
        String venue = intent.getStringExtra("venue");

        tvAnswer.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: " + year + "\nSemester: " + semester + "\nModule Credit: " + credit + "\nVenue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}