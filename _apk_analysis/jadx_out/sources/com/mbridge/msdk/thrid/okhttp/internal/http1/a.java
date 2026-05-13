package com.mbridge.msdk.thrid.okhttp.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Http1Codec.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f40420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.connection.g f40421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.e f40422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.d f40423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40424e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f40425f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: compiled from: Http1Codec.java */
    public abstract class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f40426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f40427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f40428c;

        private b() {
            this.f40426a = new i(a.this.f40422c.b());
            this.f40428c = 0L;
        }

        public final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f40424e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException("state: " + a.this.f40424e);
            }
            aVar.a(this.f40426a);
            a aVar2 = a.this;
            aVar2.f40424e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.f40421b;
            if (gVar != null) {
                gVar.a(!z10, aVar2, this.f40428c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = a.this.f40422c.b(cVar, j10);
                if (jB > 0) {
                    this.f40428c += jB;
                }
                return jB;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f40426a;
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f40430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f40431b;

        public c() {
            this.f40430a = new i(a.this.f40423d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f40431b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f40423d.a(j10);
            a.this.f40423d.a("\r\n");
            a.this.f40423d.a(cVar, j10);
            a.this.f40423d.a("\r\n");
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f40430a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f40431b) {
                return;
            }
            this.f40431b = true;
            a.this.f40423d.a("0\r\n\r\n");
            a.this.a(this.f40430a);
            a.this.f40424e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f40431b) {
                return;
            }
            a.this.f40423d.flush();
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okhttp.s f40433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f40434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f40435g;

        public d(com.mbridge.msdk.thrid.okhttp.s sVar) {
            super();
            this.f40434f = -1L;
            this.f40435g = true;
            this.f40433e = sVar;
        }

        private void d() throws IOException {
            if (this.f40434f != -1) {
                a.this.f40422c.c();
            }
            try {
                this.f40434f = a.this.f40422c.i();
                String strTrim = a.this.f40422c.c().trim();
                if (this.f40434f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f40434f + strTrim + "\"");
                }
                if (this.f40434f == 0) {
                    this.f40435g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.f40420a.i(), this.f40433e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f40427b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f40435g) {
                return -1L;
            }
            long j11 = this.f40434f;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f40435g) {
                    return -1L;
                }
            }
            long jB = super.b(cVar, Math.min(j10, this.f40434f));
            if (jB != -1) {
                this.f40434f -= jB;
                return jB;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f40427b) {
                return;
            }
            if (this.f40435g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f40427b = true;
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public final class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f40437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f40438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40439c;

        public e(long j10) {
            this.f40437a = new i(a.this.f40423d.b());
            this.f40439c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f40438b) {
                throw new IllegalStateException("closed");
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j10);
            if (j10 <= this.f40439c) {
                a.this.f40423d.a(cVar, j10);
                this.f40439c -= j10;
                return;
            }
            throw new ProtocolException("expected " + this.f40439c + " bytes but received " + j10);
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f40437a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f40438b) {
                return;
            }
            this.f40438b = true;
            if (this.f40439c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f40437a);
            a.this.f40424e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f40438b) {
                return;
            }
            a.this.f40423d.flush();
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f40441e;

        public f(long j10) throws IOException {
            super();
            this.f40441e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f40427b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f40441e;
            if (j11 == 0) {
                return -1L;
            }
            long jB = super.b(cVar, Math.min(j11, j10));
            if (jB == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f40441e - jB;
            this.f40441e = j12;
            if (j12 == 0) {
                a(true, null);
            }
            return jB;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f40427b) {
                return;
            }
            if (this.f40441e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f40427b = true;
        }
    }

    /* JADX INFO: compiled from: Http1Codec.java */
    public class g extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f40443e;

        public g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f40427b) {
                throw new IllegalStateException("closed");
            }
            if (this.f40443e) {
                return -1L;
            }
            long jB = super.b(cVar, j10);
            if (jB != -1) {
                return jB;
            }
            this.f40443e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f40427b) {
                return;
            }
            if (!this.f40443e) {
                a(false, null);
            }
            this.f40427b = true;
        }
    }

    public a(v vVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.f40420a = vVar;
        this.f40421b = gVar;
        this.f40422c = eVar;
        this.f40423d = dVar;
    }

    private String e() throws IOException {
        String strD = this.f40422c.d(this.f40425f);
        this.f40425f -= (long) strD.length();
        return strD;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        int i10 = this.f40424e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f40424e);
        }
        try {
            k kVarA = k.a(e());
            a0.a aVarA = new a0.a().a(kVarA.f40417a).a(kVarA.f40418b).a(kVarA.f40419c).a(f());
            if (z10 && kVarA.f40418b == 100) {
                return null;
            }
            if (kVarA.f40418b == 100) {
                this.f40424e = 3;
                return aVarA;
            }
            this.f40424e = 4;
            return aVarA;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f40421b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f40421b;
        gVar.f40379f.responseBodyStart(gVar.f40378e);
        String strB = a0Var.b("Content-Type");
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(a0Var)) {
            return new h(strB, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) {
            return new h(strB, -1L, l.a(a(a0Var.s().g())));
        }
        long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var);
        return jA != -1 ? new h(strB, jA, l.a(b(jA))) : new h(strB, -1L, l.a(d()));
    }

    public r a(long j10) {
        if (this.f40424e == 1) {
            this.f40424e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f40424e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j10 != -1) {
            return a(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public s a(com.mbridge.msdk.thrid.okhttp.s sVar) throws IOException {
        if (this.f40424e == 4) {
            this.f40424e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f40424e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f40423d.flush();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.r rVar, String str) throws IOException {
        if (this.f40424e != 0) {
            throw new IllegalStateException("state: " + this.f40424e);
        }
        this.f40423d.a(str).a("\r\n");
        int iB = rVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            this.f40423d.a(rVar.a(i10)).a(": ").a(rVar.b(i10)).a("\r\n");
        }
        this.f40423d.a("\r\n");
        this.f40424e = 1;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        a(yVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar, this.f40421b.c().c().b().type()));
    }

    public void a(i iVar) {
        t tVarG = iVar.g();
        iVar.a(t.f40881d);
        tVarG.a();
        tVarG.b();
    }

    public s b(long j10) throws IOException {
        if (this.f40424e == 4) {
            this.f40424e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f40424e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f40423d.flush();
    }

    public r c() {
        if (this.f40424e == 1) {
            this.f40424e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f40424e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVarC = this.f40421b.c();
        if (cVarC != null) {
            cVarC.d();
        }
    }

    public s d() throws IOException {
        if (this.f40424e != 4) {
            throw new IllegalStateException("state: " + this.f40424e);
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f40421b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f40424e = 5;
        gVar.e();
        return new g();
    }

    public com.mbridge.msdk.thrid.okhttp.r f() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String strE = e();
            if (strE.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(aVar, strE);
        }
    }
}
