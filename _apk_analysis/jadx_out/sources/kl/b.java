package kl;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Attributes.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface b {

    /* JADX INFO: compiled from: Attributes.kt */
    public static final class a {
        @NotNull
        public static <T> T a(@NotNull b bVar, @NotNull kl.a<T> aVar) {
            tn.p.k(aVar, "key");
            T t10 = (T) bVar.e(aVar);
            if (t10 != null) {
                return t10;
            }
            throw new IllegalStateException("No instance for key " + aVar);
        }
    }

    @NotNull
    <T> T a(@NotNull kl.a<T> aVar);

    <T> void b(@NotNull kl.a<T> aVar);

    @NotNull
    <T> T c(@NotNull kl.a<T> aVar, @NotNull sn.a<? extends T> aVar2);

    @NotNull
    List<kl.a<?>> d();

    @Nullable
    <T> T e(@NotNull kl.a<T> aVar);

    <T> void f(@NotNull kl.a<T> aVar, @NotNull T t10);

    boolean g(@NotNull kl.a<?> aVar);
}
