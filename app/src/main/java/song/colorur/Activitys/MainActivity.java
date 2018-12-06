package song.colorur.Activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import song.colorur.DefButton.DefImagButton;
import song.colorur.FunctionDefine;
import song.colorur.R;


public class MainActivity extends Activity implements DefImagButton.IMyClick {
    private final static String TAG = MainActivity.class.getSimpleName();

    DefImagButton defimgbtn_plus, defimgbtn_focus,defimgbtn_range,defimgbtn_measure,defimgbtn_note,defimgbtn_clear;
    DefImagButton defimgbtn_minus,defimgbtn_wave,defimgbtn_sound,defimgbtn_back,defimgbtn_saveimage,defimgbtn_savevideo;
    DefImagButton defimgbtn_mode1,defimgbtn_mode2,defimgbtn_stop,defimgbtn_line,defimgbtn_patient,defimgbtn_edit;


//启动活动
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);



        defimgbtn_plus = findViewById(R.id.defimgbtn_plus);
        defimgbtn_focus = findViewById(R.id.defimgbtn_focus);
        defimgbtn_range = findViewById( R.id.defimgbtn_range );
        defimgbtn_measure = findViewById( R.id.defimgbtn_measure );
        defimgbtn_note = findViewById( R.id.defimgbtn_note );
        defimgbtn_clear=findViewById(R.id.defimgbtn_clear);
        defimgbtn_minus=findViewById(R.id.defimgbtn_minus);
        defimgbtn_wave=findViewById(R.id.defimgbtn_wave);
        defimgbtn_sound=findViewById(R.id.defimgbtn_sound);
        defimgbtn_back=findViewById(R.id.defimgbtn_back);
        defimgbtn_saveimage=findViewById(R.id.defimgbtn_saveimage);
        defimgbtn_savevideo=findViewById(R.id.defimgbtn_savevideo);
        defimgbtn_mode1=findViewById(R.id.defimgbtn_mode1);
        defimgbtn_mode2=findViewById(R.id.defimgbtn_mode2);
        defimgbtn_stop=findViewById(R.id.defimgbtn_stop);
        defimgbtn_line=findViewById(R.id.defimgbtn_line);
        defimgbtn_patient=findViewById(R.id.defimgbtn_patient);
        defimgbtn_edit=findViewById(R.id.defimgbtn_edit);

        //设置监听事件
        defimgbtn_plus.setOnMyClickListener(this);
        defimgbtn_focus.setOnMyClickListener(this);
        defimgbtn_range.setOnMyClickListener( this );
        defimgbtn_measure.setOnMyClickListener( this );
        defimgbtn_note.setOnMyClickListener( this );
        defimgbtn_clear.setOnMyClickListener(this);
        defimgbtn_minus.setOnMyClickListener(this);
        defimgbtn_wave.setOnMyClickListener(this);
        defimgbtn_sound.setOnMyClickListener(this);
        defimgbtn_back.setOnMyClickListener(this);
        defimgbtn_saveimage.setOnMyClickListener(this);
        defimgbtn_savevideo.setOnMyClickListener(this);
        defimgbtn_mode1.setOnMyClickListener(this);
        defimgbtn_mode2.setOnMyClickListener(this);
        defimgbtn_stop.setOnMyClickListener(this);
        defimgbtn_line.setOnMyClickListener(this);
        defimgbtn_patient.setOnMyClickListener(this);
        defimgbtn_edit.setOnMyClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


    @Override
    public void onMyClick(int testid) {
        Intent intent = null;
        //主页自定义按钮，点击跳转到各功能模块
        switch (testid) {
            case FunctionDefine.test_plus:
                intent = new Intent(MainActivity.this, PlusActivity.class);
//                显示intent
                startActivity(intent);
                break;
            case FunctionDefine.test_focus:
                intent = new Intent(MainActivity.this, FocusActivity.class);
                startActivity(intent);
                break;
            case FunctionDefine.test_range:
                intent = new Intent( MainActivity.this,RangeActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_measure:
                intent = new Intent( MainActivity.this,MeasureActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_note:
                intent = new Intent( MainActivity.this,NoteActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_clear:
                intent = new Intent( MainActivity.this,ClearActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_minus:
                intent = new Intent( MainActivity.this, MinusActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_wave:
                intent = new Intent( MainActivity.this,WaveActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_sound:
                intent = new Intent( MainActivity.this,SoundActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_back:
                intent = new Intent( MainActivity.this,BackActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_saveimage:
                intent = new Intent( MainActivity.this,SaveImageActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_savevideo:
                intent = new Intent( MainActivity.this,SaveVideoActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_mode1:
                intent = new Intent( MainActivity.this,Mode1Activity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_mode2:
                intent = new Intent( MainActivity.this,Mode2Activity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_stop:
                intent = new Intent( MainActivity.this,StopActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_line:
                intent = new Intent( MainActivity.this,LineActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_patient:
                intent = new Intent( MainActivity.this,PatientActivity.class );
                startActivity( intent );
                break;
            case FunctionDefine.test_edit:
                intent = new Intent( MainActivity.this,EditActivity.class );
                startActivity( intent );
                break;
            default:
                break;
        }
    }

}
