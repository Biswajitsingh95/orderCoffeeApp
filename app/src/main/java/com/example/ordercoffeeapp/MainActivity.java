package com.example.ordercoffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /* This method is called when we click + button*/
    public void increament(View view) {
        quantity = quantity + 1;
        display(quantity);

    }

    /* This methos is call when we click - button*/
    public void decreament(View view){
        quantity = quantity-1;
        display(quantity);
    }

    /*This method is called when wee click button*/
    public void submitOrder(View view) {
        String priceMessage = "Toatl order " + quantity + " cups of Coffees..\n\n "+ "and Total price = $"+ (quantity*5);
        displayMessage(priceMessage);
    }

    private void display(int number) {
        TextView order_View = findViewById(R.id.order_view);
        order_View.setText(""+ number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView price_text_View = (TextView) findViewById(R.id.price_text_View);
        price_text_View.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView price_text_View = findViewById(R.id.price_text_View);
        price_text_View.setText(message);
    }
}