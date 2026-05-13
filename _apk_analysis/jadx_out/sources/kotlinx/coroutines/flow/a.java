package kotlinx.coroutines.flow;

import go.d;
import go.t;
import go.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0862a f73397a = C0862a.f73398a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    public static final class C0862a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0862a f73398a = new C0862a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f73399b = new t();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f73400c = new StartedLazily();

        public static /* synthetic */ a b(C0862a c0862a, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return c0862a.a(j10, j11);
        }

        @NotNull
        public final a a(long j10, long j11) {
            return new StartedWhileSubscribed(j10, j11);
        }

        @NotNull
        public final a c() {
            return f73399b;
        }

        @NotNull
        public final a d() {
            return f73400c;
        }
    }

    @NotNull
    d<SharingCommand> a(@NotNull u<Integer> uVar);
}
