package com.bytedance.adsdk.vt.lh.vt;

/* JADX INFO: loaded from: classes2.dex */
public final class zih implements lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f12081lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.pno vt;
    private final int yu;

    public zih(String str, int i10, com.bytedance.adsdk.vt.lh.ouw.pno pnoVar, boolean z10) {
        this.ouw = str;
        this.yu = i10;
        this.vt = pnoVar;
        this.f12081lh = z10;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.vm(blyVar, ouwVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.ouw + ", index=" + this.yu + '}';
    }
}
