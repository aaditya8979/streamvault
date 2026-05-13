package y5;

import a6.k0;
import java.util.Arrays;

/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes11.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f87281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f87282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a[] f87286h;

    public i(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public i(boolean z10, int i10, int i11) {
        a6.a.a(i10 > 0);
        a6.a.a(i11 >= 0);
        this.f87279a = z10;
        this.f87280b = i10;
        this.f87285g = i11;
        this.f87286h = new a[i11 + 100];
        if (i11 > 0) {
            this.f87281c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f87286h[i12] = new a(this.f87281c, i12 * i10);
            }
        } else {
            this.f87281c = null;
        }
        this.f87282d = new a[1];
    }

    @Override // y5.b
    public synchronized void a(a[] aVarArr) {
        int i10 = this.f87285g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f87286h;
        if (length >= aVarArr2.length) {
            this.f87286h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f87286h;
            int i11 = this.f87285g;
            this.f87285g = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f87284f -= aVarArr.length;
        notifyAll();
    }

    @Override // y5.b
    public synchronized a allocate() {
        a aVar;
        this.f87284f++;
        int i10 = this.f87285g;
        if (i10 > 0) {
            a[] aVarArr = this.f87286h;
            int i11 = i10 - 1;
            this.f87285g = i11;
            aVar = aVarArr[i11];
            aVarArr[i11] = null;
        } else {
            aVar = new a(new byte[this.f87280b], 0);
        }
        return aVar;
    }

    @Override // y5.b
    public synchronized void b(a aVar) {
        a[] aVarArr = this.f87282d;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    public synchronized int c() {
        return this.f87284f * this.f87280b;
    }

    public synchronized void d() {
        if (this.f87279a) {
            e(0);
        }
    }

    public synchronized void e(int i10) {
        boolean z10 = i10 < this.f87283e;
        this.f87283e = i10;
        if (z10) {
            trim();
        }
    }

    @Override // y5.b
    public int getIndividualAllocationLength() {
        return this.f87280b;
    }

    @Override // y5.b
    public synchronized void trim() {
        int i10 = 0;
        int iMax = Math.max(0, k0.k(this.f87283e, this.f87280b) - this.f87284f);
        int i11 = this.f87285g;
        if (iMax >= i11) {
            return;
        }
        if (this.f87281c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a[] aVarArr = this.f87286h;
                a aVar = aVarArr[i10];
                byte[] bArr = aVar.f87254a;
                byte[] bArr2 = this.f87281c;
                if (bArr == bArr2) {
                    i10++;
                } else {
                    a aVar2 = aVarArr[i12];
                    if (aVar2.f87254a != bArr2) {
                        i12--;
                    } else {
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.f87285g) {
                return;
            }
        }
        Arrays.fill(this.f87286h, iMax, this.f87285g, (Object) null);
        this.f87285g = iMax;
    }
}
