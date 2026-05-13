package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class w implements j<MolocoPrivacy.PrivacySettings> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.bidtoken.x f47276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f47277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public MolocoPrivacy.PrivacySettings f47278d;

    public w(@NotNull com.moloco.sdk.internal.services.bidtoken.x xVar) {
        tn.p.k(xVar, "privacyProvider");
        this.f47276b = xVar;
        this.f47277c = "PrivacyStateSignalProvider";
        this.f47278d = xVar.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47278d = this.f47276b.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z10 = !tn.p.f(this.f47278d, this.f47276b.getPrivacy());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47277c, z10 ? "[CBT] privacy updated" : "[CBT] privacy didn't change", false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return this.f47277c;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MolocoPrivacy.PrivacySettings d() {
        return this.f47278d;
    }
}
