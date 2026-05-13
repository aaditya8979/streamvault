package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class le implements View.OnTouchListener {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f12245lh = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno fkw;
    private float ouw;
    private float vt;
    private boolean yu;

    public le(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar) {
        this.fkw = pnoVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ouw = motionEvent.getX();
            this.vt = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.ouw) >= f12245lh || Math.abs(y10 - this.vt) >= f12245lh) {
                    this.yu = true;
                }
            } else if (action == 3) {
                this.yu = false;
            }
        } else {
            if (this.yu) {
                this.yu = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.ouw) >= f12245lh || Math.abs(y11 - this.vt) >= f12245lh) {
                this.yu = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar = this.fkw;
                if (pnoVar != null) {
                    pnoVar.ouw();
                }
            }
        }
        return true;
    }
}
