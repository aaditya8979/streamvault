package j5;

import a6.i0;
import a6.k0;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.hls.FullSegmentEncryptionKeyCache;
import com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer.source.hls.playlist.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import y5.q;

/* JADX INFO: compiled from: HlsChunkSource.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f72197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f72198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f72199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f72200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f72201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Format[] f72202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HlsPlaylistTracker f72203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackGroup f72204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<Format> f72205i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f72207k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public IOException f72209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Uri f72210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f72211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.google.android.exoplayer.trackselection.c f72212p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f72214r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FullSegmentEncryptionKeyCache f72206j = new FullSegmentEncryptionKeyCache(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f72208l = k0.f3579f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f72213q = -9223372036854775807L;

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class a extends g5.j {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f72215k;

        public a(com.google.android.exoplayer.upstream.a aVar, y5.h hVar, Format format, int i10, @Nullable Object obj, byte[] bArr) {
            super(aVar, hVar, 3, format, i10, obj, bArr);
        }

        @Override // g5.j
        public void e(byte[] bArr, int i10) {
            this.f72215k = Arrays.copyOf(bArr, i10);
        }

        @Nullable
        public byte[] h() {
            return this.f72215k;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public g5.d f72216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f72217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Uri f72218c;

        public b() {
            a();
        }

        public void a() {
            this.f72216a = null;
            this.f72217b = false;
            this.f72218c = null;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class c extends g5.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.android.exoplayer.source.hls.playlist.c f72219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f72220f;

        public c(com.google.android.exoplayer.source.hls.playlist.c cVar, long j10, int i10) {
            super(i10, cVar.f20605o.size() - 1);
            this.f72219e = cVar;
            this.f72220f = j10;
        }
    }

    /* JADX INFO: renamed from: j5.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class C0850d extends w5.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f72221g;

        public C0850d(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.f72221g = b(trackGroup.b(0));
        }

        @Override // com.google.android.exoplayer.trackselection.c
        public void a(long j10, long j11, long j12, List<? extends g5.l> list, g5.m[] mVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c(this.f72221g, jElapsedRealtime)) {
                for (int i10 = this.f86326b - 1; i10 >= 0; i10--) {
                    if (!c(i10, jElapsedRealtime)) {
                        this.f72221g = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer.trackselection.c
        public int getSelectedIndex() {
            return this.f72221g;
        }

        @Override // com.google.android.exoplayer.trackselection.c
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer.trackselection.c
        public int getSelectionReason() {
            return 0;
        }
    }

    public d(f fVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, e eVar, @Nullable q qVar, o oVar, @Nullable List<Format> list) {
        this.f72197a = fVar;
        this.f72203g = hlsPlaylistTracker;
        this.f72201e = uriArr;
        this.f72202f = formatArr;
        this.f72200d = oVar;
        this.f72205i = list;
        com.google.android.exoplayer.upstream.a aVarCreateDataSource = eVar.createDataSource(1);
        this.f72198b = aVarCreateDataSource;
        if (qVar != null) {
            aVarCreateDataSource.b(qVar);
        }
        this.f72199c = eVar.createDataSource(3);
        this.f72204h = new TrackGroup(formatArr);
        int[] iArr = new int[uriArr.length];
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            iArr[i10] = i10;
        }
        this.f72212p = new C0850d(this.f72204h, iArr);
    }

    @Nullable
    public static Uri c(com.google.android.exoplayer.source.hls.playlist.c cVar, @Nullable c.a aVar) {
        String str;
        if (aVar == null || (str = aVar.f20614i) == null) {
            return null;
        }
        return i0.d(cVar.f72958a, str);
    }

    public g5.m[] a(@Nullable h hVar, long j10) {
        int iC = hVar == null ? -1 : this.f72204h.c(hVar.f62012c);
        int length = this.f72212p.length();
        g5.m[] mVarArr = new g5.m[length];
        for (int i10 = 0; i10 < length; i10++) {
            int indexInTrackGroup = this.f72212p.getIndexInTrackGroup(i10);
            Uri uri = this.f72201e[indexInTrackGroup];
            if (this.f72203g.isSnapshotValid(uri)) {
                com.google.android.exoplayer.source.hls.playlist.c playlistSnapshot = this.f72203g.getPlaylistSnapshot(uri, false);
                a6.a.e(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.f20596f - this.f72203g.getInitialStartTimeUs();
                long jB = b(hVar, indexInTrackGroup != iC, playlistSnapshot, initialStartTimeUs, j10);
                long j11 = playlistSnapshot.f20599i;
                if (jB < j11) {
                    mVarArr[i10] = g5.m.f62078a;
                } else {
                    mVarArr[i10] = new c(playlistSnapshot, initialStartTimeUs, (int) (jB - j11));
                }
            } else {
                mVarArr[i10] = g5.m.f62078a;
            }
        }
        return mVarArr;
    }

    public final long b(@Nullable h hVar, boolean z10, com.google.android.exoplayer.source.hls.playlist.c cVar, long j10, long j11) {
        long jF;
        long size;
        if (hVar != null && !z10) {
            return hVar.e();
        }
        long j12 = cVar.f20606p + j10;
        if (hVar != null && !this.f72211o) {
            j11 = hVar.f62015f;
        }
        if (cVar.f20602l || j11 < j12) {
            jF = k0.f(cVar.f20605o, Long.valueOf(j11 - j10), true, !this.f72203g.isLive() || hVar == null);
            size = cVar.f20599i;
        } else {
            jF = cVar.f20599i;
            size = cVar.f20605o.size();
        }
        return jF + size;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[PHI: r2
      0x0055: PHI (r2v2 long) = (r2v1 long), (r2v1 long), (r2v15 long) binds: [B:10:0x0032, B:12:0x0036, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(long r29, long r31, java.util.List<j5.h> r33, boolean r34, j5.d.b r35) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.d.d(long, long, java.util.List, boolean, j5.d$b):void");
    }

    public TrackGroup e() {
        return this.f72204h;
    }

    public com.google.android.exoplayer.trackselection.c f() {
        return this.f72212p;
    }

    public boolean g(g5.d dVar, long j10) {
        com.google.android.exoplayer.trackselection.c cVar = this.f72212p;
        return cVar.blacklist(cVar.indexOf(this.f72204h.c(dVar.f62012c)), j10);
    }

    @Nullable
    public final g5.d h(@Nullable Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f72206j.c(uri);
        if (bArrC != null) {
            this.f72206j.b(uri, bArrC);
            return null;
        }
        return new a(this.f72199c, new y5.h(uri, 0L, -1L, null, 1), this.f72202f[i10], this.f72212p.getSelectionReason(), this.f72212p.getSelectionData(), this.f72208l);
    }

    public void i() throws IOException {
        IOException iOException = this.f72209m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f72210n;
        if (uri == null || !this.f72214r) {
            return;
        }
        this.f72203g.maybeThrowPlaylistRefreshError(uri);
    }

    public void j(g5.d dVar) {
        if (dVar instanceof a) {
            a aVar = (a) dVar;
            this.f72208l = aVar.f();
            this.f72206j.b(aVar.f62010a.f87270a, (byte[]) a6.a.e(aVar.h()));
        }
    }

    public boolean k(Uri uri, long j10) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f72201e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = this.f72212p.indexOf(i10)) == -1) {
            return true;
        }
        this.f72214r = uri.equals(this.f72210n) | this.f72214r;
        return j10 == -9223372036854775807L || this.f72212p.blacklist(iIndexOf, j10);
    }

    public void l() {
        this.f72209m = null;
    }

    public final long m(long j10) {
        long j11 = this.f72213q;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    public void n(boolean z10) {
        this.f72207k = z10;
    }

    public void o(com.google.android.exoplayer.trackselection.c cVar) {
        this.f72212p = cVar;
    }

    public final void p(com.google.android.exoplayer.source.hls.playlist.c cVar) {
        this.f72213q = cVar.f20602l ? -9223372036854775807L : cVar.d() - this.f72203g.getInitialStartTimeUs();
    }
}
