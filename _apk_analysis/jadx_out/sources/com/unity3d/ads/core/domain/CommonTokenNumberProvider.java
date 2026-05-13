package com.unity3d.ads.core.domain;

import bn.g;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonTokenNumberProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {

    @NotNull
    private final g number$delegate;

    public CommonTokenNumberProvider(@NotNull final SessionRepository sessionRepository) {
        p.k(sessionRepository, "sessionRepository");
        this.number$delegate = b.b(new sn.a<Integer>() { // from class: com.unity3d.ads.core.domain.CommonTokenNumberProvider$number$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(sessionRepository.getHeaderBiddingTokenCounter());
            }
        });
    }

    private final int getNumber() {
        return ((Number) this.number$delegate.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
