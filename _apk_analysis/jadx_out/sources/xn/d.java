package xn;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import tn.p;
import zn.i;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    @NotNull
    public static final String a(@NotNull Object obj, @NotNull Object obj2) {
        p.k(obj, TypedValues.TransitionType.S_FROM);
        p.k(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(double d10, double d11) {
        if (!(d11 > d10)) {
            throw new IllegalArgumentException(a(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void c(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void d(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int e(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int f(@NotNull Random random, @NotNull i iVar) {
        p.k(random, "<this>");
        p.k(iVar, "range");
        if (!iVar.isEmpty()) {
            return iVar.g() < Integer.MAX_VALUE ? random.nextInt(iVar.f(), iVar.g() + 1) : iVar.f() > Integer.MIN_VALUE ? random.nextInt(iVar.f() - 1, iVar.g()) + 1 : random.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + iVar);
    }

    public static final int g(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
