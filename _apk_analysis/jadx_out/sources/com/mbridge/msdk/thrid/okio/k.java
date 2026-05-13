package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: InflaterSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f40853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f40854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40856d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f40853a = eVar;
        this.f40854b = inflater;
    }

    private void h() throws IOException {
        int i10 = this.f40855c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f40854b.getRemaining();
        this.f40855c -= remaining;
        this.f40853a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f40856d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f40854b.inflate(oVarB.f40870a, oVarB.f40872c, (int) Math.min(j10, 8192 - oVarB.f40872c));
                if (iInflate > 0) {
                    oVarB.f40872c += iInflate;
                    long j11 = iInflate;
                    cVar.f40838b += j11;
                    return j11;
                }
                if (!this.f40854b.finished() && !this.f40854b.needsDictionary()) {
                }
                h();
                if (oVarB.f40871b != oVarB.f40872c) {
                    return -1L;
                }
                cVar.f40837a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f40853a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f40856d) {
            return;
        }
        this.f40854b.end();
        this.f40856d = true;
        this.f40853a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f40854b.needsInput()) {
            return false;
        }
        h();
        if (this.f40854b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f40853a.f()) {
            return true;
        }
        o oVar = this.f40853a.a().f40837a;
        int i10 = oVar.f40872c;
        int i11 = oVar.f40871b;
        int i12 = i10 - i11;
        this.f40855c = i12;
        this.f40854b.setInput(oVar.f40870a, i11, i12);
        return false;
    }
}
