package com.moloco.sdk.internal.services.events;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public e f47405a = d.f47406a;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    @NotNull
    public String a() {
        return this.f47405a.a();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public void a(boolean z10, boolean z11, @NotNull String str, @NotNull String str2) {
        p.k(str, "appForegroundUrl");
        p.k(str2, "appBackgroundUrl");
        this.f47405a = new e(z10, z11, str, str2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public boolean b() {
        return this.f47405a.d();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    public boolean c() {
        return this.f47405a.c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    @NotNull
    public String d() {
        return this.f47405a.b();
    }
}
