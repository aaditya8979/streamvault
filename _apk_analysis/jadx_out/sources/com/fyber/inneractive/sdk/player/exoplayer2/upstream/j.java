package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f18691b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18695f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18693d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18694e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18692c = new byte[1];

    public j(h hVar, k kVar) {
        this.f18690a = hVar;
        this.f18691b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f18694e) {
            return;
        }
        this.f18690a.close();
        this.f18694e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f18692c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f18692c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!(!this.f18694e)) {
            throw new IllegalStateException();
        }
        if (!this.f18693d) {
            this.f18690a.a(this.f18691b);
            this.f18693d = true;
        }
        int i12 = this.f18690a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f18695f += (long) i12;
        return i12;
    }
}
