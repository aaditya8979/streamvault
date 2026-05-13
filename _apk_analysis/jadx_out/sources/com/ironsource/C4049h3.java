package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4049h3 extends AbstractC4278u3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4049h3(int i10, @NotNull String str, boolean z10, @Nullable C4059hd c4059hd) {
        super(i10, str, z10, c4059hd);
        tn.p.k(str, "placementName");
    }

    @Override // com.ironsource.AbstractC4278u3
    @NotNull
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
