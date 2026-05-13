package j5;

import a6.g0;
import a6.i0;
import a6.k0;
import a6.t;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.id3.PrivFrame;
import com.google.android.exoplayer.source.hls.playlist.c;
import j5.f;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k4.r;

/* JADX INFO: compiled from: HlsMediaChunk.java */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends g5.l {
    public static final r H = new r();
    public static final AtomicInteger I = new AtomicInteger();
    public k4.g A;
    public boolean B;
    public n C;
    public int D;
    public boolean E;
    public volatile boolean F;
    public boolean G;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f72228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f72229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f72230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer.upstream.a f72231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final y5.h f72232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final k4.g f72233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f72234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f72235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g0 f72236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f72237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f72238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final List<Format> f72239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final DrmInitData f72240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z4.b f72241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f72242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f72243y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f72244z;

    public h(f fVar, com.google.android.exoplayer.upstream.a aVar, y5.h hVar, Format format, boolean z10, @Nullable com.google.android.exoplayer.upstream.a aVar2, @Nullable y5.h hVar2, boolean z11, Uri uri, @Nullable List<Format> list, int i10, @Nullable Object obj, long j10, long j11, long j12, int i11, boolean z12, boolean z13, g0 g0Var, @Nullable DrmInitData drmInitData, @Nullable k4.g gVar, z4.b bVar, t tVar, boolean z14) {
        super(aVar, hVar, format, i10, obj, j10, j11, j12);
        this.f72243y = z10;
        this.f72229k = i11;
        this.f72232n = hVar2;
        this.f72231m = aVar2;
        this.E = hVar2 != null;
        this.f72244z = z11;
        this.f72230l = uri;
        this.f72234p = z13;
        this.f72236r = g0Var;
        this.f72235q = z12;
        this.f72238t = fVar;
        this.f72239u = list;
        this.f72240v = drmInitData;
        this.f72233o = gVar;
        this.f72241w = bVar;
        this.f72242x = tVar;
        this.f72237s = z14;
        this.f72228j = I.getAndIncrement();
    }

    public static com.google.android.exoplayer.upstream.a g(com.google.android.exoplayer.upstream.a aVar, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return aVar;
        }
        a6.a.e(bArr2);
        return new a(aVar, bArr, bArr2);
    }

    public static h h(f fVar, com.google.android.exoplayer.upstream.a aVar, Format format, long j10, com.google.android.exoplayer.source.hls.playlist.c cVar, int i10, Uri uri, @Nullable List<Format> list, int i11, @Nullable Object obj, boolean z10, o oVar, @Nullable h hVar, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        y5.h hVar2;
        boolean z11;
        com.google.android.exoplayer.upstream.a aVarG;
        z4.b bVar;
        t tVar;
        k4.g gVar;
        boolean z12;
        c.a aVar2 = cVar.f20605o.get(i10);
        y5.h hVar3 = new y5.h(i0.d(cVar.f72958a, aVar2.f20607b), aVar2.f20616k, aVar2.f20617l, null);
        boolean z13 = bArr != null;
        com.google.android.exoplayer.upstream.a aVarG2 = g(aVar, bArr, z13 ? j((String) a6.a.e(aVar2.f20615j)) : null);
        c.a aVar3 = aVar2.f20608c;
        if (aVar3 != null) {
            boolean z14 = bArr2 != null;
            byte[] bArrJ = z14 ? j((String) a6.a.e(aVar3.f20615j)) : null;
            y5.h hVar4 = new y5.h(i0.d(cVar.f72958a, aVar3.f20607b), aVar3.f20616k, aVar3.f20617l, null);
            z11 = z14;
            aVarG = g(aVar, bArr2, bArrJ);
            hVar2 = hVar4;
        } else {
            hVar2 = null;
            z11 = false;
            aVarG = null;
        }
        long j11 = j10 + aVar2.f20612g;
        long j12 = j11 + aVar2.f20609d;
        int i12 = cVar.f20598h + aVar2.f20611f;
        if (hVar != null) {
            z4.b bVar2 = hVar.f72241w;
            t tVar2 = hVar.f72242x;
            boolean z15 = (uri.equals(hVar.f72230l) && hVar.G) ? false : true;
            bVar = bVar2;
            tVar = tVar2;
            gVar = (hVar.B && hVar.f72229k == i12 && !z15) ? hVar.A : null;
            z12 = z15;
        } else {
            bVar = new z4.b();
            tVar = new t(10);
            gVar = null;
            z12 = false;
        }
        return new h(fVar, aVarG2, hVar3, format, z13, aVarG, hVar2, z11, uri, list, i11, obj, j11, j12, cVar.f20599i + ((long) i10), i12, aVar2.f20618m, z10, oVar.a(i12), aVar2.f20613h, gVar, bVar, tVar, z12);
    }

    public static byte[] j(String str) {
        if (k0.K0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public void cancelLoad() {
        this.F = true;
    }

    @Override // g5.l
    public boolean f() {
        return this.G;
    }

    public final void i(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, boolean z10) throws InterruptedException, IOException {
        y5.h hVarE;
        boolean z11;
        int iC = 0;
        if (z10) {
            z11 = this.D != 0;
            hVarE = hVar;
        } else {
            hVarE = hVar.e(this.D);
            z11 = false;
        }
        try {
            k4.d dVarO = o(aVar, hVarE);
            if (z11) {
                dVarO.skipFully(this.D);
            }
            while (iC == 0) {
                try {
                    if (this.F) {
                        break;
                    } else {
                        iC = this.A.c(dVarO, H);
                    }
                } finally {
                    this.D = (int) (dVarO.getPosition() - hVar.f87274e);
                }
            }
        } finally {
            k0.m(aVar);
        }
    }

    public void k(n nVar) {
        this.C = nVar;
        nVar.x(this.f72228j, this.f72237s);
    }

    public final void l() throws InterruptedException, IOException {
        if (!this.f72234p) {
            this.f72236r.j();
        } else if (this.f72236r.c() == Long.MAX_VALUE) {
            this.f72236r.h(this.f62015f);
        }
        i(this.f62017h, this.f62010a, this.f72243y);
    }

    @Override // com.google.android.exoplayer.upstream.Loader.e
    public void load() throws InterruptedException, IOException {
        k4.g gVar;
        a6.a.e(this.C);
        if (this.A == null && (gVar = this.f72233o) != null) {
            this.A = gVar;
            this.B = true;
            this.E = false;
        }
        m();
        if (this.F) {
            return;
        }
        if (!this.f72235q) {
            l();
        }
        this.G = true;
    }

    public final void m() throws InterruptedException, IOException {
        if (this.E) {
            a6.a.e(this.f72231m);
            a6.a.e(this.f72232n);
            i(this.f72231m, this.f72232n, this.f72244z);
            this.D = 0;
            this.E = false;
        }
    }

    public final long n(k4.h hVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        try {
            hVar.peekFully(this.f72242x.f3620a, 0, 10);
            this.f72242x.H(10);
        } catch (EOFException unused) {
        }
        if (this.f72242x.B() != 4801587) {
            return -9223372036854775807L;
        }
        this.f72242x.M(3);
        int iX = this.f72242x.x();
        int i10 = iX + 10;
        if (i10 > this.f72242x.b()) {
            t tVar = this.f72242x;
            byte[] bArr = tVar.f3620a;
            tVar.H(i10);
            System.arraycopy(bArr, 0, this.f72242x.f3620a, 0, 10);
        }
        hVar.peekFully(this.f72242x.f3620a, 10, iX);
        Metadata metadataD = this.f72241w.d(this.f72242x.f3620a, iX);
        if (metadataD == null) {
            return -9223372036854775807L;
        }
        int iE = metadataD.e();
        for (int i11 = 0; i11 < iE; i11++) {
            Metadata.Entry entryD = metadataD.d(i11);
            if (entryD instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entryD;
                if (io.bidmachine.media3.exoplayer.hls.a.PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.f20288c)) {
                    System.arraycopy(privFrame.f20289d, 0, this.f72242x.f3620a, 0, 8);
                    this.f72242x.H(8);
                    return this.f72242x.r() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final k4.d o(com.google.android.exoplayer.upstream.a aVar, y5.h hVar) throws InterruptedException, IOException {
        k4.d dVar;
        k4.d dVar2 = new k4.d(aVar, hVar.f87274e, aVar.a(hVar));
        if (this.A == null) {
            long jN = n(dVar2);
            dVar2.resetPeekPosition();
            dVar = dVar2;
            f.a aVarA = this.f72238t.a(this.f72233o, hVar.f87270a, this.f62012c, this.f72239u, this.f72236r, aVar.getResponseHeaders(), dVar2);
            this.A = aVarA.f72223a;
            this.B = aVarA.f72225c;
            if (aVarA.f72224b) {
                this.C.V(jN != -9223372036854775807L ? this.f72236r.b(jN) : this.f62015f);
            } else {
                this.C.V(0L);
            }
            this.C.I();
            this.A.b(this.C);
        } else {
            dVar = dVar2;
        }
        this.C.S(this.f72240v);
        return dVar;
    }
}
