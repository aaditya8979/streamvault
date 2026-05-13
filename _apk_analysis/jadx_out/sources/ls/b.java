package ls;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: AbstractStreamClientConfiguration.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f73924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73925b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73926c = 5;

    public b(ExecutorService executorService) {
        this.f73924a = executorService;
    }

    @Override // ls.k
    public int a() {
        return this.f73925b;
    }

    @Override // ls.k
    public int b() {
        return this.f73926c;
    }

    @Override // ls.k
    public ExecutorService c() {
        return this.f73924a;
    }

    public String d(int i10, int i11) {
        return new ir.i(i10, i11).toString();
    }
}
