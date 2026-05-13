package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes8.dex */
public final class h0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f22789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f22790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f22791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public CharSequence f22792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f22793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Bitmap f22794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f22795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f22798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f22800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f22801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22803t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f22807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f22808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f22809z;

    public h0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f22788e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f22787d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f22784a = fRound;
        this.f22785b = fRound;
        this.f22786c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f22789f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f22790g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f22791h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public static boolean a(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public void b(g7.b bVar, b bVar2, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = bVar.f62140e == null;
        int i14 = ViewCompat.MEASURED_STATE_MASK;
        if (z10) {
            if (TextUtils.isEmpty(bVar.f62137b)) {
                return;
            } else {
                i14 = bVar.f62148m ? bVar.f62149n : bVar2.f22732c;
            }
        }
        if (a(this.f22792i, bVar.f62137b) && s7.m0.c(this.f22793j, bVar.f62138c) && this.f22794k == bVar.f62140e && this.f22795l == bVar.f62141f && this.f22796m == bVar.f62142g && s7.m0.c(Integer.valueOf(this.f22797n), Integer.valueOf(bVar.f62143h)) && this.f22798o == bVar.f62144i && s7.m0.c(Integer.valueOf(this.f22799p), Integer.valueOf(bVar.f62145j)) && this.f22800q == bVar.f62146k && this.f22801r == bVar.f62147l && this.f22802s == bVar2.f22730a && this.f22803t == bVar2.f22731b && this.f22804u == i14 && this.f22806w == bVar2.f22733d && this.f22805v == bVar2.f22734e && s7.m0.c(this.f22789f.getTypeface(), bVar2.f22735f) && this.f22807x == f10 && this.f22808y == f11 && this.f22809z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f22792i = bVar.f62137b;
        this.f22793j = bVar.f62138c;
        this.f22794k = bVar.f62140e;
        this.f22795l = bVar.f62141f;
        this.f22796m = bVar.f62142g;
        this.f22797n = bVar.f62143h;
        this.f22798o = bVar.f62144i;
        this.f22799p = bVar.f62145j;
        this.f22800q = bVar.f62146k;
        this.f22801r = bVar.f62147l;
        this.f22802s = bVar2.f22730a;
        this.f22803t = bVar2.f22731b;
        this.f22804u = i14;
        this.f22806w = bVar2.f22733d;
        this.f22805v = bVar2.f22734e;
        this.f22789f.setTypeface(bVar2.f22735f);
        this.f22807x = f10;
        this.f22808y = f11;
        this.f22809z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            s7.a.e(this.f22792i);
            g();
        } else {
            s7.a.e(this.f22794k);
            f();
        }
        d(canvas, z10);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f22794k, (Rect) null, this.J, this.f22791h);
    }

    public final void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        s7.a.e(this.J);
        s7.a.e(this.f22794k);
        c(canvas);
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f22804u) > 0) {
            this.f22790g.setColor(this.f22804u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f22790g);
        }
        int i10 = this.f22806w;
        if (i10 == 1) {
            this.f22789f.setStrokeJoin(Paint.Join.ROUND);
            this.f22789f.setStrokeWidth(this.f22784a);
            this.f22789f.setColor(this.f22805v);
            this.f22789f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f22789f;
            float f10 = this.f22785b;
            float f11 = this.f22786c;
            textPaint.setShadowLayer(f10, f11, f11, this.f22805v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f22805v;
            int i12 = z10 ? this.f22805v : -1;
            float f12 = this.f22785b / 2.0f;
            this.f22789f.setColor(this.f22802s);
            this.f22789f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f22789f.setShadowLayer(this.f22785b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f22789f.setShadowLayer(this.f22785b, f12, f12, i12);
        }
        this.f22789f.setColor(this.f22802s);
        this.f22789f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f22789f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f22794k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f22798o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f22795l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f22800q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f22801r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f22799p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f22797n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h0.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h0.g():void");
    }
}
