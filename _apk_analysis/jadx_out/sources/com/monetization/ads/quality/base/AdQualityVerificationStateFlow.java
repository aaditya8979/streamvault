package com.monetization.ads.quality.base;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import go.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface AdQualityVerificationStateFlow {
    @NotNull
    AdQualityVerificationMode getVerificationMode();

    @NotNull
    u<AdQualityVerificationState> getVerificationResultStateFlow();
}
