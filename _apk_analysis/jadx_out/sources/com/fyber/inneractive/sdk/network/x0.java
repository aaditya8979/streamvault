package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f17084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f17085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f17086r;

    public x0(e eVar, String str, String str2) {
        super(eVar, g0.f16977c.a(), null);
        this.f17086r = new AtomicInteger();
        this.f17085q = str;
        this.f17084p = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        try {
            o0 o0Var = new o0();
            o0Var.f17012a = String.valueOf(i10);
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse event network request", e10, new Object[0]);
            throw new n0(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        byte[] bArr = new byte[0];
        try {
            IAlog.a("NetworkRequestEvent: network request body %s", this.f17084p);
            return this.f17084p.getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f17086r.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f17085q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f17086r.getAndIncrement() < 4;
    }
}
