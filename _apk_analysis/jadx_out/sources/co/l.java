package co;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f6784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6785b;

    public l(T t10, long j10) {
        this.f6784a = t10;
        this.f6785b = j10;
    }

    public /* synthetic */ l(Object obj, long j10, tn.i iVar) {
        this(obj, j10);
    }

    public final T a() {
        return this.f6784a;
    }

    public final long b() {
        return this.f6785b;
    }

    public final T c() {
        return this.f6784a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p.f(this.f6784a, lVar.f6784a) && b.l(this.f6785b, lVar.f6785b);
    }

    public int hashCode() {
        T t10 = this.f6784a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + b.z(this.f6785b);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.f6784a + ", duration=" + ((Object) b.M(this.f6785b)) + ')';
    }
}
