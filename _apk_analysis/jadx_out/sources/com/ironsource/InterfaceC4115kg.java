package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC4115kg {
    void a() throws C4205pe;

    default void a(boolean z10, @NotNull sn.a<? extends IronSourceError> aVar) {
        tn.p.k(aVar, "lazyError");
        if (!z10) {
            throw new C4205pe(aVar.invoke());
        }
    }
}
