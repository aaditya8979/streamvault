package com.unity3d.ads.core.domain.scar;

import bn.r;
import com.unity3d.ads.core.data.manager.ScarManager;
import hn.c;
import in.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: LoadScarAd.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LoadScarAd {

    @NotNull
    private final ScarManager scarManager;

    public LoadScarAd(@NotNull ScarManager scarManager) {
        p.k(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i10, @NotNull c<? super r> cVar) {
        Object objLoadAd;
        return (!p.f(str, "banner") && (objLoadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i10, cVar)) == a.g()) ? objLoadAd : r.f5635a;
    }
}
