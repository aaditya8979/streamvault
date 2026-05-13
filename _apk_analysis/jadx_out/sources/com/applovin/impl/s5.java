package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class s5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9833i;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            s5.this.f9831g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f9833i);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.b(this.f8506b, "No app-ads.txt found");
                }
                s5.this.f9831g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f9833i);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.a(this.f8506b, "Found app-ads.txt");
                }
                s5.this.f9831g.a(str2, s5.this.f9833i);
            }
        }
    }

    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public s5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f9832h = str;
        this.f9831g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f9832h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || InneractiveMediationDefs.GENDER_MALE.equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f8505a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f9833i = uriBuild.toString();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Looking up app-ads.txt at " + this.f9833i);
        }
        this.f8505a.q0().a(new a(aVarA, this.f8505a));
    }
}
