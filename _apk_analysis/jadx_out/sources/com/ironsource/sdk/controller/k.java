package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC4027g;
import com.ironsource.InterfaceC4045h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    public static final class a implements InterfaceC4027g {
        @Override // com.ironsource.InterfaceC4027g
        @NotNull
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public static final class b implements InterfaceC4045h {
        @Override // com.ironsource.InterfaceC4045h
        @NotNull
        public Intent a(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    public static final class c implements InterfaceC4045h {
        @Override // com.ironsource.InterfaceC4045h
        @NotNull
        public Intent a(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
