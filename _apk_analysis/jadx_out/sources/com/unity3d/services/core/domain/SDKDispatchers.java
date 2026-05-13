package com.unity3d.services.core.domain;

import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.w0;

/* JADX INFO: compiled from: SDKDispatchers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    /* JADX INFO: renamed from: io, reason: collision with root package name */
    @NotNull
    private final h0 f53570io = w0.b();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private final h0 f3281default = w0.a();

    @NotNull
    private final h0 main = w0.c();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public h0 getDefault() {
        return this.f3281default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public h0 getIo() {
        return this.f53570io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public h0 getMain() {
        return this.main;
    }
}
