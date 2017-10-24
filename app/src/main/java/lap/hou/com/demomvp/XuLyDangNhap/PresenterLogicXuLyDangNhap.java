package lap.hou.com.demomvp.XuLyDangNhap;

import android.widget.Toast;

import lap.hou.com.demomvp.MainActivity;

/**
 * Created by Lap on 17/10/2017.
 */

public class PresenterLogicXuLyDangNhap implements PresenterImpXuLyDangNhap {
    ViewXuLyDangNhap viewXuLyDangNhap;
    public PresenterLogicXuLyDangNhap(ViewXuLyDangNhap viewXuLyDangNhap){
        this.viewXuLyDangNhap=viewXuLyDangNhap;
    }
    @Override
    public void KiemTraDangNhap(String tendangnhap, String matkhau) {
        if (tendangnhap.equals("Phamlap228")&& matkhau.equals("123")){
         // dang nhap thanh cong
            viewXuLyDangNhap.DangNhapThanhCong(tendangnhap);
        }
        else {
            //dang nhap that bai
            viewXuLyDangNhap.DangNhapThatBai();
        }
    }
}
