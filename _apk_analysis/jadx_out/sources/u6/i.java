package u6;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: IntArrayQueue.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85535a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85536b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85537c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f85538d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85539e;

    public i() {
        this.f85539e = r0.length - 1;
    }

    public void a(int i10) {
        if (this.f85537c == this.f85538d.length) {
            c();
        }
        int i11 = (this.f85536b + 1) & this.f85539e;
        this.f85536b = i11;
        this.f85538d[i11] = i10;
        this.f85537c++;
    }

    public void b() {
        this.f85535a = 0;
        this.f85536b = -1;
        this.f85537c = 0;
    }

    public final void c() {
        int[] iArr = this.f85538d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f85535a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f85538d, 0, iArr2, i11, i10);
        this.f85535a = 0;
        this.f85536b = this.f85537c - 1;
        this.f85538d = iArr2;
        this.f85539e = iArr2.length - 1;
    }

    public boolean d() {
        return this.f85537c == 0;
    }

    public int e() {
        int i10 = this.f85537c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f85538d;
        int i11 = this.f85535a;
        int i12 = iArr[i11];
        this.f85535a = (i11 + 1) & this.f85539e;
        this.f85537c = i10 - 1;
        return i12;
    }
}
