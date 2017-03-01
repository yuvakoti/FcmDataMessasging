package koti.fcmdatamessasging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Title,Meassge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Title = (TextView)findViewById(R.id.text_title);
        Meassge = (TextView)findViewById(R.id.text_message);

        if (getIntent().getExtras()!=null){
            for (String key : getIntent().getExtras().keySet())
            {
                if (key.equals("title"))
                    Title.setText(getIntent().getExtras().getString(key));
                else if (key.equals("message"))
                    Meassge.setText(getIntent().getExtras().getString(key));
            }
        }
    }
}
