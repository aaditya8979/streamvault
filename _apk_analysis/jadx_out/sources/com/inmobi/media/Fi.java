package com.inmobi.media;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f25456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f25457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25458c;

    public Fi(Yj yj2, double d10, List list) {
        tn.p.k(yj2, "telemetryConfigMetaData");
        tn.p.k(list, "samplingEvents");
        this.f25456a = yj2;
        this.f25457b = d10;
        this.f25458c = list;
        tn.p.j(Fi.class.getSimpleName(), "getSimpleName(...)");
    }

    public final int a(String str) {
        tn.p.k(str, "eventType");
        if (!this.f25458c.contains(str)) {
            return 1;
        }
        if (this.f25457b < this.f25456a.f26660g) {
            Wj wj2 = Wj.f26549a;
            return 2;
        }
        Wj wj3 = Wj.f26549a;
        return 0;
    }

    public final boolean a(String str, Map map) {
        tn.p.k(map, "keyValueMap");
        tn.p.k(str, "eventType");
        Yj yj2 = this.f25456a;
        if (yj2.f26658e && !yj2.f26659f.contains(str)) {
            return false;
        }
        if (map.isEmpty() || !tn.p.f(str, "AssetDownloaded") || !map.containsKey("assetType")) {
            return true;
        }
        if (tn.p.f("image", map.get("assetType")) && !this.f25456a.f26655b) {
            Wj wj2 = Wj.f26549a;
            return false;
        }
        if (tn.p.f("gif", map.get("assetType")) && !this.f25456a.f26656c) {
            Wj wj3 = Wj.f26549a;
            return false;
        }
        if (!tn.p.f("video", map.get("assetType")) || this.f25456a.f26657d) {
            return true;
        }
        Wj wj4 = Wj.f26549a;
        return false;
    }
}
