package jn;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final void a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    public static final d b(BaseContinuationImpl baseContinuationImpl) {
        return (d) baseContinuationImpl.getClass().getAnnotation(d.class);
    }

    public static final int c(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Nullable
    public static final StackTraceElement d(@NotNull BaseContinuationImpl baseContinuationImpl) {
        String strC;
        p.k(baseContinuationImpl, "<this>");
        d dVarB = b(baseContinuationImpl);
        if (dVarB == null) {
            return null;
        }
        a(1, dVarB.v());
        int iC = c(baseContinuationImpl);
        int i10 = iC < 0 ? -1 : dVarB.l()[iC];
        String strB = g.f72506a.b(baseContinuationImpl);
        if (strB == null) {
            strC = dVarB.c();
        } else {
            strC = strB + '/' + dVarB.c();
        }
        return new StackTraceElement(strC, dVarB.m(), dVarB.f(), i10);
    }
}
