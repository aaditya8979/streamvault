package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f48970b;

    public b(boolean z10, @Nullable String str) {
        this.f48969a = z10;
        this.f48970b = str;
    }

    public final boolean a() {
        return this.f48969a;
    }

    @Nullable
    public final String b() {
        return this.f48970b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f48969a == bVar.f48969a && tn.p.f(this.f48970b, bVar.f48970b);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f48969a) * 31;
        String str = this.f48970b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "AndroidInlineControllerData(enabled=" + this.f48969a + ", url=" + this.f48970b + ')';
    }
}
