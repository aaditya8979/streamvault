package com.moloco.sdk.internal.services.bidtoken;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f47157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final n f47158b;

    static {
        h hVar = new h(false);
        f47157a = hVar;
        f47158b = new n("", "", hVar);
    }

    @NotNull
    public static final h a() {
        return f47157a;
    }

    @NotNull
    public static final h b(@NotNull com.moloco.sdk.e eVar) {
        tn.p.k(eVar, "<this>");
        return eVar.e() ? new h(eVar.c().c()) : f47157a;
    }

    @NotNull
    public static final n c() {
        return f47158b;
    }
}
