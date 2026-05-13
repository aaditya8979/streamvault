package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class t implements j<s> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47264d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47265e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ActivityManager f47266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public s f47267c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public t(@NotNull ActivityManager activityManager) {
        tn.p.k(activityManager, "activityManager");
        this.f47266b = activityManager;
        this.f47267c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] Updating m state", false, 4, null);
        this.f47267c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        s sVarE = e();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] cached lm: " + this.f47267c.a() + ", t: " + this.f47267c.b() + ", tm: " + this.f47267c.c(), false, 4, null);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] current lm: " + sVarE.a() + ", t: " + sVarE.b() + ", tm: " + sVarE.c(), false, 4, null);
        boolean zB = b(sVarE, this.f47267c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[CBT] m needsRefresh: ");
        sb2.append(zB);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", sb2.toString(), false, 4, null);
        return zB;
    }

    public final boolean b(s sVar, s sVar2) {
        return (tn.p.f(sVar.a(), sVar2.a()) && tn.p.f(sVar.b(), sVar2.b()) && tn.p.f(sVar.c(), sVar2.c())) ? false : true;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "MemorySignalProvider";
    }

    public final s e() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.f47266b.getMemoryInfo(memoryInfo);
            return new s(Boolean.valueOf(memoryInfo.lowMemory), Long.valueOf(memoryInfo.threshold), Long.valueOf(memoryInfo.totalMem));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] MI Error", e10, false, 8, null);
            return new s(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public s d() {
        s sVar = this.f47267c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] lm: " + sVar.a() + ", t: " + sVar.b() + ", tm: " + sVar.c(), false, 4, null);
        return sVar;
    }
}
