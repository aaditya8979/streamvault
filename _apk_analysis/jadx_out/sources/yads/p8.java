package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import kotlin.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class p8 {
    public static AdQualityVerifierAdapter a() {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Object objA = om2.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            objM7534constructorimpl = Result.m7534constructorimpl(objA instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) objA : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            thM7537exceptionOrNullimpl.getMessage();
            boolean z10 = ad1.f87661a;
        }
        return (AdQualityVerifierAdapter) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }
}
