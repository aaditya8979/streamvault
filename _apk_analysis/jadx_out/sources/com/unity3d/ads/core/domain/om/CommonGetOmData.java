package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonGetOmData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonGetOmData implements GetOmData {

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(@NotNull OpenMeasurementRepository openMeasurementRepository) {
        p.k(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    @Nullable
    public Object invoke(@NotNull c<? super OMData> cVar) {
        return this.openMeasurementRepository.getOmData();
    }
}
