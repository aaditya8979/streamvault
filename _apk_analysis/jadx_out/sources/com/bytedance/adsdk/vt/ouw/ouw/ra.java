package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ra implements cf, fkw, ouw.InterfaceC0186ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f12122cf;
    private final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final boolean f12123le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Paint f12124lh;
    private com.bytedance.adsdk.vt.ouw.vt.lh mwh;
    public float ouw;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final List<mwh> f12125ra;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ryl;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> tlj;
    private final Path vt;
    private final com.bytedance.adsdk.vt.lh.lh.ouw yu;

    public ra(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.ko koVar) {
        Path path = new Path();
        this.vt = path;
        this.f12124lh = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.f12125ra = new ArrayList();
        this.yu = ouwVar;
        this.fkw = koVar.vt;
        this.f12123le = koVar.fkw;
        this.f12122cf = blyVar;
        if (ouwVar.vt() != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = ouwVar.vt().ouw.ouw();
            this.ryl = ouwVarOuw;
            ouwVarOuw.ouw(this);
            ouwVar.ouw(this.ryl);
        }
        if (ouwVar.lh() != null) {
            this.mwh = new com.bytedance.adsdk.vt.ouw.vt.lh(this, ouwVar, ouwVar.lh());
        }
        if (koVar.f12057lh == null || koVar.yu == null) {
            this.pno = null;
            this.bly = null;
            return;
        }
        path.setFillType(koVar.ouw);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw2 = koVar.f12057lh.ouw();
        this.pno = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw3 = koVar.yu.ouw();
        this.bly = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0186ouw
    public final void ouw() {
        this.f12122cf.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i10) {
        if (this.f12123le) {
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("FillContent#draw");
        this.f12124lh.setColor((com.bytedance.adsdk.vt.le.ra.ouw((int) ((((i10 / 255.0f) * this.bly.le().intValue()) / 100.0f) * 255.0f)) << 24) | (((com.bytedance.adsdk.vt.ouw.vt.vt) this.pno).pno() & ViewCompat.MEASURED_SIZE_MASK));
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.tlj;
        if (ouwVar != null) {
            this.f12124lh.setColorFilter(ouwVar.le());
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar2 = this.ryl;
        if (ouwVar2 != null) {
            float fFloatValue = ouwVar2.le().floatValue();
            if (fFloatValue == 0.0f) {
                this.f12124lh.setMaskFilter(null);
            } else if (fFloatValue != this.ouw) {
                this.f12124lh.setMaskFilter(this.yu.vt(fFloatValue));
            }
            this.ouw = fFloatValue;
        }
        com.bytedance.adsdk.vt.ouw.vt.lh lhVar = this.mwh;
        if (lhVar != null) {
            lhVar.ouw(this.f12124lh);
        }
        this.vt.reset();
        for (int i11 = 0; i11 < this.f12125ra.size(); i11++) {
            this.vt.addPath(this.f12125ra.get(i11).yu(), matrix);
        }
        canvas.drawPath(this.vt, this.f12124lh);
        com.bytedance.adsdk.vt.fkw.vt("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        this.vt.reset();
        for (int i10 = 0; i10 < this.f12125ra.size(); i10++) {
            this.vt.addPath(this.f12125ra.get(i10).yu(), matrix);
        }
        this.vt.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            lh lhVar = list2.get(i10);
            if (lhVar instanceof mwh) {
                this.f12125ra.add((mwh) lhVar);
            }
        }
    }
}
