package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calculatortest.R;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;


public class MainActivity extends AppCompatActivity {
    public int pressOp=0,pressNum=0,answer,decimal=0,canCal=0;
    boolean pressed;
    public double ans=0,num,tempNum;
    public String op,newOp=" ",opCom = " ";
    Stack<String> expers = new Stack<String>();
    EditText txtView,txtView2;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnMul,btnDiv,btnDec,btnEqu,btnClear;
    private static final DecimalFormat mi = new DecimalFormat("#.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnPlus= (Button)findViewById(R.id.btnplus);
        btnMinus = (Button)findViewById(R.id.btnminus);
        btnMul = (Button)findViewById(R.id.btnmulti);
        btnDiv = (Button)findViewById(R.id.btndivide);
        btnDec = (Button)findViewById(R.id.btndecimal);
        btnEqu = (Button)findViewById(R.id.btnequal);
        btnClear = (Button)findViewById(R.id.btnclear);
        txtView=(EditText)findViewById(R.id.output);
        txtView2=(EditText)findViewById(R.id.output2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("1");
                    txtView2.append("1");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());
                    if(checkNum == Math.abs(ans)||checkNum == ans){
                        txtView.setText("");
                        txtView.append("1");
                    }else{
                        txtView.append("1");
                    }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("2");
                    txtView2.append("2");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("2");
                    }else{
                        txtView.append("2");
                    }
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("3");
                    txtView2.append("3");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("3");
                    }else{
                        txtView.append("3");
                    }
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("4");
                    txtView2.append("4");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("4");
                    }else{
                        txtView.append("4");
                    }
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("5");
                    txtView2.append("5");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("5");
                    }else{
                        txtView.append("5");
                    }
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("6");
                    txtView2.append("6");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("6");
                    }else{
                        txtView.append("6");
                    }
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("7");
                    txtView2.append("7");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("7");
                    }else{
                        txtView.append("7");
                    }
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("8");
                    txtView2.append("8");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("8");
                    }else{
                        txtView.append("8");
                    }
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("9");
                    txtView2.append("9");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("9");
                    }else{
                        txtView.append("9");
                    }
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pressNum==0) {
                    txtView.append("0");
                    txtView2.append("0");
                }else{
                    double checkNum = Double.parseDouble(txtView.getText().toString());;
                    if(checkNum == Math.abs(ans)||checkNum == ans) {
                        txtView.setText("");
                        txtView.append("0");
                    }else{
                        txtView.append("0");
                    }
                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="+";
                if(pressed){
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    if(num==0){
                        num=number;
                    }
                    if(pressOp==0&&num==number){
                        compareOp(op,number);
                        pressOp=1;
                        num=number;
                    }else{
                        if(ans==number) {
                            compareOp(op, number);
                        }else{
                            compareOp(op,number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op,number);
                    pressed=false;
                }else {
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    String compare = txtView.getText().toString();
                    int len = compare.length();
                    expers.push(txtView.getText().toString());
                    expers.push(op);

                    if (num == 0) {
                        calculateDouble(number, op);
                        num = number;
                    }
                    if (pressOp == 0 && len == 1) {
                        compareOp(op, number);
                        pressOp = 1;
                        num = number;
                    } else {
                        if (len > 1) {
                            compareOp(op, number);
                        } else {
                            compareOp(op, number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op, number);
                }
                btnDec.setEnabled(true);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="-";
                if(pressed){
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    if(num==0){
                        num=number;
                    }
                    if(pressOp==0&&num==number){
                        compareOp(op,number);
                        pressOp=1;
                        num=number;
                    }else{
                        if(ans==number) {
                            compareOp(op, number);
                        }else{
                            compareOp(op,number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op,number);
                    pressed=false;
                }else {
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    String compare = txtView.getText().toString();
                    int len = compare.length();
                    expers.push(txtView.getText().toString());
                    expers.push(op);
                    if (num == 0) {
                        calculateDouble(number, op);
                        num = number;
                    }
                    if (pressOp == 0 && len == 1) {
                        compareOp(op, number);
                        pressOp = 1;
                        num = number;
                    } else {
                        if (len > 1) {
                            compareOp(op, number);
                        } else {
                            compareOp(op, number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op, number);
                }
                btnDec.setEnabled(true);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="*";
                if(pressed){
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    if(num==0){
                        num=number;
                    }
                    if(pressOp==0&&num==number){
                        compareOp(op,number);
                        pressOp=1;
                        num=number;
                    }else{
                        if(ans==number) {
                            compareOp(op, number);
                        }else{
                            compareOp(op,number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op,number);
                    pressed=false;
                }else {
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    String compare = txtView.getText().toString();
                    int len = compare.length();
                    expers.push(txtView.getText().toString());
                    expers.push(op);
                    if (num == 0) {
                        calculateDouble(number, op);
                        num = number;
                    }
                    if (pressOp == 0 && len == 1) {
                        compareOp(op, number);
                        pressOp = 1;
                        num = number;
                    } else {
                        if (len > 1) {
                            compareOp(op, number);
                        } else {
                            compareOp(op, number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op, number);
                }
                btnDec.setEnabled(true);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="/";
                if(pressed){
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    if(num==0){
                        num=number;
                    }
                    if(pressOp==0&&num==number){
                        compareOp(op,number);
                        pressOp=1;
                        num=number;
                    }else{
                        if(ans==number) {
                            compareOp(op, number);
                        }else{
                            compareOp(op,number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op,number);
                    pressed=false;
                }else {
                    double number = Double.parseDouble(String.valueOf(txtView.getText()));
                    String compare = txtView.getText().toString();
                    int len = compare.length();
                    expers.push(txtView.getText().toString());
                    expers.push(op);
                    if (num == 0) {
                        calculateDouble(number, op);
                        num = number;
                    }
                    if (pressOp == 0 || len == 1) {
                        compareOp(op, number);
                        pressOp = 1;
                        num = number;
                    } else {
                        if (len > 1) {
                            compareOp(op, number);
                        } else {
                            compareOp(op, number);
                            calculateDouble(number, op);
                        }
                    }
                    printTextVeiw(op, number);
                }
                btnDec.setEnabled(true);
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.append(".");
                if(pressNum==0) {
                    txtView2.append(".");
                }
                pressed=true;
                btnDec.setEnabled(false);
            }
        });
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PemDa
                String number = txtView.getText().toString();
                expers.push(number);
                pressed=false;
                String removeComma = expers.toString().replace(",","");
                String removeBracket = removeComma.replace("["," ");
                String expression = removeBracket.replace("]"," ");
                txtView2.setText("");
                txtView2.append(expression);
                String result = String.valueOf(calculate(expression));
                ans = calculate(expression);
                txtView.setText("");
                txtView.append(result);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText("");
                txtView2.setText("");
                ans = 0;
                newOp = " ";
                pressOp = 0;
                pressNum = 0;
                decimal= 0;
                answer=0;
                btnDec.setEnabled(true);
                expers.clear();
            }
        });
    }
    public void printTextVeiw(String op,double num){
        /*if (pressOp == 0) {
            txtView2.setText("");
            txtView2.append(Double.toString(num));
            txtView2.append(op);
        } else{*/
        if(newOp.equals(op)){
            txtView2.setText("");
            txtView2.append(Double.toString(ans));
            txtView2.append(op);
            txtView.setText("");
            txtView.append(Double.toString(ans));
        }else{
            ans = Double.parseDouble(mi.format(ans));
            txtView2.setText("");
            txtView2.append(Double.toString(ans));
            txtView2.append(newOp);
            txtView.setText("");
            txtView.append(Double.toString(ans));
        }

        // }
    }
    public void compareOp(String op,double num){
        if (pressOp == 0) {
            ans=num;
            if(newOp.equals(" ")) {
                newOp = op;
            }
            pressNum = 1;
            canCal=0;
        } else{
            if(newOp.equals(op)) {
                this.op = op;
                newOp = op;
                canCal = 0;
            }else{
                this.op=newOp;
                newOp = op;
                canCal = 0;
            }

        }
    }
    public void calculateDouble(double num,String op) {
        switch (op) {
            case "+":
                ans += num;
                break;
            case "-":
                ans -= num;
                break;
            case "*":
                if (ans == 0) {
                    ans = 1;
                    ans *= num;
                } else {
                    ans *= num;
                }
                break;
            case "/":
                if (num != 0) {
                    ans /= num;
                } else {
                    Toast.makeText(this, "WARNING! Can't Divide By 0", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
    public static double calculate(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    sb.append(expression.charAt(++i));
                }
                numbers.push(Double.parseDouble(sb.toString()));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    evaluate(numbers, operators);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            evaluate(numbers, operators);
        }

        return numbers.pop();
    }
    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private static void evaluate(Stack<Double> numbers, Stack<Character> operators) {
        double num2 = numbers.pop();
        double num1 = numbers.pop();
        char operator = operators.pop();
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                break;
        }

        numbers.push(result);
    }
}
