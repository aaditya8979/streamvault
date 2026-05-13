package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScarEligibleEffectiveUseCase.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface ScarEligibleEffectiveUseCase {
    @NotNull
    List<AdFormatOuterClass.AdFormat> invoke(@Nullable TokenConfiguration tokenConfiguration);
}
