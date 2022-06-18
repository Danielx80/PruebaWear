package com.example.pruebawear;

import static com.example.pruebawear.MainActivity.idNotification;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pruebawear.databinding.ActivityDialBBinding;

public class DialActivityB extends Activity {

    private TextView implementationText;
    private ActivityDialBBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDialBBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        implementationText = binding.text;

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(idNotification);
    }
}