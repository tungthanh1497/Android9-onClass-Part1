package updown.com.tidypiano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.toString();
    private EditText etName;
    private Button btHello;
    private TextView tvHelloString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.et_name);
        btHello = (Button) findViewById(R.id.bt_hello);
        tvHelloString = (TextView) findViewById(R.id.tv_hello_string);

        btHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");

                String name = etName.getText().toString();
                if (name.length() > 0) {
                    String helloString = "Hello " + name;
                    tvHelloString.setText(helloString);
                }
            }
        });
    }
}
