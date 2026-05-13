package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Ge implements Fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final N8 f29473a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29474a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f29475b = "sessionNumber";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f29476c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ge() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Ge(@NotNull N8 n82) {
        tn.p.k(n82, "sdkSharedPref");
        this.f29473a = n82;
    }

    public /* synthetic */ Ge(N8 n82, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new Ie() : n82);
    }

    @Override // com.ironsource.InterfaceC4187oe
    public long a(@NotNull Context context, long j10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return this.f29473a.b(context, "firstSessionTimestamp", j10);
    }

    @Override // com.ironsource.He
    public void a(@NotNull Context context, int i10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f29473a.a(context, a.f29475b, i10);
    }

    @Override // com.ironsource.He
    public int b(@NotNull Context context, int i10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return this.f29473a.b(context, a.f29475b, i10);
    }

    @Override // com.ironsource.InterfaceC4187oe
    public void b(@NotNull Context context, long j10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f29473a.a(context, "firstSessionTimestamp", j10);
    }
}
