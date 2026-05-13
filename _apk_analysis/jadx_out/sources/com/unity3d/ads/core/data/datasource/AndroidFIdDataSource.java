package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.fid.FIdBridge;
import com.unity3d.services.core.fid.FIdStaticBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h;
import tn.p;

/* JADX INFO: compiled from: AndroidFIdDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidFIdDataSource implements FIdDataSource {

    @NotNull
    private FIdStaticBridge bridge;

    @NotNull
    private final Context context;

    public AndroidFIdDataSource(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        this.bridge = new FIdStaticBridge();
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    @Nullable
    public String invoke() {
        Task<String> appInstanceId;
        try {
            Result.a aVar = Result.Companion;
            FIdBridge fIdStaticBridge = this.bridge.getInstance(this.context);
            if (fIdStaticBridge != null && (appInstanceId = fIdStaticBridge.getAppInstanceId()) != null) {
                return (String) h.b(null, new AndroidFIdDataSource$invoke$1$1(appInstanceId, null), 1, null);
            }
            return null;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Object objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
            return (String) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
        }
    }
}
