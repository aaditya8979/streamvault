package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.s;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Http2Codec.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f40491f = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", CreativeInfoManager.f51968b, "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f40492g = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", CreativeInfoManager.f51968b, "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f40493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.connection.g f40494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f40495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f40496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f40497e;

    /* JADX INFO: compiled from: Http2Codec.java */
    public class a extends com.mbridge.msdk.thrid.okio.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f40498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f40499c;

        public a(s sVar) {
            super(sVar);
            this.f40498b = false;
            this.f40499c = 0L;
        }

        private void a(IOException iOException) {
            if (this.f40498b) {
                return;
            }
            this.f40498b = true;
            f fVar = f.this;
            fVar.f40494b.a(false, fVar, this.f40499c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = d().b(cVar, j10);
                if (jB > 0) {
                    this.f40499c += jB;
                }
                return jB;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(null);
        }
    }

    public f(v vVar, t.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.f40493a = aVar;
        this.f40494b = gVar;
        this.f40495c = gVar2;
        List<w> listU = vVar.u();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f40497e = listU.contains(wVar) ? wVar : w.HTTP_2;
    }

    public static a0.a a(r rVar, w wVar) throws IOException {
        r.a aVar = new r.a();
        int iB = rVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVarA = null;
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = rVar.a(i10);
            String strB = rVar.b(i10);
            if (strA.equals(":status")) {
                kVarA = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + strB);
            } else if (!f40492g.contains(strA)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(aVar, strA, strB);
            }
        }
        if (kVarA != null) {
            return new a0.a().a(wVar).a(kVarA.f40418b).a(kVarA.f40419c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<c> b(y yVar) {
        r rVarC = yVar.c();
        ArrayList arrayList = new ArrayList(rVarC.b() + 4);
        arrayList.add(new c(c.f40460f, yVar.e()));
        arrayList.add(new c(c.f40461g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar.g())));
        String strA = yVar.a("Host");
        if (strA != null) {
            arrayList.add(new c(c.f40463i, strA));
        }
        arrayList.add(new c(c.f40462h, yVar.g().m()));
        int iB = rVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            com.mbridge.msdk.thrid.okio.f fVarC = com.mbridge.msdk.thrid.okio.f.c(rVarC.a(i10).toLowerCase(Locale.US));
            if (!f40491f.contains(fVarC.m())) {
                arrayList.add(new c(fVarC, rVarC.b(i10)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        a0.a aVarA = a(this.f40496d.j(), this.f40497e);
        if (z10 && com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(aVarA) == 100) {
            return null;
        }
        return aVarA;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f40494b;
        gVar.f40379f.responseBodyStart(gVar.f40378e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(a0Var.b("Content-Type"), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var), com.mbridge.msdk.thrid.okio.l.a(new a(this.f40496d.e())));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public com.mbridge.msdk.thrid.okio.r a(y yVar, long j10) {
        return this.f40496d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f40496d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        if (this.f40496d != null) {
            return;
        }
        i iVarA = this.f40495c.a(b(yVar), yVar.a() != null);
        this.f40496d = iVarA;
        com.mbridge.msdk.thrid.okio.t tVarH = iVarA.h();
        long jB = this.f40493a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarH.a(jB, timeUnit);
        this.f40496d.l().a(this.f40493a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f40495c.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.f40496d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }
}
