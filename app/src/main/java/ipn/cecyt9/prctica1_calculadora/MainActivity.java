package ipn.cecyt9.prctica1_calculadora;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Double resultado;
    String operador;
    Double numero1;
    Double numero2;

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }


    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }


    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }


    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }


    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }


    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }


    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }


    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.numeros);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.numeros) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }


    public void onClickButtonpuntito(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.numeros) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.numeros) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        try {

            if (operador.equals("+")) {
                resultado = numero1 + numero2;
            } else if (operador.equals("-")) {
                resultado = numero1 - numero2;
            } else if (operador.equals("*")) {
                resultado = numero1 * numero2;
            } else if (operador.equals("/")) {
                resultado = numero1 / numero2;
            }
            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }
    }

    public void onClickButtonborrar(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.numeros) ;
        tv.setText("");
    }

}
