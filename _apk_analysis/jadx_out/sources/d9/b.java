package d9;

/* JADX INFO: compiled from: ModulusGF.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f59727f = new b(929, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f59728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f59729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f59730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f59731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59732e;

    public b(int i10, int i11) {
        this.f59732e = i10;
        this.f59728a = new int[i10];
        this.f59729b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f59728a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f59729b[this.f59728a[i14]] = i14;
        }
        this.f59730c = new c(this, new int[]{0});
        this.f59731d = new c(this, new int[]{1});
    }

    public int a(int i10, int i11) {
        return (i10 + i11) % this.f59732e;
    }

    public c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f59730c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new c(this, iArr);
    }

    public int c(int i10) {
        return this.f59728a[i10];
    }

    public c d() {
        return this.f59731d;
    }

    public int e() {
        return this.f59732e;
    }

    public c f() {
        return this.f59730c;
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.f59728a[(this.f59732e - this.f59729b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f59729b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f59728a;
        int[] iArr2 = this.f59729b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f59732e - 1)];
    }

    public int j(int i10, int i11) {
        int i12 = this.f59732e;
        return ((i10 + i12) - i11) % i12;
    }
}
