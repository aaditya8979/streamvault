package r7;

import androidx.annotation.Nullable;
import java.util.Arrays;
import r7.b;
import s7.m0;

/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final byte[] f78778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a[] f78782g;

    public l(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public l(boolean z10, int i10, int i11) {
        s7.a.a(i10 > 0);
        s7.a.a(i11 >= 0);
        this.f78776a = z10;
        this.f78777b = i10;
        this.f78781f = i11;
        this.f78782g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f78778c = null;
            return;
        }
        this.f78778c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f78782g[i12] = new a(this.f78778c, i12 * i10);
        }
    }

    @Override // r7.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f78782g;
        int i10 = this.f78781f;
        this.f78781f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f78780e--;
        notifyAll();
    }

    @Override // r7.b
    public synchronized a allocate() {
        a aVar;
        this.f78780e++;
        int i10 = this.f78781f;
        if (i10 > 0) {
            a[] aVarArr = this.f78782g;
            int i11 = i10 - 1;
            this.f78781f = i11;
            aVar = (a) s7.a.e(aVarArr[i11]);
            this.f78782g[this.f78781f] = null;
        } else {
            aVar = new a(new byte[this.f78777b], 0);
            int i12 = this.f78780e;
            a[] aVarArr2 = this.f78782g;
            if (i12 > aVarArr2.length) {
                this.f78782g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // r7.b
    public synchronized void b(@Nullable b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f78782g;
            int i10 = this.f78781f;
            this.f78781f = i10 + 1;
            aVarArr[i10] = aVar.getAllocation();
            this.f78780e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    public synchronized int c() {
        return this.f78780e * this.f78777b;
    }

    public synchronized void d() {
        if (this.f78776a) {
            e(0);
        }
    }

    public synchronized void e(int i10) {
        boolean z10 = i10 < this.f78779d;
        this.f78779d = i10;
        if (z10) {
            trim();
        }
    }

    @Override // r7.b
    public int getIndividualAllocationLength() {
        return this.f78777b;
    }

    @Override // r7.b
    public synchronized void trim() {
        int i10 = 0;
        int iMax = Math.max(0, m0.l(this.f78779d, this.f78777b) - this.f78780e);
        int i11 = this.f78781f;
        if (iMax >= i11) {
            return;
        }
        if (this.f78778c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) s7.a.e(this.f78782g[i10]);
                if (aVar.f78731a == this.f78778c) {
                    i10++;
                } else {
                    a aVar2 = (a) s7.a.e(this.f78782g[i12]);
                    if (aVar2.f78731a != this.f78778c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f78782g;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.f78781f) {
                return;
            }
        }
        Arrays.fill(this.f78782g, iMax, this.f78781f, (Object) null);
        this.f78781f = iMax;
    }
}
