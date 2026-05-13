package com.bytedance.sdk.component.fkw.lh;

import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.ra;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yu<T> implements cf {
    private boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f12583cf;
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12584le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private T f12585lh;
    private String ouw;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Map<String, String> f12586ra;
    private ra tlj;
    private String vt;
    private T yu;

    @Override // com.bytedance.sdk.component.fkw.cf
    public final boolean fkw() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final boolean le() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final T lh() {
        return this.yu;
    }

    public final yu ouw(lh lhVar, T t10, Map<String, String> map, boolean z10) {
        this.f12586ra = map;
        this.pno = z10;
        this.f12585lh = t10;
        this.ouw = lhVar.vt;
        this.vt = lhVar.ouw;
        this.fkw = lhVar.f12543ra;
        this.f12584le = lhVar.pno;
        this.bly = lhVar.qbp;
        this.tlj = lhVar.zin;
        this.f12583cf = lhVar.vpp;
        return this;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final String ouw() {
        return this.vt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.fkw.cf
    public final void ouw(Object obj) {
        this.yu = this.f12585lh;
        this.f12585lh = obj;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final int ra() {
        return this.f12583cf;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final T vt() {
        return this.f12585lh;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final Map<String, String> yu() {
        return this.f12586ra;
    }
}
