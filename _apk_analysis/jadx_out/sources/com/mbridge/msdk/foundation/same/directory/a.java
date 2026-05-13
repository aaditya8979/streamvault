package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Directory.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f37738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f37740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f37741d;

    public List<a> a() {
        return this.f37738a;
    }

    public void a(a aVar) {
        if (this.f37738a == null) {
            this.f37738a = new ArrayList();
        }
        aVar.b(this);
        this.f37738a.add(aVar);
    }

    public void a(c cVar) {
        this.f37741d = cVar;
    }

    public void a(c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        a(aVar);
    }

    public void a(String str) {
        this.f37739b = str;
    }

    public void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public String b() {
        return this.f37739b;
    }

    public void b(a aVar) {
        this.f37740c = aVar;
    }

    public a c() {
        return this.f37740c;
    }

    public c d() {
        return this.f37741d;
    }
}
