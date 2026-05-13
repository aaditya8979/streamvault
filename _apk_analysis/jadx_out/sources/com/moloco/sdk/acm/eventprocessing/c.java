package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.ironsource.Q6;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.h f45792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f45793b;

    public c(@NotNull com.moloco.sdk.acm.h hVar, @NotNull Context context) {
        p.k(hVar, "config");
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f45792a = hVar;
        this.f45793b = context;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.b
    public void a() throws Throwable {
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Data dataA = d.a(kotlin.collections.a.m(bn.h.a("url", this.f45792a.d()), bn.h.a("AppKey", this.f45792a.c().get("AppKey")), bn.h.a("AppBundle", this.f45792a.c().get("AppBundle")), bn.h.a("AppVersion", this.f45792a.c().get("AppVersion")), bn.h.a("OS", this.f45792a.c().get("OS")), bn.h.a(Q6.G, this.f45792a.c().get(Q6.G)), bn.h.a("SdkVersion", this.f45792a.c().get("SdkVersion")), bn.h.a("Mediator", this.f45792a.c().get("Mediator"))));
        if (dataA == null) {
            return;
        }
        WorkManager.getInstance(this.f45793b).enqueue(new OneTimeWorkRequest.Builder(DBRequestWorker.class).setConstraints(constraintsBuild).setInputData(dataA).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).build());
    }
}
