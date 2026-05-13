package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cf;
import com.bytedance.sdk.component.adexpress.dynamic.yu.ra;

/* JADX INFO: loaded from: classes3.dex */
public final class lh {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12208le;
    public Paint ouw;
    private int yu;
    public Path vt = new Path();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Path f12209lh = new Path();

    public lh() {
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setAntiAlias(true);
    }

    public final void ouw(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        int iIntValue2;
        String str;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f12430lh != null) {
                float[] fArrVt = null;
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrVt = ra.vt(str);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.ouw.setColor(Color.parseColor(str));
                    this.ouw.setAlpha(90);
                } else if (fArrVt != null) {
                    this.ouw.setColor(com.bytedance.sdk.component.adexpress.yu.ra.ouw(fArrVt[3] * (1.0f - iAnimation.getRippleValue()), fArrVt[0] / 256.0f, fArrVt[1] / 256.0f, fArrVt[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.yu, this.fkw, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.ouw);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.vt.reset();
            try {
                iIntValue2 = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue2 = 0;
            }
            if (iIntValue2 >= 0) {
                int shineValue = ((int) ((((this.yu * 4) + (iIntValue2 * 2)) + (this.fkw * 2)) * iAnimation.getShineValue())) - ((this.fkw * 2) + iIntValue2);
                float f10 = shineValue;
                int i10 = this.fkw;
                this.ouw.setShader(new LinearGradient(f10, 0.0f, ((iIntValue2 + i10) / 2) + shineValue, i10 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.ouw.setStrokeWidth(this.yu * 2);
                Path path = this.f12209lh;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i11 = shineValue + iIntValue2;
                canvas.drawLine(f10, 0.0f, i11 + r1, this.fkw, this.ouw);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                this.vt.reset();
                this.vt.moveTo(0.0f, 0.0f);
                this.vt.lineTo(this.yu * 2, 0.0f);
                this.vt.lineTo(this.yu * 2, this.fkw * 2);
                this.vt.lineTo(0.0f, this.fkw * 2);
                this.vt.lineTo(0.0f, 0.0f);
                this.ouw.setShader(new LinearGradient(0.0f, 0.0f, this.yu * 2, this.fkw * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.ouw.setColor(SupportMenu.CATEGORY_MASK);
                this.ouw.setStyle(Paint.Style.STROKE);
                this.ouw.setStrokeWidth(iIntValue);
                canvas.drawPath(this.vt, this.ouw);
            }
        }
    }

    public final void ouw(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.f12208le * f10);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof cf) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i10).setTranslationX((-(this.f12208le - layoutParams.width)) / 2);
                i10++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public final void ouw(View view, int i10, int i11) {
        String str;
        this.yu = i10 / 2;
        this.fkw = i11 / 2;
        if (this.f12208le == 0 && view.getLayoutParams().width > 0) {
            this.f12208le = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.f12209lh.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.yu * 2);
            view.setPivotY(this.fkw);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.fkw);
        } else {
            view.setPivotX(this.yu);
            view.setPivotY(this.fkw);
        }
    }
}
