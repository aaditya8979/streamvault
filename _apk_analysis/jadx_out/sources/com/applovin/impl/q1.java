package com.applovin.impl;

/* JADX INFO: loaded from: classes7.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y2 f9651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f9652d;

    public q1(Object obj, long j10) {
        this.f9649a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f9652d = bVar;
            this.f9650b = bVar.getAdZone().d() != null ? this.f9652d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.f9651c = y2Var;
            this.f9650b = y2Var.getFormat().getLabel();
        }
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f9652d;
        return bVar != null ? bVar : this.f9651c;
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f9652d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.f9651c = (y2) obj;
        }
    }

    public long b() {
        return this.f9649a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f9652d;
    }

    public String d() {
        String str = this.f9650b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.f9651c;
    }

    public String f() {
        if (this.f9652d != null) {
            return "AppLovin";
        }
        y2 y2Var = this.f9651c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }
}
