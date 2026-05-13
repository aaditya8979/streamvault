package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ul f65989a = new Ul();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W9 f65990b = new W9();

    public final synchronized void a(W9 w92) {
        this.f65990b = w92;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (tn.p.f((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f65990b.f66095a) != null) {
                boolean zBooleanValue = bool.booleanValue();
                W9 w92 = this.f65990b;
                IdentifierStatus identifierStatus = w92.f66096b;
                String str2 = w92.f66097c;
                if (zBooleanValue) {
                    str = "true";
                } else {
                    if (zBooleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = com.ironsource.mediationsdk.metadata.a.f32683h;
                }
                map.put("appmetrica_lib_ssl_enabled", this.f65989a.a(new IdentifiersResult(str, identifierStatus, str2)));
            }
        }
    }
}
