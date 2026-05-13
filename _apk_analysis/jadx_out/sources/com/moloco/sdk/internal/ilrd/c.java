package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import bn.r;
import co.b;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.services.j;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.Result;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.j2;
import p000do.l0;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f46170c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46171d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f46172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public e f46173b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public c(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f46172a = context;
    }

    public final Init$SDKInitResponse.i a(Init$SDKInitResponse init$SDKInitResponse) {
        if (init$SDKInitResponse.m()) {
            return init$SDKInitResponse.g();
        }
        return null;
    }

    public final IlrdEventsRepository b(l0 l0Var, Init$SDKInitResponse.i iVar, Init$SDKInitResponse init$SDKInitResponse) {
        String strD = iVar.d();
        p.j(strD, "getRawImpUrl(...)");
        l lVarC = b.i.f47671a.c();
        b.a aVar = co.b.f6773c;
        int iE = iVar.e();
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jS = co.d.s(iE, durationUnit);
        int maxBatchSize = iVar.getMaxBatchSize();
        long jS2 = co.d.s(iVar.g(), durationUnit);
        long jS3 = co.d.s(iVar.c(), durationUnit);
        b.h hVar = b.h.f47664a;
        j jVarH = hVar.h();
        Lifecycle lifecycle = ProcessLifecycleOwner.Companion.get().getLifecycle();
        com.moloco.sdk.internal.services.p pVarD = hVar.d();
        String strI = init$SDKInitResponse.i();
        p.j(strI, "getPublisherId(...)");
        String strB = init$SDKInitResponse.b();
        p.j(strB, "getAppId(...)");
        return new IlrdEventsRepository(l0Var, strD, lVarC, jS, maxBatchSize, jS2, jS3, jVarH, lifecycle, pVarD, strI, strB, b.j.f47677a.b(), null, null, null, 57344, null);
    }

    @Nullable
    public final e c() {
        return this.f46173b;
    }

    public final e d(l0 l0Var, IlrdEventsRepository ilrdEventsRepository, List<? extends Init$SDKInitResponse.SupportedNetworks> list) {
        e eVar = new e(l0Var, this.f46172a, ilrdEventsRepository, list);
        this.f46173b = eVar;
        eVar.h();
        return eVar;
    }

    @NotNull
    public final Object e(@NotNull Init$SDKInitResponse init$SDKInitResponse) {
        p.k(init$SDKInitResponse, "response");
        if (this.f46173b != null) {
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(r.f5635a);
        }
        Init$SDKInitResponse.i iVarA = a(init$SDKInitResponse);
        if (iVarA == null) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("No ILRD configuration found")));
        }
        List<Init$SDKInitResponse.SupportedNetworks> listF = iVarA.f();
        if (!iVarA.getEnabled()) {
            Result.a aVar3 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("Publisher has not opted into ILRD collection")));
        }
        if (listF.isEmpty()) {
            Result.a aVar4 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("No ILRD supported networks available")));
        }
        l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getIo().plus(j2.b(null, 1, null)));
        IlrdEventsRepository ilrdEventsRepositoryB = b(l0VarA, iVarA, init$SDKInitResponse);
        p.h(listF);
        d(l0VarA, ilrdEventsRepositoryB, listF);
        Result.a aVar5 = Result.Companion;
        return Result.m7534constructorimpl(r.f5635a);
    }
}
