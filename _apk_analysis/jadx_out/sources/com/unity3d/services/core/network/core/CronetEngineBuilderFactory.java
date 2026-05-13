package com.unity3d.services.core.network.core;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CronetEngineBuilderFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CronetEngineBuilderFactory {
    @NotNull
    public final CronetEngine.Builder createCronetEngineBuilder(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return new CronetEngine.Builder(context);
    }
}
