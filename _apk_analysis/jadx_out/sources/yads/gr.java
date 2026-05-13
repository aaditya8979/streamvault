package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class gr {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fr f90088e = new fr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f90089a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f90090b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90091c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90092d = 4096;

    public final synchronized void a() {
        while (this.f90091c > this.f90092d) {
            byte[] bArr = (byte[]) this.f90089a.remove(0);
            this.f90090b.remove(bArr);
            this.f90091c -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f90092d) {
                this.f90089a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f90090b, bArr, f90088e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f90090b.add(iBinarySearch, bArr);
                this.f90091c += bArr.length;
                a();
            }
        }
    }

    public final synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f90090b.size(); i11++) {
            byte[] bArr = (byte[]) this.f90090b.get(i11);
            if (bArr.length >= i10) {
                this.f90091c -= bArr.length;
                this.f90090b.remove(i11);
                this.f90089a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }
}
