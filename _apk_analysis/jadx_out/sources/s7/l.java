package s7;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: FlagSet.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f79483a;

    /* JADX INFO: compiled from: FlagSet.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f79484a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f79485b;

        public b a(int i10) {
            s7.a.g(!this.f79485b);
            this.f79484a.append(i10, true);
            return this;
        }

        public b b(l lVar) {
            for (int i10 = 0; i10 < lVar.d(); i10++) {
                a(lVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public l e() {
            s7.a.g(!this.f79485b);
            this.f79485b = true;
            return new l(this.f79484a);
        }
    }

    public l(SparseBooleanArray sparseBooleanArray) {
        this.f79483a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f79483a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        s7.a.c(i10, 0, d());
        return this.f79483a.keyAt(i10);
    }

    public int d() {
        return this.f79483a.size();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (m0.f79487a >= 24) {
            return this.f79483a.equals(lVar.f79483a);
        }
        if (d() != lVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != lVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (m0.f79487a >= 24) {
            return this.f79483a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }
}
