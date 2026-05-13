package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes2.dex */
public final class le extends com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw {
    private final com.bytedance.sdk.component.pno.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Runnable f13412le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.component.adexpress.vt.mwh f13413lh;
    private com.bytedance.sdk.component.adexpress.vt.ra yu;

    public le(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.fkw.pno pnoVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar, com.bytedance.sdk.component.adexpress.dynamic.le.ouw ouwVar) {
        super(context, themeStatusBroadcastReceiver, z10, pnoVar, mwhVar, ouwVar);
        this.fkw = new com.bytedance.sdk.component.pno.pno("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.bly.le.1
            @Override // java.lang.Runnable
            public final void run() {
                le.this.f13413lh.ouw();
                com.bytedance.sdk.openadsdk.core.jg.lh().post(le.this.f13412le);
            }
        };
        this.f13412le = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.le.2
            @Override // java.lang.Runnable
            public final void run() {
                if (le.this.yu != null) {
                    le leVar = le.this;
                    le.super.ouw(leVar.yu);
                }
            }
        };
        this.f13413lh = mwhVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw
    public final void ouw() {
        super.ouw();
        com.bytedance.sdk.openadsdk.core.jg.lh().removeCallbacks(this.f13412le);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw, com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.yu = raVar;
        bs.vt(this.fkw);
    }
}
