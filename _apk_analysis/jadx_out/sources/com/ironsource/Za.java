package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Za f30823a = new Za();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f30824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f30825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f30826c;

        public a(boolean z10, long j10, long j11) {
            this.f30824a = z10;
            this.f30825b = j10;
            this.f30826c = j11;
        }

        public static /* synthetic */ a a(a aVar, boolean z10, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f30824a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f30825b;
            }
            long j12 = j10;
            if ((i10 & 4) != 0) {
                j11 = aVar.f30826c;
            }
            return aVar.a(z10, j12, j11);
        }

        @NotNull
        public final a a(boolean z10, long j10, long j11) {
            return new a(z10, j10, j11);
        }

        public final boolean a() {
            return this.f30824a;
        }

        public final long b() {
            return this.f30825b;
        }

        public final long c() {
            return this.f30826c;
        }

        public final long d() {
            return this.f30825b;
        }

        public final long e() {
            return this.f30826c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30824a == aVar.f30824a && this.f30825b == aVar.f30825b && this.f30826c == aVar.f30826c;
        }

        public final boolean f() {
            return this.f30824a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z10 = this.f30824a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            return (((r02 * 31) + Long.hashCode(this.f30825b)) * 31) + Long.hashCode(this.f30826c);
        }

        @NotNull
        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f30824a + ", refreshInterval=" + this.f30825b + ", visibilityCheckerInterval=" + this.f30826c + ")";
        }
    }

    private Za() {
    }

    @NotNull
    public final Da a(@NotNull C4173o0 c4173o0, @NotNull W2 w22, @NotNull a aVar, @NotNull J2 j22, @NotNull Ea ea2, @NotNull N2 n22, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(w22, "bannerContainer");
        tn.p.k(aVar, "config");
        tn.p.k(j22, "bannerAdProperties");
        tn.p.k(ea2, "strategyListener");
        tn.p.k(n22, "bannerAdUnitFactory");
        tn.p.k(interfaceC4262t4, "timeProvider");
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + aVar.f() + ", refreshInterval: " + aVar.d());
        if (aVar.f()) {
            return new Ha(c4173o0, w22, aVar.d(), aVar.e(), j22, ea2, n22, null, interfaceC4262t4, 128, null);
        }
        Ta ta2 = new Ta(c4173o0, w22, n22);
        ta2.a(ea2);
        return ta2;
    }
}
