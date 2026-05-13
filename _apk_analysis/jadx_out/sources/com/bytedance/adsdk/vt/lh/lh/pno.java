package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes12.dex */
public final class pno extends ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final RectF f12023cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Path f12024jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final fkw f12025ko;
    private final float[] mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> f12026rn;
    private final Paint ryl;

    public pno(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        super(blyVar, fkwVar);
        this.f12023cf = new RectF();
        com.bytedance.adsdk.vt.ouw.ouw ouwVar = new com.bytedance.adsdk.vt.ouw.ouw();
        this.ryl = ouwVar;
        this.mwh = new float[8];
        this.f12024jg = new Path();
        this.f12025ko = fkwVar;
        ouwVar.setAlpha(0);
        ouwVar.setStyle(Paint.Style.FILL);
        ouwVar.setColor(fkwVar.ryl);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        RectF rectF2 = this.f12023cf;
        fkw fkwVar = this.f12025ko;
        rectF2.set(0.0f, 0.0f, fkwVar.tlj, fkwVar.f11990cf);
        this.ouw.mapRect(this.f12023cf);
        rectF.set(this.f12023cf);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        super.vt(canvas, matrix, i10);
        int iAlpha = Color.alpha(this.f12025ko.ryl);
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.fkw.fkw == null ? 100 : r1.le().intValue())) / 100.0f) * 255.0f);
        this.ryl.setAlpha(iIntValue);
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.f12026rn;
        if (ouwVar != null) {
            this.ryl.setColorFilter(ouwVar.le());
        }
        if (iIntValue > 0) {
            float[] fArr = this.mwh;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fkw fkwVar = this.f12025ko;
            int i11 = fkwVar.tlj;
            fArr[2] = i11;
            fArr[3] = 0.0f;
            fArr[4] = i11;
            int i12 = fkwVar.f11990cf;
            fArr[5] = i12;
            fArr[6] = 0.0f;
            fArr[7] = i12;
            matrix.mapPoints(fArr);
            this.f12024jg.reset();
            Path path = this.f12024jg;
            float[] fArr2 = this.mwh;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.f12024jg;
            float[] fArr3 = this.mwh;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.f12024jg;
            float[] fArr4 = this.mwh;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.f12024jg;
            float[] fArr5 = this.mwh;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.f12024jg;
            float[] fArr6 = this.mwh;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.f12024jg.close();
            canvas.drawPath(this.f12024jg, this.ryl);
        }
    }
}
