package com.example.sistemas.notas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt11,edt12,edt13,edt21,edt22,edt23,edt31,edt32,edt33;
    private TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator(getString(R.string.txtDes),
                res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator(getString(R.string.txtDist),
                res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab3);
        spec.setIndicator(getString(R.string.txtCal),
                res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        //materia 1
        SharedPreferences prefe1=getSharedPreferences("apo", Context.MODE_PRIVATE);
        edt11=(EditText)findViewById(R.id.edt11);
        edt11.setText(prefe1.getString("primer","0"));
        edt12=(EditText)findViewById(R.id.edt12);
        edt12.setText(prefe1.getString("segundo","0"));
        edt13=(EditText)findViewById(R.id.edt13);
        edt13.setText(prefe1.getString("tercer","0"));
        txt1=(TextView)findViewById(R.id.txt1);
        txt1.setText(prefe1.getString("resul","0"));
        edt11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("apo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t11=edt11.getText().toString();
                    editor.putString("primer", edt11.getText().toString());
                    String t12=edt12.getText().toString();
                    editor.putString("segundo", edt12.getText().toString());
                    String t13=edt13.getText().toString();
                    editor.putString("tercer", edt12.getText().toString());

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);
                    if(n11>=0&&n11<6) {
                        double cal = (((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt1.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });
        edt12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("apo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t11=edt11.getText().toString();
                    editor.putString("primer", edt11.getText().toString());
                    String t12=edt12.getText().toString();
                    editor.putString("segundo", edt12.getText().toString());
                    String t13=edt13.getText().toString();
                    editor.putString("tercer", edt12.getText().toString());

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);

                    if(n12>=0&&n12<6) {
                        double cal = (((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt1.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });

        edt13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("apo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t11=edt11.getText().toString();
                    editor.putString("primer", edt11.getText().toString());
                    String t12=edt12.getText().toString();
                    editor.putString("segundo", edt12.getText().toString());
                    String t13=edt13.getText().toString();
                    editor.putString("tercer", edt12.getText().toString());

                    double n11=Double.valueOf(t11);
                    double n12=Double.valueOf(t12);
                    double n13=Double.valueOf(t13);

                    if(n13>=0&&n13<6) {
                        double cal = (((n11 + n12) / 2) * 0.6) + (n13 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt1.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });

        //materia 2
        SharedPreferences prefe2=getSharedPreferences("ingles", Context.MODE_PRIVATE);
        edt21=(EditText)findViewById(R.id.edt21);
        edt21.setText(prefe2.getString("primer","0"));
        edt22=(EditText)findViewById(R.id.edt22);
        edt22.setText(prefe2.getString("segundo","0"));
        edt23=(EditText)findViewById(R.id.edt23);
        edt23.setText(prefe2.getString("tercer","0"));
        txt2=(TextView)findViewById(R.id.txt2);
        txt2.setText(prefe2.getString("resul","0"));
        edt21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("ingles", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t21=edt21.getText().toString();
                    editor.putString("primer", edt21.getText().toString());
                    String t22=edt22.getText().toString();
                    editor.putString("segundo", edt22.getText().toString());
                    String t23=edt23.getText().toString();
                    editor.putString("tercer", edt23.getText().toString());

                    double n21=Double.valueOf(t21);
                    double n22=Double.valueOf(t22);
                    double n23=Double.valueOf(t23);

                    if(n21>=0&&n21<6) {
                        double cal = (((n21 + n22) / 2) * 0.6) + (n23 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt2.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });
        edt22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("ingles", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t21=edt21.getText().toString();
                    editor.putString("primer", edt21.getText().toString());
                    String t22=edt22.getText().toString();
                    editor.putString("segundo", edt22.getText().toString());
                    String t23=edt23.getText().toString();
                    editor.putString("tercer", edt23.getText().toString());

                    double n21=Double.valueOf(t21);
                    double n22=Double.valueOf(t22);
                    double n23=Double.valueOf(t23);

                    if(n22>=0&&n22<6) {
                        double cal = (((n21 + n22) / 2) * 0.6) + (n23 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt2.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });
        edt23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("ingles", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t21=edt21.getText().toString();
                    editor.putString("primer", edt21.getText().toString());
                    String t22=edt22.getText().toString();
                    editor.putString("segundo", edt22.getText().toString());
                    String t23=edt23.getText().toString();
                    editor.putString("tercer", edt23.getText().toString());

                    double n21=Double.valueOf(t21);
                    double n22=Double.valueOf(t22);
                    double n23=Double.valueOf(t23);

                    if(n23>=0&&n23<6) {
                        double cal = (((n21 + n22) / 2) * 0.6) + (n23 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt2.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });

        //materia 3
        SharedPreferences prefe3=getSharedPreferences("Calculo", Context.MODE_PRIVATE);
        edt31=(EditText)findViewById(R.id.edt31);
        edt31.setText(prefe3.getString("primer","0"));
        edt32=(EditText)findViewById(R.id.edt32);
        edt32.setText(prefe3.getString("segundo","0"));
        edt33=(EditText)findViewById(R.id.edt33);
        edt33.setText(prefe3.getString("tercer","0"));
        txt3=(TextView)findViewById(R.id.txt3);
        txt3.setText(prefe3.getString("resul","0"));

        edt31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Calculo", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();

                    String t31=edt31.getText().toString();
                    editor.putString("primer", edt31.getText().toString());
                    String t32=edt32.getText().toString();
                    editor.putString("segundo", edt32.getText().toString());
                    String t33=edt33.getText().toString();
                    editor.putString("tercer", edt33.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if(n31>=0&&n31<6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt3.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });
        edt32.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Calculo", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();

                    String t31=edt31.getText().toString();
                    editor.putString("primer", edt31.getText().toString());
                    String t32=edt32.getText().toString();
                    editor.putString("segundo", edt32.getText().toString());
                    String t33=edt33.getText().toString();
                    editor.putString("tercer", edt33.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if(n32>=0&&n32<6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt3.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });

        edt33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Calculo", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();

                    String t31=edt31.getText().toString();
                    editor.putString("primer", edt31.getText().toString());
                    String t32=edt32.getText().toString();
                    editor.putString("segundo", edt32.getText().toString());
                    String t33=edt33.getText().toString();
                    editor.putString("tercer", edt33.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if(n33>=0&&n33<6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        txt3.setText(resul);
                    }
                    else{
                        Toast notificacion = Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                } catch (Exception e) {

                }}

        });

    }

    public void total(View v){

        String t1 =txt1.getText().toString();
        String t2 =txt2.getText().toString();
        String t3 =txt3.getText().toString();
        double n1 =0;
        double n2 =0;
        double n3 =0;

            n1 = Double.valueOf(t1);
            n2 = Double.valueOf(t2);
            n3 = Double.valueOf(t3);

            double total = (n1 + n2 + n3) / 3;

            Toast notificacion = Toast.makeText(this, getString(R.string.toast)+" "+String.format("%.2f",total), Toast.LENGTH_LONG);
            notificacion.show();

    }

    public void acerca(View v){
        Intent i = new Intent(this, acerca.class );
        startActivity(i);
    }

}
