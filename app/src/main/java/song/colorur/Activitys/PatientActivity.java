package song.colorur.Activitys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import song.colorur.R;

public class PatientActivity extends Activity {
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，是否触发返回
                finish();
            }
        } );
    }

}
