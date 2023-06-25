package com.example.lab1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements
        OnClickListener {
    private float mTextSize = 20;
    private EditText editableText;
    private TextView tSize;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editableText =findViewById(R.id.edit_text);
        tSize =findViewById(R.id.size);
        ToggleButton buttonBold = findViewById(R.id.button_b);
        ToggleButton buttonItalic = findViewById(R.id.button_i);
        Button buttonSansSerif = findViewById(R.id.button_sans_serif);
        Button buttonSerif = findViewById(R.id.button_serif);
        Button buttonMonospace = findViewById(R.id.button_monospace);
        Button buttonIncreaseFontSize = findViewById(R.id.button_increase);
        Button buttonDecreaseFontSize = findViewById(R.id.button_decrease);
        ImageButton bRed = findViewById(R.id.red);
        ImageButton bGreen = findViewById(R.id.green);
        ImageButton bBlue = findViewById(R.id.blue);
        ImageButton bCyan = findViewById(R.id.cyan);
        ImageButton bMagenta = findViewById(R.id.magenta);
        ImageButton bYellow = findViewById(R.id.yellow);
        ImageButton bBlack = findViewById(R.id.black);

        buttonBold.setOnClickListener(this);
        buttonItalic.setOnClickListener(this);
        buttonSansSerif.setOnClickListener(this);
        buttonSerif.setOnClickListener(this);
        buttonMonospace.setOnClickListener(this);
        buttonIncreaseFontSize.setOnClickListener(this);
        buttonDecreaseFontSize.setOnClickListener(this);

        bRed.setOnClickListener(this);
        bGreen.setOnClickListener(this);
        bBlue.setOnClickListener(this);
        bCyan.setOnClickListener(this);
        bMagenta.setOnClickListener(this);
        bYellow.setOnClickListener(this);
        bBlack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int result = v.getId();

        switch(result) {
            //change apply font style
            case R.id.button_b:
                if (editableText.getTypeface().getStyle() == Typeface.ITALIC)
                    editableText.setTypeface(editableText.getTypeface(), Typeface.BOLD_ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                    editableText.setTypeface(editableText.getTypeface(), Typeface.ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD)
                    editableText.setTypeface(Typeface.create(editableText.getTypeface(), Typeface.NORMAL));

                else
                    editableText.setTypeface(editableText.getTypeface(), Typeface.BOLD);
                return;

            case R.id.button_i:
                if (editableText.getTypeface().getStyle() == Typeface.BOLD)
                    editableText.setTypeface(editableText.getTypeface(), Typeface.BOLD_ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                    editableText.setTypeface(editableText.getTypeface(), Typeface.BOLD);

                else if (editableText.getTypeface().getStyle() == Typeface.ITALIC)
                    editableText.setTypeface(Typeface.create(editableText.getTypeface(), Typeface.NORMAL));
                else
                    editableText.setTypeface(editableText.getTypeface(), Typeface.ITALIC);
                return;
            //----------

            //change font size !!!
            case R.id.button_increase:
                if (mTextSize < 72) {
                    mTextSize += 2;
                    editableText.setTextSize(mTextSize);
                    tSize.setText(String.format("%.0f", mTextSize));
                }
                return;
            case R.id.button_decrease:
                if (mTextSize > 18) {
                    mTextSize-=2;
                    editableText.setTextSize(mTextSize);
                    tSize.setText(String.format("%.0f", mTextSize));
                }
                return;
            //---------

            // change font family
            case R.id.button_sans_serif:
                if (editableText.getTypeface().getStyle() == Typeface.ITALIC)
                    editableText.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                    editableText.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD)
                    editableText.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);

                else
                    editableText.setTypeface(Typeface.SANS_SERIF, Typeface.NORMAL);
                return;

            case R.id.button_serif:
                if (editableText.getTypeface().getStyle() == Typeface.ITALIC)
                    editableText.setTypeface(Typeface.SERIF, Typeface.ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                    editableText.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD)
                    editableText.setTypeface(Typeface.SERIF, Typeface.BOLD);

                else
                    editableText.setTypeface(Typeface.SERIF, Typeface.NORMAL);
                return;
            case R.id.button_monospace:
                if (editableText.getTypeface().getStyle() == Typeface.ITALIC)
                    editableText.setTypeface(Typeface.MONOSPACE, Typeface.ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD_ITALIC)
                    editableText.setTypeface(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);

                else if (editableText.getTypeface().getStyle() == Typeface.BOLD)
                    editableText.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);

                else
                    editableText.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL);
                return;
            //---------

            //change text color
            case R.id.red:
                editableText.setTextColor(Color.parseColor("#FF0000"));
                return;
            case  R.id.green:
                editableText.setTextColor(Color.parseColor("#89FF00"));
                return;
            case R.id.blue:
                editableText.setTextColor(Color.parseColor("#0027FF"));
                return;
            case R.id.cyan:
                editableText.setTextColor(Color.parseColor("#00FFFF"));
                return;
            case R.id.magenta:
                editableText.setTextColor(Color.parseColor("#FF00FF"));
                return;
            case R.id.yellow:
                editableText.setTextColor(Color.parseColor("#FFFF00"));
                return;
            case R.id.black:
                editableText.setTextColor(Color.parseColor("#000000"));
            //-------
        }
    }
}
