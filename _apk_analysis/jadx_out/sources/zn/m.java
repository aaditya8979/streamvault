package zn;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes11.dex */
public class m {
    public static final void a(boolean z10, @NotNull Number number) {
        p.k(number, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    @NotNull
    public static final e<Float> b(float f10, float f11) {
        return new d(f10, f11);
    }
}
