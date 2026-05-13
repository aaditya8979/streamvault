package gl;

import java.util.List;
import kl.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface m extends kl.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f62560a = a.f62561a;

    /* JADX INFO: compiled from: Headers.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f62561a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final m f62562b = h.f62545c;

        @NotNull
        public final m a() {
            return f62562b;
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    public static final class b {
        public static void a(@NotNull m mVar, @NotNull sn.p<? super String, ? super List<String>, bn.r> pVar) {
            tn.p.k(pVar, "body");
            t.a.a(mVar, pVar);
        }

        @Nullable
        public static String b(@NotNull m mVar, @NotNull String str) {
            tn.p.k(str, "name");
            return t.a.b(mVar, str);
        }
    }
}
