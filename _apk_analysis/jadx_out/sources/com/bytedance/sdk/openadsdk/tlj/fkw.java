package com.bytedance.sdk.openadsdk.tlj;

import com.bytedance.sdk.component.fkw.bly;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;

/* JADX INFO: loaded from: classes12.dex */
public final class fkw implements th {
    private static int ouw;
    private final String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private long f14289lh;
    private long vt = 0;
    private boolean yu;

    public fkw() {
        ouw++;
        this.fkw = "image_request_" + ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.th
    public final void ouw(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.vt;
        this.f14289lh += jCurrentTimeMillis;
        ko.vt("ImageLoaderStep", this.fkw + " end:" + str + ",cost：" + jCurrentTimeMillis + " ms， total：" + this.f14289lh + "\r\n");
    }

    @Override // com.bytedance.sdk.component.fkw.th
    public final void ouw(String str, bly blyVar) {
        if (!this.yu) {
            ko.vt("ImageLoaderStep", "start " + this.fkw + " request:" + blyVar.ouw() + ", width:" + blyVar.vt() + ",height:" + blyVar.lh());
            this.yu = true;
        }
        this.vt = System.currentTimeMillis();
        ko.vt("ImageLoaderStep", this.fkw + " start:" + str);
    }
}
