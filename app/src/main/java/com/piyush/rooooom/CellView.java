package com.piyush.rooooom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CellView extends RelativeLayout {


    protected View bottomDivider;
    protected View topDivider;
    protected ImageView imageView;
    protected TextView subtitle;
    protected TextView title;
    protected TextView cellValue;
    protected ImageView chevron;





    public CellView(Context context) {
        this(context, null);
    }

    public CellView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }



private void init(Context context, AttributeSet attrs)
{

    TypedArray values = getContext().obtainStyledAttributes(attrs,R.styleable.CellView);
    View view = ((LayoutInflater) getContext()
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE))
            .inflate(R.layout.cell_view, this, true);
    view.setBackgroundColor(Color.WHITE);
    bottomDivider = view.findViewById(R.id.bottom_divider);
    topDivider = view.findViewById(R.id.top_divider);
    imageView = view.findViewById(R.id.cell_icon);
    chevron = view.findViewById(R.id.cellChevron);
    cellValue = view.findViewById(R.id.cellValue);
    title = view.findViewById(R.id.cellTitle);
    subtitle = view.findViewById(R.id.cellSubtitle);
    Log.d("TITLE_VISIBILITY",String.valueOf(values.getBoolean(R.styleable.CellView_showTitle, true)));
    title.setVisibility(values.getBoolean(R.styleable.CellView_showTitle, true)?VISIBLE:GONE);
    chevron.setVisibility(values.getBoolean(R.styleable.CellView_showChevron,true)?VISIBLE:GONE);
    values.recycle();
}


}
