package com.applovin.impl.mediation.debugger.ui.testmode;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.m0;
import com.applovin.mediation.MaxAdFormat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientDrawable f9042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Button f9043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.a f9044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f9045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdFormat f9046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f9047f;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f9042a = gradientDrawable;
        Button button = new Button(getContext());
        this.f9043b = button;
        com.applovin.impl.a aVar = new com.applovin.impl.a(getContext(), 20, R.attr.progressBarStyleSmall);
        this.f9044c = aVar;
        b bVar = b.LOAD;
        this.f9045d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private int a(b bVar) {
        if (b.LOAD != bVar && b.LOADING != bVar) {
            return m0.a(com.applovin.sdk.R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
        }
        return m0.a(com.applovin.sdk.R.color.applovin_sdk_brand_color, getContext());
    }

    private void a() {
        this.f9043b.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{m0.a(com.applovin.sdk.R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f9044c.a();
        } else {
            setEnabled(true);
            this.f9044c.b();
        }
        this.f9043b.setText(b(bVar));
        this.f9042a.setColor(a(bVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public b getControlState() {
        return this.f9045d;
    }

    public MaxAdFormat getFormat() {
        return this.f9046e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f9047f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setControlState(b bVar) {
        if (this.f9045d != bVar) {
            c(bVar);
        }
        this.f9045d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f9046e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f9047f = aVar;
    }
}
