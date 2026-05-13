package com.unity3d.ads.core.domain;

import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonGetAdObject.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonGetAdObject implements GetAdObject {

    @NotNull
    private final AdRepository adRepository;

    public CommonGetAdObject(@NotNull AdRepository adRepository) {
        p.k(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    @Nullable
    public AdObject invoke(@NotNull String str) {
        p.k(str, "opportunityId");
        return this.adRepository.getAd(ByteStringsKt.toByteStringUtf8(str));
    }
}
