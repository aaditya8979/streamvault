package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import com.bytedance.adsdk.ugeno.yu.mwh;

/* JADX INFO: loaded from: classes12.dex */
public final class bly extends lh {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public mwh f11906cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f11907jg;
    private float mwh;
    private float ryl;

    public bly(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ouw(java.lang.Object... r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lac
            int r1 = r9.length
            if (r1 > 0) goto L8
            goto Lac
        L8:
            r9 = r9[r0]
            android.view.MotionEvent r9 = (android.view.MotionEvent) r9
            com.bytedance.adsdk.ugeno.yu.mwh r1 = r8.f11906cf
            if (r1 == 0) goto L19
            com.bytedance.adsdk.ugeno.vt.lh r0 = r8.vt
            com.bytedance.adsdk.ugeno.yu.cf r2 = r8.ouw
            boolean r9 = r1.ouw(r0, r9, r2, r8)
            return r9
        L19:
            int r1 = r9.getAction()
            r2 = 1
            if (r1 == 0) goto L9f
            r3 = 1097859072(0x41700000, float:15.0)
            if (r1 == r2) goto L50
            r4 = 2
            if (r1 == r4) goto L2f
            r4 = 3
            if (r1 == r4) goto L2c
            goto Lab
        L2c:
            r8.f11907jg = r0
            goto L50
        L2f:
            float r0 = r9.getRawX()
            float r9 = r9.getRawY()
            float r1 = r8.ryl
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L4d
            float r0 = r8.mwh
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 < 0) goto Lab
        L4d:
            r8.f11907jg = r2
            goto Lab
        L50:
            boolean r1 = r8.f11907jg
            java.lang.String r4 = "Non-tap event"
            java.lang.String r5 = "GesThrough_UGTapEvent"
            r6 = 0
            if (r1 == 0) goto L63
            r8.f11907jg = r0
            r8.ryl = r6
            r8.mwh = r6
            android.util.Log.d(r5, r4)
            return r0
        L63:
            float r1 = r9.getRawX()
            float r9 = r9.getRawY()
            float r7 = r8.ryl
            float r1 = r1 - r7
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L99
            float r1 = r8.mwh
            float r9 = r9 - r1
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 < 0) goto L82
            goto L99
        L82:
            java.lang.String r9 = "Tap event, direct handling"
            android.util.Log.d(r5, r9)
            com.bytedance.adsdk.ugeno.yu.cf r9 = r8.ouw
            if (r9 == 0) goto Lab
            java.lang.String r0 = r8.f11914le
            com.bytedance.adsdk.ugeno.yu.le r1 = r8.f11915lh
            java.util.List<com.bytedance.adsdk.ugeno.yu.le$ouw> r1 = r1.vt
            r9.ouw(r0, r1)
            r8.ryl = r6
            r8.mwh = r6
            goto Lab
        L99:
            r8.f11907jg = r0
            android.util.Log.d(r5, r4)
            return r0
        L9f:
            float r0 = r9.getRawX()
            r8.ryl = r0
            float r9 = r9.getRawY()
            r8.mwh = r9
        Lab:
            return r2
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.yu.yu.bly.ouw(java.lang.Object[]):boolean");
    }
}
