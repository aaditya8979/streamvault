package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.d0;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l5 extends i5 implements v3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.b f8682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f8683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection f8686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExecutorService f8688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ExecutorService f8689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f8690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d0 f8691p;

    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f8682g.a(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f8507c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f8507c.a(l5Var.f8506b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    public class b implements e0.a {
        public b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f8682g.b(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f8507c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f8507c.a(l5Var.f8506b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    public class c implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0.a f8694a;

        public c(e0.a aVar) {
            this.f8694a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = l5.this.f8507c;
                if (com.applovin.impl.sdk.o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.f8507c.b(l5Var.f8506b, "Failed to cache video");
                }
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong(CreativeInfo.f52474c, l5.this.f8682g.getAdIdNumber());
                l5.this.f8505a.t().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = l5.this.f8507c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.f8507c.a(l5Var2.f8506b, "Finish caching video for ad #" + l5.this.f8682g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f8694a.a(uri);
        }
    }

    public class d implements d0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f8696a;

        public d(e eVar) {
            this.f8696a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z10) {
            if (z10) {
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f8696a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    public l5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        this.f8684i = UUID.randomUUID().toString();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f8682g = bVar;
        this.f8683h = appLovinAdLoadListener;
        this.f8685j = kVar.G();
        this.f8686k = h();
        if (((Boolean) kVar.a(x4.I0)).booleanValue()) {
            if (kVar.q0().e()) {
                this.f8688m = kVar.q0().a();
                this.f8689n = kVar.q0().d();
                return;
            }
            String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
            this.f8688m = kVar.q0().a("com.applovin.sdk.caching." + mediationServeId, ((Integer) kVar.a(x4.K0)).intValue());
            this.f8689n = kVar.q0().a("com.applovin.sdk.caching.html." + mediationServeId, ((Integer) kVar.a(x4.L0)).intValue());
        }
    }

    private Uri a(String str, String str2) {
        File fileA = this.f8685j.a(n7.a(Uri.parse(str2), this.f8682g.getCachePrefix(), this.f8505a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f8505a.a(x4.Q6)).booleanValue() && this.f8685j.a(fileA)) {
            return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
        }
        String str3 = str + str2;
        if (!this.f8685j.a(fileA, str3, Arrays.asList(str), this.f8505a.G().a(str3, this.f8682g), this.f8684i, f2.a((AppLovinAdImpl) this.f8682g))) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f8505a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8683h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f8682g);
            this.f8683h = null;
        }
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching " + str + " image...");
        }
        return b(string);
    }

    public Uri a(String str, List list, boolean z10) {
        try {
            int iA = this.f8505a.G().a(str, this.f8682g);
            Map mapA = f2.a((AppLovinAdImpl) this.f8682g);
            String strA = this.f8685j.a(a(), str, this.f8682g.getCachePrefix(), list, z10, iA, this.f8684i, mapA);
            if (!StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.b(this.f8506b, "Failed to cache image: " + str);
                }
                a(str, "cacheImageResource", mapA);
                return null;
            }
            File fileA = this.f8685j.a(strA, a());
            if (fileA != null) {
                Uri uriFromFile = Uri.fromFile(fileA);
                if (uriFromFile != null) {
                    return uriFromFile;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8507c.b(this.f8506b, "Unable to extract Uri from image file");
                }
                a(strA, "extractUriFromImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to retrieve File from cached image filename = " + strA);
            }
            a(strA, "retrieveImageFile", mapA);
            return null;
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Failed to cache image at url = " + str, th2);
            }
            Map mapA2 = f2.a((AppLovinAdImpl) this.f8682g);
            CollectionUtils.putStringIfValid("url", str, mapA2);
            this.f8505a.D().a(this.f8506b, "cacheImageResource", th2, mapA2);
            return null;
        }
    }

    public d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.f8682g, list, this.f8689n, this.f8684i, this.f8505a, new d(eVar));
        this.f8691p = d0Var;
        return d0Var;
    }

    public e0 a(String str, e0.a aVar) {
        return new e0(str, this.f8682g, this.f8684i, this.f8505a, aVar);
    }

    public e0 a(String str, List list, boolean z10, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f8507c.a(this.f8506b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching video " + str + "...");
        }
        return new e0(str, this.f8682g, list, z10, this.f8684i, this.f8505a, new c(aVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0038, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r12, java.util.List r13, com.applovin.impl.sdk.ad.b r14) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.l5.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    public List a(List list) {
        this.f8690o = list;
        return this.f8505a.q0().a(list, this.f8688m);
    }

    public void a(int i10) {
        if (this.f8683h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Calling back ad load failed with error code: " + i10);
            }
            this.f8683h.failedToReceiveAd(i10);
            this.f8683h = null;
        }
        g();
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(strA0)) {
            String strA = a(strA0, bVar.S(), bVar);
            bVar.c(strA);
            this.f8507c.f(this.f8506b, "Ad updated with video button HTML assets cached = " + strA);
        }
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.Q().equalsIgnoreCase(this.f8682g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Updating flag for timeout...");
            }
            g();
        }
        this.f8505a.Z().b(this);
    }

    public void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f8505a.D().a(d2.M0, str2, map2);
    }

    public Uri b(String str) {
        return a(str, this.f8682g.S(), true);
    }

    public Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching video " + str + "...");
        }
        int iA = this.f8505a.G().a(str, this.f8682g);
        Map mapA = f2.a((AppLovinAdImpl) this.f8682g);
        String strA = this.f8685j.a(a(), str, this.f8682g.getCachePrefix(), list, z10, iA, this.f8684i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f8685j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Finish caching video for ad #" + this.f8682g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    public e0 b(String str, e0.a aVar) {
        return a(str, this.f8682g.S(), true, aVar);
    }

    public Uri c(String str) {
        return b(str, this.f8682g.S(), true);
    }

    public String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.f8685j.a(str, list, z10, f2.a((AppLovinAdImpl) this.f8682g));
            if (inputStreamA == null) {
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                return null;
            }
            try {
                String strA = this.f8685j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Unknown failure to read input stream.", th2);
            }
            this.f8507c.a(this.f8506b, th2);
            this.f8505a.D().a(this.f8506b, "readInputStreamAsString", th2);
            return null;
        }
    }

    public List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f8682g.G() != null) {
            arrayList.add(a(this.f8682g.G().toString(), new a()));
        }
        if (this.f8682g.Y() != null) {
            arrayList.add(a(this.f8682g.Y().toString(), new b()));
        }
        return arrayList;
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Rendered new ad:" + this.f8682g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zb
            @Override // java.lang.Runnable
            public final void run() {
                this.f11080b.i();
            }
        });
    }

    public void g() {
        this.f8687l = true;
        List list = this.f8690o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f8690o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f8505a.q0().e()) {
            d0 d0Var = this.f8691p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f8688m;
        if (executorService != null) {
            executorService.shutdown();
            this.f8688m = null;
        }
        ExecutorService executorService2 = this.f8689n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f8689n = null;
        }
    }

    public void j() {
        if (o0.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Caching mute images...");
        }
        Uri uriA = a(this.f8682g.G(), CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (uriA != null) {
            this.f8682g.a(uriA);
        }
        Uri uriA2 = a(this.f8682g.Y(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        if (uriA2 != null) {
            this.f8682g.b(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Ad updated with muteImageFilename = " + this.f8682g.G() + ", unmuteImageFilename = " + this.f8682g.Y());
        }
    }

    public void k() {
        this.f8505a.Z().b(this);
        if (!this.f8505a.q0().e()) {
            ExecutorService executorService = this.f8688m;
            if (executorService != null) {
                executorService.shutdown();
                this.f8688m = null;
            }
            ExecutorService executorService2 = this.f8689n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f8689n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f8682g.getAdZone().d();
        if (((Boolean) this.f8505a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f8505a.h().b(this.f8682g);
        }
        this.f8505a.d0().a(this.f8684i);
    }

    public boolean l() {
        return this.f8687l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8682g.b1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Subscribing to timeout events...");
            }
            this.f8505a.Z().a(this);
        }
    }
}
