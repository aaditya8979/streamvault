package e5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.a;
import e5.e0;
import e5.r;
import java.io.IOException;

/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends b implements e0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f60439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a.InterfaceC0296a f60440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k4.k f60441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f60442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y5.m f60443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f60444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f60445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Object f60446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f60447o = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f60448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f60449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public y5.q f60450r;

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0296a f60451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k4.k f60452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f60453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Object f60454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.google.android.exoplayer.drm.a<?> f60455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public y5.m f60456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f60457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f60458h;

        public a(a.InterfaceC0296a interfaceC0296a) {
            this(interfaceC0296a, new k4.e());
        }

        public a(a.InterfaceC0296a interfaceC0296a, k4.k kVar) {
            this.f60451a = interfaceC0296a;
            this.f60452b = kVar;
            this.f60455e = com.google.android.exoplayer.drm.a.a();
            this.f60456f = new com.google.android.exoplayer.upstream.f();
            this.f60457g = 1048576;
        }

        public f0 a(Uri uri) {
            this.f60458h = true;
            return new f0(uri, this.f60451a, this.f60452b, this.f60455e, this.f60456f, this.f60453c, this.f60457g, this.f60454d);
        }
    }

    public f0(Uri uri, a.InterfaceC0296a interfaceC0296a, k4.k kVar, com.google.android.exoplayer.drm.a<?> aVar, y5.m mVar, @Nullable String str, int i10, @Nullable Object obj) {
        this.f60439g = uri;
        this.f60440h = interfaceC0296a;
        this.f60441i = kVar;
        this.f60442j = aVar;
        this.f60443k = mVar;
        this.f60444l = str;
        this.f60445m = i10;
        this.f60446n = obj;
    }

    @Override // e5.r
    public q b(r.a aVar, y5.b bVar, long j10) {
        com.google.android.exoplayer.upstream.a aVarCreateDataSource = this.f60440h.createDataSource();
        y5.q qVar = this.f60450r;
        if (qVar != null) {
            aVarCreateDataSource.b(qVar);
        }
        return new e0(this.f60439g, aVarCreateDataSource, this.f60441i.createExtractors(), this.f60442j, this.f60443k, n(aVar), this, bVar, this.f60444l, this.f60445m);
    }

    @Override // e5.r
    @Nullable
    public Object getTag() {
        return this.f60446n;
    }

    @Override // e5.r
    public void k(q qVar) {
        ((e0) qVar).N();
    }

    @Override // e5.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // e5.e0.c
    public void onSourceInfoRefreshed(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f60447o;
        }
        if (this.f60447o == j10 && this.f60448p == z10 && this.f60449q == z11) {
            return;
        }
        v(j10, z10, z11);
    }

    @Override // e5.b
    public void s(@Nullable y5.q qVar) {
        this.f60450r = qVar;
        this.f60442j.prepare();
        v(this.f60447o, this.f60448p, this.f60449q);
    }

    @Override // e5.b
    public void u() {
        this.f60442j.release();
    }

    public final void v(long j10, boolean z10, boolean z11) {
        this.f60447o = j10;
        this.f60448p = z10;
        this.f60449q = z11;
        t(new l0(this.f60447o, this.f60448p, false, this.f60449q, null, this.f60446n));
    }
}
