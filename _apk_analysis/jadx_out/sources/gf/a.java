package gf;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: ScarAdBase.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f62374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f62375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cf.c f62376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ff.a f62377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f62378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public af.c f62379f;

    public a(Context context, cf.c cVar, ff.a aVar, af.c cVar2) {
        this.f62375b = context;
        this.f62376c = cVar;
        this.f62377d = aVar;
        this.f62379f = cVar2;
    }

    public void a(cf.b bVar) {
        AdRequest adRequestB = this.f62377d.b(this.f62376c.a());
        if (bVar != null) {
            this.f62378e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    public abstract void b(AdRequest adRequest, cf.b bVar);

    public void c(T t10) {
        this.f62374a = t10;
    }
}
