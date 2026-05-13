package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes9.dex */
public final class tlj implements lh {
    public final com.bytedance.adsdk.vt.lh.ouw.vt bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final boolean f12070cf;
    public final com.bytedance.adsdk.vt.lh.ouw.vt fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f12071le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f12072lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.vt pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f12073ra;
    public final boolean tlj;
    public final ouw vt;
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> yu;

    public enum ouw {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final int f12074lh;

        ouw(int i10) {
            this.f12074lh = i10;
        }

        public static ouw ouw(int i10) {
            for (ouw ouwVar : values()) {
                if (ouwVar.f12074lh == i10) {
                    return ouwVar;
                }
            }
            return null;
        }
    }

    public tlj(String str, ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar3, com.bytedance.adsdk.vt.lh.ouw.vt vtVar4, com.bytedance.adsdk.vt.lh.ouw.vt vtVar5, com.bytedance.adsdk.vt.lh.ouw.vt vtVar6, boolean z10, boolean z11) {
        this.ouw = str;
        this.vt = ouwVar;
        this.f12072lh = vtVar;
        this.yu = mwhVar;
        this.fkw = vtVar2;
        this.f12071le = vtVar3;
        this.f12073ra = vtVar4;
        this.pno = vtVar5;
        this.bly = vtVar6;
        this.tlj = z10;
        this.f12070cf = z11;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.jg(blyVar, ouwVar, this);
    }
}
