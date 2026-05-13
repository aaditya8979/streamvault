package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InternalMolocoPrivacySettings f47315a;

    public v(@NotNull InternalMolocoPrivacySettings internalMolocoPrivacySettings) {
        tn.p.k(internalMolocoPrivacySettings, "internalMolocoPrivacySettings");
        this.f47315a = internalMolocoPrivacySettings;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.x
    @NotNull
    public MolocoPrivacy.PrivacySettings getPrivacy() {
        return this.f47315a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }
}
