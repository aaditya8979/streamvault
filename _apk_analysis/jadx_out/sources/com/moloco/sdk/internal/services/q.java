package com.moloco.sdk.internal.services;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.moloco.sdk.internal.services.o;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47536a;

    public q(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47536a = context;
    }

    @Override // com.moloco.sdk.internal.services.p
    @NotNull
    public o a() {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(AdvertisingIdClient.getAdvertisingIdInfo(this.f47536a));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        o aVar3 = null;
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) objM7534constructorimpl;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                aVar3 = o.b.f47535a;
            } else {
                String id2 = info.getId();
                if (id2 != null) {
                    aVar3 = new o.a(id2);
                }
            }
            if (aVar3 != null) {
                return aVar3;
            }
        }
        return o.b.f47535a;
    }
}
