package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4359z implements InterfaceC4162n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final P8 f34480a;

    public C4359z(@NotNull P8 p82) {
        tn.p.k(p82, "sessionDepthService");
        this.f34480a = p82;
    }

    @Override // com.ironsource.InterfaceC4162n7
    public void a(@NotNull Map<String, Object> map) {
        tn.p.k(map, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Q6.J0, Integer.valueOf(this.f34480a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        map.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Q6.J0, Integer.valueOf(this.f34480a.a(LevelPlay.AdFormat.REWARDED)));
        map.put("rewardedVideo", linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(Q6.J0, Integer.valueOf(this.f34480a.a(LevelPlay.AdFormat.BANNER)));
        map.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(Q6.J0, Integer.valueOf(this.f34480a.a(LevelPlay.AdFormat.NATIVE_AD)));
        map.put("nativeAd", linkedHashMap4);
    }
}
