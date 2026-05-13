package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj extends yu {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private Path f12028cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f12029jg;
    private int mwh;

    public tlj(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        super(blyVar, fkwVar);
        this.f12028cf = null;
        this.mwh = -1;
        this.f12029jg = -1;
        if (((yu) this).ryl != null) {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
            this.mwh = (int) (tljVar.ouw * fOuw);
            this.f12029jg = (int) (tljVar.vt * fOuw);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.mwh, this.f12029jg);
            Path path = new Path();
            this.f12028cf = path;
            float f10 = fOuw * 40.0f;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.yu, com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        View view = this.vt.jae;
        if (this.mwh <= 0 || view == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ouw(i10);
        float f10 = this.tlj;
        int i11 = this.mwh;
        int i12 = this.f12029jg;
        view.layout(0, 0, i11, i12);
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setAlpha(f10);
        canvas.clipPath(this.f12028cf);
        view.draw(canvas);
        canvas.restore();
    }
}
