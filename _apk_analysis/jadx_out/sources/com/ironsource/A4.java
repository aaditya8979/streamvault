package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class A4 implements S8, R8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final A7 f28724a;

    /* JADX WARN: Multi-variable type inference failed */
    public A4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public A4(@NotNull A7 a72) {
        tn.p.k(a72, "sharedSignalsStorageFactory");
        this.f28724a = a72;
    }

    public /* synthetic */ A4(A7 a72, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new D4() : a72);
    }

    @Override // com.ironsource.S8
    @Nullable
    public String a(@NotNull Context context, @NotNull EnumC4364z4 enumC4364z4, @NotNull String str) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(enumC4364z4, "source");
        tn.p.k(str, "key");
        F4 f4A = this.f28724a.a(context, enumC4364z4);
        if (f4A != null) {
            return F4.a(f4A, str, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC4364z4);
        return null;
    }

    @Override // com.ironsource.R8
    public void a(@NotNull Context context, @NotNull EnumC4364z4 enumC4364z4, @NotNull String str, @NotNull String str2) {
        bn.r rVar;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(enumC4364z4, "source");
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        F4 f4A = this.f28724a.a(context, enumC4364z4);
        if (f4A != null) {
            f4A.b(str, str2);
            rVar = bn.r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC4364z4);
        }
    }
}
