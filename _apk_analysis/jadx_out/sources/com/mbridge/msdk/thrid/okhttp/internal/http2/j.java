package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.http2.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Http2Writer.java */
/* JADX INFO: loaded from: classes9.dex */
final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f40607g = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.d f40608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f40609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.c f40610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d.b f40613f;

    public j(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        this.f40608a = dVar;
        this.f40609b = z10;
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        this.f40610c = cVar;
        this.f40613f = new d.b(cVar);
        this.f40611d = 16384;
    }

    private static void a(com.mbridge.msdk.thrid.okio.d dVar, int i10) throws IOException {
        dVar.writeByte((i10 >>> 16) & 255);
        dVar.writeByte((i10 >>> 8) & 255);
        dVar.writeByte(i10 & 255);
    }

    private void b(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int iMin = (int) Math.min(this.f40611d, j10);
            long j11 = iMin;
            j10 -= j11;
            a(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f40608a.a(this.f40610c, j11);
        }
    }

    public void a(int i10, byte b10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        a(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f40608a.a(cVar, i11);
        }
    }

    public void a(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f40607g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f40611d;
        if (i11 > i12) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw e.a("reserved bit set: %s", Integer.valueOf(i10));
        }
        a(this.f40608a, i11);
        this.f40608a.writeByte(b10 & 255);
        this.f40608a.writeByte(b11 & 255);
        this.f40608a.writeInt(i10 & Integer.MAX_VALUE);
    }

    public synchronized void a(int i10, int i11, List<c> list) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        this.f40613f.a(list);
        long size = this.f40610c.size();
        int iMin = (int) Math.min(this.f40611d - 4, size);
        long j10 = iMin;
        a(i10, iMin + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
        this.f40608a.writeInt(i11 & Integer.MAX_VALUE);
        this.f40608a.a(this.f40610c, j10);
        if (size > j10) {
            b(i10, size - j10);
        }
    }

    public synchronized void a(int i10, long j10) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
        a(i10, 4, (byte) 8, (byte) 0);
        this.f40608a.writeInt((int) j10);
        this.f40608a.flush();
    }

    public synchronized void a(int i10, b bVar) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        if (bVar.f40457a == -1) {
            throw new IllegalArgumentException();
        }
        a(i10, 4, (byte) 3, (byte) 0);
        this.f40608a.writeInt(bVar.f40457a);
        this.f40608a.flush();
    }

    public synchronized void a(int i10, b bVar, byte[] bArr) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        if (bVar.f40457a == -1) {
            throw e.a("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f40608a.writeInt(i10);
        this.f40608a.writeInt(bVar.f40457a);
        if (bArr.length > 0) {
            this.f40608a.write(bArr);
        }
        this.f40608a.flush();
    }

    public synchronized void a(m mVar) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        this.f40611d = mVar.c(this.f40611d);
        if (mVar.b() != -1) {
            this.f40613f.b(mVar.b());
        }
        a(0, 0, (byte) 4, (byte) 1);
        this.f40608a.flush();
    }

    public synchronized void a(boolean z10, int i10, int i11) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
        this.f40608a.writeInt(i10);
        this.f40608a.writeInt(i11);
        this.f40608a.flush();
    }

    public synchronized void a(boolean z10, int i10, int i11, List<c> list) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        a(z10, i10, list);
    }

    public synchronized void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        a(i10, z10 ? (byte) 1 : (byte) 0, cVar, i11);
    }

    public void a(boolean z10, int i10, List<c> list) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        this.f40613f.a(list);
        long size = this.f40610c.size();
        int iMin = (int) Math.min(this.f40611d, size);
        long j10 = iMin;
        byte b10 = size == j10 ? (byte) 4 : (byte) 0;
        if (z10) {
            b10 = (byte) (b10 | 1);
        }
        a(i10, iMin, (byte) 1, b10);
        this.f40608a.a(this.f40610c, j10);
        if (size > j10) {
            b(i10, size - j10);
        }
    }

    public synchronized void b(m mVar) throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        int i10 = 0;
        a(0, mVar.d() * 6, (byte) 4, (byte) 0);
        while (i10 < 10) {
            if (mVar.d(i10)) {
                this.f40608a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                this.f40608a.writeInt(mVar.a(i10));
            }
            i10++;
        }
        this.f40608a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f40612e = true;
        this.f40608a.close();
    }

    public synchronized void d() throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        if (this.f40609b) {
            Logger logger = f40607g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(com.mbridge.msdk.thrid.okhttp.internal.c.a(">> CONNECTION %s", e.f40487a.g()));
            }
            this.f40608a.write(e.f40487a.l());
            this.f40608a.flush();
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f40612e) {
            throw new IOException("closed");
        }
        this.f40608a.flush();
    }

    public int h() {
        return this.f40611d;
    }
}
