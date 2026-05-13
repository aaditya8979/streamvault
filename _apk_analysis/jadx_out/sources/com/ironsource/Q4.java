package com.ironsource;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Q4 implements InterfaceC4248s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f30206a;

    public Q4(@Nullable Boolean bool) {
        this.f30206a = bool;
    }

    @Override // com.ironsource.InterfaceC4248s7
    @NotNull
    public Object a() {
        Boolean bool = this.f30206a;
        if (bool != null) {
            return Result.m7534constructorimpl(bool);
        }
        Result.a aVar = Result.Companion;
        return Result.m7534constructorimpl(kotlin.c.a(new Exception("enabled flag is not provided or invalid")));
    }
}
