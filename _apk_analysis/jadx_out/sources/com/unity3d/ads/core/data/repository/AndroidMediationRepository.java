package com.unity3d.ads.core.data.repository;

import bo.a0;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import gatewayprotocol.v1.ClientInfoOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidMediationRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidMediationRepository implements MediationRepository {

    @NotNull
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(@NotNull MediationDataSource mediationDataSource) {
        p.k(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @NotNull
    public sn.a<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new sn.a<ClientInfoOuterClass.MediationProvider>() { // from class: com.unity3d.ads.core.data.repository.AndroidMediationRepository$mediationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ClientInfoOuterClass.MediationProvider invoke() {
                String name = this.this$0.getName();
                if (name != null) {
                    ClientInfoOuterClass.MediationProvider mediationProvider = a0.W(name, "AppLovinSdk_", false, 2, null) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : a0.J(name, "AdMob", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB : a0.J(name, "MAX", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : a0.J(name, "ironSource", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                    if (mediationProvider != null) {
                        return mediationProvider;
                    }
                }
                return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
