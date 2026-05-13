package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: RealBufferedSink.java */
/* JADX INFO: loaded from: classes2.dex */
final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f40863a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f40864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40865c;

    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f40864b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f40863a;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.a(j10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.a(str);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f40864b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f40865c) {
            return;
        }
        Throwable th2 = null;
        try {
            c cVar = this.f40863a;
            long j10 = cVar.f40838b;
            if (j10 > 0) {
                this.f40864b.a(cVar, j10);
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f40864b.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.f40865c = true;
        if (th2 != null) {
            u.a(th2);
        }
    }

    public d d() throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f40863a.m();
        if (jM > 0) {
            this.f40864b.a(this.f40863a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f40863a;
        long j10 = cVar.f40838b;
        if (j10 > 0) {
            this.f40864b.a(cVar, j10);
        }
        this.f40864b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f40865c;
    }

    public String toString() {
        return "buffer(" + this.f40864b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f40863a.write(byteBuffer);
        d();
        return iWrite;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.write(bArr, i10, i11);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f40865c) {
            throw new IllegalStateException("closed");
        }
        this.f40863a.writeShort(i10);
        return d();
    }
}
