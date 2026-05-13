package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes9.dex */
public final class cf implements lh {
    public final boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> f12051lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> vt;
    public final com.bytedance.adsdk.vt.lh.ouw.vt yu;

    public cf(String str, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, boolean z10) {
        this.ouw = str;
        this.vt = mwhVar;
        this.f12051lh = mwhVar2;
        this.yu = vtVar;
        this.fkw = z10;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.ko(blyVar, ouwVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.vt + ", size=" + this.f12051lh + '}';
    }
}
