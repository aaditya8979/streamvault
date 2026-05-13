package zk;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f98298d = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final kl.a<g0> f98299e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Long f98300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Long f98301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Long f98302c;

    /* JADX INFO: compiled from: HttpTimeout.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kTypeM = null;
        KClass kClassB = tn.t.b(g0.class);
        try {
            kTypeM = tn.t.m(g0.class);
        } catch (Throwable unused) {
        }
        f98299e = new kl.a<>("TimeoutConfiguration", new rl.a(kClassB, kTypeM));
    }

    public g0(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        this.f98300a = 0L;
        this.f98301b = 0L;
        this.f98302c = 0L;
        f(l10);
        e(l11);
        g(l12);
    }

    public /* synthetic */ g0(Long l10, Long l11, Long l12, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : l12);
    }

    public final Long a(Long l10) {
        if (l10 == null || l10.longValue() > 0) {
            return l10;
        }
        throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS".toString());
    }

    @Nullable
    public final Long b() {
        return this.f98301b;
    }

    @Nullable
    public final Long c() {
        return this.f98300a;
    }

    @Nullable
    public final Long d() {
        return this.f98302c;
    }

    public final void e(@Nullable Long l10) {
        this.f98301b = a(l10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return tn.p.f(this.f98300a, g0Var.f98300a) && tn.p.f(this.f98301b, g0Var.f98301b) && tn.p.f(this.f98302c, g0Var.f98302c);
    }

    public final void f(@Nullable Long l10) {
        this.f98300a = a(l10);
    }

    public final void g(@Nullable Long l10) {
        this.f98302c = a(l10);
    }

    public int hashCode() {
        Long l10 = this.f98300a;
        int iHashCode = (l10 != null ? l10.hashCode() : 0) * 31;
        Long l11 = this.f98301b;
        int iHashCode2 = (iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
        Long l12 = this.f98302c;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }
}
