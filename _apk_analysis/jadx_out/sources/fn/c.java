package fn;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
public class c extends b {
    public static final float g(float f10, @NotNull float... fArr) {
        p.k(fArr, "other");
        for (float f11 : fArr) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    public static final int h(int i10, @NotNull int... iArr) {
        p.k(iArr, "other");
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T i(@NotNull T t10, @NotNull T t11) {
        p.k(t10, "a");
        p.k(t11, "b");
        return t10.compareTo(t11) >= 0 ? t10 : t11;
    }

    public static final float j(float f10, @NotNull float... fArr) {
        p.k(fArr, "other");
        for (float f11 : fArr) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }
}
