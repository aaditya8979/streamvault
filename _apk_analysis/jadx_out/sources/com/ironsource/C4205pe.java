package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4205pe extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f33255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4205pe(@NotNull IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        tn.p.k(ironSourceError, "error");
        this.f33255a = ironSourceError;
        this.f33256b = ironSourceError.getErrorCode();
    }

    @NotNull
    public final IronSourceError a() {
        return this.f33255a;
    }

    public final int b() {
        return this.f33256b;
    }
}
