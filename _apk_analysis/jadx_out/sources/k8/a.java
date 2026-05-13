package k8;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: Binarizer.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f73011a;

    public a(d dVar) {
        this.f73011a = dVar;
    }

    public abstract a a(d dVar);

    public abstract o8.b b() throws NotFoundException;

    public abstract o8.a c(int i10, o8.a aVar) throws NotFoundException;

    public final int d() {
        return this.f73011a.a();
    }

    public final d e() {
        return this.f73011a;
    }

    public final int f() {
        return this.f73011a.d();
    }
}
