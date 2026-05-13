package x5;

import a6.k0;
import a6.m;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f86790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f86791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f86792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f86793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f86794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f86795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f86796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f86797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Layout.Alignment f86798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f86799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f86800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f86801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f86802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f86803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f86804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f86805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f86806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f86807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f86808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f86809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f86810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f86811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f86812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f86813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f86814y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f86815z;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f86794e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f86793d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f86790a = fRound;
        this.f86791b = fRound;
        this.f86792c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f86795f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f86796g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public void b(n5.b bVar, boolean z10, boolean z11, n5.a aVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z12 = bVar.f75128d == null;
        int i14 = ViewCompat.MEASURED_STATE_MASK;
        if (z12) {
            if (TextUtils.isEmpty(bVar.f75126b)) {
                return;
            } else {
                i14 = (bVar.f75136l && z10) ? bVar.f75137m : aVar.f75121c;
            }
        }
        if (a(this.f86797h, bVar.f75126b) && k0.c(this.f86798i, bVar.f75127c) && this.f86799j == bVar.f75128d && this.f86800k == bVar.f75129e && this.f86801l == bVar.f75130f && k0.c(Integer.valueOf(this.f86802m), Integer.valueOf(bVar.f75131g)) && this.f86803n == bVar.f75132h && k0.c(Integer.valueOf(this.f86804o), Integer.valueOf(bVar.f75133i)) && this.f86805p == bVar.f75134j && this.f86806q == bVar.f75135k && this.f86807r == z10 && this.f86808s == z11 && this.f86809t == aVar.f75119a && this.f86810u == aVar.f75120b && this.f86811v == i14 && this.f86813x == aVar.f75122d && this.f86812w == aVar.f75123e && k0.c(this.f86795f.getTypeface(), aVar.f75124f) && this.f86814y == f10 && this.f86815z == f11 && this.A == f12 && this.B == i10 && this.C == i11 && this.D == i12 && this.E == i13) {
            d(canvas, z12);
            return;
        }
        this.f86797h = bVar.f75126b;
        this.f86798i = bVar.f75127c;
        this.f86799j = bVar.f75128d;
        this.f86800k = bVar.f75129e;
        this.f86801l = bVar.f75130f;
        this.f86802m = bVar.f75131g;
        this.f86803n = bVar.f75132h;
        this.f86804o = bVar.f75133i;
        this.f86805p = bVar.f75134j;
        this.f86806q = bVar.f75135k;
        this.f86807r = z10;
        this.f86808s = z11;
        this.f86809t = aVar.f75119a;
        this.f86810u = aVar.f75120b;
        this.f86811v = i14;
        this.f86813x = aVar.f75122d;
        this.f86812w = aVar.f75123e;
        this.f86795f.setTypeface(aVar.f75124f);
        this.f86814y = f10;
        this.f86815z = f11;
        this.A = f12;
        this.B = i10;
        this.C = i11;
        this.D = i12;
        this.E = i13;
        if (z12) {
            g();
        } else {
            f();
        }
        d(canvas, z12);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f86799j, (Rect) null, this.J, (Paint) null);
    }

    public final void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.F;
        if (staticLayout == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f86811v) > 0) {
            this.f86796g.setColor(this.f86811v);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f86796g);
        }
        int i10 = this.f86813x;
        if (i10 == 1) {
            this.f86795f.setStrokeJoin(Paint.Join.ROUND);
            this.f86795f.setStrokeWidth(this.f86790a);
            this.f86795f.setColor(this.f86812w);
            this.f86795f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f86795f;
            float f10 = this.f86791b;
            float f11 = this.f86792c;
            textPaint.setShadowLayer(f10, f11, f11, this.f86812w);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f86812w;
            int i12 = z10 ? this.f86812w : -1;
            float f12 = this.f86791b / 2.0f;
            this.f86795f.setColor(this.f86809t);
            this.f86795f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f86795f.setShadowLayer(this.f86791b, f13, f13, i11);
            staticLayout.draw(canvas);
            this.f86795f.setShadowLayer(this.f86791b, f12, f12, i12);
        }
        this.f86795f.setColor(this.f86809t);
        this.f86795f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f86795f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r7 = this;
            int r0 = r7.D
            int r1 = r7.B
            int r0 = r0 - r1
            int r2 = r7.E
            int r3 = r7.C
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.f86803n
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.f86800k
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.f86805p
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.f86806q
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L2c
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            goto L41
        L2c:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.f86799j
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.f86799j
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
        L41:
            int r4 = r7.f86802m
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L4a
            float r4 = (float) r0
        L48:
            float r1 = r1 - r4
            goto L50
        L4a:
            if (r4 != r5) goto L50
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L48
        L50:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.f86804o
            if (r4 != r6) goto L5b
            float r4 = (float) r2
        L59:
            float r3 = r3 - r4
            goto L61
        L5b:
            if (r4 != r5) goto L61
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L59
        L61:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.c.f():void");
    }

    public final void g() {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        int iMax;
        int iMin;
        int i10;
        int iRound;
        int i11;
        int i12 = this.D - this.B;
        int i13 = this.E - this.C;
        this.f86795f.setTextSize(this.f86814y);
        int i14 = (int) ((this.f86814y * 0.125f) + 0.5f);
        int i15 = i14 * 2;
        int i16 = i12 - i15;
        float f10 = this.f86805p;
        if (f10 != -3.4028235E38f) {
            i16 = (int) (i16 * f10);
        }
        if (i16 <= 0) {
            m.h("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        CharSequence string = this.f86797h;
        if (this.f86807r) {
            if (!this.f86808s) {
                spannableStringBuilder = new SpannableStringBuilder(string);
                int length = spannableStringBuilder.length();
                AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, length, AbsoluteSizeSpan.class);
                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, length, RelativeSizeSpan.class);
                for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                    spannableStringBuilder.removeSpan(absoluteSizeSpan);
                }
                for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                }
            } else if (this.f86815z > 0.0f) {
                spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f86815z), 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
            }
            string = spannableStringBuilder;
        } else {
            string = string.toString();
        }
        if (Color.alpha(this.f86810u) > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f86810u), 0, spannableStringBuilder2.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
            charSequence = spannableStringBuilder2;
        } else {
            charSequence = string;
        }
        Layout.Alignment alignment = this.f86798i;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f86795f, i16, alignment2, this.f86793d, this.f86794e, true);
        this.F = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.F.getLineCount();
        int iMax2 = 0;
        for (int i17 = 0; i17 < lineCount; i17++) {
            iMax2 = Math.max((int) Math.ceil(this.F.getLineWidth(i17)), iMax2);
        }
        if (this.f86805p == -3.4028235E38f || iMax2 >= i16) {
            i16 = iMax2;
        }
        int i18 = i16 + i15;
        float f11 = this.f86803n;
        if (f11 != -3.4028235E38f) {
            int iRound2 = Math.round(i12 * f11);
            int i19 = this.B;
            int i20 = iRound2 + i19;
            int i21 = this.f86804o;
            if (i21 == 2) {
                i20 -= i18;
            } else if (i21 == 1) {
                i20 = ((i20 * 2) - i18) / 2;
            }
            iMax = Math.max(i20, i19);
            iMin = Math.min(i18 + iMax, this.D);
        } else {
            iMax = ((i12 - i18) / 2) + this.B;
            iMin = iMax + i18;
        }
        int i22 = iMin - iMax;
        if (i22 <= 0) {
            m.h("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f12 = this.f86800k;
        if (f12 != -3.4028235E38f) {
            if (this.f86801l == 0) {
                iRound = Math.round(i13 * f12);
                i11 = this.C;
            } else {
                int lineBottom = this.F.getLineBottom(0) - this.F.getLineTop(0);
                float f13 = this.f86800k;
                if (f13 >= 0.0f) {
                    iRound = Math.round(f13 * lineBottom);
                    i11 = this.C;
                } else {
                    iRound = Math.round((f13 + 1.0f) * lineBottom);
                    i11 = this.E;
                }
            }
            i10 = iRound + i11;
            int i23 = this.f86802m;
            if (i23 == 2) {
                i10 -= height;
            } else if (i23 == 1) {
                i10 = ((i10 * 2) - height) / 2;
            }
            int i24 = i10 + height;
            int i25 = this.E;
            if (i24 > i25) {
                i10 = i25 - height;
            } else {
                int i26 = this.C;
                if (i10 < i26) {
                    i10 = i26;
                }
            }
        } else {
            i10 = (this.E - height) - ((int) (i13 * this.A));
        }
        this.F = new StaticLayout(charSequence, this.f86795f, i22, alignment2, this.f86793d, this.f86794e, true);
        this.G = iMax;
        this.H = i10;
        this.I = i14;
    }
}
