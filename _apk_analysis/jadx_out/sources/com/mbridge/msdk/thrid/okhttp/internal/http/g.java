package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: RealInterceptorChain.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t> f40397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g f40398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f40399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c f40400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f40402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f40403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f40404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f40405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f40406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f40407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f40408l;

    public g(List<t> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i10, y yVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, int i11, int i12, int i13) {
        this.f40397a = list;
        this.f40400d = cVar2;
        this.f40398b = gVar;
        this.f40399c = cVar;
        this.f40401e = i10;
        this.f40402f = yVar;
        this.f40403g = dVar;
        this.f40404h = oVar;
        this.f40405i = i11;
        this.f40406j = i12;
        this.f40407k = i13;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int a() {
        return this.f40405i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public a0 a(y yVar) throws IOException {
        return a(yVar, this.f40398b, this.f40399c, this.f40400d);
    }

    public a0 a(y yVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) throws IOException {
        if (this.f40401e >= this.f40397a.size()) {
            throw new AssertionError();
        }
        this.f40408l++;
        if (this.f40399c != null && !this.f40400d.a(yVar.g())) {
            throw new IllegalStateException("network interceptor " + this.f40397a.get(this.f40401e - 1) + " must retain the same host and port");
        }
        if (this.f40399c != null && this.f40408l > 1) {
            throw new IllegalStateException("network interceptor " + this.f40397a.get(this.f40401e - 1) + " must call proceed() exactly once");
        }
        g gVar2 = new g(this.f40397a, gVar, cVar, cVar2, this.f40401e + 1, yVar, this.f40403g, this.f40404h, this.f40405i, this.f40406j, this.f40407k);
        t tVar = this.f40397a.get(this.f40401e);
        a0 a0VarA = tVar.a(gVar2);
        if (cVar != null && this.f40401e + 1 < this.f40397a.size() && gVar2.f40408l != 1) {
            throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
        }
        if (a0VarA == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        if (a0VarA.d() != null) {
            return a0VarA;
        }
        throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int b() {
        return this.f40406j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int c() {
        return this.f40407k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public y d() {
        return this.f40402f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.f40403g;
    }

    public com.mbridge.msdk.thrid.okhttp.h f() {
        return this.f40400d;
    }

    public o g() {
        return this.f40404h;
    }

    public c h() {
        return this.f40399c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.f40398b;
    }
}
