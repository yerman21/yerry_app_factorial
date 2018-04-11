package com.example.alumfial1.app_factorial.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alumfial1.app_factorial.R;
import com.example.alumfial1.app_factorial.interfaces.Interfaces;
import com.example.alumfial1.app_factorial.presentador.FactorialPresenter;

public class MainActivity extends AppCompatActivity implements Interfaces.View{
    private EditText et_numero;
    private TextView tv_resultado;
    private Button btn_factorial;
    private Interfaces.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero=(EditText)findViewById(R.id.et_numero);
        tv_resultado=(TextView)findViewById(R.id.tv_resultado);
        btn_factorial=(Button)findViewById(R.id.btn_factorial);

        presenter=new FactorialPresenter(this);

        btn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularFactorial(view);
            }
        });

    }

    public void calcularFactorial(View view){
        presenter.factorial(et_numero.getText().toString());
    }

    @Override
    public void mostrarResultado(String r) {
        tv_resultado.setText(r);
    }
}
