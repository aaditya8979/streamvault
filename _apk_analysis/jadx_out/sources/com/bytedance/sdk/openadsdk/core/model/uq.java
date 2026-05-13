package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.fak;

/* JADX INFO: loaded from: classes4.dex */
public final class uq {
    public boolean bly;
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f13744le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f13745lh;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f13746ra;
    public long tlj;
    public long vt;
    public long yu;
    public fak ouw = fak.vt();

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private fak f13743cf = fak.vt();

    public final void ouw(fak fakVar) {
        this.f13743cf = fakVar;
        this.f13744le = fakVar.ouw(this.ouw);
    }

    public final void ouw(fak fakVar, fak fakVar2, int i10, fak fakVar3) {
        this.vt = fakVar.ouw(this.ouw);
        this.f13745lh = fakVar2.ouw(fakVar);
        this.yu = i10;
        this.fkw = fakVar3.ouw(fakVar2);
    }
}
