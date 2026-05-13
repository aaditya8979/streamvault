package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final O f30739a;

    public Ye(@Nullable O o10) {
        this.f30739a = o10;
    }

    @Nullable
    public final O a() {
        return this.f30739a;
    }

    @NotNull
    public final C4274u a(@NotNull Kb<Ye, C4274u> kb2) {
        tn.p.k(kb2, "mapper");
        return kb2.a(this);
    }

    @NotNull
    public abstract EnumC4025ff b();
}
