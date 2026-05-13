package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Eg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f29279c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f29280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Vc f29281b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final Eg a(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0, @NotNull Vc vc2, @NotNull yg ygVar, @NotNull G g10) {
            tn.p.k(w02, "adTools");
            tn.p.k(abstractC4309w0, "adUnitData");
            tn.p.k(vc2, "outcomeReporter");
            tn.p.k(ygVar, "waterfallInstances");
            tn.p.k(g10, "adInstanceLoadStrategy");
            return abstractC4309w0.q() ? new C4223qf(w02, vc2, ygVar, g10) : new O4(w02, vc2, ygVar);
        }
    }

    public Eg(@NotNull C4173o0 c4173o0, @NotNull Vc vc2) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(vc2, "outcomeReporter");
        this.f29280a = c4173o0;
        this.f29281b = vc2;
    }

    private final void b(A a10, List<? extends A> list) {
        for (A a11 : list) {
            if (a11 == a10) {
                a10.a(true);
                return;
            }
            a11.a(false);
            IronLog.INTERNAL.verbose(C4173o0.a(this.f29280a, a11.q() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(@NotNull A a10);

    public final void a(@NotNull A a10, @Nullable String str, @NotNull C4201pa c4201pa) {
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(c4201pa, "publisherDataHolder");
        this.f29281b.a(a10, str, c4201pa);
    }

    public final void a(@NotNull A a10, @NotNull List<? extends A> list) {
        tn.p.k(a10, "instanceToShow");
        tn.p.k(list, "orderedInstances");
        b(a10, list);
        c(a10);
    }

    public abstract void b(@NotNull A a10);

    public abstract void c(@NotNull A a10);
}
