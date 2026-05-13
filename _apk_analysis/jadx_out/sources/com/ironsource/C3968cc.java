package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3968cc extends C4028g0 {
    public C3968cc() {
        this(C4367z7.f34502a.a(), "", null, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3968cc(@NotNull UUID uuid, @NotNull String str, @Nullable C4041gd c4041gd) {
        super(IronSource.a.NATIVE_AD, uuid, str, c4041gd, null, null, 48, null);
        tn.p.k(uuid, f.b.f33716c);
        tn.p.k(str, "adUnitId");
    }

    public /* synthetic */ C3968cc(UUID uuid, String str, C4041gd c4041gd, int i10, tn.i iVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c4041gd);
    }
}
