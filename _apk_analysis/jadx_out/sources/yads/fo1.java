package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class fo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.monetization.ads.mediation.base.a f89651a;

    public fo1(com.monetization.ads.mediation.base.a aVar) {
        this.f89651a = aVar;
    }

    public final MediatedAdapterInfo b() {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(this.f89651a.getAdapterInfo());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            objM7534constructorimpl = new MediatedAdapterInfo.Builder().setAdapterVersion("null").setNetworkName("null").setNetworkSdkVersion("null").build();
        }
        return (MediatedAdapterInfo) objM7534constructorimpl;
    }
}
