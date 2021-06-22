package com.example.jandroid.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;

public class BuyNewActivity extends AppCompatActivity {

    private PaymentsClient paymentsClient;
    private IsReadyToPayRequest isReadyToPayRequest;
    private Button backToHome;
    private Button buyPremium;
    private Boolean isReadyToPay=false;
    private ImageView payImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_new);
//        Wallet.WalletOptions walletOptions =
//                new Wallet.WalletOptions.Builder()
//                        .setEnvironment(WalletConstants.ENVIRONMENT_PRODUCTION)
//                        .build();

//        paymentsClient = Wallet.getPaymentsClient(this, walletOptions);

        backToHome= findViewById(R.id.backToHomeBuy2);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToHome();
            }
        });
        buyPremium=(Button) findViewById(R.id.payForPremium2);
        buyPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isReadyToPay=true;
                showGooglePayButton(isReadyToPay);
            }


        });

    }
    public void goBackToHome() {
        Intent intentLinear = new Intent(this, MainActivity.class);
        startActivity(intentLinear);
    }
    public void showGooglePayButton(boolean isReady){
        payImage=(ImageView) findViewById(R.id.payImage);
        if (isReady) {
            payImage.setVisibility(View.VISIBLE);
        }
    }

}