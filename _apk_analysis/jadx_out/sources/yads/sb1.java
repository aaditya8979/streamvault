package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class sb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94759a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94760b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94761c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f94762d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94763e = 15;

    public final void a(int i10) {
        int i11 = this.f94761c;
        int[] iArr = this.f94762d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f94759a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f94762d, 0, iArr2, i13, i12);
            this.f94759a = 0;
            this.f94760b = this.f94761c - 1;
            this.f94762d = iArr2;
            this.f94763e = length - 1;
        }
        int i14 = (this.f94760b + 1) & this.f94763e;
        this.f94760b = i14;
        this.f94762d[i14] = i10;
        this.f94761c++;
    }
}
