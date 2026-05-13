package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final class En {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dn f65222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiFunction f65223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Df f65224c;

    public En() {
        this(new Bn(), new C4959ma(), C4696c4.l().n());
    }

    public En(Dn dn2, C4959ma c4959ma, C5104s6 c5104s6) {
        this.f65222a = dn2;
        this.f65223b = c4959ma;
        this.f65224c = c5104s6;
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map mapC;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Cn());
        try {
            mapC = this.f65222a.c();
        } catch (SecurityException unused) {
            mapC = null;
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C5246xn) this.f65223b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
