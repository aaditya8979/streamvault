package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3997e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3997e5 f31533a = new C3997e5();

    private C3997e5() {
    }

    private final int a(Context context, int i10) {
        return vn.c.d(i10 / context.getResources().getDisplayMetrics().density);
    }

    public final int a(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final int b(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }
}
