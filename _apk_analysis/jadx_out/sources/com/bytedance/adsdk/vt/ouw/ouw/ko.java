package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.vt.ouw.vt.ouw;

/* JADX INFO: loaded from: classes4.dex */
public final class ko implements cf, mwh, ouw.InterfaceC0186ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f12097cf;
    private final com.bytedance.adsdk.vt.bly fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> f12098le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f12099lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> f12100ra;
    private final boolean yu;
    private final Path ouw = new Path();
    private final RectF vt = new RectF();
    private final vt bly = new vt();
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> tlj = null;

    public ko(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.cf cfVar) {
        this.f12099lh = cfVar.ouw;
        this.yu = cfVar.fkw;
        this.fkw = blyVar;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw = cfVar.vt.ouw();
        this.f12098le = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = cfVar.f12051lh.ouw();
        this.f12100ra = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = cfVar.yu.ouw();
        this.pno = ouwVarOuw3;
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0186ouw
    public final void ouw() {
        this.f12097cf = false;
        this.fkw.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(java.util.List<com.bytedance.adsdk.vt.ouw.ouw.lh> r5, java.util.List<com.bytedance.adsdk.vt.ouw.ouw.lh> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L30
            java.lang.Object r0 = r5.get(r6)
            com.bytedance.adsdk.vt.ouw.ouw.lh r0 = (com.bytedance.adsdk.vt.ouw.ouw.lh) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.vt.ouw.ouw.zin
            if (r1 == 0) goto L23
            r1 = r0
            com.bytedance.adsdk.vt.ouw.ouw.zin r1 = (com.bytedance.adsdk.vt.ouw.ouw.zin) r1
            com.bytedance.adsdk.vt.lh.vt.th$ouw r2 = r1.vt
            com.bytedance.adsdk.vt.lh.vt.th$ouw r3 = com.bytedance.adsdk.vt.lh.vt.th.ouw.SIMULTANEOUSLY
            if (r2 != r3) goto L23
            com.bytedance.adsdk.vt.ouw.ouw.vt r0 = r4.bly
            r0.ouw(r1)
            r1.ouw(r4)
            goto L2d
        L23:
            boolean r1 = r0 instanceof com.bytedance.adsdk.vt.ouw.ouw.zih
            if (r1 == 0) goto L2d
            com.bytedance.adsdk.vt.ouw.ouw.zih r0 = (com.bytedance.adsdk.vt.ouw.ouw.zih) r0
            com.bytedance.adsdk.vt.ouw.vt.ouw<java.lang.Float, java.lang.Float> r0 = r0.ouw
            r4.tlj = r0
        L2d:
            int r6 = r6 + 1
            goto L1
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.ouw.ouw.ko.ouw(java.util.List, java.util.List):void");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar;
        if (this.f12097cf) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.yu) {
            this.f12097cf = true;
            return this.ouw;
        }
        PointF pointFLe = this.f12100ra.le();
        float f10 = pointFLe.x / 2.0f;
        float f11 = pointFLe.y / 2.0f;
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = this.pno;
        float fPno = ouwVar2 == null ? 0.0f : ((com.bytedance.adsdk.vt.ouw.vt.yu) ouwVar2).pno();
        if (fPno == 0.0f && (ouwVar = this.tlj) != null) {
            fPno = Math.min(ouwVar.le().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fPno > fMin) {
            fPno = fMin;
        }
        PointF pointFLe2 = this.f12098le.le();
        this.ouw.moveTo(pointFLe2.x + f10, (pointFLe2.y - f11) + fPno);
        this.ouw.lineTo(pointFLe2.x + f10, (pointFLe2.y + f11) - fPno);
        if (fPno > 0.0f) {
            RectF rectF = this.vt;
            float f12 = pointFLe2.x;
            float f13 = fPno * 2.0f;
            float f14 = pointFLe2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.ouw.arcTo(this.vt, 0.0f, 90.0f, false);
        }
        this.ouw.lineTo((pointFLe2.x - f10) + fPno, pointFLe2.y + f11);
        if (fPno > 0.0f) {
            RectF rectF2 = this.vt;
            float f15 = pointFLe2.x;
            float f16 = pointFLe2.y;
            float f17 = fPno * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.ouw.arcTo(this.vt, 90.0f, 90.0f, false);
        }
        this.ouw.lineTo(pointFLe2.x - f10, (pointFLe2.y - f11) + fPno);
        if (fPno > 0.0f) {
            RectF rectF3 = this.vt;
            float f18 = pointFLe2.x;
            float f19 = pointFLe2.y;
            float f20 = fPno * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.ouw.arcTo(this.vt, 180.0f, 90.0f, false);
        }
        this.ouw.lineTo((pointFLe2.x + f10) - fPno, pointFLe2.y - f11);
        if (fPno > 0.0f) {
            RectF rectF4 = this.vt;
            float f21 = pointFLe2.x;
            float f22 = fPno * 2.0f;
            float f23 = pointFLe2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.ouw.arcTo(this.vt, 270.0f, 90.0f, false);
        }
        this.ouw.close();
        this.bly.ouw(this.ouw);
        this.f12097cf = true;
        return this.ouw;
    }
}
