package com.iab.omid.library.appodeal.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f23903c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f23904a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f23905b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f23903c;
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f23905b);
    }

    public void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        this.f23904a.add(aVar);
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f23904a);
    }

    public void b(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f23904a.remove(aVar);
        this.f23905b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f23905b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.f23905b.size() > 0;
    }
}
