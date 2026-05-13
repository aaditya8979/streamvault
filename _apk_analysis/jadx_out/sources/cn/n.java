package cn;

import java.lang.reflect.Array;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArraysJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class n {
    @NotNull
    public static final <T> T[] a(@NotNull T[] tArr, int i10) {
        tn.p.k(tArr, "reference");
        Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        tn.p.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
