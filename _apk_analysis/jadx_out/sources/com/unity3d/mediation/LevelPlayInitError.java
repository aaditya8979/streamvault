package com.unity3d.mediation;

import com.ironsource.C4169ne;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelPlayInitError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53498b;

    public LevelPlayInitError(int i10, @NotNull String str) {
        p.k(str, "errorMessage");
        this.f53497a = i10;
        this.f53498b = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@NotNull C4169ne c4169ne) {
        this(c4169ne.c(), c4169ne.d());
        p.k(c4169ne, "sdkError");
    }

    public final int getErrorCode() {
        return this.f53497a;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.f53498b;
    }

    @NotNull
    public String toString() {
        return "LevelPlayError(errorCode=" + this.f53497a + ", errorMessage='" + this.f53498b + "')";
    }
}
