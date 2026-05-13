package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.e0;
import com.applovin.impl.l5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class m5 extends l5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f8773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8775s;

    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                m5.this.f8773q.m1();
                m5.this.f8773q.c(uri);
            }
        }
    }

    public class b implements l5.e {
        public b() {
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            m5.this.f8773q.d(m5.this.d(str));
            m5.this.f8773q.b(true);
            com.applovin.impl.sdk.o oVar = m5.this.f8507c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var = m5.this;
                m5Var.f8507c.a(m5Var.f8506b, "Finish caching non-video resources for ad #" + m5.this.f8773q.getAdIdNumber());
            }
            m5 m5Var2 = m5.this;
            m5Var2.f8507c.f(m5Var2.f8506b, "Ad updated with cachedHTML = " + m5.this.f8773q.g1());
        }
    }

    public m5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f8773q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (n7.j(com.applovin.impl.sdk.k.o())) {
            str = n7.c(str);
        }
        if (!this.f8773q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f8505a.e0().a(str, f2.a((AppLovinAdImpl) this.f8682g));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching non-optional HTML resources...");
        }
        this.f8773q.d(d(a(this.f8773q.g1(), this.f8773q.S(), this.f8773q)));
        this.f8773q.b(true);
        a(this.f8773q);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Finish caching non-optional HTML resources for ad #" + this.f8773q.getAdIdNumber());
        }
        this.f8507c.f(this.f8506b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f8773q.g1());
    }

    private void n() {
        Uri uriC;
        if (l() || (uriC = c(this.f8773q.k1())) == null) {
            return;
        }
        this.f8773q.m1();
        this.f8773q.c(uriC);
    }

    private d0 o() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching HTML resources...");
        }
        return a(this.f8773q.g1(), this.f8773q.S(), new b());
    }

    private e0 p() {
        return b(this.f8773q.k1(), new a());
    }

    private void q() {
        List<String> listH = this.f8773q.H();
        if (CollectionUtils.isEmpty(listH)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching optional HTML resources...");
        }
        String strG1 = this.f8773q.g1();
        for (String str : listH) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Caching optional resource: " + str);
            }
            int iA = this.f8505a.G().a(str, this.f8682g);
            Map mapA = f2.a((AppLovinAdImpl) this.f8682g);
            String strA = this.f8505a.G().a(com.applovin.impl.sdk.k.o(), str, this.f8773q.getCachePrefix(), this.f8773q.S(), true, true, iA, this.f8684i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.a(this.f8506b, "Updating HTML with cached optional resource: " + strA);
                }
                this.f8773q.a(strA, str);
                strG1 = strG1.replace(str, strA);
                this.f8773q.d(strG1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.b(this.f8506b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Finish caching optional HTML resources for ad #" + this.f8773q.getAdIdNumber());
        }
    }

    public void b(boolean z10) {
        this.f8775s = z10;
    }

    public void c(boolean z10) {
        this.f8774r = z10;
    }

    @Override // com.applovin.impl.l5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zC0 = this.f8773q.C0();
        boolean z10 = this.f8775s;
        if (zC0 || z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Begin caching for streaming ad #" + this.f8773q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f8505a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                ArrayList arrayList = new ArrayList();
                if (!zC0) {
                    f();
                    d0 d0VarO = o();
                    if (d0VarO != null) {
                        arrayList.add(d0VarO);
                    }
                } else if (this.f8774r) {
                    f();
                    d0 d0VarO2 = o();
                    if (d0VarO2 != null) {
                        arrayList.add(d0VarO2);
                    }
                    e0 e0VarP = p();
                    if (e0VarP != null) {
                        arrayList.add(e0VarP);
                    }
                } else {
                    d0 d0VarO3 = o();
                    if (d0VarO3 != null) {
                        a(Arrays.asList(d0VarO3));
                    }
                    f();
                    e0 e0VarP2 = p();
                    if (e0VarP2 != null) {
                        arrayList.add(e0VarP2);
                    }
                }
                a(arrayList);
                f();
            } else {
                j();
                if (zC0) {
                    if (this.f8774r) {
                        f();
                    }
                    m();
                    if (!this.f8774r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Begin processing for non-streaming ad #" + this.f8773q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f8505a.a(x4.I0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!o0.d()) {
                    arrayList2.addAll(e());
                }
                d0 d0VarO4 = o();
                if (d0VarO4 != null) {
                    arrayList2.add(d0VarO4);
                }
                e0 e0VarP3 = p();
                if (e0VarP3 != null) {
                    arrayList2.add(e0VarP3);
                }
                a(arrayList2);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        }
        k();
    }
}
