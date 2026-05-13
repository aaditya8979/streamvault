package com.iab.omid.library.fyber.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f24289c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f24290a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f24291b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f24289c;
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f24291b);
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar) {
        this.f24290a.add(aVar);
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24290a);
    }

    public void b(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f24290a.remove(aVar);
        this.f24291b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f24291b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.f24291b.size() > 0;
    }
}
