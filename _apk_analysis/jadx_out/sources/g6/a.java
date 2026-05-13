package g6;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62083b;

    public final void a(int i10) {
        this.f62083b = i10 | this.f62083b;
    }

    public void b() {
        this.f62083b = 0;
    }

    public final void c(int i10) {
        this.f62083b = (~i10) & this.f62083b;
    }

    public final boolean d(int i10) {
        return (this.f62083b & i10) == i10;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean i() {
        return d(134217728);
    }

    public final boolean j() {
        return d(1);
    }

    public final void k(int i10) {
        this.f62083b = i10;
    }
}
