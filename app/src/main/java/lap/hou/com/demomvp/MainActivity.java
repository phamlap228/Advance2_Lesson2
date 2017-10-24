package lap.hou.com.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import lap.hou.com.demomvp.XuLyDangNhap.PresenterLogicXuLyDangNhap;
import lap.hou.com.demomvp.XuLyDangNhap.ViewXuLyDangNhap;

public class MainActivity extends AppCompatActivity implements ViewXuLyDangNhap,AdapterView.OnClickListener{
    Button mButtonDongY;
    EditText mEditTextTK,mEditTextMK;
    PresenterLogicXuLyDangNhap mlogicXuLyDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonDongY= (Button) findViewById(R.id.button_dang_nhap);
        mEditTextTK=(EditText)findViewById(R.id.text_TenDangNhap);
        mEditTextMK=(EditText)findViewById(R.id.text_MatKhau);
        mlogicXuLyDangNhap = new PresenterLogicXuLyDangNhap(this);
        mButtonDongY.setOnClickListener(this);
    }

    @Override
    public void DangNhapThanhCong(String tendangnhap) {
        Toast.makeText(this, "Đăng nhập thành công: "+ tendangnhap, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void DangNhapThatBai() {
        Toast.makeText(this, "Đăng nhập thất bại! ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String tendangnhap,matkhau;
        tendangnhap=mEditTextTK.getText().toString();
        matkhau=mEditTextMK.getText().toString();
        mlogicXuLyDangNhap.KiemTraDangNhap(tendangnhap, matkhau);
    }
}
