package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.appodeal.internal.d;
import com.iab.omid.library.appodeal.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class i implements d.a, com.iab.omid.library.appodeal.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f23921f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23922a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.e f23923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.b f23924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.devicevolume.d f23925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f23926e;

    public i(com.iab.omid.library.appodeal.devicevolume.e eVar, com.iab.omid.library.appodeal.devicevolume.b bVar) {
        this.f23923b = eVar;
        this.f23924c = bVar;
    }

    private c a() {
        if (this.f23926e == null) {
            this.f23926e = c.c();
        }
        return this.f23926e;
    }

    public static i c() {
        if (f23921f == null) {
            f23921f = new i(new com.iab.omid.library.appodeal.devicevolume.e(), new com.iab.omid.library.appodeal.devicevolume.b());
        }
        return f23921f;
    }

    @Override // com.iab.omid.library.appodeal.devicevolume.c
    public void a(float f10) {
        this.f23922a = f10;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f23925d = this.f23923b.a(new Handler(), context, this.f23924c.a(), this);
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f23922a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f23925d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f23925d.d();
    }
}
