package br.com.up.enviarmensagemwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText phone;
    private TextInputEditText message;
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inserindo na varivel e informando pasta
        phone   = findViewById(R.id.text_phone);
        message = findViewById(R.id.text_message);
        click   = findViewById(R.id.button_click);

        //ouve
        click.setOnClickListener(view ->{

            //variavel que guarda as informaçoes do imput
            String telefone  = phone.getText().toString();
            String menssagem = message.getText().toString();

            //intent + link do whats
            Uri webpage = Uri.parse("https://wa.me/" + telefone + "?text=" + menssagem);
            Intent webintent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webintent);
        });
    }
}