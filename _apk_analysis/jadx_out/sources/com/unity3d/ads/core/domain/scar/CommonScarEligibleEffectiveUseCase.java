package com.unity3d.ads.core.domain.scar;

import cn.v;
import cn.w;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonScarEligibleEffectiveUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonScarEligibleEffectiveUseCase implements ScarEligibleEffectiveUseCase {

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonScarEligibleEffectiveUseCase(@NotNull SessionRepository sessionRepository) {
        p.k(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @NotNull
    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase
    @NotNull
    public List<AdFormatOuterClass.AdFormat> invoke(@Nullable TokenConfiguration tokenConfiguration) {
        List<AdFormatOuterClass.AdFormat> listE;
        if (tokenConfiguration == null) {
            return this.sessionRepository.getScarEligibleFormats();
        }
        AdFormatOuterClass.AdFormat protoAdFormat = AdFormatExtensions.toProtoAdFormat(tokenConfiguration.getAdFormat());
        if (!this.sessionRepository.getScarEligibleFormats().contains(protoAdFormat)) {
            protoAdFormat = null;
        }
        return (protoAdFormat == null || (listE = v.e(protoAdFormat)) == null) ? w.m() : listE;
    }
}
