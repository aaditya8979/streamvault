package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes10.dex */
public class yu extends ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Paint f12034cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Rect f12035jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> f12036ko;
    private final Rect mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Bitmap, Bitmap> f12037rn;
    public final com.bytedance.adsdk.vt.tlj ryl;

    public yu(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        super(blyVar, fkwVar);
        this.f12034cf = new com.bytedance.adsdk.vt.ouw.ouw(3);
        this.mwh = new Rect();
        this.f12035jg = new Rect();
        this.ryl = blyVar.yu(fkwVar.f11995ra);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        if (this.ryl != null) {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            com.bytedance.adsdk.vt.tlj tljVar = this.ryl;
            rectF.set(0.0f, 0.0f, tljVar.ouw * fOuw, tljVar.vt * fOuw);
            this.ouw.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010 A[PHI: r0
      0x0010: PHI (r0v12 android.graphics.Bitmap) = (r0v4 android.graphics.Bitmap), (r0v14 android.graphics.Bitmap) binds: [B:11:0x0024, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vt(android.graphics.Canvas r5, android.graphics.Matrix r6, int r7) {
        /*
            r4 = this;
            super.vt(r5, r6, r7)
            com.bytedance.adsdk.vt.ouw.vt.ouw<android.graphics.Bitmap, android.graphics.Bitmap> r0 = r4.f12037rn
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r0 = r0.le()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L12
        L10:
            r1 = r0
            goto L2d
        L12:
            com.bytedance.adsdk.vt.lh.lh.fkw r0 = r4.f12014lh
            java.lang.String r0 = r0.f11995ra
            com.bytedance.adsdk.vt.bly r2 = r4.vt
            com.bytedance.adsdk.vt.vt.vt r2 = r2.pno()
            if (r2 == 0) goto L23
            android.graphics.Bitmap r0 = r2.ouw(r0)
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L27
            goto L10
        L27:
            com.bytedance.adsdk.vt.tlj r0 = r4.ryl
            if (r0 == 0) goto L2d
            android.graphics.Bitmap r1 = r0.f12192cf
        L2d:
            if (r1 == 0) goto L9d
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto L9d
            com.bytedance.adsdk.vt.tlj r0 = r4.ryl
            if (r0 != 0) goto L3a
            goto L9d
        L3a:
            float r0 = com.bytedance.adsdk.vt.le.pno.ouw()
            android.graphics.Paint r2 = r4.f12034cf
            r2.setAlpha(r7)
            com.bytedance.adsdk.vt.ouw.vt.ouw<android.graphics.ColorFilter, android.graphics.ColorFilter> r7 = r4.f12036ko
            if (r7 == 0) goto L52
            android.graphics.Paint r2 = r4.f12034cf
            java.lang.Object r7 = r7.le()
            android.graphics.ColorFilter r7 = (android.graphics.ColorFilter) r7
            r2.setColorFilter(r7)
        L52:
            r5.save()
            r5.concat(r6)
            android.graphics.Rect r6 = r4.mwh
            int r7 = r1.getWidth()
            int r2 = r1.getHeight()
            r3 = 0
            r6.set(r3, r3, r7, r2)
            com.bytedance.adsdk.vt.bly r6 = r4.vt
            boolean r6 = r6.f11937vm
            if (r6 == 0) goto L7e
            android.graphics.Rect r6 = r4.f12035jg
            com.bytedance.adsdk.vt.tlj r7 = r4.ryl
            int r2 = r7.ouw
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = (int) r2
            int r7 = r7.vt
            float r7 = (float) r7
            float r7 = r7 * r0
            int r7 = (int) r7
            r6.set(r3, r3, r2, r7)
            goto L91
        L7e:
            android.graphics.Rect r6 = r4.f12035jg
            int r7 = r1.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r0
            int r7 = (int) r7
            int r2 = r1.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (int) r2
            r6.set(r3, r3, r7, r0)
        L91:
            android.graphics.Rect r6 = r4.mwh
            android.graphics.Rect r7 = r4.f12035jg
            android.graphics.Paint r0 = r4.f12034cf
            r5.drawBitmap(r1, r6, r7, r0)
            r5.restore()
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.yu.vt(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
