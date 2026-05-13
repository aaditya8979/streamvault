package com.google.android.exoplayer.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.DataSourceException;
import com.google.android.exoplayer.upstream.cache.Cache;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import y5.h;
import y5.p;
import y5.q;
import z5.i;
import z5.j;

/* JADX INFO: compiled from: CacheDataSource.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements com.google.android.exoplayer.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f21076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f21077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer.upstream.a f21078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f21079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z5.d f21080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final InterfaceC0297a f21081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer.upstream.a f21085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Uri f21087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Uri f21088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public byte[] f21090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map<String, String> f21091p = Collections.emptyMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f21093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21095t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public z5.e f21096u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f21099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f21100y;

    /* JADX INFO: renamed from: com.google.android.exoplayer.upstream.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheDataSource.java */
    public interface InterfaceC0297a {
        void onCacheIgnored(int i10);

        void onCachedBytesRead(long j10, long j11);
    }

    public a(Cache cache, com.google.android.exoplayer.upstream.a aVar, com.google.android.exoplayer.upstream.a aVar2, @Nullable y5.f fVar, int i10, @Nullable InterfaceC0297a interfaceC0297a, @Nullable z5.d dVar) {
        this.f21076a = cache;
        this.f21077b = aVar2;
        this.f21080e = dVar == null ? d.f21108a : dVar;
        this.f21082g = (i10 & 1) != 0;
        this.f21083h = (i10 & 2) != 0;
        this.f21084i = (i10 & 4) != 0;
        this.f21079d = aVar;
        if (fVar != null) {
            this.f21078c = new p(aVar, fVar);
        } else {
            this.f21078c = null;
        }
        this.f21081f = interfaceC0297a;
    }

    public static Uri d(Cache cache, String str, Uri uri) {
        Uri uriB = i.b(cache.getContentMetadata(str));
        return uriB != null ? uriB : uri;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws IOException {
        try {
            String strA = this.f21080e.a(hVar);
            this.f21093r = strA;
            Uri uri = hVar.f87270a;
            this.f21087l = uri;
            this.f21088m = d(this.f21076a, strA, uri);
            this.f21089n = hVar.f87271b;
            this.f21090o = hVar.f87272c;
            this.f21091p = hVar.f87273d;
            this.f21092q = hVar.f87278i;
            this.f21094s = hVar.f87275f;
            int iN = n(hVar);
            boolean z10 = iN != -1;
            this.f21098w = z10;
            if (z10) {
                k(iN);
            }
            long j10 = hVar.f87276g;
            if (j10 != -1 || this.f21098w) {
                this.f21095t = j10;
            } else {
                long jA = i.a(this.f21076a.getContentMetadata(this.f21093r));
                this.f21095t = jA;
                if (jA != -1) {
                    long j11 = jA - hVar.f87275f;
                    this.f21095t = j11;
                    if (j11 <= 0) {
                        throw new DataSourceException(0);
                    }
                }
            }
            l(false);
            return this.f21095t;
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void b(q qVar) {
        this.f21077b.b(qVar);
        this.f21079d.b(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() throws IOException {
        com.google.android.exoplayer.upstream.a aVar = this.f21085j;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.f21085j = null;
            this.f21086k = false;
            z5.e eVar = this.f21096u;
            if (eVar != null) {
                this.f21076a.a(eVar);
                this.f21096u = null;
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws IOException {
        this.f21087l = null;
        this.f21088m = null;
        this.f21089n = 1;
        this.f21090o = null;
        this.f21091p = Collections.emptyMap();
        this.f21092q = 0;
        this.f21094s = 0L;
        this.f21093r = null;
        j();
        try {
            c();
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }

    public final void e(Throwable th2) {
        if (g() || (th2 instanceof Cache.CacheException)) {
            this.f21097v = true;
        }
    }

    public final boolean f() {
        return this.f21085j == this.f21079d;
    }

    public final boolean g() {
        return this.f21085j == this.f21077b;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        return h() ? this.f21079d.getResponseHeaders() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f21088m;
    }

    public final boolean h() {
        return !g();
    }

    public final boolean i() {
        return this.f21085j == this.f21078c;
    }

    public final void j() {
        InterfaceC0297a interfaceC0297a = this.f21081f;
        if (interfaceC0297a == null || this.f21099x <= 0) {
            return;
        }
        interfaceC0297a.onCachedBytesRead(this.f21076a.getCacheSpace(), this.f21099x);
        this.f21099x = 0L;
    }

    public final void k(int i10) {
        InterfaceC0297a interfaceC0297a = this.f21081f;
        if (interfaceC0297a != null) {
            interfaceC0297a.onCacheIgnored(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.upstream.cache.a.l(boolean):void");
    }

    public final void m() throws IOException {
        this.f21095t = 0L;
        if (i()) {
            j jVar = new j();
            j.g(jVar, this.f21094s);
            this.f21076a.c(this.f21093r, jVar);
        }
    }

    public final int n(h hVar) {
        if (this.f21083h && this.f21097v) {
            return 0;
        }
        return (this.f21084i && hVar.f87276g == -1) ? 1 : -1;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f21095t == 0) {
            return -1;
        }
        try {
            if (this.f21094s >= this.f21100y) {
                l(true);
            }
            int i12 = this.f21085j.read(bArr, i10, i11);
            if (i12 != -1) {
                if (g()) {
                    this.f21099x += (long) i12;
                }
                long j10 = i12;
                this.f21094s += j10;
                long j11 = this.f21095t;
                if (j11 != -1) {
                    this.f21095t = j11 - j10;
                }
            } else {
                if (!this.f21086k) {
                    long j12 = this.f21095t;
                    if (j12 <= 0) {
                        if (j12 == -1) {
                        }
                    }
                    c();
                    l(false);
                    return read(bArr, i10, i11);
                }
                m();
            }
            return i12;
        } catch (IOException e10) {
            if (this.f21086k && d.c(e10)) {
                m();
                return -1;
            }
            e(e10);
            throw e10;
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }
}
