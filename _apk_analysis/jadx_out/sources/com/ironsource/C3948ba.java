package com.ironsource;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3948ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final C4283u8 f31025a;

    public C3948ba() {
        this(null);
    }

    public C3948ba(@Nullable C4283u8 c4283u8) {
        this.f31025a = c4283u8;
    }

    @Nullable
    public final C4283u8 a() {
        return this.f31025a;
    }

    public final boolean b() {
        return this.f31025a == null;
    }
}
