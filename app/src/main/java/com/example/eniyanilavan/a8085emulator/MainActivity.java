package com.example.eniyanilavan.a8085emulator;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_SHORT;
import static java.lang.Math.E;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Button a[] = new Button[20];
    TextView add,data;
    int reset,sub,go,accumulator,b,c,d,e,h,l,carry,reg=-1,sp,s=0;
    String lsb,hsb,eff,pc,m;
    Bundle memory = new Bundle();
    ArrayList<Integer> stack = new ArrayList<>();
    private DrawerLayout drawer;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = (DrawerLayout)findViewById(R.id.drawable);
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,drawer,R.string.open,R.string.close);
        add = (TextView)findViewById(R.id.address);
        data= (TextView)findViewById(R.id.data);
        a[0]=(Button)findViewById(R.id.res);
        a[1]=(Button)findViewById(R.id.c);
        a[2]=(Button)findViewById(R.id.d);
        a[3]=(Button)findViewById(R.id.e);
        a[4]=(Button)findViewById(R.id.f);
        a[5]=(Button)findViewById(R.id.exe);
        a[6]=(Button)findViewById(R.id.n8);
        a[7]=(Button)findViewById(R.id.n9);
        a[8]=(Button)findViewById(R.id.a);
        a[9]=(Button)findViewById(R.id.b);
        a[10]=(Button)findViewById(R.id.dec);
        a[11]=(Button)findViewById(R.id.n4);
        a[12]=(Button)findViewById(R.id.n5);
        a[13]=(Button)findViewById(R.id.n6);
        a[14]=(Button)findViewById(R.id.n7);
        a[15]=(Button)findViewById(R.id.next);
        a[16]=(Button)findViewById(R.id.n0);
        a[17]=(Button)findViewById(R.id.n1);
        a[18]=(Button)findViewById(R.id.n2);
        a[19]=(Button)findViewById(R.id.n3);
        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView= (NavigationView)findViewById(R.id.nav_bar);
        navigationView.setNavigationItemSelectedListener(this);
        a[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add.setText("");
                data.setText("");
                sub=0;
                go=0;

            }
        });
        a[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    sub=1;
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("0");
                    else
                        data.setText("0");
                }
                else
                {
                    add.append("0");
                }
            }
        });
        a[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("1");
                    else
                        data.setText("1");
                }
                else
                {
                    add.append("1");
                }
                
            }
        });
        a[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("2");
                    else
                        data.setText("2");
                }
                else
                {
                    add.append("2");
                }

            }
        });
        a[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("3");
                    else
                        data.setText("3");
                }
                else
                {
                    add.append("3");
                }

            }
        });
        a[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("4");
                    else
                        data.setText("4");
                }
                else
                {
                    add.append("4");
                }

            }
        });
        a[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("5");
                    else
                        data.setText("5");
                }
                else
                {
                    add.append("5");
                }

            }
        });
        a[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("6");
                    else
                        data.setText("6");                }
                else
                {
                    add.append("6");
                }

            }
        });
        a[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("7");
                    else
                        data.setText("7");
                }
                else
                {
                    add.append("7");
                }

            }
        });
        a[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    go=1;
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("8");
                    else
                        data.setText("8");
                }
                else
                {
                    add.append("8");
                }

            }
        });
        a[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {
                    
                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("9");
                    else
                        data.setText("9");
                }
                else
                {
                    add.append("9");
                }

            }
        });
        a[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {

                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("a");
                    else
                        data.setText("a");
                }
                else
                {
                    add.append("a");
                }

            }
        });
        a[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {

                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("b");
                    else
                        data.setText("b");                }
                else
                {
                    add.append("b");
                }

            }
        });
        a[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {

                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("c");
                    else
                        data.setText("c");
                }
                else
                {
                    add.append("c");
                }

            }
        });
        a[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {

                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("d");
                    else
                        data.setText("d");
                }
                else
                {
                    add.append("d");
                }

            }
        });
        a[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {

                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("e");
                    else
                        data.setText("e");
                }
                else
                {
                    add.append("e");
                }

            }
        });
        a[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sub==0&&go==0)
                {

                }
                else if (go==1 && add.length()==4)
                {

                }
                else if (add.length()==4)
                {
                    if (data.length()==1)
                        data.append("f");
                    else
                        data.setText("f");
                }
                else
                {
                    add.append("f");
                }

            }
        });
        a[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(add.getText().toString().equals(""))) {
                    int next = Integer.parseInt(add.getText().toString(),16)+1;
                    if (!(add.getText().toString().equals(""))&&!(data.getText().toString().equals(""))) {
                        if(data.length()!=2)
                        {
                            Toast.makeText(MainActivity.this,"Data requires two bit",Toast.LENGTH_LONG).show();
                        }
                        else {
                            memory.putInt(add.getText().toString(), Integer.parseInt(data.getText().toString(), 16));
                            if (memory.containsKey(Integer.toString(next, 16))) {
                                add.setText(Integer.toString(next, 16));
                                if (Integer.toString(memory.getInt(Integer.toString(next, 16)), 16).length()==1) {
                                    data.setText("0"+Integer.toString(memory.getInt(Integer.toString(next, 16)), 16));
                                }
                                else
                                {
                                    data.setText(Integer.toString(memory.getInt(Integer.toString(next, 16)), 16));
                                }

                            }
                            else {
                                add.setText(Integer.toString(next, 16));
                                data.setText("");
                            }
                        }
                    }
                    else
                    {
                        if(memory.containsKey(add.getText().toString())){
                            if (Integer.toString(memory.getInt(add.getText().toString()), 16).length()==1) {
                                data.setText("0"+Integer.toString(memory.getInt(add.getText().toString()), 16));
                            }
                            else
                            {
                                data.setText(Integer.toString(memory.getInt(add.getText().toString()), 16));
                            }
                        }
                        else {
                            memory.putInt(add.getText().toString(),0);
                            add.setText(Integer.toString(next,16));
                        }
                    }
                }
            }
        });
        a[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(go==1)
                {
                    String start = add.getText().toString();
                    ArrayList<Integer> opcodes = new ArrayList<>();
                    while (true)
                    {
                        if(memory.containsKey(start))
                        {
                            int n = (int) Long.parseLong(Integer.toString(memory.getInt(start),16), 16);
                            opcodes.add(n);
                            start = Integer.toString(Integer.parseInt(start,16)+1,16);
                        }
                        else
                        {
                            break;
                        }
                    }
                    if (opcodes.isEmpty())
                    {
                        add.setText("ERROR");
                        data.setText("");
                    }
                    else
                    {
                        for(int i=0;opcodes.get(i)!=0x76;i++)
                        {
                            switch (opcodes.get(i))
                            {
                                case 0x3a:
                                    lsb = Integer.toString(opcodes.get(i+1),16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+lsb;
                                    }
                                    hsb = Integer.toString(opcodes.get(i+2),16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+hsb;
                                    }
                                    eff = hsb+lsb;
                                    accumulator = memory.getInt(eff);
                                    i+=2;
                                    break;
                                case 0x78:
                                    accumulator = b;
                                    break;
                                case 0x79:
                                    accumulator=c;
                                    break;
                                case 0x7a:
                                    accumulator=d;
                                    break;
                                case 0x7b:
                                    accumulator=e;
                                    break;
                                case 0x7c:
                                    accumulator=h;
                                    break;
                                case 0x7d:
                                    accumulator=l;
                                    break;
                                case 0x7e:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    accumulator=memory.getInt(m);
                                    break;
                                case 0x47:
                                    b=accumulator;
                                    break;
                                case 0x40:
                                    b=b;
                                    break;
                                case 0x41:
                                    b=c;
                                    break;
                                case 0x42:
                                    b=d;
                                    break;
                                case 0x43:
                                    b=e;
                                    break;
                                case 0x44:
                                    b=h;
                                    break;
                                case 0x45:
                                    b=l;
                                    break;
                                case 0x46:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    b=memory.getInt(m);
                                    break;
                                case 0x4f:
                                    c=accumulator;
                                    break;
                                case 0x48:
                                    c=b;
                                    break;
                                case 0x49:
                                    c=c;
                                    break;
                                case 0x4a:
                                    c=d;
                                    break;
                                case 0x4b:
                                    c=e;
                                    break;
                                case 0x4c:
                                    c=h;
                                    break;
                                case 0x4d:
                                    c=l;
                                    break;
                                case 0x4e:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    c=memory.getInt(m);
                                    break;
                                case 0x57:
                                    d=accumulator;
                                    break;
                                case 0x50:
                                    d=b;
                                    break;
                                case 0x51:
                                    d=c;
                                    break;
                                case 0x52:
                                    d=d;
                                    break;
                                case 0x53:
                                    d=e;
                                    break;
                                case 0x54:
                                    d=h;
                                    break;
                                case 0x55:
                                    d=l;
                                    break;
                                case 0x56:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    d=memory.getInt(m);
                                    break;
                                case 0x5f:
                                    e=accumulator;
                                    break;
                                case 0x58:
                                    e=b;
                                    break;
                                case 0x59:
                                    e=c;
                                    break;
                                case 0x5a:
                                    e=d;
                                    break;
                                case 0x5b:
                                    e=e;
                                    break;
                                case 0x5c:
                                    e=h;
                                    break;
                                case 0x5d:
                                    e=l;
                                    break;
                                case 0x5e:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    e=memory.getInt(m);
                                    break;
                                case 0x67:
                                    h=accumulator;
                                    break;
                                case 0x60:
                                    h=b;
                                    break;
                                case 0x61:
                                    h=c;
                                    break;
                                case 0x62:
                                    h=d;
                                    break;
                                case 0x63:
                                    h=e;
                                    break;
                                case 0x64:
                                    h=h;
                                    break;
                                case 0x65:
                                    h=l;
                                    break;
                                case 0x66:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    h=memory.getInt(m);
                                    break;
                                case 0x6f:
                                    l=accumulator;
                                    break;
                                case 0x68:
                                    l=b;
                                    break;
                                case 0x69:
                                    l=c;
                                    break;
                                case 0x6a:
                                    l=d;
                                    break;
                                case 0x6b:
                                    l=e;
                                    break;
                                case 0x6c:
                                    l=h;
                                    break;
                                case 0x6d:
                                    l=l;
                                    break;
                                case 0x6e:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    l=memory.getInt(m);
                                    break;
                                case 0x77:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,accumulator);
                                    break;
                                case 0x70:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,b);
                                    break;
                                case 0x71:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,c);
                                    break;
                                case 0x72:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,d);
                                    break;
                                case 0x73:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,e);
                                    break;
                                case 0x74:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,h);
                                    break;
                                case 0x75:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,l);
                                    break;
                                case 0x3e:
                                    accumulator=opcodes.get(i+1);
                                    i++;
                                    break;
                                case 0x06:
                                    b=opcodes.get(i+1);
                                    i++;
                                    break;
                                case 0x0e:
                                    c=opcodes.get(i+1);
                                    i++;
                                    break;
                                case 0x16:
                                    d=opcodes.get(i+1);
                                    i++;
                                    break;
                                case 0x1e:
                                    e=opcodes.get(i+1);
                                    i++;
                                    break;
                                case 0x26:
                                    h=opcodes.get(i+1);
                                    i++;
                                    break;
                                case 0x2e:
                                    l=opcodes.get(i+1);
                                    i++;
                                    break;
                                case 0x36:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,opcodes.get(i+1));
                                    i++;
                                    break;
                                case 0x32:
                                    lsb = Integer.toString(opcodes.get(i+1),16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+lsb;
                                    }
                                    hsb = Integer.toString(opcodes.get(i+2),16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+hsb;
                                    }
                                    eff = hsb+lsb;
                                    memory.putInt(eff,accumulator);
                                    i+=2;
                                    break;
                                case 0x87:
                                    accumulator+=accumulator;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x80:
                                    accumulator+=b;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x81:
                                    accumulator+=c;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x82:
                                    accumulator+=d;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x83:
                                    accumulator+=e;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x84:
                                    accumulator+=h;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x85:
                                    accumulator+=l;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x86:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    accumulator+=memory.getInt(m);
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x3d:
                                    accumulator--;
                                    reg = accumulator;
                                    break;
                                case 0x05:
                                    b--;
                                    reg = b;
                                    break;
                                case 0x0d:
                                    c--;
                                    reg = c;
                                    break;
                                case 0x15:
                                    d--;
                                    reg = d;
                                    break;
                                case 0x1d:
                                    e--;
                                    reg = e;
                                    break;
                                case 0x25:
                                    h--;
                                    reg = h;
                                    break;
                                case 0x2d:
                                    l--;
                                    reg=l;
                                    break;
                                case 0x35:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    reg=memory.getInt(m)-1;
                                    memory.putInt(m,memory.getInt(m)-1);
                                    break;
                                case 0x3c:
                                    accumulator++;
                                    break;
                                case 0x04:
                                    b++;
                                    break;
                                case 0x0c:
                                    c++;
                                    break;
                                case 0x14:
                                    d++;
                                    break;
                                case 0x1c:
                                    e++;
                                    break;
                                case 0x24:
                                    h++;
                                    break;
                                case 0x2c:
                                    l++;
                                    break;
                                case 0x34:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    memory.putInt(m,memory.getInt(m)+1);
                                    break;
                                case 0x97:
                                    accumulator-=accumulator;
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0x90:
                                    accumulator-=b;
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0x91:
                                    accumulator-=c;
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0x92:
                                    accumulator-=d;
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0x93:
                                    accumulator-=e;
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0x94:
                                    accumulator-=h;
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0x95:
                                    accumulator-=l;
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0x96:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    accumulator-=memory.getInt(m);
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        s=1;
                                        accumulator = -accumulator;
                                    }
                                    break;
                                case 0xd6:
                                    accumulator-=opcodes.get(i+1);
                                    s=0;
                                    if (accumulator<0)
                                    {
                                        accumulator=-accumulator;
                                        s=1;
                                    }
                                    i++;
                                    break;
                                case 0x76:
                                    break;
                                case 0xc2:
                                    if (reg!=0)
                                    {
                                        lsb = Integer.toString(opcodes.get(i+1),16);
                                        if (lsb.length()==1)
                                        {
                                            lsb="0"+lsb;
                                        }
                                        hsb = Integer.toString(opcodes.get(i+2),16);
                                        if (hsb.length()==1)
                                        {
                                            hsb="0"+hsb;
                                        }
                                        eff = hsb+lsb;
                                        i=(Integer.parseInt(Integer.toHexString(Integer.parseInt(eff,16)%10),10))-1;
                                        Log.d("AAA","mul:"+accumulator+" b:"+b);
                                    }
                                    else
                                    {
                                        i+=2;
                                        reg=-1;
                                    }
                                    break;
                                case 0xca:
                                    if (reg==0)
                                    {
                                        lsb = Integer.toString(opcodes.get(i+1),16);
                                        if (lsb.length()==1)
                                        {
                                            lsb="0"+lsb;
                                        }
                                        hsb = Integer.toString(opcodes.get(i+2),16);
                                        if (hsb.length()==1)
                                        {
                                            hsb="0"+hsb;
                                        }
                                        eff = hsb+lsb;
                                        i=(Integer.parseInt(Integer.toHexString(Integer.parseInt(eff,16)%10),10))-1;
                                        Log.d("AAA","mul:"+accumulator+" b:"+b);
                                    }
                                    else
                                    {
                                        i+=2;
                                        reg=-1;
                                    }
                                    break;
                                case 0x00:
                                    break;
                                case 0xb7:
                                    accumulator = accumulator;
                                    break;
                                case 0xb0:
                                    accumulator = accumulator|b;
                                    break;
                                case 0xb1:
                                    accumulator = accumulator|c;
                                    break;
                                case 0xb2:
                                    accumulator = accumulator|d;
                                    break;
                                case 0xb3:
                                    accumulator = accumulator|e;
                                    break;
                                case 0xb4:
                                    accumulator = accumulator|h;
                                    break;
                                case 0xb5:
                                    accumulator = accumulator|l;
                                    break;
                                case 0xb6:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    accumulator = accumulator|memory.getInt(eff);
                                    break;
                                case 0xf6:
                                    accumulator = accumulator | opcodes.get(i+1);
                                    i+=1;
                                    break;
                                case 0xa7:
                                    accumulator = accumulator;
                                    reg=accumulator;
                                    break;
                                case 0xa0:
                                    accumulator = accumulator&b;
                                    reg=accumulator;
                                    break;
                                case 0xa1:
                                    accumulator = accumulator&c;
                                    reg=accumulator;
                                    break;
                                case 0xa2:
                                    accumulator = accumulator&d;
                                    reg=accumulator;
                                    break;
                                case 0xa3:
                                    accumulator = accumulator&e;
                                    reg=accumulator;
                                    break;
                                case 0xa4:
                                    accumulator = accumulator&h;
                                    reg=accumulator;
                                    break;
                                case 0xa5:
                                    accumulator = accumulator&l;
                                    reg=accumulator;
                                    break;
                                case 0xa6:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    accumulator = accumulator&memory.getInt(eff);
                                    reg=accumulator;
                                    break;
                                case 0xe6:
                                    accumulator = accumulator & opcodes.get(i+1);
                                    reg=accumulator;
                                    i+=1;
                                    break;
                                case 0xaf:
                                    accumulator = 0;
                                    reg=0;
                                    break;
                                case 0xa8:
                                    accumulator = accumulator^b;
                                    reg=accumulator;
                                    break;
                                case 0xa9:
                                    accumulator = accumulator^c;
                                    reg=accumulator;
                                    break;
                                case 0xaa:
                                    accumulator = accumulator^d;
                                    reg=accumulator;
                                    break;
                                case 0xab:
                                    accumulator = accumulator^e;
                                    reg=accumulator;
                                    break;
                                case 0xac:
                                    accumulator = accumulator^h;
                                    reg=accumulator;
                                    break;
                                case 0xad:
                                    accumulator = accumulator^l;
                                    reg=accumulator;
                                    break;
                                case 0xae:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    accumulator = accumulator^memory.getInt(eff);
                                    reg=accumulator;
                                    break;
                                case 0xee:
                                    accumulator = accumulator ^ opcodes.get(i+1);
                                    reg=accumulator;
                                    i+=1;
                                    break;
                                case 0xd3:
                                    lsb = Integer.toString(opcodes.get(i+1),16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+lsb;
                                    }
                                    hsb = Integer.toString(opcodes.get(i+2),16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+hsb;
                                    }
                                    eff = hsb+lsb;
                                    memory.putInt(eff,accumulator);
                                    i+=2;
                                    break;
                                case 0xe9:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    eff = hsb+lsb;
                                    pc = eff;
                                    break;
                                case 0xce:
                                    accumulator+=opcodes.get(i+1)+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    i++;
                                    break;
                                case 0xc6:
                                    accumulator+=opcodes.get(i+1);
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    i++;
                                    break;
                                case 0x8f:
                                    accumulator+=accumulator+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x88:
                                    accumulator+=b+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x89:
                                    accumulator+=c+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x8a:
                                    accumulator+=d+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x8b:
                                    accumulator+=e+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x8c:
                                    accumulator+=h+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x8d:
                                    accumulator+=l+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;
                                case 0x8e:
                                    lsb = Integer.toString(l,16);
                                    if (lsb.length()==1)
                                    {
                                        lsb="0"+l;
                                    }
                                    hsb = Integer.toString(h,16);
                                    if (hsb.length()==1)
                                    {
                                        hsb="0"+h;
                                    }
                                    m = hsb+lsb;
                                    accumulator+=memory.getInt(m)+carry;
                                    carry=0;
                                    if (Integer.toHexString(accumulator).length()==3)
                                    {
                                        accumulator-=0x100;
                                        carry=1;
                                    }
                                    break;

                                default:
                                    Toast.makeText(MainActivity.this,"Under development not all features emulated",Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                    go=0;
                    add.setText("");
                }
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        reset=1;
        sub=1;
        go=0;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.clear)
        {
            memory.clear();
            carry=0;
            sub=0;
            go=0;
            reg=-1;
            s=0;
            drawer.closeDrawer(navigationView);

        }
        return false;
    }
}