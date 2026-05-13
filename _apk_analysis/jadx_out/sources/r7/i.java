package r7;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f78749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f78750c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78754g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78752e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78753f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f78751d = new byte[1];

    public i(h hVar, k kVar) {
        this.f78749b = hVar;
        this.f78750c = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f78753f) {
            return;
        }
        this.f78749b.close();
        this.f78753f = true;
    }

    public final void d() throws IOException {
        if (this.f78752e) {
            return;
        }
        this.f78749b.a(this.f78750c);
        this.f78752e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f78751d) == -1) {
            return -1;
        }
        return this.f78751d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        s7.a.g(!this.f78753f);
        d();
        int i12 = this.f78749b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f78754g += (long) i12;
        return i12;
    }
}
