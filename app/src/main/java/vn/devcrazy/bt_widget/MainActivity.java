package vn.devcrazy.bt_widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editFirstName, editLastName;
    private Button btnGetFullName;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tìm id của các Widgets
        editFirstName = (EditText) findViewById(R.id.editFirstName);
        editLastName = (EditText) findViewById(R.id.editLastName);
        btnGetFullName = (Button) findViewById(R.id.btnGetFullName);
        txtResult = (TextView) findViewById(R.id.txtResult);

        //Hướng dẫn bắt sự kiện click
        //1. Lắng nghe sự kiện
        btnGetFullName.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        //Lấy ra text của hai ô nhật liệu, sau đó gán kết quả
        String firstName = editFirstName.getText().toString();
        String LastName = editLastName.getText().toString();

        //gán vào kết quả
        txtResult.setText("Kết quả:"+""+ firstName + "" + LastName);

    }
}
