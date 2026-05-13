package com.unity3d.ads.core.domain;

import bn.r;
import com.unity3d.ads.core.data.model.AdObject;
import kotlinx.coroutines.d;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i;
import p000do.i0;
import p000do.j2;
import p000do.l0;
import p000do.t1;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: CleanUpWhenOpportunityExpires.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CleanUpWhenOpportunityExpires {

    @NotNull
    private final i0 coroutineExceptionHandler;

    @NotNull
    private final l0 coroutineScope;

    public CleanUpWhenOpportunityExpires(@NotNull h0 h0Var) {
        p.k(h0Var, "defaultDispatcher");
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(i0.D8);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = d.a(j2.b(null, 1, null).plus(h0Var).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(@NotNull AdObject adObject) {
        p.k(adObject, "adObject");
        if (adObject.getAdPlayer() == null) {
            throw new IllegalArgumentException("AdObject does not have an adPlayer.".toString());
        }
        final g gVarD = i.d(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3, null);
        t1.m(adObject.getAdPlayer().getScope().getCoroutineContext()).f(new l<Throwable, r>() { // from class: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke.2
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                g.a.a(gVarD, null, 1, null);
            }
        });
    }
}
