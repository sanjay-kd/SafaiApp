package com.nsit.safaiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainScreenActivity extends AppCompatActivity {

    private CardView findDustbinCardView;
    private CardView schedulePickupCardView;
    private CardView requestForDustbinCardView;
    private CardView complaintRegardingRequestCardView;
    private CardView markADustbinCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        findDustbinCardView = findViewById(R.id.findDustbinCardView);
        schedulePickupCardView = findViewById(R.id.schedulePickupCardView);
        requestForDustbinCardView = findViewById(R.id.requestForDustbinCardView);
        complaintRegardingRequestCardView = findViewById(R.id.complaintRegardingRequestCardView);
        markADustbinCardView = findViewById(R.id.markADustbinCardView);

        findDustbinCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, DustBinLocationNavigationActivity.class);
                startActivity(intent);
            }
        });

        schedulePickupCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, PickupRequest.class);
                startActivity(intent);
            }
        });

        requestForDustbinCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, RequestForBinActivity.class);
                startActivity(intent);
            }
        });

        complaintRegardingRequestCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, ComplaintActivity.class);
                startActivity(intent);
            }
        });

        markADustbinCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, LocationOfBinNotMarkedActivity.class);
                startActivity(intent);
            }
        });

    }
}
