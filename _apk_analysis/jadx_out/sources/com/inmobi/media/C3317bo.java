package com.inmobi.media;

import android.content.Context;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.inmobi.media.C3317bo;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3317bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H5 f26890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3291ao f26891b;

    public C3317bo(final Context context, final AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(webAssetCacheConfig, "webAssetCacheConfig");
        this.f26891b = new C3291ao();
        Runnable runnable = new Runnable() { // from class: n9.t5
            @Override // java.lang.Runnable
            public final void run() {
                C3317bo.a(webAssetCacheConfig, this, context);
            }
        };
        Context context2 = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static void a(Context context, long j10) {
        Pair pairA = bn.h.a("size", Long.valueOf(j10));
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "web_asset_file_key");
        tn.p.k("cache_enabled", "key");
        Map mapO = kotlin.collections.a.o(pairA, bn.h.a("state", Boolean.valueOf(eaA.f25373a.getBoolean("cache_enabled", false))));
        Wj wj2 = Wj.f26549a;
        Wj.b("LowAvailableSpaceForCache", mapO, EnumC3287ak.f26805a);
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, C3317bo c3317bo, Context context) {
        try {
            C3850x5.f28483a.getClass();
            long j10 = C3850x5.f28485c;
            if (j10 >= webAssetCacheConfig.getMinAvailableDiskSpace()) {
                c3317bo.a(context, webAssetCacheConfig, j10);
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", true);
            } else {
                c3317bo.getClass();
                a(context, j10);
                ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
                Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", false);
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            e10.getMessage();
        }
    }

    public final InputStream a(String str, InterfaceC3580m9 interfaceC3580m9) {
        G5 g5B;
        tn.p.k(str, "url");
        H5 h52 = this.f26890a;
        if (h52 == null) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + str);
            }
            return null;
        }
        try {
            g5B = h52.b(String.valueOf(str.hashCode()));
        } catch (Exception e10) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e10.getMessage() + " for " + str);
            }
        }
        if (g5B != null && tn.p.f(str, AbstractC3314bl.a(new InputStreamReader(g5B.f25513a[0], AbstractC3314bl.f26879b)))) {
            return g5B.f25513a[1];
        }
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + str);
        }
        return null;
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j10) throws IOException {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        tn.p.k(webAssetCacheConfig, "webAssetCacheConfig");
        long jMin = ((long) (j10 == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j10 * ((long) webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent())) / ((long) 100))))) * 1024 * ((long) 1024);
        C3291ao c3291ao = this.f26891b;
        Pattern pattern = H5.f25566p;
        if (jMin <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        H5 h52 = new H5(file, jMin, c3291ao);
        if (h52.f25570c.exists()) {
            try {
                h52.b();
                h52.a();
                h52.f25579l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(h52.f25570c, true), AbstractC3314bl.f26878a));
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                h52.close();
                AbstractC3314bl.a(h52.f25569b);
                file.mkdirs();
                h52 = new H5(file, jMin, c3291ao);
                h52.c();
            }
        } else {
            file.mkdirs();
            h52 = new H5(file, jMin, c3291ao);
            h52.c();
        }
        this.f26890a = h52;
    }

    public final boolean a(String str, String str2, InterfaceC3580m9 interfaceC3580m9) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        D5 d5A;
        tn.p.k(str, "url");
        tn.p.k(str2, "data");
        if (this.f26890a == null) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + str);
            }
            return false;
        }
        try {
            String strValueOf = String.valueOf(str.hashCode());
            H5 h52 = this.f26890a;
            outputStreamWriter = null;
            if (h52 == null) {
                tn.p.C("diskLruCache");
                h52 = null;
            }
            d5A = h52.a(strValueOf);
        } catch (Exception e10) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e10.getMessage() + " for " + str);
            }
        }
        if (d5A == null) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + str);
            }
            return false;
        }
        try {
            OutputStream outputStreamA = d5A.a(0);
            Charset charset = AbstractC3314bl.f26879b;
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(outputStreamA, charset);
            try {
                outputStreamWriter2.write(str);
                AbstractC3314bl.a(outputStreamWriter2);
                try {
                    OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(d5A.a(1), charset);
                    try {
                        outputStreamWriter3.write(str2);
                        AbstractC3314bl.a(outputStreamWriter3);
                        if (d5A.f25300c) {
                            d5A.f25301d.a(d5A, false);
                            d5A.f25301d.d(d5A.f25298a.f25361a);
                        } else {
                            d5A.f25301d.a(d5A, true);
                        }
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStreamWriter = outputStreamWriter3;
                        AbstractC3314bl.a(outputStreamWriter);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStreamWriter = outputStreamWriter2;
                AbstractC3314bl.a(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
