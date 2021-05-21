package sg.edu.rp.c346.id20026745.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv346;
    TextView tv349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv346 = findViewById(R.id.textView346);
        tv349 = findViewById(R.id.textView349);

        tv346.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Mobile App Development");
                intent.putExtra("AcademicYear","2021");
                intent.putExtra("semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W66M");
                startActivity(intent);
            }
        });
    }
}