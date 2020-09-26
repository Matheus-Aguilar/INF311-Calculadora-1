package android.teste.matheusaguilar.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButtonSum(View view){
        EditText edt1 = (EditText) findViewById(R.id.valor1);
        EditText edt2 = (EditText) findViewById(R.id.valor2);
        TextView result = (TextView) findViewById(R.id.result);

        if(edt1.getText().toString().length() == 0){
            result.setText("Erro: O primeiro campo esta vazio");
            return;
        }

        if(edt2.getText().toString().length() == 0){
            result.setText("Erro: O segundo campo esta vazio");
            return;
        }

        double valor1, valor2;

        try{
            valor1 = parseDouble(edt1.getText().toString());
            valor2 = parseDouble(edt2.getText().toString());
        }
        catch(NumberFormatException e){
            result.setText("Erro: Valores com formato invalido");
            return;
        }

        result.setText("Resultado: " + Double.toString(valor1 + valor2));
    }

    public void clickButtonSub(View view){
        EditText edt1 = (EditText) findViewById(R.id.valor1);
        EditText edt2 = (EditText) findViewById(R.id.valor2);
        TextView result = (TextView) findViewById(R.id.result);

        if(edt1.getText().toString().length() == 0){
            result.setText("Erro: O primeiro campo esta vazio");
            return;
        }

        if(edt2.getText().toString().length() == 0){
            result.setText("Erro: O segundo campo esta vazio");
            return;
        }

        double valor1, valor2;

        try{
            valor1 = parseDouble(edt1.getText().toString());
            valor2 = parseDouble(edt2.getText().toString());
        }
        catch(NumberFormatException e){
            result.setText("Erro: Valores com formato invalido");
            return;
        }

        result.setText("Resultado: " + Double.toString(valor1 - valor2));
    }

    public void clickButtonMult(View view){
        EditText edt1 = (EditText) findViewById(R.id.valor1);
        EditText edt2 = (EditText) findViewById(R.id.valor2);
        TextView result = (TextView) findViewById(R.id.result);

        if(edt1.getText().toString().length() == 0){
            result.setText("Erro: O primeiro campo esta vazio");
            return;
        }

        if(edt2.getText().toString().length() == 0){
            result.setText("Erro: O segundo campo esta vazio");
            return;
        }

        double valor1, valor2;

        try{
            valor1 = parseDouble(edt1.getText().toString());
            valor2 = parseDouble(edt2.getText().toString());
        }
        catch(NumberFormatException e){
            result.setText("Erro: Valores com formato invalido");
            return;
        }

        result.setText("Resultado: " + Double.toString(valor1 * valor2));
    }

    public void clickButtonDiv(View view){
        EditText edt1 = (EditText) findViewById(R.id.valor1);
        EditText edt2 = (EditText) findViewById(R.id.valor2);
        TextView result = (TextView) findViewById(R.id.result);

        if(edt1.getText().toString().length() == 0){
            result.setText("Erro: O primeiro campo esta vazio");
            return;
        }

        if(edt2.getText().toString().length() == 0){
            result.setText("Erro: O segundo campo esta vazio");
            return;
        }

        double valor1, valor2;

        try{
            valor1 = parseDouble(edt1.getText().toString());
            valor2 = parseDouble(edt2.getText().toString());
        }
        catch(NumberFormatException e){
            result.setText("Erro: Valores com formato invalido");
            return;
        }

        if(valor2 == 0.0)
            result.setText("Erro: Divisao por zero!!!");
        else
            result.setText("Resultado: " + Double.toString(valor1 / valor2));
    }
}