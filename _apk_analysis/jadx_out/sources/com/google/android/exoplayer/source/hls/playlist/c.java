package com.google.android.exoplayer.source.hls.playlist;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.offline.StreamKey;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HlsMediaPlaylist.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends k5.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f20601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final DrmInitData f20604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<a> f20605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f20606p;

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class a implements Comparable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final a f20608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f20609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f20610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20611f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f20612g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final DrmInitData f20613h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f20614i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f20615j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f20616k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f20617l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f20618m;

        public a(String str, long j10, long j11, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false);
        }

        public a(String str, @Nullable a aVar, String str2, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j12, long j13, boolean z10) {
            this.f20607b = str;
            this.f20608c = aVar;
            this.f20610e = str2;
            this.f20609d = j10;
            this.f20611f = i10;
            this.f20612g = j11;
            this.f20613h = drmInitData;
            this.f20614i = str3;
            this.f20615j = str4;
            this.f20616k = j12;
            this.f20617l = j13;
            this.f20618m = z10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f20612g > l10.longValue()) {
                return 1;
            }
            return this.f20612g < l10.longValue() ? -1 : 0;
        }
    }

    public c(int i10, String str, List<String> list, long j10, long j11, boolean z10, int i11, long j12, int i12, long j13, boolean z11, boolean z12, boolean z13, @Nullable DrmInitData drmInitData, List<a> list2) {
        super(str, list, z11);
        this.f20594d = i10;
        this.f20596f = j11;
        this.f20597g = z10;
        this.f20598h = i11;
        this.f20599i = j12;
        this.f20600j = i12;
        this.f20601k = j13;
        this.f20602l = z12;
        this.f20603m = z13;
        this.f20604n = drmInitData;
        this.f20605o = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f20606p = 0L;
        } else {
            a aVar = list2.get(list2.size() - 1);
            this.f20606p = aVar.f20612g + aVar.f20609d;
        }
        this.f20595e = j10 == -9223372036854775807L ? -9223372036854775807L : j10 >= 0 ? j10 : this.f20606p + j10;
    }

    @Override // b5.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c copy(List<StreamKey> list) {
        return this;
    }

    public c b(long j10, int i10) {
        return new c(this.f20594d, this.f72958a, this.f72959b, this.f20595e, j10, true, i10, this.f20599i, this.f20600j, this.f20601k, this.f72960c, this.f20602l, this.f20603m, this.f20604n, this.f20605o);
    }

    public c c() {
        return this.f20602l ? this : new c(this.f20594d, this.f72958a, this.f72959b, this.f20595e, this.f20596f, this.f20597g, this.f20598h, this.f20599i, this.f20600j, this.f20601k, this.f72960c, true, this.f20603m, this.f20604n, this.f20605o);
    }

    public long d() {
        return this.f20596f + this.f20606p;
    }

    public boolean e(c cVar) {
        if (cVar == null) {
            return true;
        }
        long j10 = this.f20599i;
        long j11 = cVar.f20599i;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f20605o.size();
        int size2 = cVar.f20605o.size();
        if (size <= size2) {
            return size == size2 && this.f20602l && !cVar.f20602l;
        }
        return true;
    }
}
