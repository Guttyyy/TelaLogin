package br.org.catolicasc.telalogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText.setText("");

        editText = findViewById(R.id.editText2);
        editText.setText("");

        Button button = findViewById(R.id.button);  //botao

        textView = findViewById(R.id.textView4);  //login com sucesso


        final String login = editText.getText().toString();
        final String senha = editText.getText().toString();


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (login != "Ricardo" || senha != "Ricardolindo"){
                    String texto = editText.getText().toString();
                 textView.append(texto);

                }

            }
        };





    }



}
