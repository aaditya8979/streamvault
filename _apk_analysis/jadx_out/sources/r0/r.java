package r0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CastInterface.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface r {

    /* JADX INFO: compiled from: CastInterface.kt */
    public static final class a {
        public static void a(@NotNull r rVar, @Nullable String str) {
        }

        public static void b(@NotNull r rVar, @Nullable String str) {
        }

        public static void c(@NotNull r rVar, @Nullable String str) {
        }

        public static void d(@NotNull r rVar, @Nullable String str, @NotNull ds.b<?> bVar) {
            tn.p.k(bVar, "event");
        }
    }

    void a(@Nullable String str);

    void b(@Nullable String str);

    void c(@Nullable String str, @NotNull ds.b<?> bVar);

    void d(@Nullable String str);
}
