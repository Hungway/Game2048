package com.lthergo.game2048;

/**
 * Created by musei on 2018/2/5.
 */

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

    public Card(Context context) {
        super(context);

        LayoutParams lp = null;

        background = new View(getContext());
        lp = new LayoutParams(-1, -1);
        lp.setMargins(22, 22, 0, 0);
        background.setBackgroundColor(0xff3d2964);
        addView(background, lp);

        label = new TextView(getContext());
        label.setTextSize(24);
        label.setTextColor(0xff7a6e62);
        label.setGravity(Gravity.CENTER);

        lp = new LayoutParams(-1, -1);
        lp.setMargins(22, 22, 0, 0);
        addView(label, lp);

        setNum(0);
    }


    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;

        if (num<=0) {
            label.setText("");
        }else{
            label.setText(num+"");
        }

        switch (num) {
            case 0:
                label.setBackgroundColor(0x00000000);
                break;
            case 2:
                label.setBackgroundColor(0xffeee4da);
                label.setTextColor(0xff7a6e62);
                break;
            case 4:
                label.setBackgroundColor(0xffede0c8);
                label.setTextColor(0xff7a6e62);
                break;
            case 8:
                label.setBackgroundColor(0xfff2b179);
                label.setTextColor(0xff7a6e62);
                break;
            case 16:
                label.setBackgroundColor(0xfff59563);
                label.setTextColor(0xffffffff);
                break;
            case 32:
                label.setBackgroundColor(0xfff67c5f);
                label.setTextColor(0xffffffff);
                break;
            case 64:
                label.setBackgroundColor(0xfff65e3b);
                label.setTextColor(0xffffffff);
                break;
            case 128:
                label.setBackgroundColor(0xffedcf72);
                label.setTextColor(0xFF58407C);
                break;
            case 256:
                label.setBackgroundColor(0xffedcc61);
                label.setTextColor(0xFF58407C);
                break;
            case 512:
                label.setBackgroundColor(0xffedc850);
                label.setTextColor(0xFF58407C);
                break;
            case 1024:
                label.setBackgroundColor(0xffedc53f);
                label.setTextColor(0xff3d2964);
                break;
            case 2048:
                label.setBackgroundColor(0xffedc22e);
                label.setTextColor(0xff3d2964);
                break;
            default:
                label.setBackgroundColor(0xff3c3a32);
                break;
        }
    }

    public boolean equals(Card o) {
        return getNum()==o.getNum();
    }

    protected Card clone(){
        Card c= new Card(getContext());
        c.setNum(getNum());
        return c;
    }

    public TextView getLabel() {
        return label;
    }

    private TextView label;
    private View background;
}
