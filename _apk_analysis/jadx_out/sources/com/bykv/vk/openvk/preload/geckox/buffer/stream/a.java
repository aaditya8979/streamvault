package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: BufferInputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f11444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11445b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f11444a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jB = this.f11444a.b() - this.f11444a.c();
        if (jB > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f11445b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f11444a.d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f11444a.b(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f11444a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f11444a.b(this.f11445b);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        return this.f11444a.a(j10);
    }
}
