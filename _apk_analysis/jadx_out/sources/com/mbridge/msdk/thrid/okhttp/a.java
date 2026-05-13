package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: Address.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f40144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f40145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SocketFactory f40146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f40147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<w> f40148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<j> f40149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f40150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Proxy f40151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SSLSocketFactory f40152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HostnameVerifier f40153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f40154k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f40144a = new s.a().f(sSLSocketFactory != null ? "https" : "http").b(str).a(i10).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f40145b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f40146c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f40147d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f40148e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f40149f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f40150g = proxySelector;
        this.f40151h = proxy;
        this.f40152i = sSLSocketFactory;
        this.f40153j = hostnameVerifier;
        this.f40154k = fVar;
    }

    public f a() {
        return this.f40154k;
    }

    public boolean a(a aVar) {
        return this.f40145b.equals(aVar.f40145b) && this.f40147d.equals(aVar.f40147d) && this.f40148e.equals(aVar.f40148e) && this.f40149f.equals(aVar.f40149f) && this.f40150g.equals(aVar.f40150g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40151h, aVar.f40151h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40152i, aVar.f40152i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40153j, aVar.f40153j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40154k, aVar.f40154k) && k().j() == aVar.k().j();
    }

    public List<j> b() {
        return this.f40149f;
    }

    public n c() {
        return this.f40145b;
    }

    public HostnameVerifier d() {
        return this.f40153j;
    }

    public List<w> e() {
        return this.f40148e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f40144a.equals(aVar.f40144a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public Proxy f() {
        return this.f40151h;
    }

    public b g() {
        return this.f40147d;
    }

    public ProxySelector h() {
        return this.f40150g;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f40144a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f40145b.hashCode()) * 31) + this.f40147d.hashCode()) * 31) + this.f40148e.hashCode()) * 31) + this.f40149f.hashCode()) * 31) + this.f40150g.hashCode()) * 31;
        Proxy proxy = this.f40151h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f40152i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f40153j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f40154k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f40146c;
    }

    public SSLSocketFactory j() {
        return this.f40152i;
    }

    public s k() {
        return this.f40144a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f40144a.g());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(this.f40144a.j());
        if (this.f40151h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f40151h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f40150g);
        }
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e);
        return sb2.toString();
    }
}
