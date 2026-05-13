package bo;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class a {
        @NotNull
        public static b a(@NotNull l lVar) {
            return new b(lVar);
        }
    }

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final l f5698a;

        public b(@NotNull l lVar) {
            tn.p.k(lVar, "match");
            this.f5698a = lVar;
        }

        @NotNull
        public final l a() {
            return this.f5698a;
        }
    }

    @NotNull
    b a();

    @NotNull
    List<String> b();

    @NotNull
    zn.i c();

    @NotNull
    String getValue();

    @Nullable
    l next();
}
