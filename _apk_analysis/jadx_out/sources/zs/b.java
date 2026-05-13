package zs;

import android.view.View;

/* JADX INFO: compiled from: MeasureHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98418d;

    public int[] a(int i10, int i11) {
        int i12;
        int i13 = this.f98418d;
        if (i13 == 90 || i13 == 270) {
            int i14 = i10 + i11;
            i11 = i14 - i11;
            i10 = i14 - i11;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = this.f98416b;
        if (i15 == 0 || (i12 = this.f98415a) == 0) {
            return new int[]{size, size2};
        }
        int i16 = this.f98417c;
        if (i16 == 1) {
            i11 = (size / 16) * 9;
            if (size2 <= i11) {
                i10 = (size2 / 9) * 16;
                i11 = size2;
            }
            i10 = size;
        } else if (i16 == 2) {
            i11 = (size / 4) * 3;
            if (size2 <= i11) {
                i10 = (size2 / 3) * 4;
                i11 = size2;
            }
            i10 = size;
        } else if (i16 != 3) {
            if (i16 == 4) {
                i11 = i15;
                i10 = i12;
            } else if (i16 != 5) {
                if (i12 * size2 < size * i15) {
                    i10 = (i12 * size2) / i15;
                } else if (i12 * size2 > size * i15) {
                    i11 = (i15 * size) / i12;
                    i10 = size;
                } else {
                    i10 = size;
                }
                i11 = size2;
            } else if (i12 * size2 > size * i15) {
                i10 = (i12 * size2) / i15;
                i11 = size2;
            } else {
                i11 = (i15 * size) / i12;
                i10 = size;
            }
        }
        return new int[]{i10, i11};
    }

    public void b(int i10) {
        this.f98417c = i10;
    }

    public void c(int i10) {
        this.f98418d = i10;
    }

    public void d(int i10, int i11) {
        this.f98415a = i10;
        this.f98416b = i11;
    }
}
