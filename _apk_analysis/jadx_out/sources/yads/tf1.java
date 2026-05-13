package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class tf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95194d;

    public tf1(int i10, int i11, int i12, int i13) {
        this.f95191a = i10;
        this.f95192b = i11;
        this.f95193c = i12;
        this.f95194d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f95191a - this.f95192b > 1) {
                return true;
            }
        } else if (this.f95193c - this.f95194d > 1) {
            return true;
        }
        return false;
    }
}
