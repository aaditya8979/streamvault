package com.unity3d.ads.core.domain.offerwall;

import bn.r;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import hn.c;
import in.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: LoadOfferwallAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LoadOfferwallAd {

    @NotNull
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(@NotNull OfferwallManager offerwallManager) {
        p.k(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull c<? super r> cVar) {
        Object objLoadAd = this.offerwallManager.loadAd(str, cVar);
        return objLoadAd == a.g() ? objLoadAd : r.f5635a;
    }
}
