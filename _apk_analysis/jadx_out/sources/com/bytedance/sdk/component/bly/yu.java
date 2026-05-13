package com.bytedance.sdk.component.bly;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yu extends lh {
    private float bly;
    private final Context fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final le f12519le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final int f12520lh;
    public String ouw;
    private long pno = -1;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private View.OnTouchListener f12521ra;
    private float tlj;
    private final View.OnTouchListener vt;
    private final long yu;

    public yu(Context context, View.OnTouchListener onTouchListener, int i10, long j10, le leVar) {
        this.fkw = context;
        this.vt = onTouchListener;
        this.f12520lh = i10;
        this.yu = j10;
        this.f12519le = leVar;
    }

    private void ouw(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f12520lh);
            jSONObject.put("lp_click_interval", this.yu);
        } catch (Throwable th2) {
            qbp.ouw("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th2);
        }
        if (com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw != null) {
            com.bytedance.sdk.component.bly.ouw.vt vtVar = com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw;
            le leVar = this.f12519le;
            vtVar.ouw(leVar != null ? leVar.getMaterialMeta() : null, this.ouw, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            int r0 = r15.getAction()
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "action: "
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = ", x: "
            r5 = 2
            r1[r5] = r2
            float r2 = r15.getX()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r6 = 3
            r1[r6] = r2
            r2 = 4
            java.lang.String r7 = ",y: "
            r1[r2] = r7
            float r2 = r15.getY()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7 = 5
            r1[r7] = r2
            java.lang.String r2 = "LpClickIntervalTouchListener"
            com.bytedance.sdk.component.utils.ko.vt(r2, r1)
            float r1 = r15.getX()
            float r2 = r15.getY()
            if (r0 == 0) goto L8e
            if (r0 == r4) goto L45
            goto L92
        L45:
            float r10 = r13.bly
            float r11 = r13.tlj
            android.content.Context r12 = r13.fkw
            r7 = r13
            r8 = r1
            r9 = r2
            boolean r0 = r7.ouw(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L92
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r9 = r13.pno
            r11 = -1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L7e
            int r0 = r13.f12520lh
            if (r0 != r4) goto L71
            long r9 = r7 - r9
            long r11 = r13.yu
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L6e
        L6c:
            r0 = r4
            goto L81
        L6e:
            r13.pno = r7
            goto L80
        L71:
            if (r0 != r5) goto L80
            long r9 = r7 - r9
            long r11 = r13.yu
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L7e
            r13.pno = r7
            goto L6c
        L7e:
            r13.pno = r7
        L80:
            r0 = r3
        L81:
            if (r0 == 0) goto L8a
            r15.setAction(r6)
            r13.ouw(r4, r1, r2)
            goto L92
        L8a:
            r13.ouw(r3, r1, r2)
            goto L92
        L8e:
            r13.bly = r1
            r13.tlj = r2
        L92:
            android.view.View$OnTouchListener r0 = r13.vt
            if (r0 == 0) goto L99
            r0.onTouch(r14, r15)
        L99:
            android.view.View$OnTouchListener r0 = r13.f12521ra
            if (r0 == 0) goto La0
            r0.onTouch(r14, r15)
        La0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bly.yu.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.sdk.component.bly.lh
    public final void ouw(View.OnTouchListener onTouchListener) {
        this.f12521ra = onTouchListener;
    }
}
