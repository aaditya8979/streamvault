package com.iab.omid.library.bigosg.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bigosg.b.b;
import com.iab.omid.library.bigosg.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f implements com.iab.omid.library.bigosg.a.c, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f24049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f24050b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.a.e f24051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.a.b f24052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.a.d f24053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f24054f;

    public f(com.iab.omid.library.bigosg.a.e eVar, com.iab.omid.library.bigosg.a.b bVar) {
        this.f24051c = eVar;
        this.f24052d = bVar;
    }

    public static f a() {
        if (f24049a == null) {
            f24049a = new f(new com.iab.omid.library.bigosg.a.e(), new com.iab.omid.library.bigosg.a.b());
        }
        return f24049a;
    }

    private a e() {
        if (this.f24054f == null) {
            this.f24054f = a.a();
        }
        return this.f24054f;
    }

    @Override // com.iab.omid.library.bigosg.a.c
    public void a(float f10) {
        this.f24050b = f10;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f24053e = this.f24051c.a(new Handler(), context, this.f24052d.a(), this);
    }

    @Override // com.iab.omid.library.bigosg.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        if (b.a().d()) {
            TreeWalker.getInstance().a();
        }
        this.f24053e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f24053e.b();
    }

    public float d() {
        return this.f24050b;
    }
}
