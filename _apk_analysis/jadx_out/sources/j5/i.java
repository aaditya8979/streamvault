package j5;

import a6.k0;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer.source.hls.playlist.b;
import e4.t0;
import e5.b0;
import e5.i0;
import e5.j0;
import e5.q;
import j5.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsMediaPeriod.java */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements q, n.a, HlsPlaylistTracker.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f72245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HlsPlaylistTracker f72246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f72247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final y5.q f72248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f72249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y5.m f72250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0.a f72251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y5.b f72252i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e5.g f72255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f72256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f72257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f72258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public q.a f72259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f72260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TrackGroupArray f72261r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j0 f72265v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f72266w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentityHashMap<i0, Integer> f72253j = new IdentityHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f72254k = new o();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n[] f72262s = new n[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n[] f72263t = new n[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[][] f72264u = new int[0][];

    public i(f fVar, HlsPlaylistTracker hlsPlaylistTracker, e eVar, @Nullable y5.q qVar, com.google.android.exoplayer.drm.a<?> aVar, y5.m mVar, b0.a aVar2, y5.b bVar, e5.g gVar, boolean z10, int i10, boolean z11) {
        this.f72245b = fVar;
        this.f72246c = hlsPlaylistTracker;
        this.f72247d = eVar;
        this.f72248e = qVar;
        this.f72249f = aVar;
        this.f72250g = mVar;
        this.f72251h = aVar2;
        this.f72252i = bVar;
        this.f72255l = gVar;
        this.f72256m = z10;
        this.f72257n = i10;
        this.f72258o = z11;
        this.f72265v = gVar.a(new j0[0]);
        aVar2.I();
    }

    public static Format k(Format format, @Nullable Format format2, boolean z10) {
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        int i12;
        Metadata metadata;
        if (format2 != null) {
            String str4 = format2.f19924g;
            Metadata metadata2 = format2.f19925h;
            int i13 = format2.f19940w;
            int i14 = format2.f19921d;
            int i15 = format2.f19922e;
            String str5 = format2.B;
            str2 = format2.f19920c;
            str = str4;
            metadata = metadata2;
            i12 = i13;
            i10 = i14;
            i11 = i15;
            str3 = str5;
        } else {
            String strD = k0.D(format.f19924g, 1);
            Metadata metadata3 = format.f19925h;
            if (z10) {
                int i16 = format.f19940w;
                str = strD;
                i12 = i16;
                i10 = format.f19921d;
                metadata = metadata3;
                i11 = format.f19922e;
                str3 = format.B;
                str2 = format.f19920c;
            } else {
                str = strD;
                str2 = null;
                str3 = null;
                i10 = 0;
                i11 = 0;
                i12 = -1;
                metadata = metadata3;
            }
        }
        return Format.n(format.f19919b, str2, format.f19926i, a6.p.e(str), str, metadata, z10 ? format.f19923f : -1, i12, -1, null, i10, i11, str3);
    }

    public static Map<String, DrmInitData> l(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitDataG = list.get(i10);
            String str = drmInitDataG.f20127d;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData.f20127d, str)) {
                    drmInitDataG = drmInitDataG.g(drmInitData);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, drmInitDataG);
        }
        return map;
    }

    public static Format m(Format format) {
        String strD = k0.D(format.f19924g, 2);
        return Format.B(format.f19919b, format.f19920c, format.f19926i, a6.p.e(strD), strD, format.f19925h, format.f19923f, format.f19932o, format.f19933p, format.f19934q, null, format.f19921d, format.f19922e);
    }

    @Override // e5.q
    public long a(long j10, t0 t0Var) {
        return j10;
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker.b
    public boolean b(Uri uri, long j10) {
        boolean zJ = true;
        for (n nVar : this.f72262s) {
            zJ &= nVar.J(uri, j10);
        }
        this.f72259p.c(this);
        return zJ;
    }

    @Override // e5.q, e5.j0
    public boolean continueLoading(long j10) {
        if (this.f72261r != null) {
            return this.f72265v.continueLoading(j10);
        }
        for (n nVar : this.f72262s) {
            nVar.n();
        }
        return false;
    }

    @Override // e5.q
    public void discardBuffer(long j10, boolean z10) {
        for (n nVar : this.f72263t) {
            nVar.discardBuffer(j10, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    @Override // e5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long e(com.google.android.exoplayer.trackselection.c[] r22, boolean[] r23, e5.i0[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.i.e(com.google.android.exoplayer.trackselection.c[], boolean[], e5.i0[], boolean[], long):long");
    }

    @Override // e5.q
    public void f(q.a aVar, long j10) {
        this.f72259p = aVar;
        this.f72246c.c(this);
        i(j10);
    }

    public final void g(long j10, List<b.a> list, List<n> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f20587d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (k0.c(str, list.get(i11).f20587d)) {
                        b.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f20584a);
                        arrayList2.add(aVar.f20585b);
                        z10 &= aVar.f20585b.f19924g != null;
                    }
                }
                n nVarJ = j(1, (Uri[]) arrayList.toArray((Uri[]) k0.j(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j10);
                list3.add(k0.I0(arrayList3));
                list2.add(nVarJ);
                if (this.f72256m && z10) {
                    nVarJ.L(new TrackGroup[]{new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // e5.q, e5.j0
    public long getBufferedPositionUs() {
        return this.f72265v.getBufferedPositionUs();
    }

    @Override // e5.q, e5.j0
    public long getNextLoadPositionUs() {
        return this.f72265v.getNextLoadPositionUs();
    }

    @Override // e5.q
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) a6.a.e(this.f72261r);
    }

    public final void h(com.google.android.exoplayer.source.hls.playlist.b bVar, long j10, List<n> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z10;
        boolean z11;
        int size = bVar.f20575e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < bVar.f20575e.size(); i12++) {
            Format format = bVar.f20575e.get(i12).f20589b;
            if (format.f19933p > 0 || k0.D(format.f19924g, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (k0.D(format.f19924g, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        Format[] formatArr = new Format[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < bVar.f20575e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                b.C0291b c0291b = bVar.f20575e.get(i14);
                uriArr[i13] = c0291b.f20588a;
                formatArr[i13] = c0291b.f20589b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = formatArr[0].f19924g;
        n nVarJ = j(0, uriArr, formatArr, bVar.f20580j, bVar.f20581k, map, j10);
        list.add(nVarJ);
        list2.add(iArr2);
        if (!this.f72256m || str == null) {
            return;
        }
        boolean z12 = k0.D(str, 2) != null;
        boolean z13 = k0.D(str, 1) != null;
        ArrayList arrayList = new ArrayList();
        if (z12) {
            Format[] formatArr2 = new Format[size];
            for (int i15 = 0; i15 < size; i15++) {
                formatArr2[i15] = m(formatArr[i15]);
            }
            arrayList.add(new TrackGroup(formatArr2));
            if (z13 && (bVar.f20580j != null || bVar.f20577g.isEmpty())) {
                arrayList.add(new TrackGroup(k(formatArr[0], bVar.f20580j, false)));
            }
            List<Format> list3 = bVar.f20581k;
            if (list3 != null) {
                for (int i16 = 0; i16 < list3.size(); i16++) {
                    arrayList.add(new TrackGroup(list3.get(i16)));
                }
            }
        } else {
            if (!z13) {
                throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
            }
            Format[] formatArr3 = new Format[size];
            for (int i17 = 0; i17 < size; i17++) {
                formatArr3[i17] = k(formatArr[i17], bVar.f20580j, true);
            }
            arrayList.add(new TrackGroup(formatArr3));
        }
        TrackGroup trackGroup = new TrackGroup(Format.u("ID3", "application/id3", null, -1, null));
        arrayList.add(trackGroup);
        nVarJ.L((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
    }

    public final void i(long j10) {
        com.google.android.exoplayer.source.hls.playlist.b bVar = (com.google.android.exoplayer.source.hls.playlist.b) a6.a.e(this.f72246c.b());
        Map<String, DrmInitData> mapL = this.f72258o ? l(bVar.f20583m) : Collections.emptyMap();
        boolean z10 = !bVar.f20575e.isEmpty();
        List<b.a> list = bVar.f20577g;
        List<b.a> list2 = bVar.f20578h;
        this.f72260q = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            h(bVar, j10, arrayList, arrayList2, mapL);
        }
        g(j10, list, arrayList, arrayList2, mapL);
        int i10 = 0;
        while (i10 < list2.size()) {
            b.a aVar = list2.get(i10);
            int i11 = i10;
            n nVarJ = j(3, new Uri[]{aVar.f20584a}, new Format[]{aVar.f20585b}, null, Collections.emptyList(), mapL, j10);
            arrayList2.add(new int[]{i11});
            arrayList.add(nVarJ);
            nVarJ.L(new TrackGroup[]{new TrackGroup(aVar.f20585b)}, 0, new int[0]);
            i10 = i11 + 1;
        }
        this.f72262s = (n[]) arrayList.toArray(new n[0]);
        this.f72264u = (int[][]) arrayList2.toArray(new int[0][]);
        n[] nVarArr = this.f72262s;
        this.f72260q = nVarArr.length;
        nVarArr[0].U(true);
        for (n nVar : this.f72262s) {
            nVar.n();
        }
        this.f72263t = this.f72262s;
    }

    @Override // e5.q, e5.j0
    public boolean isLoading() {
        return this.f72265v.isLoading();
    }

    public final n j(int i10, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j10) {
        return new n(i10, this, new d(this.f72245b, this.f72246c, uriArr, formatArr, this.f72247d, this.f72248e, this.f72254k, list), map, this.f72252i, j10, format, this.f72249f, this.f72250g, this.f72251h, this.f72257n);
    }

    @Override // e5.q
    public void maybeThrowPrepareError() throws IOException {
        for (n nVar : this.f72262s) {
            nVar.maybeThrowPrepareError();
        }
    }

    @Override // e5.j0.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void c(n nVar) {
        this.f72259p.c(this);
    }

    public void o() {
        this.f72246c.d(this);
        for (n nVar : this.f72262s) {
            nVar.N();
        }
        this.f72259p = null;
        this.f72251h.J();
    }

    @Override // com.google.android.exoplayer.source.hls.playlist.HlsPlaylistTracker.b
    public void onPlaylistChanged() {
        this.f72259p.c(this);
    }

    @Override // j5.n.a
    public void onPlaylistRefreshRequired(Uri uri) {
        this.f72246c.refreshPlaylist(uri);
    }

    @Override // j5.n.a
    public void onPrepared() {
        int i10 = this.f72260q - 1;
        this.f72260q = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (n nVar : this.f72262s) {
            i11 += nVar.getTrackGroups().f20392b;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i11];
        int i12 = 0;
        for (n nVar2 : this.f72262s) {
            int i13 = nVar2.getTrackGroups().f20392b;
            int i14 = 0;
            while (i14 < i13) {
                trackGroupArr[i12] = nVar2.getTrackGroups().b(i14);
                i14++;
                i12++;
            }
        }
        this.f72261r = new TrackGroupArray(trackGroupArr);
        this.f72259p.d(this);
    }

    @Override // e5.q
    public long readDiscontinuity() {
        if (this.f72266w) {
            return -9223372036854775807L;
        }
        this.f72251h.L();
        this.f72266w = true;
        return -9223372036854775807L;
    }

    @Override // e5.q, e5.j0
    public void reevaluateBuffer(long j10) {
        this.f72265v.reevaluateBuffer(j10);
    }

    @Override // e5.q
    public long seekToUs(long j10) {
        n[] nVarArr = this.f72263t;
        if (nVarArr.length > 0) {
            boolean zQ = nVarArr[0].Q(j10, false);
            int i10 = 1;
            while (true) {
                n[] nVarArr2 = this.f72263t;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i10].Q(j10, zQ);
                i10++;
            }
            if (zQ) {
                this.f72254k.b();
            }
        }
        return j10;
    }
}
