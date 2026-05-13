package com.google.android.exoplayer.upstream.cache;

import a6.k0;
import a6.m;
import a6.y;
import com.google.android.exoplayer.upstream.cache.Cache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import y5.h;

/* JADX INFO: loaded from: classes10.dex */
public final class CacheDataSink implements y5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f21066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f21069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f21071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f21072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f21075j;

    public static class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache, long j10, int i10) {
        a6.a.g(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < 2097152) {
            m.h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f21066a = (Cache) a6.a.e(cache);
        this.f21067b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f21068c = i10;
    }

    @Override // y5.f
    public void a(h hVar) throws CacheDataSinkException {
        if (hVar.f87276g == -1 && hVar.d(2)) {
            this.f21069d = null;
            return;
        }
        this.f21069d = hVar;
        this.f21070e = hVar.d(4) ? this.f21067b : Long.MAX_VALUE;
        this.f21074i = 0L;
        try {
            c();
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    public final void b() throws IOException {
        OutputStream outputStream = this.f21072g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            k0.n(this.f21072g);
            this.f21072g = null;
            File file = this.f21071f;
            this.f21071f = null;
            this.f21066a.commitFile(file, this.f21073h);
        } catch (Throwable th2) {
            k0.n(this.f21072g);
            this.f21072g = null;
            File file2 = this.f21071f;
            this.f21071f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void c() throws IOException {
        long j10 = this.f21069d.f87276g;
        long jMin = j10 != -1 ? Math.min(j10 - this.f21074i, this.f21070e) : -1L;
        Cache cache = this.f21066a;
        h hVar = this.f21069d;
        this.f21071f = cache.startFile(hVar.f87277h, hVar.f87274e + this.f21074i, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f21071f);
        if (this.f21068c > 0) {
            y yVar = this.f21075j;
            if (yVar == null) {
                this.f21075j = new y(fileOutputStream, this.f21068c);
            } else {
                yVar.a(fileOutputStream);
            }
            this.f21072g = this.f21075j;
        } else {
            this.f21072g = fileOutputStream;
        }
        this.f21073h = 0L;
    }

    @Override // y5.f
    public void close() throws CacheDataSinkException {
        if (this.f21069d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // y5.f
    public void write(byte[] bArr, int i10, int i11) throws CacheDataSinkException {
        if (this.f21069d == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f21073h == this.f21070e) {
                    b();
                    c();
                }
                int iMin = (int) Math.min(i11 - i12, this.f21070e - this.f21073h);
                this.f21072g.write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f21073h += j10;
                this.f21074i += j10;
            } catch (IOException e10) {
                throw new CacheDataSinkException(e10);
            }
        }
    }
}
