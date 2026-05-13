package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5180v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f67812a;

    public C5180v7() {
        HashMap map = new HashMap();
        this.f67812a = map;
        map.put("events", AbstractC5128t5.f67717a);
        map.put("sessions", AbstractC5178v5.f67807a);
        map.put("preferences", InterfaceC5153u5.f67769a);
        map.put("binary_data", AbstractC5103s5.f67663a);
    }
}
