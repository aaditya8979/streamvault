package com.unity3d.ads.core.data.repository;

import cn.b0;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidAdRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AndroidAdRepository implements AdRepository {

    @NotNull
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();

    @NotNull
    private final ConcurrentHashMap<String, List<ByteString>> placementsLoadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(@NotNull ByteString byteString, @NotNull AdObject adObject) {
        p.k(byteString, "opportunityId");
        p.k(adObject, "adObject");
        this.loadedAds.put(byteString, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(@NotNull String str, @NotNull ByteString byteString) {
        List<ByteString> listPutIfAbsent;
        p.k(str, "placementId");
        p.k(byteString, "opportunityId");
        ConcurrentHashMap<String, List<ByteString>> concurrentHashMap = this.placementsLoadedAds;
        List<ByteString> arrayList = concurrentHashMap.get(str);
        if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList<>()))) != null) {
            arrayList = listPutIfAbsent;
        }
        arrayList.add(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public AdObject getAd(@NotNull ByteString byteString) {
        p.k(byteString, "opportunityId");
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @NotNull
    public Map<ByteString, AdObject> getAllAds() {
        return kotlin.collections.a.z(this.loadedAds);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(@NotNull ByteString byteString) {
        p.k(byteString, "opportunityId");
        return this.loadedAds.containsKey(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public ByteString pollOpportunityIdForPlacement(@NotNull String str) {
        p.k(str, "placementId");
        List<ByteString> list = this.placementsLoadedAds.get(str);
        if (list != null) {
            return (ByteString) b0.Q(list);
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(@NotNull ByteString byteString) {
        p.k(byteString, "opportunityId");
        this.loadedAds.remove(byteString);
    }
}
