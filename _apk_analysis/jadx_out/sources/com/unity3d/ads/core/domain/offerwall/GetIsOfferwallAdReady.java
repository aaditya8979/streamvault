package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: GetIsOfferwallAdReady.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class GetIsOfferwallAdReady {

    @NotNull
    private final OfferwallManager offerwallManager;

    public GetIsOfferwallAdReady(@NotNull OfferwallManager offerwallManager) {
        p.k(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull c<? super Boolean> cVar) {
        return this.offerwallManager.isAdReady(str, cVar);
    }
}
