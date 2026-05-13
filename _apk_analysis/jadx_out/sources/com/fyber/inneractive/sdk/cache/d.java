package com.fyber.inneractive.sdk.cache;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15872c = IAlog.a(d.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15874b;

    public d(String str) {
        this.f15873a = str;
        Locale locale = Locale.US;
        int iHashCode = str.hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iHashCode);
        this.f15874b = sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f15873a;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        IAlog.c("%s: onCacheCommitted: %s for url: %s", f15872c, (Uri) obj, this.f15873a);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f15874b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }
}
