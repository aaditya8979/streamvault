package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ac implements nc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do2 f87644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87645b;

    public ac(do2 do2Var, String str) {
        this.f87644a = do2Var;
        this.f87645b = str;
    }

    @Override // yads.nc2
    public final Map a(long j10) {
        Map mapJ = kotlin.collections.a.j();
        if (!tn.y.m(mapJ)) {
            mapJ = null;
        }
        if (mapJ == null) {
            mapJ = new LinkedHashMap();
        }
        String str = this.f87645b;
        if (str == null) {
            mapJ.put(Q6.G1, "undefined");
        } else {
            mapJ.put(Q6.G1, str);
        }
        String str2 = this.f87644a.f88941b;
        if (str2 == null) {
            mapJ.put("status", "undefined");
        } else {
            mapJ.put("status", str2);
        }
        mapJ.put("duration", Long.valueOf(j10));
        return mapJ;
    }
}
