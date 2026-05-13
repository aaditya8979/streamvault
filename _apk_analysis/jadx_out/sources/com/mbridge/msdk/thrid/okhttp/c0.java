package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: Route.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f40207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f40208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f40209c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f40207a = aVar;
        this.f40208b = proxy;
        this.f40209c = inetSocketAddress;
    }

    public a a() {
        return this.f40207a;
    }

    public Proxy b() {
        return this.f40208b;
    }

    public boolean c() {
        return this.f40207a.f40152i != null && this.f40208b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f40209c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (c0Var.f40207a.equals(this.f40207a) && c0Var.f40208b.equals(this.f40208b) && c0Var.f40209c.equals(this.f40209c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f40207a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f40208b.hashCode()) * 31) + this.f40209c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f40209c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
