package wl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Pool.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface f<T> extends AutoCloseable {

    /* JADX INFO: compiled from: Pool.kt */
    public static final class a {
        public static <T> void a(@NotNull f<T> fVar) {
            fVar.dispose();
        }
    }

    @NotNull
    T E();

    void dispose();

    void r(@NotNull T t10);
}
