package wo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class u<T> extends ClassValue<l1<T>> {
    @Override // java.lang.ClassValue
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l1<T> computeValue(@NotNull Class<?> cls) {
        tn.p.k(cls, "type");
        return new l1<>();
    }
}
