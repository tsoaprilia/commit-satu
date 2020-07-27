package id.sch.smktelkom.mlg.www.perkenalan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String nama, tanggal, alamat, hobi, keinginan;
    int telpon;

    EditText edt_name;
    EditText edt_birthday;
    EditText edt_address;
    EditText edt_phone;
    EditText edt_hobby;
    EditText edt_Wish;

    Button btn_got;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.edt_name);
        edt_birthday = findViewById(R.id.edt_birthday);
        edt_address = findViewById(R.id.edt_address);
        edt_phone = findViewById(R.id.edt_phone);
        edt_hobby = findViewById(R.id.edt_hobby);
        edt_Wish = findViewById(R.id.edt_wish);

        btn_got = findViewById(R.id.btn_got);
        btn_got.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View V) {
                nama = edt_name.getText().toString();
                tanggal = edt_birthday.getText().toString();
                alamat = edt_address.getText().toString();
                telpon = Integer.valueOf(edt_phone.getText().toString());
                hobi = edt_hobby.getText().toString();
                keinginan = edt_Wish.getText().toString();

                showToas(nama);
                showToas(tanggal);
                showToas(alamat);
                showToas(String.valueOf(telpon));
                showToas(hobi);
                showToas(keinginan);

            }
        });
    }

    private void showToas(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
