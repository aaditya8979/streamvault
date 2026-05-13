package n8;

/* JADX INFO: compiled from: Token.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f75276b = new e(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f75277a;

    public g(g gVar) {
        this.f75277a = gVar;
    }

    public final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    public final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    public abstract void c(o8.a aVar, byte[] bArr);

    public final g d() {
        return this.f75277a;
    }
}
