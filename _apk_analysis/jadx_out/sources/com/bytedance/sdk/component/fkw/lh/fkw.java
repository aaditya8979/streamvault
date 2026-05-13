package com.bytedance.sdk.component.fkw.lh;

import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.ryl;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.fkw.zih;
import com.bytedance.sdk.component.fkw.zin;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public final class fkw implements mwh {
    private zin bly;
    private vm fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.lh f12526le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.yu f12527lh;
    private ryl ouw;
    private qbp pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.vt f12528ra;
    private boolean tlj;
    private ExecutorService vt;
    private zih yu;

    public static class ouw {
        public zin bly;
        public vm fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.lh f12529le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.yu f12530lh;
        public ryl ouw;
        public qbp pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.vt f12531ra;
        public boolean tlj;
        public ExecutorService vt;
        public zih yu;
    }

    private fkw(ouw ouwVar) {
        this.ouw = ouwVar.ouw;
        this.vt = ouwVar.vt;
        this.f12527lh = ouwVar.f12530lh;
        this.yu = ouwVar.yu;
        this.fkw = ouwVar.fkw;
        this.f12526le = ouwVar.f12529le;
        this.f12528ra = ouwVar.f12531ra;
        this.pno = ouwVar.pno;
        this.bly = ouwVar.bly;
        this.tlj = ouwVar.tlj;
    }

    public /* synthetic */ fkw(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final zin bly() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final zih fkw() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final vm le() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final qbp lh() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final ryl ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final com.bytedance.sdk.component.fkw.vt pno() {
        return this.f12528ra;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final com.bytedance.sdk.component.fkw.lh ra() {
        return this.f12526le;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final boolean tlj() {
        return this.tlj;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final ExecutorService vt() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final com.bytedance.sdk.component.fkw.yu yu() {
        return this.f12527lh;
    }
}
