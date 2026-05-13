package com.iab.omid.library.fyber.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.internal.d;
import com.iab.omid.library.fyber.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class i implements d.a, com.iab.omid.library.fyber.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f24307f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f24308a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.e f24309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.b f24310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.devicevolume.d f24311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f24312e;

    public i(com.iab.omid.library.fyber.devicevolume.e eVar, com.iab.omid.library.fyber.devicevolume.b bVar) {
        this.f24309b = eVar;
        this.f24310c = bVar;
    }

    private c a() {
        if (this.f24312e == null) {
            this.f24312e = c.c();
        }
        return this.f24312e;
    }

    public static i c() {
        if (f24307f == null) {
            f24307f = new i(new com.iab.omid.library.fyber.devicevolume.e(), new com.iab.omid.library.fyber.devicevolume.b());
        }
        return f24307f;
    }

    @Override // com.iab.omid.library.fyber.devicevolume.c
    public void a(float f10) {
        this.f24308a = f10;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f24311d = this.f24309b.a(new Handler(), context, this.f24310c.a(), this);
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f24308a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f24311d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f24311d.d();
    }
}
