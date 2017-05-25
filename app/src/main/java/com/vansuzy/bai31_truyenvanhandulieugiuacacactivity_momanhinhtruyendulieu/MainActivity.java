package com.vansuzy.bai31_truyenvanhandulieugiuacacactivity_momanhinhtruyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vansuzy.model.SinhVien;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGuiDuLieu(View view) {
        Intent intent = new Intent(MainActivity.this, ManHinh2Activity.class);

        intent.putExtra("KIEU_BOOLEAN", true);  // putExtra() là hàm để gởi dữ liệu vào Intent (tức là đóng gói dữ liệu vào Intent: tất cả những dữ liệu muốn gởi qua màn hình khác thì phải đưa vào Intent trước). Đối số 1 là tên biến (đặt tên gì cũng được), đối số 2 là giá trị của biến này.
        intent.putExtra("KIEU_CHAR", 'x');
        intent.putExtra("KIEU_INT", 100);
        intent.putExtra("KIEU_DOUBLE", 15.99);
        intent.putExtra("KIEU_CHUOI", "Topica Edumall");    // Kiểu chuỗi là kiểu đối tượng, nó không phải là kiểu primitive data (kiểu dữ liệu cơ sở).

        SinhVien topica = new SinhVien(1, "Topica Excellent!");
        intent.putExtra("SINHVIEN", topica);

        startActivity(intent);
    }
}
