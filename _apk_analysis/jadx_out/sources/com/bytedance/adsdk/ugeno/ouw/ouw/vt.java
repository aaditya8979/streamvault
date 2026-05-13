package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vt extends ouw {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Paint f11757le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11758lh;
    private int yu;

    public vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        Paint paint = new Paint();
        this.f11757le = paint;
        paint.setAntiAlias(true);
    }

    private void lh(Canvas canvas) {
        try {
            if (this.vt.uoy() > 0.0f) {
                this.f11757le.setColor(this.f11758lh);
                this.f11757le.setAlpha((int) ((1.0f - this.vt.uoy()) * 255.0f));
                ((ViewGroup) this.vt.fkw.getParent()).setClipChildren(true);
                canvas.drawCircle(this.yu, this.fkw, Math.min(r0, r2) * 2 * this.vt.uoy(), this.f11757le);
            }
        } catch (Throwable th2) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f11758lh = com.bytedance.adsdk.ugeno.ra.ouw.ouw(this.ouw.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i10, int i11) {
        this.yu = i10 / 2;
        this.fkw = i11 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
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
