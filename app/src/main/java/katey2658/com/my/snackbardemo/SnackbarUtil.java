package katey2658.com.my.snackbardemo;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by 11456 on 2016/9/17.
 */
public class SnackbarUtil {
    public  static final int Info=1;
    public  static final int Config=2;
    public  static final int Warning=3;
    public  static final int Alert=4;

    public static  int red=0xfff44336;
    public static int  green=0xff4caf50;
    public  static  int blue=0xff2195f3;
    public  static  int orange=0xffffc107;
    //短显示
    public static Snackbar shortSnackbar(View view,String message,int messageColor,int backgroudColor){
        Snackbar snackbar=Snackbar.make(view,message,Snackbar.LENGTH_SHORT);
        setSnackbarColor(snackbar,messageColor,backgroudColor);
        return snackbar;
    }
    //长显示
    public static Snackbar longSnackbar(View view,String message,int messageColor,int backgroudColor){
        Snackbar snackbar=Snackbar.make(view,message,Snackbar.LENGTH_LONG);
        setSnackbarColor(snackbar,messageColor,backgroudColor);
        return snackbar;
    }
    //自定义时长
    public static Snackbar IndeIniteSnackbar(View view,String message,int messageColor,int duration,int backgroudColor){
        Snackbar snackbar=Snackbar.make(view,message,Snackbar.LENGTH_INDEFINITE).setDuration(duration);
        setSnackbarColor(snackbar,messageColor,backgroudColor);
        return snackbar;
    }
    //短显示，可预选类型
    public static Snackbar shortSnackbar(View view,String message,int type){
        Snackbar snackbar=Snackbar.make(view,message,Snackbar.LENGTH_SHORT);
        switchType(snackbar,type);
        return snackbar;

    }
    //长显示，可预选类型
    public static Snackbar LongSnackbar(View view,String message,int type){
        Snackbar snackbar=Snackbar.make(view,message,Snackbar.LENGTH_LONG);
        switchType(snackbar,type);
        return snackbar;

    }
    //自定义时长，可预选类型
    public static  Snackbar Indefinite(View view,String message,int duration,int type){
        Snackbar snackbar=Snackbar.make(view,message,Snackbar.LENGTH_INDEFINITE).setDuration(duration);
        switchType(snackbar,type);
        return snackbar;

    }
    //预选类型
    private static void switchType(Snackbar snackbar, int type) {
        switch (type){
            case Info:
                setSnackbarColor(snackbar,blue);
                break;
            case Config:
                setSnackbarColor(snackbar,green);
                break;
            case Warning:
                setSnackbarColor(snackbar,orange);
                break;
            case Alert:
                setSnackbarColor(snackbar, Color.YELLOW,red);
                break;

        }
    }
    //设置背颜色
    private static void setSnackbarColor(Snackbar snackbar, int backgroundColor) {
        View view=snackbar.getView();
        if (view!=null){
            view.setBackgroundColor(backgroundColor);
        }
    }


    //设置消息字体颜色，背景
    private static void setSnackbarColor(Snackbar snackbar, int messageColor, int backgroudColor) {
        View view=snackbar.getView();
        if (view!=null){
            view.setBackgroundColor(backgroudColor);
            ((TextView)view.findViewById(R.id.snackbar_text)).setTextColor(messageColor);
        }

    }

    //想snackbar中添加view
    public  static void  snackbarAddView(Snackbar snackbar,int layoutId,int index){
        View snackbarView=snackbar.getView();
        Snackbar.SnackbarLayout snackbarLayout= (Snackbar.SnackbarLayout) snackbarView;
        View add_view= LayoutInflater.from(snackbarView.getContext()).inflate(layoutId,null);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.gravity= Gravity.CENTER_VERTICAL;
        snackbarLayout.addView(add_view,index,lp);
    }

}
