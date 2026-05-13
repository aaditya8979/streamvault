package kf;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: ScarAdBase.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f73080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f73081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cf.c f73082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jf.a f73083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f73084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public af.c f73085f;

    public a(Context context, cf.c cVar, jf.a aVar, af.c cVar2) {
        this.f73081b = context;
        this.f73082c = cVar;
        this.f73083d = aVar;
        this.f73085f = cVar2;
    }

    public void a(cf.b bVar) {
        AdRequest adRequestB = this.f73083d.b(this.f73082c.a());
        if (bVar != null) {
            this.f73084e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    public abstract void b(AdRequest adRequest, cf.b bVar);

    public void c(T t10) {
        this.f73080a = t10;
    }
}
