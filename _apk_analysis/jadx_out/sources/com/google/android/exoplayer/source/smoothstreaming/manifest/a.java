package com.google.android.exoplayer.source.smoothstreaming.manifest;

import a6.i0;
import a6.k0;
import android.net.Uri;
import androidx.annotation.Nullable;
import b5.d;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import q4.m;

/* JADX INFO: compiled from: SsManifest.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C0293a f20738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f20739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20741h;

    /* JADX INFO: renamed from: com.google.android.exoplayer.source.smoothstreaming.manifest.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SsManifest.java */
    public static class C0293a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f20742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f20743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m[] f20744c;

        public C0293a(UUID uuid, byte[] bArr, m[] mVarArr) {
            this.f20742a = uuid;
            this.f20743b = bArr;
            this.f20744c = mVarArr;
        }
    }

    /* JADX INFO: compiled from: SsManifest.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f20748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f20752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f20753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Format[] f20754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f20755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f20756l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f20757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<Long> f20758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long[] f20759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f20760p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @Nullable String str5, Format[] formatArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, formatArr, list, k0.z0(list, 1000000L, j10), k0.y0(j11, 1000000L, j10));
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @Nullable String str5, Format[] formatArr, List<Long> list, long[] jArr, long j11) {
            this.f20756l = str;
            this.f20757m = str2;
            this.f20745a = i10;
            this.f20746b = str3;
            this.f20747c = j10;
            this.f20748d = str4;
            this.f20749e = i11;
            this.f20750f = i12;
            this.f20751g = i13;
            this.f20752h = i14;
            this.f20753i = str5;
            this.f20754j = formatArr;
            this.f20758n = list;
            this.f20759o = jArr;
            this.f20760p = j11;
            this.f20755k = list.size();
        }

        public Uri a(int i10, int i11) {
            a6.a.f(this.f20754j != null);
            a6.a.f(this.f20758n != null);
            a6.a.f(i11 < this.f20758n.size());
            String string = Integer.toString(this.f20754j[i10].f19923f);
            String string2 = this.f20758n.get(i11).toString();
            return i0.d(this.f20756l, this.f20757m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(Format[] formatArr) {
            return new b(this.f20756l, this.f20757m, this.f20745a, this.f20746b, this.f20747c, this.f20748d, this.f20749e, this.f20750f, this.f20751g, this.f20752h, this.f20753i, formatArr, this.f20758n, this.f20759o, this.f20760p);
        }

        public long c(int i10) {
            if (i10 == this.f20755k - 1) {
                return this.f20760p;
            }
            long[] jArr = this.f20759o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return k0.h(this.f20759o, j10, true, true);
        }

        public long e(int i10) {
            return this.f20759o[i10];
        }
    }

    public a(int i10, int i11, long j10, long j11, int i12, boolean z10, @Nullable C0293a c0293a, b[] bVarArr) {
        this.f20734a = i10;
        this.f20735b = i11;
        this.f20740g = j10;
        this.f20741h = j11;
        this.f20736c = i12;
        this.f20737d = z10;
        this.f20738e = c0293a;
        this.f20739f = bVarArr;
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, @Nullable C0293a c0293a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : k0.y0(j11, 1000000L, j10), j12 != 0 ? k0.y0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0293a, bVarArr);
    }

    @Override // b5.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a copy(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            b bVar2 = this.f20739f[streamKey.f20359c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f20754j[streamKey.f20360d]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new a(this.f20734a, this.f20735b, this.f20740g, this.f20741h, this.f20736c, this.f20737d, this.f20738e, (b[]) arrayList2.toArray(new b[0]));
    }
}
