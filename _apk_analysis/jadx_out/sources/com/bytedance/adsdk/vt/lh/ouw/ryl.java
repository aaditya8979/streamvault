package com.bytedance.adsdk.vt.lh.ouw;

import android.graphics.PointF;
import com.bytedance.adsdk.vt.ouw.vt.rn;

/* JADX INFO: loaded from: classes12.dex */
public final class ryl implements com.bytedance.adsdk.vt.lh.vt.lh {
    public final vt bly;
    public final yu fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final vt f12040le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final ra f12041lh;
    public final fkw ouw;
    public final vt pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final vt f12042ra;
    public final mwh<PointF, PointF> vt;
    public final vt yu;

    public ryl() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public ryl(fkw fkwVar, mwh<PointF, PointF> mwhVar, ra raVar, vt vtVar, yu yuVar, vt vtVar2, vt vtVar3, vt vtVar4, vt vtVar5) {
        this.ouw = fkwVar;
        this.vt = mwhVar;
        this.f12041lh = raVar;
        this.yu = vtVar;
        this.fkw = yuVar;
        this.pno = vtVar2;
        this.bly = vtVar3;
        this.f12040le = vtVar4;
        this.f12042ra = vtVar5;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return null;
    }

    public final rn ouw() {
        return new rn(this);
    }
}
