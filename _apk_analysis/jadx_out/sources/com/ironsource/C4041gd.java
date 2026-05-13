package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4041gd extends AbstractC4278u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private String f31814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31815f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4041gd(int i10, @NotNull String str, boolean z10, @NotNull String str2, int i11, @Nullable C4059hd c4059hd) {
        super(i10, str, z10, c4059hd);
        tn.p.k(str, "placementName");
        tn.p.k(str2, IronSourceConstants.EVENTS_REWARD_NAME);
        this.f31815f = i11;
        this.f31814e = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4041gd(@NotNull AbstractC4278u3 abstractC4278u3) {
        super(abstractC4278u3.b(), abstractC4278u3.c(), abstractC4278u3.d(), abstractC4278u3.a());
        tn.p.k(abstractC4278u3, "placement");
        this.f31814e = "";
    }

    public final int e() {
        return this.f31815f;
    }

    @NotNull
    public final String f() {
        return this.f31814e;
    }

    @Override // com.ironsource.AbstractC4278u3
    @NotNull
    public String toString() {
        return super.toString() + ", reward name: " + this.f31814e + " , amount: " + this.f31815f;
    }
}
