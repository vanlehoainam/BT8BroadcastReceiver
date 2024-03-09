package vn.edu.pxu.broadcast;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Tùy chỉnh giao diện màn hình chào mừng

        // Hiển thị thông báo chào mừng
        Toast.makeText(this, "Chào mừng bạn đến với điện thoại của Tôi !", Toast.LENGTH_LONG).show();
    }
}
