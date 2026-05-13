package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AdRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface AdRepository {
    void addAd(@NotNull ByteString byteString, @NotNull AdObject adObject);

    void enqueueOpportunityForPlacement(@NotNull String str, @NotNull ByteString byteString);

    @Nullable
    AdObject getAd(@NotNull ByteString byteString);

    @NotNull
    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(@NotNull ByteString byteString);

    @Nullable
    ByteString pollOpportunityIdForPlacement(@NotNull String str);

    void removeAd(@NotNull ByteString byteString);
}
