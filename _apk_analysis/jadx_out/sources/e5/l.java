package e5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.a;
import e4.v0;
import e5.r;

/* JADX INFO: compiled from: ExtractorMediaSource.java */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public final class l extends e<Void> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f60531j;

    /* JADX INFO: compiled from: ExtractorMediaSource.java */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0296a f60532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public k4.k f60533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f60534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Object f60535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public y5.m f60536e = new com.google.android.exoplayer.upstream.f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f60537f = 1048576;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f60538g;

        public b(a.InterfaceC0296a interfaceC0296a) {
            this.f60532a = interfaceC0296a;
        }

        public l a(Uri uri) {
            this.f60538g = true;
            if (this.f60533b == null) {
                this.f60533b = new k4.e();
            }
            return new l(uri, this.f60532a, this.f60533b, this.f60536e, this.f60534c, this.f60537f, this.f60535d);
        }

        public b b(String str) {
            a6.a.f(!this.f60538g);
            this.f60534c = str;
            return this;
        }

        public b c(k4.k kVar) {
            a6.a.f(!this.f60538g);
            this.f60533b = kVar;
            return this;
        }

        public b d(y5.m mVar) {
            a6.a.f(!this.f60538g);
            this.f60536e = mVar;
            return this;
        }

        @Deprecated
        public b e(int i10) {
            return d(new com.google.android.exoplayer.upstream.f(i10));
        }
    }

    public l(Uri uri, a.InterfaceC0296a interfaceC0296a, k4.k kVar, y5.m mVar, @Nullable String str, int i10, @Nullable Object obj) {
        this.f60531j = new f0(uri, interfaceC0296a, kVar, com.google.android.exoplayer.drm.a.a(), mVar, str, i10, obj);
    }

    @Override // e5.e
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void B(@Nullable Void r12, r rVar, v0 v0Var) {
        t(v0Var);
    }

    @Override // e5.r
    public q b(r.a aVar, y5.b bVar, long j10) {
        return this.f60531j.b(aVar, bVar, j10);
    }

    @Override // e5.r
    @Nullable
    public Object getTag() {
        return this.f60531j.getTag();
    }

    @Override // e5.r
    public void k(q qVar) {
        this.f60531j.k(qVar);
    }

    @Override // e5.e, e5.b
    public void s(@Nullable y5.q qVar) {
        super.s(qVar);
        D(null, this.f60531j);
    }
}
