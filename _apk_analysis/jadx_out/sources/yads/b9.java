package yads;

import android.content.Context;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8 f87946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8 f87947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8 f87948c;

    public b9(p8 p8Var, q8 q8Var, z8 z8Var) {
        this.f87946a = p8Var;
        this.f87947b = q8Var;
        this.f87948c = z8Var;
    }

    public final a9 a(Context context) {
        Object objM7534constructorimpl;
        Object w7Var;
        try {
            Result.a aVar = Result.Companion;
            Object obj = dw2.f89000j;
            nt2 nt2VarA = cw2.a().a(context);
            f8 f8VarA = nt2VarA != null ? nt2VarA.a() : null;
            if (f8VarA == null || !f8VarA.a()) {
                boolean z10 = ad1.f87661a;
                w7Var = new w7();
            } else {
                this.f87947b.getClass();
                AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfigurationA = q8.a(f8VarA);
                this.f87946a.getClass();
                AdQualityVerifierAdapter adQualityVerifierAdapterA = p8.a();
                if (adQualityVerifierAdapterA == null) {
                    boolean z11 = ad1.f87661a;
                    w7Var = new w7();
                } else {
                    this.f87948c.getClass();
                    i8 i8VarA = z8.a(f8VarA);
                    long verificationTimeoutInSec = 1 + adQualityVerifierAdapterConfigurationA.getVerificationTimeoutInSec();
                    y8 y8Var = new y8(i8VarA);
                    n8 n8Var = new n8(i8VarA);
                    boolean z12 = ad1.f87661a;
                    w7Var = new b8(adQualityVerifierAdapterA, adQualityVerifierAdapterConfigurationA, verificationTimeoutInSec, y8Var, n8Var);
                }
            }
            objM7534constructorimpl = Result.m7534constructorimpl(w7Var);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            thM7537exceptionOrNullimpl.getMessage();
            boolean z13 = ad1.f87661a;
            objM7534constructorimpl = new w7();
        }
        return (a9) objM7534constructorimpl;
    }
}
