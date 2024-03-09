package vn.edu.pxu.broadcast;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            // Hiển thị màn hình chào mừng
            Intent intentWelcome = new Intent(context, WelcomeActivity.class);
            intentWelcome.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentWelcome);
        }
    }
}