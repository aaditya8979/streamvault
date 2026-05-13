package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Ie implements N8 {
    @Override // com.ironsource.N8
    public void a(@NotNull Context context, @NotNull String str, int i10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "key");
        IronSourceUtils.b(context, str, i10);
    }

    @Override // com.ironsource.N8
    public void a(@NotNull Context context, @NotNull String str, long j10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "key");
        IronSourceUtils.b(context, str, j10);
    }

    @Override // com.ironsource.N8
    public int b(@NotNull Context context, @NotNull String str, int i10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "key");
        return IronSourceUtils.a(context, str, i10);
    }

    @Override // com.ironsource.N8
    public long b(@NotNull Context context, @NotNull String str, long j10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "key");
        return IronSourceUtils.a(context, str, j10);
    }
}
