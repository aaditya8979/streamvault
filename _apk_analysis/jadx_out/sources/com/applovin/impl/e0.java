package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class e0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f8142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f8143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f8145l;

    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.S(), true, str2, kVar, aVar);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f8139f = str;
        this.f8140g = bVar;
        this.f8141h = list;
        this.f8142i = z10;
        this.f8143j = str2;
        this.f8144k = kVar;
        this.f8145l = aVar;
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f7907e.get() || (aVar = this.f8145l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f7907e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f8144k.G().a(a(), this.f8139f, this.f8140g.getCachePrefix(), this.f8141h, this.f8142i, this.f8144k.G().a(this.f8139f, this.f8140g), this.f8143j, f2.a((AppLovinAdImpl) this.f8140g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7907e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f8144k.G().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7905c.b(this.f7904b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7907e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7905c.b(this.f7904b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7907e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8139f.equals(((e0) obj).f8139f);
    }

    public int hashCode() {
        String str = this.f8139f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
