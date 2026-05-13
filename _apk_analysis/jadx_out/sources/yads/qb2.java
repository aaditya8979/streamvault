package yads;

import android.net.Uri;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class qb2 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f93974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r33 f93976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb2 f93977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f93978f;

    public qb2(int i10, p30 p30Var, u30 u30Var, pb2 pb2Var) {
        this.f93976d = new r33(p30Var);
        this.f93974b = u30Var;
        this.f93975c = i10;
        this.f93977e = pb2Var;
        this.f93973a = vf1.a();
    }

    public qb2(p30 p30Var, Uri uri, int i10, pb2 pb2Var) {
        this(i10, p30Var, new t30().a(uri).a(1).a(), pb2Var);
    }

    @Override // yads.bg1
    public final void a() {
        this.f93976d.f94278b = 0L;
        r30 r30Var = new r30(this.f93976d, this.f93974b);
        try {
            r30Var.f94268a.a(r30Var.f94269b);
            r30Var.f94271d = true;
            Uri uri = this.f93976d.f94277a.getUri();
            uri.getClass();
            this.f93978f = this.f93977e.a(uri, r30Var);
        } finally {
            ib3.a((Closeable) r30Var);
        }
    }

    @Override // yads.bg1
    public final void b() {
    }
}
