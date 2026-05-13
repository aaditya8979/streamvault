package com.moloco.sdk.internal.android_context;

import android.annotation.SuppressLint;
import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"StaticFieldLeak"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f45918a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Context f45919b;

    @NotNull
    public final Context a() {
        Context context = f45919b;
        if (context != null) {
            return context;
        }
        p.C("value");
        return null;
    }

    public final void b(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        f45919b = context.getApplicationContext();
    }
}
