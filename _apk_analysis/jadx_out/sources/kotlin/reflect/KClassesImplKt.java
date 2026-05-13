package kotlin.reflect;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: KClassesImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class KClassesImplKt {
    @Nullable
    public static final String getQualifiedOrSimpleName(@NotNull KClass<?> kClass) {
        p.k(kClass, "<this>");
        return kClass.getQualifiedName();
    }
}
