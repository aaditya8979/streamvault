package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class yu implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f12260cf;
    private boolean fkw = true;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f12261le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private float f12262lh;
    private float ouw;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f12263ra;
    private int tlj;
    private float vt;
    private float yu;

    public yu(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i10, boolean z10) {
        this.bly = pnoVar;
        this.tlj = i10;
        this.f12260cf = z10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ouw = motionEvent.getX();
            this.vt = motionEvent.getY();
            this.f12261le = motionEvent.getY();
            this.fkw = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f12263ra = y10;
                if (Math.abs(y10 - this.f12261le) > 10.0f) {
                    this.pno = true;
                }
                this.yu = motionEvent.getX();
                this.f12262lh = motionEvent.getY();
                if (Math.abs(this.yu - this.ouw) > 8.0f || Math.abs(this.f12262lh - this.vt) > 8.0f) {
                    this.fkw = false;
                }
            }
        } else {
            if (!this.pno && !this.fkw) {
                return false;
            }
            if (this.f12260cf || (pnoVar3 = this.bly) == null) {
                int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(this.f12263ra - this.f12261le));
                if (this.f12263ra - this.f12261le < 0.0f && iVt > this.tlj && (pnoVar2 = this.bly) != null) {
                    pnoVar2.ouw();
                } else if (this.fkw && (pnoVar = this.bly) != null) {
                    pnoVar.ouw();
                }
            } else {
                pnoVar3.ouw();
            }
        }
        return true;
    }
}
