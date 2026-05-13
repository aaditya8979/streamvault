package com.bytedance.adsdk.vt;

import android.content.Context;
import android.content.res.Resources;
import android.util.JsonReader;
import android.util.Pair;
import androidx.multidex.MultiDexExtractor;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class pno {
    private static final Map<String, jg<ra>> ouw = new HashMap();
    private static final Set<Object> vt = new HashSet();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final byte[] f12162lh = {80, 75, 3, 4};

    public static mwh<ra> lh(Context context, int i10) {
        try {
            return lh(context.getResources().openRawResource(i10), yu(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new mwh<>((Throwable) e10);
        }
    }

    public static mwh<ra> lh(Context context, String str) {
        return lh(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static mwh<ra> lh(Context context, String str, String str2) {
        try {
            if (!str.endsWith(MultiDexExtractor.EXTRACTED_SUFFIX) && !str.endsWith(".lottie")) {
                return lh(context.getAssets().open(str), str2);
            }
            return ouw(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new mwh<>((Throwable) e10);
        }
    }

    private static mwh<ra> lh(InputStream inputStream, String str) {
        try {
            return ouw(new JsonReader(new InputStreamReader(inputStream)), str, true);
        } finally {
            com.bytedance.adsdk.vt.le.pno.ouw(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lh() {
        ArrayList arrayList = new ArrayList(vt);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }

    public static jg<ra> ouw(Context context, int i10) {
        return ouw(context, i10, yu(context, i10));
    }

    public static jg<ra> ouw(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return ouw(str, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return pno.lh(context2, i10);
            }
        });
    }

    public static jg<ra> ouw(Context context, String str) {
        return ouw(context, str, "url_".concat(String.valueOf(str)));
    }

    public static jg<ra> ouw(final Context context, final String str, final String str2) {
        return ouw(str2, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                mwh<ra> mwhVarOuw;
                com.bytedance.adsdk.vt.yu.ra raVar;
                Pair<com.bytedance.adsdk.vt.yu.lh, InputStream> pairOuw;
                com.bytedance.adsdk.vt.yu.pno pnoVarOuw = fkw.ouw(context);
                Context context2 = context;
                String str3 = str;
                String str4 = str2;
                ra raVar2 = null;
                if (str4 != null && (raVar = pnoVarOuw.ouw) != null && (pairOuw = raVar.ouw(str3)) != null) {
                    com.bytedance.adsdk.vt.yu.lh lhVar = (com.bytedance.adsdk.vt.yu.lh) pairOuw.first;
                    InputStream inputStream = (InputStream) pairOuw.second;
                    ra raVar3 = (lhVar == com.bytedance.adsdk.vt.yu.lh.ZIP ? pno.ouw(context2, new ZipInputStream(inputStream), str4) : pno.vt(inputStream, str4)).ouw;
                    if (raVar3 != null) {
                        raVar2 = raVar3;
                    }
                }
                if (raVar2 != null) {
                    mwhVarOuw = new mwh<>(raVar2);
                } else {
                    com.bytedance.adsdk.vt.le.yu.ouw("Animation for " + str3 + " not found in cache. Fetching from network.");
                    mwhVarOuw = pnoVarOuw.ouw(context2, str3, str4);
                }
                if (str2 != null && mwhVarOuw.ouw != null) {
                    com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str2, mwhVarOuw.ouw);
                }
                return mwhVarOuw;
            }
        });
    }

    public static jg<ra> ouw(final InputStream inputStream, final String str) {
        return ouw(str, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.6
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                return pno.vt(inputStream, str);
            }
        });
    }

    private static jg<ra> ouw(final String str, Callable<mwh<ra>> callable) {
        final ra raVarOuw = str == null ? null : com.bytedance.adsdk.vt.lh.fkw.ouw().ouw(str);
        if (raVarOuw != null) {
            return new jg<>(new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.7
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ mwh<ra> call() throws Exception {
                    return new mwh<>(raVarOuw);
                }
            });
        }
        if (str != null) {
            Map<String, jg<ra>> map = ouw;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        jg<ra> jgVar = new jg<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jgVar.ouw(new cf<ra>() { // from class: com.bytedance.adsdk.vt.pno.2
                @Override // com.bytedance.adsdk.vt.cf
                public final /* synthetic */ void ouw(ra raVar) {
                    pno.ouw.remove(str);
                    atomicBoolean.set(true);
                    if (pno.ouw.size() == 0) {
                        pno.lh();
                    }
                }
            });
            jgVar.lh(new cf<Throwable>() { // from class: com.bytedance.adsdk.vt.pno.3
                @Override // com.bytedance.adsdk.vt.cf
                public final /* synthetic */ void ouw(Throwable th2) {
                    pno.ouw.remove(str);
                    atomicBoolean.set(true);
                    if (pno.ouw.size() == 0) {
                        pno.lh();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, jg<ra>> map2 = ouw;
                map2.put(str, jgVar);
                if (map2.size() == 1) {
                    lh();
                }
            }
        }
        return jgVar;
    }

    public static mwh<ra> ouw(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return vt(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.vt.le.pno.ouw(zipInputStream);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[PHI: r22
      0x012c: PHI (r22v18 java.lang.String) = 
      (r22v2 java.lang.String)
      (r22v3 java.lang.String)
      (r22v4 java.lang.String)
      (r22v5 java.lang.String)
      (r22v6 java.lang.String)
      (r22v7 java.lang.String)
      (r22v8 java.lang.String)
      (r22v9 java.lang.String)
      (r22v10 java.lang.String)
      (r22v11 java.lang.String)
      (r22v12 java.lang.String)
      (r22v13 java.lang.String)
      (r22v14 java.lang.String)
      (r22v15 java.lang.String)
      (r22v16 java.lang.String)
      (r22v19 java.lang.String)
     binds: [B:52:0x0128, B:49:0x011c, B:46:0x010f, B:43:0x0102, B:40:0x00f6, B:37:0x00e9, B:34:0x00db, B:31:0x00cf, B:28:0x00c1, B:25:0x00b3, B:22:0x00a6, B:19:0x0098, B:16:0x008a, B:13:0x007c, B:10:0x006d, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bytedance.adsdk.vt.mwh<com.bytedance.adsdk.vt.ra> ouw(android.util.JsonReader r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.pno.ouw(android.util.JsonReader, java.lang.String, boolean):com.bytedance.adsdk.vt.mwh");
    }

    private static tlj ouw(ra raVar, String str) {
        for (tlj tljVar : raVar.f12171lh.values()) {
            if (tljVar.yu.equals(str)) {
                return tljVar;
            }
        }
        return null;
    }

    private static void ouw(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static boolean ouw(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static jg<ra> vt(Context context, String str) {
        return vt(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static jg<ra> vt(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return ouw(str2, new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.pno.4
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                return pno.lh(applicationContext, str, str2);
            }
        });
    }

    public static mwh<ra> vt(Context context, int i10) {
        yu(context, i10);
        return lh(context, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0110 A[Catch: IOException -> 0x02a2, TryCatch #3 {IOException -> 0x02a2, blocks: (B:3:0x000a, B:6:0x0014, B:8:0x0020, B:62:0x014c, B:9:0x0025, B:11:0x0031, B:12:0x0036, B:14:0x0042, B:15:0x0057, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:25:0x007d, B:27:0x0085, B:30:0x008e, B:31:0x0093, B:33:0x0099, B:34:0x00a2, B:54:0x0106, B:56:0x0110, B:57:0x012a, B:53:0x00e8, B:58:0x012e, B:60:0x0134, B:61:0x013d, B:35:0x00c0, B:42:0x00d7, B:51:0x00e6, B:50:0x00e3, B:47:0x00de, B:37:0x00c7, B:38:0x00c9, B:40:0x00d0, B:41:0x00d4, B:45:0x00dc), top: B:121:0x000a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bytedance.adsdk.vt.mwh<com.bytedance.adsdk.vt.ra> vt(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.pno.vt(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):com.bytedance.adsdk.vt.mwh");
    }

    public static mwh<ra> vt(InputStream inputStream, String str) {
        return lh(inputStream, str);
    }

    private static String yu(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append(ouw(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }
}
