package com.calculator.sam.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends ActionBarActivity {

    private Toolbar toolbar;


    static String All="";
    float ResultN;
    String[] arg = new String[50];

    int[] operand = new int[49];
    int[] sign = new int[50];
    int sign_reveal = 0 ;
    int operand_counter=0;
    int sign_counter =0;
    int arg_counter=0 ;




    TextView Result ;
    Button btnMult;
    Button btnDiv;
    Button btnAdd;
    Button btnSub;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnResult;
    Button btnClear;
    Button Vergule;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        int i=0;
        while(i<arg.length){
            arg[i]="";
            i++;
        }

        Result =(TextView)findViewById(R.id.Result);
        btnMult = (Button)findViewById(R.id.multi);
        btnDiv = (Button)findViewById(R.id.div);
        btnAdd = (Button)findViewById(R.id.plus);
        btnSub =(Button)findViewById(R.id.minus);
        btn0 =(Button)findViewById(R.id.Num0);
        btn1 =(Button)findViewById(R.id.Num1);
        btn2 =(Button)findViewById(R.id.Num2);
        btn3 =(Button)findViewById(R.id.Num3);
        btn4 =(Button)findViewById(R.id.Num4);
        btn5 =(Button)findViewById(R.id.Num5);
        btn6 =(Button)findViewById(R.id.Num6);
        btn7 =(Button)findViewById(R.id.Num7);
        btn8 =(Button)findViewById(R.id.Num8);
        btn9 =(Button)findViewById(R.id.Num9);
        btnClear=(Button)findViewById(R.id.C);
        btnResult = (Button)findViewById(R.id.Eql);
        Vergule = (Button)findViewById(R.id.vergule);


        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (arg[0]!="" && sign_reveal==0){
                    operand[operand_counter]=2;
                    operand_counter++;
                    sign_reveal++;
                    arg_counter++;
                    sign_counter++;
                }else {
                    if(sign_reveal==1) {
                        operand[operand_counter-1]=2;
                        sign_reveal++;
                        arg_counter++;
                    }}
                if (arg[0]!="" && sign_reveal==1 ){
                    All+="X";
                    Result.setText(All);
                }
            }
        });
//
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arg[0]!="" && sign_reveal==0){
                    operand[operand_counter]=1;
                    operand_counter++;
                    sign_reveal++;
                    arg_counter++;
                    sign_counter++;
                }else {
                    if(sign_reveal==1) {
                        operand[operand_counter-1]=1;
                        sign_reveal++;
                        arg_counter++;
                    }}
                if (arg[0]!="" && sign_reveal==1 ){
                    All+="/";
                    Result.setText(All);
                }
                }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if(arg[0]==null && sign_reveal==0){
                    sign[sign_counter]=-1;
                    sign_counter++;
                    }*/
                if (arg[0]!="" && sign_reveal==0){
                    operand[operand_counter]=3;
                    operand_counter++;
                    sign_reveal++;
                    arg_counter++;
                    sign_counter++;
                }else {
                    if(sign_reveal==1) {
                        sign[sign_counter] = 1;
                        sign_counter++;
                        sign_reveal++;
                    }}
                if (arg[0]!="" && sign_reveal==1 ){
                    All+="+";
                    Result.setText(All);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(arg[0]=="" && sign_reveal==0){
                    sign[sign_counter]=-1;
                    sign_reveal++;
                    All+="-";
                    Result.setText(All);
                }
                else{
                    if (sign_reveal==0){
                        operand[operand_counter]=4;
                        operand_counter++;
                        sign_reveal++;
                        arg_counter++;
                        sign_counter++;
                    }else {
                        if(sign_reveal==1) {
                            sign[sign_counter] = -1;
                            sign_reveal++;
                        }}}
                if( sign_reveal<=2) {
                    if(arg[0]!="" ){
                        sign_reveal++;
                    All+="-";
                    Result.setText(All);}
                }
            }
        });










        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    arg[arg_counter]+="0";
                    All+="0";
                    sign_reveal=0;
                    Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="1";
                All+="1";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="2";
                All+="2";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="3";
                All+="3";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="4";
                All+="4";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="5";
                All+="5";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="6";
                All+="6";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="7";
                All+="7";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }

            }
        });
        Vergule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+=".";
                All+=".";
                sign_reveal=0;
                Result.setText(All);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="8";
                All+="8";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg[arg_counter]+="9";
                All+="9";
                sign_reveal=0;
                Result.setText(All);
                if(sign[sign_counter]!=1 && sign[sign_counter]!=-1){
                    sign[sign_counter]=1;
                }

            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float[] True_Arg = new float[50];
                Log.d("Arg_Counter",""+arg_counter);
                Log.d("True_Arg[i+1]",arg[1]);
                for(int j = 0;j<=arg_counter; j++){
                    Log.d("sign[j]",""+sign[j]);
                    True_Arg[j]=Float.parseFloat(arg[j])*sign[j];
                    Log.d("True_Arg",""+True_Arg[j]);
                    Log.d("sign_Arg",""+operand[j]);
                }

                Log.d("Operand_Counter",""+operand_counter);

                for(int j=0;j<=operand_counter-1;j++){
                    if(operand[j]==1 || operand[j]==2){
                        True_Arg[j+1]=operations(True_Arg[j],True_Arg[j+1],operand[j]);
                        Log.d("True_Arg[j+1]=",""+True_Arg[j+1]);
                        for(int k=j;k<=arg_counter-1;k++){

                            True_Arg[k]=True_Arg[k+1];
                            Log.d("True_Arg[]",""+True_Arg[k]);
                        }
                        for(int h=j;h<=operand_counter-2;h++){

                            operand[h]=operand[h+1];
                            Log.d("operand[]",""+operand[h]);
                        }
                        arg_counter--;
                        operand_counter--;
                        j--;

                    }
                }
                for(int j=0;j<=operand_counter-1;j++){
                    Log.d("Operand_Counter",""+operand_counter);
                    Log.d("Operand",""+operand[j]);



                        True_Arg[j+1]=operations(True_Arg[j],True_Arg[j+1],operand[j]);
                        Log.d("True_Arg[j+1]=",""+True_Arg[j+1]);
                        for(int k=j;k<=arg_counter-1;k++){
                            True_Arg[k]=True_Arg[k+1];
                        }
                        for(int h=j;h<=operand_counter-2;h++){
                            operand[h]=operand[h+1];
                        }
                        arg_counter--;
                        operand_counter--;
                    j--;
                }
                Log.d("True_Arg[0]=",""+True_Arg[0]);
                Log.d("True_Arg[1]=", "" + True_Arg[1]);
                Log.d("operand_id", "" + operand[0]);


                    Result.setText("=" + True_Arg[0]);


                All="";
                All+=True_Arg[0];
                ResultN=0;
                operand = new int[49];
                sign = new int[50];
                if(True_Arg[0]>=0) {
                    sign[0] = 1;
                    Log.d("sign[0]",""+sign[0]);
                }
                else {
                    sign[0] = -1;
                    True_Arg[0]=True_Arg[0]*-1;
                    Log.d("sign[0]",""+sign[0]);
                }
                    arg=new String[50];
                int i=0 ;
                while(i<arg.length){
                    arg[i]="";
                    i++;
                }
                arg[0]=""+True_Arg[0];

                sign_reveal = 0 ;
                operand_counter=0;
                sign_counter =0;
                arg_counter=0 ;


            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                All="";
                ResultN=0;
                arg = new String[50];
                operand = new int[49];
                sign = new int[50];
                sign_reveal = 0 ;
                operand_counter=0;
                sign_counter =0;
                arg_counter=0 ;
                Result.setText("0");
                int i=0;
                while(i<arg.length){
                    arg[i]="";
                    i++;
                }

            }
        });
    }





    public float operations(float op1 , float op2 ,int operand_ID  ){


        switch (operand_ID){
            case 0:
                break;
            case 1:
                ResultN = op1/op2;

                break;
            case 2:
                ResultN = op1*op2;

                break;
            case 3:
                ResultN = op1+op2;

                break;
            case 4:
                ResultN = op1-op2;

                break;

        }
        return ResultN;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    }



