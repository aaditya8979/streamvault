package com.bytedance.sdk.openadsdk.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.mwh.yu.ouw;

/* JADX INFO: loaded from: classes3.dex */
public final class cd implements Handler.Callback, ouw.InterfaceC0239ouw {
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f14311cf;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f14313lh;
    private final com.bytedance.sdk.openadsdk.core.model.vpp pno;
    private int ryl;
    private boolean tlj;
    public boolean vt;
    public boolean yu;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f14312le = 1.0f;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f14314ra = 1000;
    public final Handler ouw = new Handler(Looper.getMainLooper(), this);
    public int fkw = 0;

    public cd(@NonNull com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, @NonNull com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        this.f14311cf = 0;
        this.ryl = 0;
        this.bly = ouwVar;
        this.pno = vppVar;
        if (vppVar.ey()) {
            if (vppVar.ng() >= 0) {
                this.ryl = vppVar.ng();
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                this.ryl = com.bytedance.sdk.openadsdk.core.settings.cf.ra(String.valueOf(vppVar.fqk()));
            }
        } else if (vppVar.rrs()) {
            if (vppVar.myk() >= 0) {
                this.ryl = vppVar.myk();
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                this.ryl = com.bytedance.sdk.openadsdk.core.settings.cf.jg(String.valueOf(vppVar.fqk()));
            }
        }
        this.f14311cf = (int) ouwVar.ex.zin();
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "totalTime: " + this.f14311cf + ", skipTime=" + this.ryl);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(@androidx.annotation.NonNull android.os.Message r9) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.cd.handleMessage(android.os.Message):boolean");
    }

    public final void ouw() {
        if (this.vt) {
            this.ouw.removeMessages(1024);
            this.ouw.sendEmptyMessage(1024);
            this.f14313lh = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0239ouw
    public final void ouw(int i10) {
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i10)));
        if (i10 == 1) {
            ouw();
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                vt();
                return;
            }
            return;
        }
        if (!this.vt || this.f14313lh) {
            return;
        }
        this.ouw.removeMessages(1024);
        this.f14313lh = true;
    }

    public final void vt() {
        this.ouw.removeMessages(1024);
        this.vt = false;
        this.yu = true;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ex.zih();
        }
    }
}
