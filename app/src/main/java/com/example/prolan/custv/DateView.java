package com.example.prolan.custv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Prolan on 09/02/2016.
 */
public class DateView extends TextView {
    public DateView(Context context) {
        super(context);
        initDate();
    }

    public DateView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initDate();
    }

    public DateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initDate();
    }
    private void initDate() {

        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());
        this.setText(date);

    }
}
