package com.mgs.carparking.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.dramarush.shortin.R;

/* JADX INFO: loaded from: classes4.dex */
public class DotView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f44982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f44989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44991k;

    public DotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public DotView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    public final void a(Context context) {
        this.f44983c = getResources().getDisplayMetrics().widthPixels;
        float f10 = getResources().getDisplayMetrics().density;
        this.f44982b = f10;
        this.f44984d = 10.0f;
        this.f44985e = f10 * 5.0f;
        this.f44989i = new Paint();
        this.f44990j = getResources().getColor(R.color.color_commen);
        this.f44991k = getResources().getColor(R.color.color_e7e7e7);
    }

    public void b(int i10, int i11) {
        this.f44986f = i10;
        this.f44987g = i11;
        this.f44988h = this.f44983c - ((((i11 - 1) * this.f44985e) + (i11 * this.f44984d)) + 70.0f);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i10 = 0; i10 < this.f44987g; i10++) {
            if (this.f44986f == i10) {
                this.f44989i.setColor(this.f44990j);
            } else {
                this.f44989i.setColor(this.f44991k);
            }
            int i11 = this.f44986f;
            if (i11 == i10) {
                float f10 = this.f44988h;
                float f11 = i10;
                float f12 = this.f44985e;
                float f13 = this.f44984d;
                canvas.drawRect((f11 * f12) + f10 + (f11 * f13), 0.0f, f10 + (f12 * f11) + (f11 * f13) + (2.0f * f13), f13 + 0.0f, this.f44989i);
            } else if (i11 > i10) {
                float f14 = this.f44988h;
                float f15 = i10;
                float f16 = this.f44985e;
                float f17 = this.f44984d;
                canvas.drawRect((f15 * f16) + f14 + (f15 * f17), 0.0f, f14 + (f16 * f15) + (f15 * f17) + f17, f17 + 0.0f, this.f44989i);
            } else if (i11 < i10) {
                float f18 = this.f44988h;
                float f19 = i10;
                float f20 = this.f44985e;
                float f21 = this.f44984d;
                canvas.drawRect((f19 * f20) + f18 + (f19 * f21) + f21, 0.0f, f18 + (f20 * f19) + (f19 * f21) + (2.0f * f21), f21 + 0.0f, this.f44989i);
            }
        }
    }
}
