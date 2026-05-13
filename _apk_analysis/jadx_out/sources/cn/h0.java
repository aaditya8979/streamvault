package cn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f6743b;

    public h0(int i10, T t10) {
        this.f6742a = i10;
        this.f6743b = t10;
    }

    public final int a() {
        return this.f6742a;
    }

    public final T b() {
        return this.f6743b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f6742a == h0Var.f6742a && tn.p.f(this.f6743b, h0Var.f6743b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f6742a) * 31;
        T t10 = this.f6743b;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.f6742a + ", value=" + this.f6743b + ')';
    }
}
