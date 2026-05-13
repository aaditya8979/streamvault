package e7;

import android.util.SparseArray;

/* JADX INFO: compiled from: SpannedData.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e0<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.h<V> f60861c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f60860b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60859a = -1;

    public e0(s7.h<V> hVar) {
        this.f60861c = hVar;
    }

    public void a(int i10, V v10) {
        if (this.f60859a == -1) {
            s7.a.g(this.f60860b.size() == 0);
            this.f60859a = 0;
        }
        if (this.f60860b.size() > 0) {
            SparseArray<V> sparseArray = this.f60860b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            s7.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                s7.h<V> hVar = this.f60861c;
                SparseArray<V> sparseArray2 = this.f60860b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f60860b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f60860b.size(); i10++) {
            this.f60861c.accept(this.f60860b.valueAt(i10));
        }
        this.f60859a = -1;
        this.f60860b.clear();
    }

    public void c(int i10) {
        for (int size = this.f60860b.size() - 1; size >= 0 && i10 < this.f60860b.keyAt(size); size--) {
            this.f60861c.accept(this.f60860b.valueAt(size));
            this.f60860b.removeAt(size);
        }
        this.f60859a = this.f60860b.size() > 0 ? Math.min(this.f60859a, this.f60860b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f60860b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f60860b.keyAt(i12)) {
                return;
            }
            this.f60861c.accept(this.f60860b.valueAt(i11));
            this.f60860b.removeAt(i11);
            int i13 = this.f60859a;
            if (i13 > 0) {
                this.f60859a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f60859a == -1) {
            this.f60859a = 0;
        }
        while (true) {
            int i11 = this.f60859a;
            if (i11 <= 0 || i10 >= this.f60860b.keyAt(i11)) {
                break;
            }
            this.f60859a--;
        }
        while (this.f60859a < this.f60860b.size() - 1 && i10 >= this.f60860b.keyAt(this.f60859a + 1)) {
            this.f60859a++;
        }
        return this.f60860b.valueAt(this.f60859a);
    }

    public V f() {
        return this.f60860b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f60860b.size() == 0;
    }
}
