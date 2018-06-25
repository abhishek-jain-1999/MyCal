package me.vable.android.mycal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int col=0,ans=0;
    char aChar='_';


    public void disp(){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);
        String s=""+col;
        int [] arr={1,1000,1000000};
        int h=(s.length()-1)/3;

        int g=col/arr[h];
        t1.setText(""+g);

        if(h==1){

            t1.append(","+s.substring(s.length()-3,s.length()));
        }
        if(h==2){
            t1.append(","+s.substring(s.length()-6,s.length()-3)+","+s.substring(s.length()-3,s.length()));
        }


    }
    public void f1(View view){
        col=col*10+1;
        disp();
    }
    public void f2(View view){
        col=col*10+2;
        disp();
    }

    public void f3(View view){
        col=col*10+3;
        disp();
    }
    public void f4(View view){
        col=col*10+4;
        disp();
    }
    public void f5(View view){
        col=col*10+5;
        disp();
    }
    public void f6(View view){
        col=col*10+6;
        disp();
    }
    public void f7(View view){
        col=col*10+7;
        disp();
    }
    public void f8(View view){
        col=col*10+8;
        disp();
    }
    public void f9(View view){
        col=col*10+9;
        disp();
    }
    public void f0(View view){
        col=col*10;
        disp();
    }
    public void f00(View view){
        col=col*100;
        disp();
    }
    public void f000(View view){
        col=col*1000;
        disp();
    }
    public void fc(View view){
        col=0;
        disp();
    }

    public int cal(){

        switch (aChar){
            case '+':   ans=ans+col;
                break;
            case '-':   ans=ans-col;
                break;
            case '*':   ans=ans*col;
                break;
            case '/':   if(col!=0) {
                ans = ans / col;
            }else {
                fca();
                TextView t2=findViewById(R.id.t2);
                t2.setText("Cannot Divide By 0");
                return -1;
            }
                break;
            case '^':   int l=ans;
                for(int i=1;i<col;i++){
                    ans=ans*l;
                }
                break;

        }
        return 0;

    }

    public void fa(View view){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);

        t1.setText("0");
        if(aChar=='_'){
            t2.setText(""+col+"    +");
            ans=col;
        }else {
            int h=cal();
            if(h!=-1) {
                t2.setText("" + ans + "    +");
            }
        }
        col=0;
        aChar='+';

    }
    public void fs(View view){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);

        t1.setText("0");
        if(aChar=='_'){
            t2.setText(""+col+"    -");
            ans=col;
        }else {
            int h=cal();
            if(h!=-1) {
                t2.setText("" + ans + "    -");
            }
        }
        col=0;
        aChar='-';

    }
    public void fm(View view){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);

        t1.setText("0");
        if(aChar=='_'){
            t2.setText(""+col+"    *");
            ans=col;
        }else {
            int h=cal();
            if(h!=-1) {
                t2.setText("" + ans + "    *");
            }
        }
        col=0;
        aChar='*';

    }
    public void fd(View view){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);

        t1.setText("0");
        if(aChar=='_'){
            t2.setText(""+col+"    /");
            ans=col;
        }else {
            int h=cal();
            if(h!=-1) {
                t2.setText("" + ans + "    /");
            }
        }
        col=0;
        aChar='/';

    }
    public void fex(View view){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);

        t1.setText("0");
        if(aChar=='_'){
            t2.setText(""+col+"    ^");
            ans=col;
        }else {
            int h=cal();
            if(h!=-1) {
                t2.setText("" + ans + "    ^");
            }
        }
        col=0;
        aChar='^';

    }
    public void fe(View view){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);


        int k=cal();
        if(k!=-1) {
            String s=""+ans;
            int [] arr={1,1000,1000000};
            int h=(s.length()-1)/3;

            int g=ans/arr[h];
            t1.setText(""+g);

            if(h==1){

                t1.append(","+s.substring(s.length()-3,s.length()));
            }
            if(h==2){
                t1.append(","+s.substring(s.length()-6,s.length()-3)+","+s.substring(s.length()-3,s.length()));
            }


            t2.setText("=    " + ans);
            col = ans;
            ans = 0;
            aChar = '_';
        }

    }
    public void fca(View view){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);

        t1.setText("0");
        t2.setText("");
        col=0;
        ans=0;
        aChar='_';

    }
    public void fca(){
        TextView t2=findViewById(R.id.t2);
        TextView t1=findViewById(R.id.t1);

        t1.setText("0");
        t2.setText("");
        col=0;
        ans=0;
        aChar='_';

    }



}
