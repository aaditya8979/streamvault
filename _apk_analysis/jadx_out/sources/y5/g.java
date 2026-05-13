package y5;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f87264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f87265c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f87269g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f87267e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f87268f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f87266d = new byte[1];

    public g(com.google.android.exoplayer.upstream.a aVar, h hVar) {
        this.f87264b = aVar;
        this.f87265c = hVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f87268f) {
            return;
        }
        this.f87264b.close();
        this.f87268f = true;
    }

    public final void d() throws IOException {
        if (this.f87267e) {
            return;
        }
        this.f87264b.a(this.f87265c);
        this.f87267e = true;
    }

    public void h() throws IOException {
        d();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f87266d) == -1) {
            return -1;
        }
        return this.f87266d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        a6.a.f(!this.f87268f);
        d();
        int i12 = this.f87264b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f87269g += (long) i12;
        return i12;
    }
}
