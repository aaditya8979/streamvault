package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.e0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f18617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f18618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f18619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f18620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18621e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18622f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18623g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f18624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f18626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f18631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18633q;

    public e(l lVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2, c cVar) {
        this.f18617a = lVar;
        this.f18618b = hVar2;
        this.f18620d = hVar;
        if (cVar != null) {
            this.f18619c = new e0(hVar, cVar);
        } else {
            this.f18619c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) throws IOException {
        try {
            Uri uri = kVar.f18696a;
            this.f18626j = uri;
            this.f18627k = kVar.f18701f;
            String string = kVar.f18700e;
            if (string == null) {
                string = uri.toString();
            }
            this.f18628l = string;
            this.f18629m = kVar.f18698c;
            boolean z10 = (this.f18622f && this.f18632p) || (kVar.f18699d == -1 && this.f18623g);
            this.f18633q = z10;
            long j10 = kVar.f18699d;
            if (j10 != -1 || z10) {
                this.f18630n = j10;
            } else {
                long jA = this.f18617a.a(string);
                this.f18630n = jA;
                if (jA != -1) {
                    long j11 = jA - kVar.f18698c;
                    this.f18630n = j11;
                    if (j11 <= 0) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i();
                    }
                }
            }
            a(true);
            return this.f18630n;
        } catch (IOException e10) {
            if (this.f18624h == this.f18618b || (e10 instanceof a)) {
                this.f18632p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f18624h;
        return hVar == this.f18620d ? hVar.a() : this.f18626j;
    }

    public final void a(long j10) {
        if (this.f18624h == this.f18619c) {
            l lVar = this.f18617a;
            String str = this.f18628l;
            synchronized (lVar) {
                i iVar = lVar.f18662d;
                h hVar = (h) iVar.f18648a.get(str);
                if (hVar == null) {
                    iVar.a(str, j10);
                } else if (hVar.f18647d != j10) {
                    hVar.f18647d = j10;
                    iVar.f18653f = true;
                }
                lVar.f18662d.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e.a(boolean):boolean");
    }

    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f18624h;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
            this.f18624h = null;
            this.f18625i = false;
            m mVar = this.f18631o;
            if (mVar != null) {
                l lVar = this.f18617a;
                synchronized (lVar) {
                    if (mVar != lVar.f18661c.remove(mVar.f18638a)) {
                        throw new IllegalStateException();
                    }
                    lVar.notifyAll();
                }
                this.f18631o = null;
            }
        } catch (Throwable th2) {
            m mVar2 = this.f18631o;
            if (mVar2 != null) {
                this.f18617a.b(mVar2);
                this.f18631o = null;
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws IOException {
        this.f18626j = null;
        try {
            b();
        } catch (IOException e10) {
            if (this.f18624h == this.f18618b || (e10 instanceof a)) {
                this.f18632p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f18630n == 0) {
            return -1;
        }
        try {
            int i12 = this.f18624h.read(bArr, i10, i11);
            if (i12 >= 0) {
                long j10 = i12;
                this.f18629m += j10;
                long j11 = this.f18630n;
                if (j11 != -1) {
                    this.f18630n = j11 - j10;
                }
            } else {
                if (this.f18625i) {
                    a(this.f18629m);
                    this.f18630n = 0L;
                }
                b();
                long j12 = this.f18630n;
                if ((j12 > 0 || j12 == -1) && a(false)) {
                    return read(bArr, i10, i11);
                }
            }
            return i12;
        } catch (IOException e10) {
            if (this.f18624h == this.f18618b || (e10 instanceof a)) {
                this.f18632p = true;
            }
            throw e10;
        }
    }
}
