package com.unity3d.ads.beta;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.utils.i;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UnityAdsBeta.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class UnityAdsBeta {
    public static final void getToken(@NotNull TokenConfiguration tokenConfiguration, @NotNull TokenListener tokenListener) {
        p.k(tokenConfiguration, i.f53156c);
        p.k(tokenListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @NotNull
    public static final String getVersion() {
        return "";
    }

    public static final void initialize(@NotNull InitializationConfiguration initializationConfiguration, @NotNull InitializationListener initializationListener) {
        p.k(initializationConfiguration, i.f53156c);
        p.k(initializationListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public static final boolean isInitialize() {
        return true;
    }
}
