package com.ironsource;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4220qc implements InterfaceC4203pc {
    @Override // com.ironsource.InterfaceC4203pc
    public void a(int i10) {
        SDKUtils.setDebugMode(i10);
    }

    @Override // com.ironsource.InterfaceC4203pc
    public void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        tn.p.k(context, "applicationContext");
        tn.p.k(str, C3978d4.j.f31389g);
        tn.p.k(str2, "userId");
        tn.p.k(map, "initParams");
        IronSourceNetwork.initSDK(context, str, str2, map);
    }

    @Override // com.ironsource.InterfaceC4203pc
    public void a(@NotNull Mc mc2) {
        tn.p.k(mc2, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(mc2);
    }

    @Override // com.ironsource.InterfaceC4203pc
    public void a(@NotNull String str) {
        tn.p.k(str, "controllerConfig");
        SDKUtils.setControllerConfig(str);
    }

    @Override // com.ironsource.InterfaceC4203pc
    public void b(@NotNull String str) {
        tn.p.k(str, "controllerUrl");
        SDKUtils.setControllerUrl(str);
    }
}
