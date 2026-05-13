package yads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class f23 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz f89464c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f89463b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89462a = -1;

    public f23(iz izVar) {
        this.f89464c = izVar;
    }

    public final void a(int i10) {
        for (int size = this.f89463b.size() - 1; size >= 0 && i10 < this.f89463b.keyAt(size); size--) {
            this.f89464c.accept(this.f89463b.valueAt(size));
            this.f89463b.removeAt(size);
        }
        this.f89462a = this.f89463b.size() > 0 ? Math.min(this.f89462a, this.f89463b.size() - 1) : -1;
    }

    public final void b(int i10) {
        int i11 = 0;
        while (i11 < this.f89463b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f89463b.keyAt(i12)) {
                return;
            }
            this.f89464c.accept(this.f89463b.valueAt(i11));
            this.f89463b.removeAt(i11);
            int i13 = this.f89462a;
            if (i13 > 0) {
                this.f89462a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final Object c(int i10) {
        if (this.f89462a == -1) {
            this.f89462a = 0;
        }
        while (true) {
            int i11 = this.f89462a;
            if (i11 <= 0 || i10 >= this.f89463b.keyAt(i11)) {
                break;
            }
            this.f89462a--;
        }
        while (this.f89462a < this.f89463b.size() - 1 && i10 >= this.f89463b.keyAt(this.f89462a + 1)) {
            this.f89462a++;
        }
        return this.f89463b.valueAt(this.f89462a);
    }
}
