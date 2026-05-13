package com.moloco.sdk.internal.services.usertracker;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.services.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h0 f47548a;

    public c(@NotNull h0 h0Var) {
        p.k(h0Var, "dataStoreService");
        this.f47548a = h0Var;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    @Nullable
    public Object a(@NotNull String str, @NotNull hn.c<? super r> cVar) {
        Object objB = this.f47548a.b("com.moloco.sdk.mref", str, cVar);
        return objB == in.a.g() ? objB : r.f5635a;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    @Nullable
    public Object b(@NotNull hn.c<? super String> cVar) {
        return this.f47548a.c("com.moloco.sdk.mref", cVar);
    }
}
