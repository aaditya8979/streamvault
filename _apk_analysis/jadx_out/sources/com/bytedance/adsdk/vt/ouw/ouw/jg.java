package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.vt.lh.vt.th;
import com.bytedance.adsdk.vt.lh.vt.tlj;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jg implements cf, mwh, ouw.InterfaceC0186ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f12091cf;
    private final boolean fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f12093ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final boolean f12094le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f12095lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> mwh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f12096ra;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ryl;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> tlj;
    private final String vt;
    private final tlj.ouw yu;
    private final Path ouw = new Path();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final vt f12092jg = new vt();

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.ouw.ouw.jg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[tlj.ouw.values().length];
            ouw = iArr;
            try {
                iArr[tlj.ouw.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[tlj.ouw.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public jg(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.tlj tljVar) {
        this.f12095lh = blyVar;
        this.vt = tljVar.ouw;
        tlj.ouw ouwVar2 = tljVar.vt;
        this.yu = ouwVar2;
        this.fkw = tljVar.tlj;
        this.f12094le = tljVar.f12070cf;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = tljVar.f12072lh.ouw();
        this.f12096ra = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = tljVar.yu.ouw();
        this.pno = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = tljVar.fkw.ouw();
        this.bly = ouwVarOuw3;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw4 = tljVar.f12073ra.ouw();
        this.f12091cf = ouwVarOuw4;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw5 = tljVar.bly.ouw();
        this.mwh = ouwVarOuw5;
        tlj.ouw ouwVar3 = tlj.ouw.STAR;
        if (ouwVar2 == ouwVar3) {
            this.tlj = tljVar.f12071le.ouw();
            this.ryl = tljVar.pno.ouw();
        } else {
            this.tlj = null;
            this.ryl = null;
        }
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVar.ouw(ouwVarOuw4);
        ouwVar.ouw(ouwVarOuw5);
        if (ouwVar2 == ouwVar3) {
            ouwVar.ouw(this.tlj);
            ouwVar.ouw(this.ryl);
        }
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
        ouwVarOuw4.ouw(this);
        ouwVarOuw5.ouw(this);
        if (ouwVar2 == ouwVar3) {
            this.tlj.ouw(this);
            this.ryl.ouw(this);
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0186ouw
    public final void ouw() {
        this.f12093ko = false;
        this.f12095lh.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            lh lhVar = list.get(i10);
            if (lhVar instanceof zin) {
                zin zinVar = (zin) lhVar;
                if (zinVar.vt == th.ouw.SIMULTANEOUSLY) {
                    this.f12092jg.ouw(zinVar);
                    zinVar.ouw(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        float fSin;
        float f10;
        double d10;
        float fCos;
        float f11;
        float f12;
        float f13;
        float f14;
        double d11;
        float f15;
        float f16;
        float f17;
        float f18;
        int i10;
        double d12;
        if (this.f12093ko) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.fkw) {
            this.f12093ko = true;
            return this.ouw;
        }
        int i11 = AnonymousClass1.ouw[this.yu.ordinal()];
        float f19 = 0.0f;
        if (i11 == 1) {
            float fFloatValue = this.f12096ra.le().floatValue();
            double radians = Math.toRadians((this.bly != null ? r2.le().floatValue() : 0.0d) - 90.0d);
            double d13 = fFloatValue;
            float f20 = (float) (6.283185307179586d / d13);
            if (this.f12094le) {
                f20 *= -1.0f;
            }
            float f21 = f20 / 2.0f;
            float f22 = fFloatValue - ((int) fFloatValue);
            if (f22 != 0.0f) {
                radians += (double) ((1.0f - f22) * f21);
            }
            float fFloatValue2 = this.f12091cf.le().floatValue();
            float fFloatValue3 = this.tlj.le().floatValue();
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar = this.ryl;
            float fFloatValue4 = ouwVar != null ? ouwVar.le().floatValue() / 100.0f : 0.0f;
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = this.mwh;
            float fFloatValue5 = ouwVar2 != null ? ouwVar2.le().floatValue() / 100.0f : 0.0f;
            if (f22 != 0.0f) {
                float f23 = ((fFloatValue2 - fFloatValue3) * f22) + fFloatValue3;
                double d14 = f23;
                f11 = f23;
                fCos = (float) (d14 * Math.cos(radians));
                float fSin2 = (float) (d14 * Math.sin(radians));
                this.ouw.moveTo(fCos, fSin2);
                d10 = radians + ((double) ((f20 * f22) / 2.0f));
                f10 = f21;
                fSin = fSin2;
            } else {
                double d15 = fFloatValue2;
                float fCos2 = (float) (d15 * Math.cos(radians));
                fSin = (float) (d15 * Math.sin(radians));
                this.ouw.moveTo(fCos2, fSin);
                f10 = f21;
                d10 = radians + ((double) f10);
                fCos = fCos2;
                f11 = 0.0f;
            }
            double dCeil = Math.ceil(d13) * 2.0d;
            float f24 = fCos;
            int i12 = 0;
            boolean z10 = false;
            while (true) {
                double d16 = i12;
                if (d16 >= dCeil) {
                    break;
                }
                float f25 = z10 ? fFloatValue2 : fFloatValue3;
                if (f11 == 0.0f || d16 != dCeil - 2.0d) {
                    f12 = f20;
                    f13 = f10;
                } else {
                    f12 = f20;
                    f13 = (f20 * f22) / 2.0f;
                }
                if (f11 == 0.0f || d16 != dCeil - 1.0d) {
                    f14 = f10;
                    d11 = d16;
                    f15 = f25;
                } else {
                    f14 = f10;
                    d11 = d16;
                    f15 = f11;
                }
                double d17 = f15;
                double d18 = dCeil;
                float fCos3 = (float) (d17 * Math.cos(d10));
                float fSin3 = (float) (d17 * Math.sin(d10));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.ouw.lineTo(fCos3, fSin3);
                    f16 = fFloatValue2;
                    f17 = fFloatValue5;
                    f18 = fFloatValue4;
                } else {
                    f16 = fFloatValue2;
                    double dAtan2 = (float) (Math.atan2(fSin, f24) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    f17 = fFloatValue5;
                    f18 = fFloatValue4;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f26 = z10 ? f18 : f17;
                    float f27 = z10 ? f17 : f18;
                    float f28 = (z10 ? fFloatValue3 : f16) * f26 * 0.47829f;
                    float f29 = fCos4 * f28;
                    float f30 = f28 * fSin4;
                    float f31 = (z10 ? f16 : fFloatValue3) * f27 * 0.47829f;
                    float f32 = fCos5 * f31;
                    float f33 = f31 * fSin5;
                    if (f22 != 0.0f) {
                        if (i12 == 0) {
                            f29 *= f22;
                            f30 *= f22;
                        } else if (d11 == d18 - 1.0d) {
                            f32 *= f22;
                            f33 *= f22;
                        }
                    }
                    this.ouw.cubicTo(f24 - f29, fSin - f30, fCos3 + f32, fSin3 + f33, fCos3, fSin3);
                }
                d10 += (double) f13;
                z10 = !z10;
                i12++;
                f24 = fCos3;
                fSin = fSin3;
                fFloatValue2 = f16;
                f20 = f12;
                f10 = f14;
                fFloatValue4 = f18;
                fFloatValue5 = f17;
                dCeil = d18;
            }
            PointF pointFLe = this.pno.le();
            this.ouw.offset(pointFLe.x, pointFLe.y);
            this.ouw.close();
        } else if (i11 == 2) {
            int iFloor = (int) Math.floor(this.f12096ra.le().floatValue());
            double radians2 = Math.toRadians((this.bly != null ? r14.le().floatValue() : 0.0d) - 90.0d);
            double d19 = iFloor;
            float fFloatValue6 = this.mwh.le().floatValue() / 100.0f;
            float fFloatValue7 = this.f12091cf.le().floatValue();
            double d20 = fFloatValue7;
            float fCos6 = (float) (d20 * Math.cos(radians2));
            float fSin6 = (float) (d20 * Math.sin(radians2));
            this.ouw.moveTo(fCos6, fSin6);
            double d21 = (float) (6.283185307179586d / d19);
            double d22 = radians2 + d21;
            double dCeil2 = Math.ceil(d19);
            float f34 = fCos6;
            int i13 = 0;
            while (i13 < dCeil2) {
                float fCos7 = (float) (Math.cos(d22) * d20);
                double d23 = dCeil2;
                float fSin7 = (float) (d20 * Math.sin(d22));
                if (fFloatValue6 != f19) {
                    d12 = d20;
                    double dAtan23 = (float) (Math.atan2(fSin6, f34) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    i10 = i13;
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f35 = fFloatValue7 * fFloatValue6 * 0.25f;
                    this.ouw.cubicTo(f34 - (fCos8 * f35), fSin6 - (fSin8 * f35), fCos7 + (((float) Math.cos(dAtan24)) * f35), fSin7 + (f35 * ((float) Math.sin(dAtan24))), fCos7, fSin7);
                } else {
                    i10 = i13;
                    d12 = d20;
                    this.ouw.lineTo(fCos7, fSin7);
                }
                d22 += d21;
                i13 = i10 + 1;
                f34 = fCos7;
                fSin6 = fSin7;
                dCeil2 = d23;
                d20 = d12;
                f19 = 0.0f;
            }
            PointF pointFLe2 = this.pno.le();
            this.ouw.offset(pointFLe2.x, pointFLe2.y);
            this.ouw.close();
        }
        this.ouw.close();
        this.f12092jg.ouw(this.ouw);
        this.f12093ko = true;
        return this.ouw;
    }
}
