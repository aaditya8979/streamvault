package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonIsOMActivated.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonIsOMActivated implements IsOMActivated {

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(@NotNull OpenMeasurementRepository openMeasurementRepository) {
        p.k(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.IsOMActivated
    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
