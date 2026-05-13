package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ra.ouw;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yu extends ouw {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private static final float f11759jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private static final float f11760ko;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private static final float f11761rn;
    private static final float zih;
    private float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11762cf;
    private Path fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private ouw.C0181ouw f11763le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11764lh;
    private Path mwh;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11765ra;
    private boolean ryl;
    private int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private float f11766vm;
    private Paint yu;

    static {
        float radians = (float) Math.toRadians(30.0d);
        f11759jg = radians;
        f11760ko = (float) Math.tan(radians);
        f11761rn = (float) Math.cos(radians);
        zih = (float) Math.sin(radians);
    }

    public yu(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        this.ryl = true;
        Paint paint = new Paint();
        this.yu = paint;
        paint.setAntiAlias(true);
        this.fkw = new Path();
        this.bly = this.vt.ux;
        this.mwh = new Path();
    }

    private void lh(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.vt.osn() > 0.0f) {
                int i10 = this.tlj;
                float f10 = f11760ko;
                float fOsn = (i10 + (i10 * f10)) * this.vt.osn();
                this.mwh.reset();
                this.mwh.moveTo(fOsn, 0.0f);
                int i11 = this.f11762cf;
                float f11 = fOsn - (i11 * f10);
                this.mwh.lineTo(f11, i11);
                this.mwh.lineTo(f11 + this.f11764lh, this.f11762cf);
                this.mwh.lineTo(this.f11764lh + fOsn, 0.0f);
                this.mwh.close();
                float f12 = this.f11766vm;
                float f13 = f11761rn * f12;
                float f14 = f12 * zih;
                if (!this.ryl || this.f11763le == null) {
                    int i12 = this.pno;
                    linearGradient = new LinearGradient(fOsn, 0.0f, fOsn + f13, f14, new int[]{i12, this.f11765ra, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fOsn, 0.0f, fOsn + f13, f14, this.f11763le.vt, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.yu.setShader(linearGradient);
                Path path = this.fkw;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.mwh, this.yu);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f11764lh = (int) ra.ouw(this.vt.fkw.getContext(), this.ouw.optInt("shineWidth", 30));
        String strOptString = this.ouw.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.f11763le = com.bytedance.adsdk.ugeno.ra.ouw.vt(str);
        } else {
            int iOuw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str, ViewCompat.MEASURED_STATE_MASK);
            this.f11765ra = iOuw;
            this.pno = (iOuw & ViewCompat.MEASURED_SIZE_MASK) | 536870912;
            this.ryl = false;
        }
        this.f11766vm = f11761rn * this.f11764lh;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i10, int i11) {
        this.tlj = i10;
        this.f11762cf = i11;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            Path path = this.fkw;
            float f10 = this.bly;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    @SuppressLint({"DrawAllocation"})
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(lh(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }
}
