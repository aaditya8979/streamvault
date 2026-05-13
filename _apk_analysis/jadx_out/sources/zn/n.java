package zn;

import java.util.NoSuchElementException;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import tn.p;
import zn.g;

/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes11.dex */
public class n extends m {
    public static final double c(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static final float d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final int e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static final long f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T g(@NotNull T t10, @NotNull T t11) {
        p.k(t10, "<this>");
        p.k(t11, "minimumValue");
        return t10.compareTo(t11) < 0 ? t11 : t10;
    }

    public static final double h(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static final float i(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final int j(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static final long k(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static final double l(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static final float m(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static final int n(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final int o(int i10, @NotNull f<Integer> fVar) {
        p.k(fVar, "range");
        if (fVar instanceof e) {
            return ((Number) q(Integer.valueOf(i10), (e) fVar)).intValue();
        }
        if (!fVar.isEmpty()) {
            return i10 < ((Number) fVar.getStart()).intValue() ? ((Number) fVar.getStart()).intValue() : i10 > ((Number) fVar.getEndInclusive()).intValue() ? ((Number) fVar.getEndInclusive()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
    }

    public static final long p(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T q(@NotNull T t10, @NotNull e<T> eVar) {
        p.k(t10, "<this>");
        p.k(eVar, "range");
        if (!eVar.isEmpty()) {
            return (!eVar.a(t10, eVar.getStart()) || eVar.a(eVar.getStart(), t10)) ? (!eVar.a(eVar.getEndInclusive(), t10) || eVar.a(t10, eVar.getEndInclusive())) ? t10 : eVar.getEndInclusive() : eVar.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
    }

    @NotNull
    public static final g r(int i10, int i11) {
        return g.f98353e.a(i10, i11, -1);
    }

    public static final int s(@NotNull i iVar, @NotNull Random random) {
        p.k(iVar, "<this>");
        p.k(random, "random");
        try {
            return xn.d.f(random, iVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @NotNull
    public static final g t(@NotNull g gVar) {
        p.k(gVar, "<this>");
        return g.f98353e.a(gVar.g(), gVar.f(), -gVar.h());
    }

    @NotNull
    public static final g u(@NotNull g gVar, int i10) {
        p.k(gVar, "<this>");
        m.a(i10 > 0, Integer.valueOf(i10));
        g.a aVar = g.f98353e;
        int iF = gVar.f();
        int iG = gVar.g();
        if (gVar.h() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iF, iG, i10);
    }

    @NotNull
    public static final i v(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? i.f98361f.a() : new i(i10, i11 - 1);
    }
}
