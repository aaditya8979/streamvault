package j5;

import a6.k0;
import a6.t;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.emsg.EventMessage;
import com.google.android.exoplayer.metadata.id3.PrivFrame;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.upstream.Loader;
import e4.f0;
import e5.b0;
import e5.h0;
import e5.i0;
import e5.j0;
import j5.d;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements Loader.b<g5.d>, Loader.f, j0, k4.i, h0.b {
    public static final Set<Integer> W = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 4)));
    public boolean A;
    public boolean B;
    public int C;
    public Format D;

    @Nullable
    public Format E;
    public boolean F;
    public TrackGroupArray G;
    public Set<TrackGroup> H;
    public int[] I;
    public int J;
    public boolean K;
    public boolean[] L;
    public boolean[] M;
    public long N;
    public long O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public long T;

    @Nullable
    public DrmInitData U;
    public int V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f72274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f72275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y5.b f72276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Format f72277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f72278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y5.m f72279h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0.a f72281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f72282k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<h> f72284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<h> f72285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f72286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f72287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f72288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<j> f72289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map<String, DrmInitData> f72290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c[] f72291t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Set<Integer> f72293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SparseIntArray f72294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u f72295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f72296y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f72297z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Loader f72280i = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d.b f72283l = new d.b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f72292u = new int[0];

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public interface a extends j0.a<n> {
        void onPlaylistRefreshRequired(Uri uri);

        void onPrepared();
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static class b implements u {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Format f72298g = Format.t(null, "application/id3", Long.MAX_VALUE);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Format f72299h = Format.t(null, "application/x-emsg", Long.MAX_VALUE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x4.a f72300a = new x4.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f72301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Format f72302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Format f72303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f72304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72305f;

        public b(u uVar, int i10) {
            this.f72301b = uVar;
            if (i10 == 1) {
                this.f72302c = f72298g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f72302c = f72299h;
            }
            this.f72304e = new byte[0];
            this.f72305f = 0;
        }

        @Override // k4.u
        public void a(t tVar, int i10) {
            f(this.f72305f + i10);
            tVar.h(this.f72304e, this.f72305f, i10);
            this.f72305f += i10;
        }

        @Override // k4.u
        public int b(k4.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
            f(this.f72305f + i10);
            int i11 = hVar.read(this.f72304e, this.f72305f, i10);
            if (i11 != -1) {
                this.f72305f += i11;
                return i11;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // k4.u
        public void c(long j10, int i10, int i11, int i12, @Nullable u.a aVar) {
            a6.a.e(this.f72303d);
            t tVarG = g(i11, i12);
            if (!k0.c(this.f72303d.f19927j, this.f72302c.f19927j)) {
                if (!"application/x-emsg".equals(this.f72303d.f19927j)) {
                    a6.m.h("EmsgUnwrappingTrackOutput", "Ignoring sample for unsupported format: " + this.f72303d.f19927j);
                    return;
                }
                EventMessage eventMessageB = this.f72300a.b(tVarG);
                if (!e(eventMessageB)) {
                    a6.m.h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f72302c.f19927j, eventMessageB.getWrappedMetadataFormat()));
                    return;
                }
                tVarG = new t((byte[]) a6.a.e(eventMessageB.getWrappedMetadataBytes()));
            }
            int iA = tVarG.a();
            this.f72301b.a(tVarG, iA);
            this.f72301b.c(j10, i10, iA, i12, aVar);
        }

        @Override // k4.u
        public void d(Format format) {
            this.f72303d = format;
            this.f72301b.d(this.f72302c);
        }

        public final boolean e(EventMessage eventMessage) {
            Format wrappedMetadataFormat = eventMessage.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && k0.c(this.f72302c.f19927j, wrappedMetadataFormat.f19927j);
        }

        public final void f(int i10) {
            byte[] bArr = this.f72304e;
            if (bArr.length < i10) {
                this.f72304e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        public final t g(int i10, int i11) {
            int i12 = this.f72305f - i11;
            t tVar = new t(Arrays.copyOfRange(this.f72304e, i12 - i10, i12));
            byte[] bArr = this.f72304e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f72305f = i11;
            return tVar;
        }
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static final class c extends h0 {
        public final Map<String, DrmInitData> F;

        @Nullable
        public DrmInitData G;

        public c(y5.b bVar, Looper looper, com.google.android.exoplayer.drm.a<?> aVar, Map<String, DrmInitData> map) {
            super(bVar, looper, aVar);
            this.F = map;
        }

        @Nullable
        public final Metadata Y(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iE = metadata.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iE) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry entryD = metadata.d(i11);
                if ((entryD instanceof PrivFrame) && io.bidmachine.media3.exoplayer.hls.a.PRIV_TIMESTAMP_FRAME_OWNER.equals(((PrivFrame) entryD).f20288c)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (iE == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iE - 1];
            while (i10 < iE) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.d(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        public void Z(@Nullable DrmInitData drmInitData) {
            this.G = drmInitData;
            C();
        }

        @Override // e5.h0
        public Format s(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.G;
            if (drmInitData2 == null) {
                drmInitData2 = format.f19930m;
            }
            if (drmInitData2 != null && (drmInitData = this.F.get(drmInitData2.f20127d)) != null) {
                drmInitData2 = drmInitData;
            }
            return super.s(format.b(drmInitData2, Y(format.f19925h)));
        }
    }

    public n(int i10, a aVar, d dVar, Map<String, DrmInitData> map, y5.b bVar, long j10, @Nullable Format format, com.google.android.exoplayer.drm.a<?> aVar2, y5.m mVar, b0.a aVar3, int i11) {
        this.f72273b = i10;
        this.f72274c = aVar;
        this.f72275d = dVar;
        this.f72290s = map;
        this.f72276e = bVar;
        this.f72277f = format;
        this.f72278g = aVar2;
        this.f72279h = mVar;
        this.f72281j = aVar3;
        this.f72282k = i11;
        Set<Integer> set = W;
        this.f72293v = new HashSet(set.size());
        this.f72294w = new SparseIntArray(set.size());
        this.f72291t = new c[0];
        this.M = new boolean[0];
        this.L = new boolean[0];
        ArrayList<h> arrayList = new ArrayList<>();
        this.f72284m = arrayList;
        this.f72285n = Collections.unmodifiableList(arrayList);
        this.f72289r = new ArrayList<>();
        this.f72286o = new Runnable() { // from class: j5.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f72271b.C();
            }
        };
        this.f72287p = new Runnable() { // from class: j5.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f72272b.K();
            }
        };
        this.f72288q = new Handler();
        this.N = j10;
        this.O = j10;
    }

    public static k4.f o(int i10, int i11) {
        a6.m.h("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new k4.f();
    }

    public static Format r(@Nullable Format format, Format format2, boolean z10) {
        if (format == null) {
            return format2;
        }
        int i10 = z10 ? format.f19923f : -1;
        int i11 = format.f19940w;
        if (i11 == -1) {
            i11 = format2.f19940w;
        }
        int i12 = i11;
        String strD = k0.D(format.f19924g, a6.p.h(format2.f19927j));
        String strE = a6.p.e(strD);
        if (strE == null) {
            strE = format2.f19927j;
        }
        return format2.d(format.f19919b, format.f19920c, strE, strD, format.f19925h, i10, format.f19932o, format.f19933p, i12, format.f19921d, format.B);
    }

    public static boolean t(Format format, Format format2) {
        String str = format.f19927j;
        String str2 = format2.f19927j;
        int iH = a6.p.h(str);
        if (iH != 3) {
            return iH == a6.p.h(str2);
        }
        if (k0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || format.C == format2.C;
        }
        return false;
    }

    public static int w(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static boolean y(g5.d dVar) {
        return dVar instanceof h;
    }

    public boolean A(int i10) {
        return !z() && this.f72291t[i10].E(this.R);
    }

    public final void B() {
        int i10 = this.G.f20392b;
        int[] iArr = new int[i10];
        this.I = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                c[] cVarArr = this.f72291t;
                if (i12 >= cVarArr.length) {
                    break;
                }
                if (t(cVarArr[i12].z(), this.G.b(i11).b(0))) {
                    this.I[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<j> it = this.f72289r.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void C() {
        if (!this.F && this.I == null && this.A) {
            for (c cVar : this.f72291t) {
                if (cVar.z() == null) {
                    return;
                }
            }
            if (this.G != null) {
                B();
                return;
            }
            m();
            T();
            this.f72274c.onPrepared();
        }
    }

    public void D() throws IOException {
        this.f72280i.maybeThrowError();
        this.f72275d.i();
    }

    public void E(int i10) throws IOException {
        D();
        this.f72291t[i10].G();
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void l(g5.d dVar, long j10, long j11, boolean z10) {
        this.f72281j.x(dVar.f62010a, dVar.d(), dVar.c(), dVar.f62011b, this.f72273b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, j10, j11, dVar.a());
        if (z10) {
            return;
        }
        O();
        if (this.C > 0) {
            this.f72274c.c(this);
        }
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void j(g5.d dVar, long j10, long j11) {
        this.f72275d.j(dVar);
        this.f72281j.A(dVar.f62010a, dVar.d(), dVar.c(), dVar.f62011b, this.f72273b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, j10, j11, dVar.a());
        if (this.B) {
            this.f72274c.c(this);
        } else {
            continueLoading(this.N);
        }
    }

    @Override // com.google.android.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Loader.c g(g5.d dVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        long jA = dVar.a();
        boolean zY = y(dVar);
        long jA2 = this.f72279h.a(dVar.f62011b, j11, iOException, i10);
        boolean zG = jA2 != -9223372036854775807L ? this.f72275d.g(dVar, jA2) : false;
        if (zG) {
            if (zY && jA == 0) {
                ArrayList<h> arrayList = this.f72284m;
                a6.a.f(arrayList.remove(arrayList.size() - 1) == dVar);
                if (this.f72284m.isEmpty()) {
                    this.O = this.N;
                }
            }
            cVarG = Loader.f21018f;
        } else {
            long jB = this.f72279h.b(dVar.f62011b, j11, iOException, i10);
            cVarG = jB != -9223372036854775807L ? Loader.g(false, jB) : Loader.f21019g;
        }
        Loader.c cVar = cVarG;
        this.f72281j.D(dVar.f62010a, dVar.d(), dVar.c(), dVar.f62011b, this.f72273b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, j10, j11, jA, iOException, !cVar.c());
        if (zG) {
            if (this.B) {
                this.f72274c.c(this);
            } else {
                continueLoading(this.N);
            }
        }
        return cVar;
    }

    public void I() {
        this.f72293v.clear();
    }

    public boolean J(Uri uri, long j10) {
        return this.f72275d.k(uri, j10);
    }

    public final void K() {
        this.A = true;
        C();
    }

    public void L(TrackGroup[] trackGroupArr, int i10, int... iArr) {
        this.G = q(trackGroupArr);
        this.H = new HashSet();
        for (int i11 : iArr) {
            this.H.add(this.G.b(i11));
        }
        this.J = i10;
        Handler handler = this.f72288q;
        final a aVar = this.f72274c;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: j5.k
            @Override // java.lang.Runnable
            public final void run() {
                aVar.onPrepared();
            }
        });
        T();
    }

    public int M(int i10, f0 f0Var, i4.e eVar, boolean z10) {
        if (z()) {
            return -3;
        }
        int i11 = 0;
        if (!this.f72284m.isEmpty()) {
            int i12 = 0;
            while (i12 < this.f72284m.size() - 1 && s(this.f72284m.get(i12))) {
                i12++;
            }
            k0.w0(this.f72284m, 0, i12);
            h hVar = this.f72284m.get(0);
            Format format = hVar.f62012c;
            if (!format.equals(this.E)) {
                this.f72281j.l(this.f72273b, format, hVar.f62013d, hVar.f62014e, hVar.f62015f);
            }
            this.E = format;
        }
        int iK = this.f72291t[i10].K(f0Var, eVar, z10, this.R, this.N);
        if (iK == -5) {
            Format formatJ = (Format) a6.a.e(f0Var.f60107c);
            if (i10 == this.f72297z) {
                int I = this.f72291t[i10].I();
                while (i11 < this.f72284m.size() && this.f72284m.get(i11).f72228j != I) {
                    i11++;
                }
                formatJ = formatJ.j(i11 < this.f72284m.size() ? this.f72284m.get(i11).f62012c : (Format) a6.a.e(this.D));
            }
            f0Var.f60107c = formatJ;
        }
        return iK;
    }

    public void N() {
        if (this.B) {
            for (c cVar : this.f72291t) {
                cVar.J();
            }
        }
        this.f72280i.l(this);
        this.f72288q.removeCallbacksAndMessages(null);
        this.F = true;
        this.f72289r.clear();
    }

    public final void O() {
        for (c cVar : this.f72291t) {
            cVar.P(this.P);
        }
        this.P = false;
    }

    public final boolean P(long j10) {
        int length = this.f72291t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f72291t[i10].S(j10, false) && (this.M[i10] || !this.K)) {
                return false;
            }
        }
        return true;
    }

    public boolean Q(long j10, boolean z10) {
        this.N = j10;
        if (z()) {
            this.O = j10;
            return true;
        }
        if (this.A && !z10 && P(j10)) {
            return false;
        }
        this.O = j10;
        this.R = false;
        this.f72284m.clear();
        if (this.f72280i.i()) {
            this.f72280i.e();
        } else {
            this.f72280i.f();
            O();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(com.google.android.exoplayer.trackselection.c[] r20, boolean[] r21, e5.i0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.n.R(com.google.android.exoplayer.trackselection.c[], boolean[], e5.i0[], boolean[], long, boolean):boolean");
    }

    public void S(@Nullable DrmInitData drmInitData) {
        if (k0.c(this.U, drmInitData)) {
            return;
        }
        this.U = drmInitData;
        int i10 = 0;
        while (true) {
            c[] cVarArr = this.f72291t;
            if (i10 >= cVarArr.length) {
                return;
            }
            if (this.M[i10]) {
                cVarArr[i10].Z(drmInitData);
            }
            i10++;
        }
    }

    public final void T() {
        this.B = true;
    }

    public void U(boolean z10) {
        this.f72275d.n(z10);
    }

    public void V(long j10) {
        if (this.T != j10) {
            this.T = j10;
            for (c cVar : this.f72291t) {
                cVar.T(j10);
            }
        }
    }

    public int W(int i10, long j10) {
        if (z()) {
            return 0;
        }
        c cVar = this.f72291t[i10];
        return (!this.R || j10 <= cVar.v()) ? cVar.e(j10) : cVar.f();
    }

    public void X(int i10) {
        i();
        a6.a.e(this.I);
        int i11 = this.I[i10];
        a6.a.f(this.L[i11]);
        this.L[i11] = false;
    }

    public final void Y(i0[] i0VarArr) {
        this.f72289r.clear();
        for (i0 i0Var : i0VarArr) {
            if (i0Var != null) {
                this.f72289r.add((j) i0Var);
            }
        }
    }

    @Override // e5.h0.b
    public void b(Format format) {
        this.f72288q.post(this.f72286o);
    }

    @Override // k4.i
    public void c(s sVar) {
    }

    @Override // e5.j0
    public boolean continueLoading(long j10) {
        List<h> listEmptyList;
        long jMax;
        if (this.R || this.f72280i.i() || this.f72280i.h()) {
            return false;
        }
        if (z()) {
            listEmptyList = Collections.emptyList();
            jMax = this.O;
        } else {
            listEmptyList = this.f72285n;
            h hVarU = u();
            jMax = hVarU.f() ? hVarU.f62016g : Math.max(this.N, hVarU.f62015f);
        }
        List<h> list = listEmptyList;
        this.f72275d.d(j10, jMax, list, this.B || !list.isEmpty(), this.f72283l);
        d.b bVar = this.f72283l;
        boolean z10 = bVar.f72217b;
        g5.d dVar = bVar.f72216a;
        Uri uri = bVar.f72218c;
        bVar.a();
        if (z10) {
            this.O = -9223372036854775807L;
            this.R = true;
            return true;
        }
        if (dVar == null) {
            if (uri != null) {
                this.f72274c.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (y(dVar)) {
            this.O = -9223372036854775807L;
            h hVar = (h) dVar;
            hVar.k(this);
            this.f72284m.add(hVar);
            this.D = hVar.f62012c;
        }
        this.f72281j.G(dVar.f62010a, dVar.f62011b, this.f72273b, dVar.f62012c, dVar.f62013d, dVar.f62014e, dVar.f62015f, dVar.f62016g, this.f72280i.m(dVar, this, this.f72279h.getMinimumLoadableRetryCount(dVar.f62011b)));
        return true;
    }

    public void discardBuffer(long j10, boolean z10) {
        if (!this.A || z()) {
            return;
        }
        int length = this.f72291t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f72291t[i10].m(j10, z10, this.L[i10]);
        }
    }

    @Override // k4.i
    public void endTracks() {
        this.S = true;
        this.f72288q.post(this.f72287p);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // e5.j0
    public long getBufferedPositionUs() {
        /*
            r7 = this;
            boolean r0 = r7.R
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.z()
            if (r0 == 0) goto L10
            long r0 = r7.O
            return r0
        L10:
            long r0 = r7.N
            j5.h r2 = r7.u()
            boolean r3 = r2.f()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<j5.h> r2 = r7.f72284m
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<j5.h> r2 = r7.f72284m
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            j5.h r2 = (j5.h) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f62016g
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.A
            if (r2 == 0) goto L55
            j5.n$c[] r2 = r7.f72291t
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.v()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.n.getBufferedPositionUs():long");
    }

    @Override // e5.j0
    public long getNextLoadPositionUs() {
        if (z()) {
            return this.O;
        }
        if (this.R) {
            return Long.MIN_VALUE;
        }
        return u().f62016g;
    }

    public TrackGroupArray getTrackGroups() {
        i();
        return this.G;
    }

    public final void i() {
        a6.a.f(this.B);
        a6.a.e(this.G);
        a6.a.e(this.H);
    }

    @Override // e5.j0
    public boolean isLoading() {
        return this.f72280i.i();
    }

    public int k(int i10) {
        i();
        a6.a.e(this.I);
        int i11 = this.I[i10];
        if (i11 == -1) {
            return this.H.contains(this.G.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.L;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public final void m() {
        int length = this.f72291t.length;
        int i10 = 6;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = this.f72291t[i12].z().f19927j;
            int i13 = a6.p.n(str) ? 2 : a6.p.l(str) ? 1 : a6.p.m(str) ? 3 : 6;
            if (w(i13) > w(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        TrackGroup trackGroupE = this.f72275d.e();
        int i14 = trackGroupE.f20388b;
        this.J = -1;
        this.I = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.I[i15] = i15;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i16 = 0; i16 < length; i16++) {
            Format formatZ = this.f72291t[i16].z();
            if (i16 == i11) {
                Format[] formatArr = new Format[i14];
                if (i14 == 1) {
                    formatArr[0] = formatZ.j(trackGroupE.b(0));
                } else {
                    for (int i17 = 0; i17 < i14; i17++) {
                        formatArr[i17] = r(trackGroupE.b(i17), formatZ, true);
                    }
                }
                trackGroupArr[i16] = new TrackGroup(formatArr);
                this.J = i16;
            } else {
                trackGroupArr[i16] = new TrackGroup(r((i10 == 2 && a6.p.l(formatZ.f19927j)) ? this.f72277f : null, formatZ, false));
            }
        }
        this.G = q(trackGroupArr);
        a6.a.f(this.H == null);
        this.H = Collections.emptySet();
    }

    public void maybeThrowPrepareError() throws IOException {
        D();
        if (this.R && !this.B) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    public void n() {
        if (this.B) {
            return;
        }
        continueLoading(this.N);
    }

    @Override // com.google.android.exoplayer.upstream.Loader.f
    public void onLoaderReleased() {
        for (c cVar : this.f72291t) {
            cVar.M();
        }
    }

    public final h0 p(int i10, int i11) {
        int length = this.f72291t.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        c cVar = new c(this.f72276e, this.f72288q.getLooper(), this.f72278g, this.f72290s);
        if (z10) {
            cVar.Z(this.U);
        }
        cVar.T(this.T);
        cVar.W(this.V);
        cVar.V(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f72292u, i12);
        this.f72292u = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f72291t = (c[]) k0.o0(this.f72291t, cVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.M, i12);
        this.M = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.K |= z10;
        this.f72293v.add(Integer.valueOf(i11));
        this.f72294w.append(i11, length);
        if (w(i11) > w(this.f72296y)) {
            this.f72297z = length;
            this.f72296y = i11;
        }
        this.L = Arrays.copyOf(this.L, i12);
        return cVar;
    }

    public final TrackGroupArray q(TrackGroup[] trackGroupArr) {
        for (int i10 = 0; i10 < trackGroupArr.length; i10++) {
            TrackGroup trackGroup = trackGroupArr[i10];
            Format[] formatArr = new Format[trackGroup.f20388b];
            for (int i11 = 0; i11 < trackGroup.f20388b; i11++) {
                Format formatB = trackGroup.b(i11);
                DrmInitData drmInitData = formatB.f19930m;
                if (drmInitData != null) {
                    formatB = formatB.f(this.f72278g.e(drmInitData));
                }
                formatArr[i11] = formatB;
            }
            trackGroupArr[i10] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    @Override // e5.j0
    public void reevaluateBuffer(long j10) {
    }

    public final boolean s(h hVar) {
        int i10 = hVar.f72228j;
        int length = this.f72291t.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.L[i11] && this.f72291t[i11].I() == i10) {
                return false;
            }
        }
        return true;
    }

    @Override // k4.i
    public u track(int i10, int i11) {
        u uVarP;
        if (!W.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                u[] uVarArr = this.f72291t;
                if (i12 >= uVarArr.length) {
                    uVarP = null;
                    break;
                }
                if (this.f72292u[i12] == i10) {
                    uVarP = uVarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            uVarP = v(i10, i11);
        }
        if (uVarP == null) {
            if (this.S) {
                return o(i10, i11);
            }
            uVarP = p(i10, i11);
        }
        if (i11 != 4) {
            return uVarP;
        }
        if (this.f72295x == null) {
            this.f72295x = new b(uVarP, this.f72282k);
        }
        return this.f72295x;
    }

    public final h u() {
        return this.f72284m.get(r0.size() - 1);
    }

    @Nullable
    public final u v(int i10, int i11) {
        a6.a.a(W.contains(Integer.valueOf(i11)));
        int i12 = this.f72294w.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f72293v.add(Integer.valueOf(i11))) {
            this.f72292u[i12] = i10;
        }
        return this.f72292u[i12] == i10 ? this.f72291t[i12] : o(i10, i11);
    }

    public void x(int i10, boolean z10) {
        this.V = i10;
        for (c cVar : this.f72291t) {
            cVar.W(i10);
        }
        if (z10) {
            for (c cVar2 : this.f72291t) {
                cVar2.X();
            }
        }
    }

    public final boolean z() {
        return this.O != -9223372036854775807L;
    }
}
