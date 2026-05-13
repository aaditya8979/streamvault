package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: H5ShowRewardListener.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f41357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f41358d;

    public c(com.mbridge.msdk.video.bt.module.listener.b bVar, String str) {
        this.f41357c = bVar;
        this.f41358d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        if (this.f41357c != null) {
            q0.a("H5ShowRewardListener", "onAutoLoad");
            this.f41357c.a(this.f41358d, i10, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f41357c != null) {
            q0.a("H5ShowRewardListener", "onAdShow");
            this.f41357c.a(this.f41358d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        if (this.f41357c != null) {
            q0.a("H5ShowRewardListener", "onShowFail");
            this.f41357c.a(this.f41358d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        if (this.f41357c != null) {
            q0.a("H5ShowRewardListener", "onAdClose");
            this.f41357c.a(this.f41358d, z10, cVar2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        if (this.f41357c != null) {
            q0.a("H5ShowRewardListener", "onEndcardShow");
            this.f41357c.c(this.f41358d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        if (this.f41357c != null) {
            q0.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f41357c.b(this.f41358d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        if (this.f41357c != null) {
            q0.a("H5ShowRewardListener", "onVideoComplete");
            this.f41357c.a(this.f41358d, str, str2);
        }
    }
}
