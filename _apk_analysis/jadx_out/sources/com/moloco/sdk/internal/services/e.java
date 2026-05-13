package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f47368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f47369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f47371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f47372h;

    public e(int i10, float f10, int i11, float f11, float f12, int i12, float f13, float f14) {
        this.f47365a = i10;
        this.f47366b = f10;
        this.f47367c = i11;
        this.f47368d = f11;
        this.f47369e = f12;
        this.f47370f = i12;
        this.f47371g = f13;
        this.f47372h = f14;
    }

    public final float a() {
        return this.f47369e;
    }

    public final int b() {
        return this.f47370f;
    }

    public final float c() {
        return this.f47368d;
    }

    public final int d() {
        return this.f47367c;
    }

    public final float e() {
        return this.f47366b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f47365a == eVar.f47365a && Float.compare(this.f47366b, eVar.f47366b) == 0 && this.f47367c == eVar.f47367c && Float.compare(this.f47368d, eVar.f47368d) == 0 && Float.compare(this.f47369e, eVar.f47369e) == 0 && this.f47370f == eVar.f47370f && Float.compare(this.f47371g, eVar.f47371g) == 0 && Float.compare(this.f47372h, eVar.f47372h) == 0;
    }

    public final int f() {
        return this.f47365a;
    }

    public final float g() {
        return this.f47371g;
    }

    public final float h() {
        return this.f47372h;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f47365a) * 31) + Float.hashCode(this.f47366b)) * 31) + Integer.hashCode(this.f47367c)) * 31) + Float.hashCode(this.f47368d)) * 31) + Float.hashCode(this.f47369e)) * 31) + Integer.hashCode(this.f47370f)) * 31) + Float.hashCode(this.f47371g)) * 31) + Float.hashCode(this.f47372h);
    }

    @NotNull
    public String toString() {
        return "ScreenInfo(screenWidthPx=" + this.f47365a + ", screenWidthDp=" + this.f47366b + ", screenHeightPx=" + this.f47367c + ", screenHeightDp=" + this.f47368d + ", density=" + this.f47369e + ", dpi=" + this.f47370f + ", xdpi=" + this.f47371g + ", ydpi=" + this.f47372h + ')';
    }
}
