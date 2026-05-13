package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* JADX INFO: compiled from: ConnectionJavaSocket.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f35900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f35901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f35902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f35903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f35904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f35905f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f35900a = aVar;
        this.f35901b = aVar2;
        this.f35902c = aVar3;
        this.f35905f = aVar2.b();
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f35901b.a(str);
        this.f35901b.c(i10);
        this.f35901b.a(i11);
        this.f35901b.b(2);
        return this.f35901b;
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f35900a, this.f35901b, this.f35902c);
        this.f35904e = bVar;
        bVar.c(str);
        this.f35904e.a(this.f35903d);
        c.a().a(this.f35904e, this.f35905f);
        return this.f35901b;
    }

    public void a() {
        b bVar = this.f35904e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f35903d = aVar;
    }
}
