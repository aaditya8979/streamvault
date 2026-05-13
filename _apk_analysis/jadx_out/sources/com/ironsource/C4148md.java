package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4148md implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32306a;

    public C4148md(@NotNull String str) {
        tn.p.k(str, "placementName");
        this.f32306a = str;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b02) {
        HashMap map = new HashMap();
        map.put("placement", this.f32306a);
        return map;
    }
}
