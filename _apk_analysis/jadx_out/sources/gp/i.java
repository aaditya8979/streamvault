package gp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import fp.p;
import gp.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SimpleTextCacheStuffer.java */
/* JADX INFO: loaded from: classes4.dex */
public class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Float, Float> f62751a = new HashMap();

    @Override // gp.b
    public void a() {
        f62751a.clear();
    }

    @Override // gp.b
    public void c(fp.c cVar, Canvas canvas, float f10, float f11, boolean z10, a.C0773a c0773a) {
        float f12;
        float f13;
        int i10;
        boolean z11;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11 = cVar.f61786m;
        float f18 = f10 + i11;
        float f19 = f11 + i11;
        if (cVar.f61785l != 0) {
            f18 += 4.0f;
            f19 += 4.0f;
        }
        float f20 = f19;
        float f21 = f18;
        c0773a.i(z10);
        TextPaint textPaintK = c0773a.k(cVar, z10);
        g(cVar, canvas, f10, f11);
        String[] strArr = cVar.f61777d;
        boolean z12 = true;
        boolean z13 = false;
        if (strArr == null) {
            if (c0773a.n(cVar)) {
                c0773a.f(cVar, textPaintK, true);
                float fAscent = f20 - textPaintK.ascent();
                if (c0773a.f62699s) {
                    float f22 = c0773a.f62691k + f21;
                    f12 = fAscent + c0773a.f62692l;
                    f13 = f22;
                } else {
                    f12 = fAscent;
                    f13 = f21;
                }
                h(cVar, null, canvas, f13, f12, textPaintK);
            }
            c0773a.f(cVar, textPaintK, false);
            i(cVar, null, canvas, f21, f20 - textPaintK.ascent(), textPaintK, z10);
        } else if (strArr.length == 1) {
            if (c0773a.n(cVar)) {
                c0773a.f(cVar, textPaintK, true);
                float fAscent2 = f20 - textPaintK.ascent();
                if (c0773a.f62699s) {
                    float f23 = c0773a.f62691k + f21;
                    f16 = fAscent2 + c0773a.f62692l;
                    f17 = f23;
                } else {
                    f16 = fAscent2;
                    f17 = f21;
                }
                h(cVar, strArr[0], canvas, f17, f16, textPaintK);
            }
            c0773a.f(cVar, textPaintK, false);
            i(cVar, strArr[0], canvas, f21, f20 - textPaintK.ascent(), textPaintK, z10);
        } else {
            float length = (cVar.f61789p - (cVar.f61786m * 2)) / strArr.length;
            int i12 = 0;
            while (i12 < strArr.length) {
                String str = strArr[i12];
                if (str == null || str.length() == 0) {
                    i10 = i12;
                    z11 = z13;
                } else {
                    if (c0773a.n(cVar)) {
                        c0773a.f(cVar, textPaintK, z12);
                        float fAscent3 = ((i12 * length) + f20) - textPaintK.ascent();
                        if (c0773a.f62699s) {
                            float f24 = c0773a.f62691k + f21;
                            f14 = fAscent3 + c0773a.f62692l;
                            f15 = f24;
                        } else {
                            f14 = fAscent3;
                            f15 = f21;
                        }
                        i10 = i12;
                        h(cVar, strArr[i12], canvas, f15, f14, textPaintK);
                    } else {
                        i10 = i12;
                    }
                    c0773a.f(cVar, textPaintK, z13);
                    z11 = z13;
                    i(cVar, strArr[i10], canvas, f21, ((i10 * length) + f20) - textPaintK.ascent(), textPaintK, z10);
                }
                i12 = i10 + 1;
                z13 = z11;
                z12 = true;
            }
        }
        if (cVar.f61783j != 0) {
            Paint paintM = c0773a.m(cVar);
            float f25 = (f11 + cVar.f61789p) - c0773a.f62688h;
            canvas.drawLine(f10, f25, f10 + cVar.f61788o, f25, paintM);
        }
        if (cVar.f61785l != 0) {
            canvas.drawRect(f10, f11, f10 + cVar.f61788o, f11 + cVar.f61789p, c0773a.j(cVar));
        }
    }

    @Override // gp.b
    public void d(fp.c cVar, TextPaint textPaint, boolean z10) {
        float fMax = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (cVar.f61777d == null) {
            CharSequence charSequence = cVar.f61776c;
            if (charSequence != null) {
                fMax = textPaint.measureText(charSequence.toString());
                fValueOf = j(cVar, textPaint);
            }
            cVar.f61788o = fMax;
            cVar.f61789p = fValueOf.floatValue();
            return;
        }
        Float fJ = j(cVar, textPaint);
        for (String str : cVar.f61777d) {
            if (str.length() > 0) {
                fMax = Math.max(textPaint.measureText(str), fMax);
            }
        }
        cVar.f61788o = fMax;
        cVar.f61789p = cVar.f61777d.length * fJ.floatValue();
    }

    public void g(fp.c cVar, Canvas canvas, float f10, float f11) {
    }

    public void h(fp.c cVar, String str, Canvas canvas, float f10, float f11, Paint paint) {
        if (str != null) {
            canvas.drawText(str, f10, f11, paint);
        } else {
            canvas.drawText(cVar.f61776c.toString(), f10, f11, paint);
        }
    }

    public void i(fp.c cVar, String str, Canvas canvas, float f10, float f11, TextPaint textPaint, boolean z10) {
        if (z10 && (cVar instanceof p)) {
            textPaint.setAlpha(255);
        }
        if (str != null) {
            canvas.drawText(str, f10, f11, textPaint);
        } else {
            canvas.drawText(cVar.f61776c.toString(), f10, f11, textPaint);
        }
    }

    public Float j(fp.c cVar, Paint paint) {
        Float fValueOf = Float.valueOf(paint.getTextSize());
        Map<Float, Float> map = f62751a;
        Float f10 = map.get(fValueOf);
        if (f10 != null) {
            return f10;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Float fValueOf2 = Float.valueOf((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading);
        map.put(fValueOf, fValueOf2);
        return fValueOf2;
    }
}
