package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class J5 implements D0 {
    @NotNull
    public final Map<String, Object> a(@NotNull C4028g0 c4028g0) {
        tn.p.k(c4028g0, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = c4028g0.a().toString();
        tn.p.j(string, "adProperties.adFormat.toString()");
        map.put(C3949bb.f31031f, string);
        map.put("adf", Integer.valueOf(C4324wf.c(c4028g0.a())));
        String string2 = c4028g0.b().toString();
        tn.p.j(string2, "adProperties.adId.toString()");
        map.put(C3949bb.f31034i, string2);
        map.put("mediationAdUnitId", c4028g0.c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
