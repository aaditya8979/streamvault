package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class C0 extends J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f28867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4028g0 f28868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f28869c;

    public C0(@NotNull C4173o0 c4173o0, @NotNull C4028g0 c4028g0, @Nullable String str) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(c4028g0, "adProperties");
        this.f28867a = c4173o0;
        this.f28868b = c4028g0;
        this.f28869c = str;
    }

    public /* synthetic */ C0(C4173o0 c4173o0, C4028g0 c4028g0, String str, int i10, tn.i iVar) {
        this(c4173o0, c4028g0, (i10 & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b02) {
        Map<String, Object> mapA = a(this.f28868b);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.f28867a.f()));
        String str = this.f28869c;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }
}
