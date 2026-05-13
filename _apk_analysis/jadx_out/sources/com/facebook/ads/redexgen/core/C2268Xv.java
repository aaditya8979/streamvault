package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2268Xv extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Paint A03;
    public boolean A04;

    public C2268Xv(C2529dL c2529dL) {
        this(c2529dL, 60, true);
    }

    public C2268Xv(C2529dL c2529dL, int i10, boolean z10) {
        super(c2529dL);
        this.A00 = i10;
        this.A04 = z10;
        if (z10) {
            this.A02 = new Paint();
            this.A02.setColor(-3355444);
            this.A02.setStyle(Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            this.A01 = new Paint();
            this.A01.setColor(-1287371708);
            this.A01.setStyle(Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            this.A03 = new Paint();
            this.A03.setColor(-1);
            this.A03.setStyle(Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f10 = AbstractC2232Wl.A02;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (this.A00 * f10), (int) (this.A00 * f10));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A04) {
            canvas.isHardwareAccelerated();
            int iMin = Math.min(canvas.getWidth(), canvas.getHeight());
            int i10 = iMin / 2;
            int i11 = iMin / 2;
            canvas.drawCircle(i10, i11, (i10 * 2) / 3, this.A02);
            canvas.drawCircle(i10, i11, r4 - 2, this.A01);
            int i12 = iMin / 3;
            int i13 = iMin / 3;
            canvas.drawLine(i12, i13, i12 * 2, i13 * 2, this.A03);
            canvas.drawLine(i12 * 2, i13, i12, i13 * 2, this.A03);
        }
        super.onDraw(canvas);
    }
}
