package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f47565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f47566c;

    public w(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        tn.p.k(str, "applicationName");
        tn.p.k(str2, HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        tn.p.k(str3, "version");
        this.f47564a = str;
        this.f47565b = str2;
        this.f47566c = str3;
    }

    @NotNull
    public final String a() {
        return this.f47565b;
    }

    @NotNull
    public final String b() {
        return this.f47566c;
    }
}
