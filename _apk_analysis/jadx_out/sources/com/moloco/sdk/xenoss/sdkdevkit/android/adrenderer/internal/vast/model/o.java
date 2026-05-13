package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f49909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f49910b;

    public o(@NotNull String str, @NotNull List<String> list) {
        tn.p.k(str, "clickThroughUrl");
        tn.p.k(list, "clickTrackingUrlList");
        this.f49909a = str;
        this.f49910b = list;
    }

    @NotNull
    public final String a() {
        return this.f49909a;
    }

    @NotNull
    public final List<String> b() {
        return this.f49910b;
    }
}
