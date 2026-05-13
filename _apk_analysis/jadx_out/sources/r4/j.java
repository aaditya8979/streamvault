package r4;

import a6.t;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import k4.w;
import r4.i;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f78630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f78631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f78632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w.d f78633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w.b f78634r;

    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w.d f78635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w.b f78636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f78637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final w.c[] f78638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f78639e;

        public a(w.d dVar, w.b bVar, byte[] bArr, w.c[] cVarArr, int i10) {
            this.f78635a = dVar;
            this.f78636b = bVar;
            this.f78637c = bArr;
            this.f78638d = cVarArr;
            this.f78639e = i10;
        }
    }

    @VisibleForTesting
    public static void l(t tVar, long j10) {
        tVar.K(tVar.d() + 4);
        tVar.f3620a[tVar.d() - 4] = (byte) (j10 & 255);
        tVar.f3620a[tVar.d() - 3] = (byte) ((j10 >>> 8) & 255);
        tVar.f3620a[tVar.d() - 2] = (byte) ((j10 >>> 16) & 255);
        tVar.f3620a[tVar.d() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    public static int m(byte b10, a aVar) {
        return !aVar.f78638d[n(b10, aVar.f78639e, 1)].f72942a ? aVar.f78635a.f72952g : aVar.f78635a.f72953h;
    }

    @VisibleForTesting
    public static int n(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean p(t tVar) {
        try {
            return w.l(1, tVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // r4.i
    public void d(long j10) {
        super.d(j10);
        this.f78632p = j10 != 0;
        w.d dVar = this.f78633q;
        this.f78631o = dVar != null ? dVar.f72952g : 0;
    }

    @Override // r4.i
    public long e(t tVar) {
        byte b10 = tVar.f3620a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        int iM = m(b10, this.f78630n);
        long j10 = this.f78632p ? (this.f78631o + iM) / 4 : 0;
        l(tVar, j10);
        this.f78632p = true;
        this.f78631o = iM;
        return j10;
    }

    @Override // r4.i
    public boolean h(t tVar, long j10, i.b bVar) throws InterruptedException, IOException {
        if (this.f78630n != null) {
            return false;
        }
        a aVarO = o(tVar);
        this.f78630n = aVarO;
        if (aVarO == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f78630n.f78635a.f72955j);
        arrayList.add(this.f78630n.f78637c);
        w.d dVar = this.f78630n.f78635a;
        bVar.f78628a = Format.q(null, "audio/vorbis", null, dVar.f72950e, -1, dVar.f72947b, (int) dVar.f72948c, arrayList, null, 0, null);
        return true;
    }

    @Override // r4.i
    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f78630n = null;
            this.f78633q = null;
            this.f78634r = null;
        }
        this.f78631o = 0;
        this.f78632p = false;
    }

    @VisibleForTesting
    public a o(t tVar) throws IOException {
        if (this.f78633q == null) {
            this.f78633q = w.j(tVar);
            return null;
        }
        if (this.f78634r == null) {
            this.f78634r = w.h(tVar);
            return null;
        }
        byte[] bArr = new byte[tVar.d()];
        System.arraycopy(tVar.f3620a, 0, bArr, 0, tVar.d());
        return new a(this.f78633q, this.f78634r, bArr, w.k(tVar, this.f78633q.f72947b), w.a(r5.length - 1));
    }
}
