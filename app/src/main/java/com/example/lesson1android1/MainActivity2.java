package com.example.lesson1android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private Button buttonn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button2);
        imageView = findViewById(R.id.image_view2);
        buttonn = findViewById(R.id.button3);

        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Вы успешно зашли!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this,MainActivitylonnar.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        String text = intent.getStringExtra("key");
       buttonn.setText(text);
    }
}
// 1.Создать пустую кнопку , что бы слово Айназик выходил в той кнопке.✔️