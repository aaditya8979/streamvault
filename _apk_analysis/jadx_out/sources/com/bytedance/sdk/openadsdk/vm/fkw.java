package com.bytedance.sdk.openadsdk.vm;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.jg;

/* JADX INFO: loaded from: classes3.dex */
final class fkw implements yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f14394lh;
    private yu ouw;
    private int vt;
    private int yu;

    public fkw(yu yuVar, int i10, int i11, int i12) {
        this.ouw = yuVar;
        this.vt = i10;
        this.f14394lh = i11;
        this.yu = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.yu
    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVarOuw = this.ouw.ouw();
        ouwVarOuw.vt = BuildConfig.VERSION_NAME;
        ouwVarOuw.yu = this.vt;
        ouwVarOuw.fkw = this.f14394lh;
        ouwVarOuw.f14400le = this.yu;
        ouwVarOuw.f14399cf = bly.ouw().ra();
        ouwVarOuw.ryl = jg.yu();
        return ouwVarOuw;
    }
}
