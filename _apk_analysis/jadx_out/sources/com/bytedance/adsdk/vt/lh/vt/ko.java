package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.Path;

/* JADX INFO: loaded from: classes9.dex */
public final class ko implements lh {
    public final boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final boolean f12056le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.ouw f12057lh;
    public final Path.FillType ouw;
    public final String vt;
    public final com.bytedance.adsdk.vt.lh.ouw.yu yu;

    public ko(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, boolean z11) {
        this.vt = str;
        this.f12056le = z10;
        this.ouw = fillType;
        this.f12057lh = ouwVar;
        this.yu = yuVar;
        this.fkw = z11;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.ra(blyVar, ouwVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f12056le + '}';
    }
}
