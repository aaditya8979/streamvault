package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f48966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f48967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48968e;

    public a(boolean z10, boolean z11, @Nullable String str, @Nullable String str2, boolean z12) {
        this.f48964a = z10;
        this.f48965b = z11;
        this.f48966c = str;
        this.f48967d = str2;
        this.f48968e = z12;
    }

    @Nullable
    public final String a() {
        return this.f48967d;
    }

    public final boolean b() {
        return this.f48964a;
    }

    @Nullable
    public final String c() {
        return this.f48966c;
    }

    public final boolean d() {
        return this.f48968e;
    }

    public final boolean e() {
        return this.f48965b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f48964a == aVar.f48964a && this.f48965b == aVar.f48965b && tn.p.f(this.f48966c, aVar.f48966c) && tn.p.f(this.f48967d, aVar.f48967d) && this.f48968e == aVar.f48968e;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f48964a) * 31) + Boolean.hashCode(this.f48965b)) * 31;
        String str = this.f48966c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48967d;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f48968e);
    }

    @NotNull
    public String toString() {
        return "AndroidAutoInlineControllerData(enabled=" + this.f48964a + ", onSkip=" + this.f48965b + ", eventLink=" + this.f48966c + ", clickthroughUrl=" + this.f48967d + ", forceFullscreen=" + this.f48968e + ')';
    }
}
