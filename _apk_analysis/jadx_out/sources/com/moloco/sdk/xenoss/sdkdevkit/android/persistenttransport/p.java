package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.moloco.sdk.internal.MolocoLogger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WorkManager f51008a;

    public p(@NotNull Context context) {
        WorkManager workManagerC;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            workManagerC = b(context);
        } catch (IllegalStateException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager not initialized already, performing initialization", e10, false, 8, null);
            workManagerC = c(context);
        }
        this.f51008a = workManagerC;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o
    @NotNull
    public Operation a(@NotNull WorkRequest workRequest) {
        tn.p.k(workRequest, "workRequest");
        Operation operationEnqueue = this.f51008a.enqueue(workRequest);
        tn.p.j(operationEnqueue, "enqueue(...)");
        return operationEnqueue;
    }

    public final WorkManager b(Context context) {
        WorkManager workManager = WorkManager.getInstance(context);
        tn.p.j(workManager, "getInstance(...)");
        return workManager;
    }

    public final WorkManager c(Context context) {
        Configuration configurationBuild = new Configuration.Builder().build();
        tn.p.j(configurationBuild, "build(...)");
        try {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to initialize work manager as one is not already available", null, false, 12, null);
            try {
                WorkManager.initialize(context, configurationBuild);
            } catch (IllegalStateException e10) {
                e = e10;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager initialized already at this point, retrieving instance", e, false, 8, null);
            }
        } catch (IllegalStateException e11) {
            e = e11;
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
        try {
            return b(context);
        } catch (IllegalStateException e12) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager instance couldn't be re-initialized, cannot provide WorkManager", null, false, 12, null);
            throw new IllegalStateException("Cannot provide MolocoWorkManager. Failed to re-initialize WorkManager", e12);
        }
    }
}
