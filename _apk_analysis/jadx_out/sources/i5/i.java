package i5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import i5.j;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Representation.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f63782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d> f63785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f63786f;

    /* JADX INFO: compiled from: Representation.java */
    public static class b extends i implements h5.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j.a f63787g;

        public b(long j10, Format format, String str, j.a aVar, @Nullable List<d> list) {
            super(j10, format, str, aVar, list);
            this.f63787g = aVar;
        }

        @Override // i5.i
        @Nullable
        public String a() {
            return null;
        }

        @Override // i5.i
        public h5.c b() {
            return this;
        }

        @Override // i5.i
        @Nullable
        public h c() {
            return null;
        }

        @Override // h5.c
        public long getDurationUs(long j10, long j11) {
            return this.f63787g.e(j10, j11);
        }

        @Override // h5.c
        public long getFirstSegmentNum() {
            return this.f63787g.c();
        }

        @Override // h5.c
        public int getSegmentCount(long j10) {
            return this.f63787g.d(j10);
        }

        @Override // h5.c
        public long getSegmentNum(long j10, long j11) {
            return this.f63787g.f(j10, j11);
        }

        @Override // h5.c
        public h getSegmentUrl(long j10) {
            return this.f63787g.h(this, j10);
        }

        @Override // h5.c
        public long getTimeUs(long j10) {
            return this.f63787g.g(j10);
        }

        @Override // h5.c
        public boolean isExplicit() {
            return this.f63787g.i();
        }
    }

    /* JADX INFO: compiled from: Representation.java */
    public static class c extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Uri f63788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f63789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f63790i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final h f63791j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final k f63792k;

        public c(long j10, Format format, String str, j.e eVar, @Nullable List<d> list, @Nullable String str2, long j11) {
            super(j10, format, str, eVar, list);
            this.f63788g = Uri.parse(str);
            h hVarC = eVar.c();
            this.f63791j = hVarC;
            this.f63790i = str2;
            this.f63789h = j11;
            this.f63792k = hVarC != null ? null : new k(new h(null, 0L, j11));
        }

        @Override // i5.i
        @Nullable
        public String a() {
            return this.f63790i;
        }

        @Override // i5.i
        @Nullable
        public h5.c b() {
            return this.f63792k;
        }

        @Override // i5.i
        @Nullable
        public h c() {
            return this.f63791j;
        }
    }

    public i(long j10, Format format, String str, j jVar, @Nullable List<d> list) {
        this.f63781a = j10;
        this.f63782b = format;
        this.f63783c = str;
        this.f63785e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f63786f = jVar.a(this);
        this.f63784d = jVar.b();
    }

    public static i e(long j10, Format format, String str, j jVar, @Nullable List<d> list) {
        return f(j10, format, str, jVar, list, null);
    }

    public static i f(long j10, Format format, String str, j jVar, @Nullable List<d> list, @Nullable String str2) {
        if (jVar instanceof j.e) {
            return new c(j10, format, str, (j.e) jVar, list, str2, -1L);
        }
        if (jVar instanceof j.a) {
            return new b(j10, format, str, (j.a) jVar, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    @Nullable
    public abstract String a();

    @Nullable
    public abstract h5.c b();

    @Nullable
    public abstract h c();

    @Nullable
    public h d() {
        return this.f63786f;
    }
}
