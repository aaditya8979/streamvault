package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class b8 implements a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityVerifierAdapter f87934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdQualityVerifierAdapterConfiguration f87935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f87936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y8 f87937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n8 f87938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o8 f87939f;

    public /* synthetic */ b8(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j10, y8 y8Var, n8 n8Var) {
        this(adQualityVerifierAdapter, adQualityVerifierAdapterConfiguration, j10, y8Var, n8Var, new o8());
    }

    public b8(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j10, y8 y8Var, n8 n8Var, o8 o8Var) {
        this.f87934a = adQualityVerifierAdapter;
        this.f87935b = adQualityVerifierAdapterConfiguration;
        this.f87936c = j10;
        this.f87937d = y8Var;
        this.f87938e = n8Var;
        this.f87939f = o8Var;
    }

    @Override // yads.a9
    public final void onAdWillDisplay() {
        try {
            Result.a aVar = Result.Companion;
            this.f87934a.onAdWillDisplay();
            Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }

    @Override // yads.a9
    public final void onInvalidated() {
        try {
            Result.a aVar = Result.Companion;
            this.f87934a.onInvalidated();
            Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }
}
