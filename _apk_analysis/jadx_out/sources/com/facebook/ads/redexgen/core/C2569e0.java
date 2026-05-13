package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.Button;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2569e0 extends Button {
    public static byte[] A07;
    public static String[] A08 = {"xcAgjuPXjiWMB1ssCuSZa5J", "MDq9KSsWLWIXMrqq85Bb", "5uEVnqsabDRdJRQ85jW9NMB9i", "gm0LtQz6WhkHdj5wX4JbuGG7BvRjVm91", "l1YawQMaGwDZUwnW", "7ZUqugjvimlTMP6MGoSM1hJ8SS3JK7y", "GCEj76jN8N56F9CXfv91ddVngBp", "DhtSUABtfeQAzaNHynIAsSOoxymmsGBP"};
    public String A00;
    public String A01;
    public boolean A02;
    public final Paint A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    static {
        A02();
    }

    public C2569e0(C2529dL c2529dL) {
        this(c2529dL, false);
    }

    public C2569e0(C2529dL c2529dL, boolean z10) {
        super(c2529dL);
        this.A02 = false;
        this.A01 = A00(5, 4, 110);
        this.A00 = A00(0, 5, 111);
        this.A04 = new Path();
        this.A05 = new Path();
        this.A06 = new Path();
        this.A03 = new C2568dz(this, z10);
        A01();
        setClickable(true);
        XP.A0K(this, 0);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A08[1].length() == 30) {
                throw new RuntimeException();
            }
            A08[1] = "l8iwcelfQsHaFWcAi";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
            i13++;
        }
    }

    private void A01() {
        setContentDescription(this.A02 ? this.A01 : this.A00);
    }

    public static void A02() {
        A07 = new byte[]{19, 34, 54, 48, 38, 18, 46, 35, 59};
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.isHardwareAccelerated();
        float fMax = Math.max(canvas.getWidth(), canvas.getHeight()) / 100.0f;
        if (this.A02) {
            this.A06.rewind();
            this.A06.moveTo(fMax * 26.5f, fMax * 15.5f);
            this.A06.lineTo(fMax * 26.5f, 84.5f * fMax);
            this.A06.lineTo(90.0f * fMax, 50.0f * fMax);
            this.A06.lineTo(26.5f * fMax, 15.5f * fMax);
            this.A06.close();
            canvas.drawPath(this.A06, this.A03);
        } else {
            this.A04.rewind();
            this.A04.moveTo(fMax * 29.0f, fMax * 21.0f);
            this.A04.lineTo(fMax * 29.0f, fMax * 79.0f);
            this.A04.lineTo(fMax * 45.0f, fMax * 79.0f);
            this.A04.lineTo(45.0f * fMax, fMax * 21.0f);
            this.A04.lineTo(29.0f * fMax, fMax * 21.0f);
            this.A04.close();
            this.A05.rewind();
            this.A05.moveTo(fMax * 55.0f, fMax * 21.0f);
            this.A05.lineTo(fMax * 55.0f, fMax * 79.0f);
            this.A05.lineTo(fMax * 71.0f, 79.0f * fMax);
            this.A05.lineTo(71.0f * fMax, fMax * 21.0f);
            this.A05.lineTo(55.0f * fMax, 21.0f * fMax);
            this.A05.close();
            canvas.drawPath(this.A04, this.A03);
            canvas.drawPath(this.A05, this.A03);
        }
        super.onDraw(canvas);
    }

    public void setChecked(boolean z10) {
        this.A02 = z10;
        A01();
        refreshDrawableState();
        invalidate();
    }

    public void setPauseAccessibilityLabel(String str) {
        if (str != null) {
            this.A00 = str;
            A01();
        }
    }

    public void setPlayAccessibilityLabel(String str) {
        if (str != null) {
            this.A01 = str;
            A01();
        }
    }
}
