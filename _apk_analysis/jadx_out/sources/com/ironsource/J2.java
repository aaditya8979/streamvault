package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class J2 extends C4028g0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdSize f29648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Boolean f29649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final Long f29650i;

    public J2() {
        this(C4367z7.f34502a.a(), "", null, null, null, null, null, null, 252, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(@NotNull UUID uuid, @NotNull String str, @Nullable C4041gd c4041gd, @NotNull LevelPlayAdSize levelPlayAdSize, @Nullable Boolean bool, @Nullable Long l10, @Nullable Hf hf2, @Nullable Double d10) {
        super(IronSource.a.BANNER, uuid, str, c4041gd, hf2, d10);
        tn.p.k(uuid, f.b.f33716c);
        tn.p.k(str, "adUnitId");
        tn.p.k(levelPlayAdSize, C3978d4.i.O);
        this.f29648g = levelPlayAdSize;
        this.f29649h = bool;
        this.f29650i = l10;
    }

    public /* synthetic */ J2(UUID uuid, String str, C4041gd c4041gd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l10, Hf hf2, Double d10, int i10, tn.i iVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c4041gd, (i10 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : hf2, (i10 & 128) != 0 ? null : d10);
    }

    @NotNull
    public final LevelPlayAdSize h() {
        return this.f29648g;
    }

    @Nullable
    public final Boolean i() {
        return this.f29649h;
    }

    @Nullable
    public final Long j() {
        return this.f29650i;
    }
}
