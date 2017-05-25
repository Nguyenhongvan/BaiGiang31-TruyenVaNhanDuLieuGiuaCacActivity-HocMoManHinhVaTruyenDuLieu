package com.vansuzy.bai31_truyenvanhandulieugiuacacactivity_momanhinhtruyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.vansuzy.model.SinhVien;

public class ManHinh2Activity extends AppCompatActivity {
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);

        addControls();
    }

    private void addControls() {
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);

        Intent intent = getIntent();
        boolean kieuBoolean = intent.getBooleanExtra("KIEU_BOOLEAN", false);    // Nếu như mà tồn tại biến có tên là KIEU_BOOLEAN bên màn hình MainActivity thì nó lấy đúng giá trị của màn hình MainActivity truyền qua (true), còn nếu như không tồn tại thì đối số thứ hai chính là giá trị mặc định (trong trường hợp này là false).
        char kieuChar = intent.getCharExtra("KIEU_CHAR", 'y');
        int kieuInt = intent.getIntExtra("KIEU_INT", 0);
        double kieuDouble = intent.getDoubleExtra("KIEU_DOUBLE", 0.0);
        String kieuChuoi = intent.getStringExtra("KIEU_CHUOI"); // Nếu trong MainActivity không tồn tại biến có tên là KIEU_CHUOI thì lúc này biến kieuChuoi sẽ có giá trị là null
        SinhVien sv = (SinhVien) intent.getSerializableExtra("SINHVIEN");

        txtKetQua.setText("Kiểu boolean = " + kieuBoolean + "\n" +
                            "Kiểu char = " + kieuChar + "\n" +
                            "Kiểu int = " + kieuInt + "\n" +
                            "Kiểu double = " + kieuDouble + "\n" +
                            "Kiểu chuỗi = " + kieuChuoi + "\n"+
                            "Kiểu đối tượng = " + sv);
    }
}
