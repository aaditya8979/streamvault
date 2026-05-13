package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4266t8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Y4> f30771a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Y4> f30772b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Y4> f30773c = new LinkedHashMap();

    private void a(C4266t8.e eVar, String str, Y4 y42) {
        Map<String, Y4> mapB;
        if (TextUtils.isEmpty(str) || y42 == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, y42);
    }

    private Map<String, Y4> b(C4266t8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C4266t8.e.RewardedVideo.name())) {
            return this.f30771a;
        }
        if (eVar.name().equalsIgnoreCase(C4266t8.e.Interstitial.name())) {
            return this.f30772b;
        }
        if (eVar.name().equalsIgnoreCase(C4266t8.e.Banner.name())) {
            return this.f30773c;
        }
        return null;
    }

    public Y4 a(C4266t8.e eVar, O9 o92) {
        Y4 y42 = new Y4(o92);
        a(eVar, o92.e(), y42);
        return y42;
    }

    public Y4 a(C4266t8.e eVar, String str) {
        Map<String, Y4> mapB;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    public Y4 a(C4266t8.e eVar, String str, Map<String, String> map, Hc hc2) {
        Y4 y42 = new Y4(str, str, map, hc2);
        a(eVar, str, y42);
        return y42;
    }

    public Collection<Y4> a(C4266t8.e eVar) {
        Map<String, Y4> mapB = b(eVar);
        return mapB != null ? mapB.values() : new ArrayList();
    }

    public void b(C4266t8.e eVar, String str) {
        Map<String, Y4> mapB;
        Y4 y4Remove;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (y4Remove = mapB.remove(str)) == null) {
            return;
        }
        y4Remove.a();
    }
}
