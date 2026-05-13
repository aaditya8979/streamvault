package yads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class r30 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f94268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f94269b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94271d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94272e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f94270c = new byte[1];

    public r30(r33 r33Var, u30 u30Var) {
        this.f94268a = r33Var;
        this.f94269b = u30Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f94272e) {
            return;
        }
        this.f94268a.close();
        this.f94272e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f94270c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f94270c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!(!this.f94272e)) {
            throw new IllegalStateException();
        }
        if (!this.f94271d) {
            this.f94268a.a(this.f94269b);
            this.f94271d = true;
        }
        int i12 = this.f94268a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        return i12;
    }
}
