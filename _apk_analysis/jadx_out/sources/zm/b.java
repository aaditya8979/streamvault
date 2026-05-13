package zm;

/* JADX INFO: compiled from: AsyncEvent.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f98330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f98331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f98332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f98333d;

    public b(a aVar, p pVar, t tVar) {
        this(aVar, pVar, tVar, null);
    }

    public b(a aVar, p pVar, t tVar, Throwable th2) {
        this.f98330a = aVar;
        this.f98331b = pVar;
        this.f98332c = tVar;
        this.f98333d = th2;
    }

    public p a() {
        return this.f98331b;
    }

    public t b() {
        return this.f98332c;
    }

    public Throwable c() {
        return this.f98333d;
    }
}
