package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.vt.ouw.vt.ouw;

/* JADX INFO: loaded from: classes2.dex */
public final class rn {
    public ouw<?, Float> bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Matrix f12155cf;
    public ouw<Integer, Integer> fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final float[] f12156jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public yu f12157le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> f12158lh;
    private final Matrix mwh;
    public ouw<PointF, PointF> ouw;
    public ouw<?, Float> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public yu f12159ra;
    private final Matrix ryl;
    private final Matrix tlj = new Matrix();
    public ouw<?, PointF> vt;
    public ouw<Float, Float> yu;

    public rn(com.bytedance.adsdk.vt.lh.ouw.ryl rylVar) {
        com.bytedance.adsdk.vt.lh.ouw.fkw fkwVar = rylVar.ouw;
        this.ouw = fkwVar == null ? null : fkwVar.ouw();
        com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar = rylVar.vt;
        this.vt = mwhVar == null ? null : mwhVar.ouw();
        com.bytedance.adsdk.vt.lh.ouw.ra raVar = rylVar.f12041lh;
        this.f12158lh = raVar == null ? null : raVar.ouw();
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar = rylVar.yu;
        this.yu = vtVar == null ? null : vtVar.ouw();
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2 = rylVar.f12040le;
        yu yuVar = vtVar2 == null ? null : (yu) vtVar2.ouw();
        this.f12157le = yuVar;
        if (yuVar != null) {
            this.f12155cf = new Matrix();
            this.ryl = new Matrix();
            this.mwh = new Matrix();
            this.f12156jg = new float[9];
        } else {
            this.f12155cf = null;
            this.ryl = null;
            this.mwh = null;
            this.f12156jg = null;
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar3 = rylVar.f12042ra;
        this.f12159ra = vtVar3 == null ? null : (yu) vtVar3.ouw();
        com.bytedance.adsdk.vt.lh.ouw.yu yuVar2 = rylVar.fkw;
        if (yuVar2 != null) {
            this.fkw = yuVar2.ouw();
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar4 = rylVar.pno;
        if (vtVar4 != null) {
            this.pno = vtVar4.ouw();
        } else {
            this.pno = null;
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar5 = rylVar.bly;
        if (vtVar5 != null) {
            this.bly = vtVar5.ouw();
        } else {
            this.bly = null;
        }
    }

    private void vt() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f12156jg[i10] = 0.0f;
        }
    }

    public final Matrix ouw() {
        PointF pointFLe;
        PointF pointFLe2;
        this.tlj.reset();
        ouw<?, PointF> ouwVar = this.vt;
        if (ouwVar != null && (pointFLe2 = ouwVar.le()) != null) {
            float f10 = pointFLe2.x;
            if (f10 != 0.0f || pointFLe2.y != 0.0f) {
                this.tlj.preTranslate(f10, pointFLe2.y);
            }
        }
        ouw<Float, Float> ouwVar2 = this.yu;
        if (ouwVar2 != null) {
            float fFloatValue = ouwVar2 instanceof zih ? ouwVar2.le().floatValue() : ((yu) ouwVar2).pno();
            if (fFloatValue != 0.0f) {
                this.tlj.preRotate(fFloatValue);
            }
        }
        if (this.f12157le != null) {
            float fCos = this.f12159ra == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.pno()) + 90.0f));
            float fSin = this.f12159ra == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.pno()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.pno()));
            vt();
            float[] fArr = this.f12156jg;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f12155cf.setValues(fArr);
            vt();
            float[] fArr2 = this.f12156jg;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.ryl.setValues(fArr2);
            vt();
            float[] fArr3 = this.f12156jg;
            fArr3[0] = fCos;
            fArr3[1] = f11;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.mwh.setValues(fArr3);
            this.ryl.preConcat(this.f12155cf);
            this.mwh.preConcat(this.ryl);
            this.tlj.preConcat(this.mwh);
        }
        ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar3 = this.f12158lh;
        if (ouwVar3 != null) {
            com.bytedance.adsdk.vt.ra.lh lhVarLe = ouwVar3.le();
            float f12 = lhVarLe.ouw;
            if (f12 != 1.0f || lhVarLe.vt != 1.0f) {
                this.tlj.preScale(f12, lhVarLe.vt);
            }
        }
        ouw<PointF, PointF> ouwVar4 = this.ouw;
        if (ouwVar4 != null && (((pointFLe = ouwVar4.le()) != null && pointFLe.x != 0.0f) || pointFLe.y != 0.0f)) {
            this.tlj.preTranslate(-pointFLe.x, -pointFLe.y);
        }
        return this.tlj;
    }

    public final Matrix ouw(float f10) {
        ouw<?, PointF> ouwVar = this.vt;
        PointF pointFLe = ouwVar == null ? null : ouwVar.le();
        ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar2 = this.f12158lh;
        com.bytedance.adsdk.vt.ra.lh lhVarLe = ouwVar2 == null ? null : ouwVar2.le();
        this.tlj.reset();
        if (pointFLe != null) {
            this.tlj.preTranslate(pointFLe.x * f10, pointFLe.y * f10);
        }
        if (lhVarLe != null) {
            double d10 = f10;
            this.tlj.preScale((float) Math.pow(lhVarLe.ouw, d10), (float) Math.pow(lhVarLe.vt, d10));
        }
        ouw<Float, Float> ouwVar3 = this.yu;
        if (ouwVar3 != null) {
            float fFloatValue = ouwVar3.le().floatValue();
            ouw<PointF, PointF> ouwVar4 = this.ouw;
            PointF pointFLe2 = ouwVar4 != null ? ouwVar4.le() : null;
            this.tlj.preRotate(fFloatValue * f10, pointFLe2 == null ? 0.0f : pointFLe2.x, pointFLe2 != null ? pointFLe2.y : 0.0f);
        }
        return this.tlj;
    }

    public final void ouw(com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        ouwVar.ouw(this.fkw);
        ouwVar.ouw(this.pno);
        ouwVar.ouw(this.bly);
        ouwVar.ouw(this.ouw);
        ouwVar.ouw(this.vt);
        ouwVar.ouw(this.f12158lh);
        ouwVar.ouw(this.yu);
        ouwVar.ouw(this.f12157le);
        ouwVar.ouw(this.f12159ra);
    }

    public final void ouw(ouw.InterfaceC0186ouw interfaceC0186ouw) {
        ouw<Integer, Integer> ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(interfaceC0186ouw);
        }
        ouw<?, Float> ouwVar2 = this.pno;
        if (ouwVar2 != null) {
            ouwVar2.ouw(interfaceC0186ouw);
        }
        ouw<?, Float> ouwVar3 = this.bly;
        if (ouwVar3 != null) {
            ouwVar3.ouw(interfaceC0186ouw);
        }
        ouw<PointF, PointF> ouwVar4 = this.ouw;
        if (ouwVar4 != null) {
            ouwVar4.ouw(interfaceC0186ouw);
        }
        ouw<?, PointF> ouwVar5 = this.vt;
        if (ouwVar5 != null) {
            ouwVar5.ouw(interfaceC0186ouw);
        }
        ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar6 = this.f12158lh;
        if (ouwVar6 != null) {
            ouwVar6.ouw(interfaceC0186ouw);
        }
        ouw<Float, Float> ouwVar7 = this.yu;
        if (ouwVar7 != null) {
            ouwVar7.ouw(interfaceC0186ouw);
        }
        yu yuVar = this.f12157le;
        if (yuVar != null) {
            yuVar.ouw(interfaceC0186ouw);
        }
        yu yuVar2 = this.f12159ra;
        if (yuVar2 != null) {
            yuVar2.ouw(interfaceC0186ouw);
        }
    }
}
