package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.vt.ouw.vt.ouw;

/* JADX INFO: loaded from: classes2.dex */
public final class lh implements ouw.InterfaceC0186ouw {
    private final ouw<Float, Float> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final ouw<Float, Float> f12145le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final ouw<Float, Float> f12146lh;
    private final ouw.InterfaceC0186ouw ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12147ra = true;
    private final ouw<Integer, Integer> vt;
    private final ouw<Float, Float> yu;

    public lh(ouw.InterfaceC0186ouw interfaceC0186ouw, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.fkw.tlj tljVar) {
        this.ouw = interfaceC0186ouw;
        ouw<Integer, Integer> ouwVarOuw = tljVar.ouw.ouw();
        this.vt = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
        ouw<Float, Float> ouwVarOuw2 = tljVar.vt.ouw();
        this.f12146lh = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        ouw<Float, Float> ouwVarOuw3 = tljVar.f11945lh.ouw();
        this.yu = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
        ouw<Float, Float> ouwVarOuw4 = tljVar.yu.ouw();
        this.fkw = ouwVarOuw4;
        ouwVarOuw4.ouw(this);
        ouwVar.ouw(ouwVarOuw4);
        ouw<Float, Float> ouwVarOuw5 = tljVar.fkw.ouw();
        this.f12145le = ouwVarOuw5;
        ouwVarOuw5.ouw(this);
        ouwVar.ouw(ouwVarOuw5);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0186ouw
    public final void ouw() {
        this.f12147ra = true;
        this.ouw.ouw();
    }

    public final void ouw(Paint paint) {
        if (this.f12147ra) {
            this.f12147ra = false;
            double dFloatValue = ((double) this.yu.le().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.fkw.le().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.vt.le().intValue();
            paint.setShadowLayer(this.f12145le.le().floatValue(), fSin, fCos, Color.argb(Math.round(this.f12146lh.le().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
