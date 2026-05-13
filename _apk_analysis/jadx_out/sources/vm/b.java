package vm;

import com.ironsource.C3978d4;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Timed.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f86122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f86123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f86124c;

    public b(T t10, long j10, TimeUnit timeUnit) {
        this.f86122a = t10;
        this.f86123b = j10;
        this.f86124c = (TimeUnit) fm.a.e(timeUnit, "unit is null");
    }

    public long a() {
        return this.f86123b;
    }

    public T b() {
        return this.f86122a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return fm.a.c(this.f86122a, bVar.f86122a) && this.f86123b == bVar.f86123b && fm.a.c(this.f86124c, bVar.f86124c);
    }

    public int hashCode() {
        T t10 = this.f86122a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f86123b;
        return (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31) + this.f86124c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f86123b + ", unit=" + this.f86124c + ", value=" + this.f86122a + C3978d4.j.f31385e;
    }
}
