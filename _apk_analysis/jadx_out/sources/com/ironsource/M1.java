package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class M1 implements InterfaceC4180o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final I7 f29821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private N1 f29822b;

    public static final class a {
        @NotNull
        public final N1 a(@Nullable K1 k12, @NotNull I7 i72) {
            tn.p.k(i72, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + i72.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (k12 != null ? Boolean.valueOf(k12.k()) : null));
            boolean z10 = false;
            if (i72.a()) {
                C3952be.i().a(new C5(D5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((k12 != null ? k12.k() : false) && i72.a()) {
                z10 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z10);
            return z10 ? new C4293v1() : new X7();
        }
    }

    public M1(@NotNull I7 i72) {
        tn.p.k(i72, "featureAvailabilityService");
        this.f29821a = i72;
    }

    @Override // com.ironsource.InterfaceC4180o7
    public void a(@Nullable K1 k12) {
        if (this.f29822b == null) {
            this.f29822b = new a().a(k12, this.f29821a);
        }
    }

    @Override // com.ironsource.N1
    public void a(@NotNull InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "observer");
        N1 n12 = this.f29822b;
        if (n12 != null) {
            n12.a(interfaceC4145ma);
        }
    }

    @Override // com.ironsource.N1
    public void b(@NotNull InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "observer");
        N1 n12 = this.f29822b;
        if (n12 != null) {
            n12.b(interfaceC4145ma);
        }
    }
}
