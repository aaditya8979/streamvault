package com.safedk.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import androidx.appcompat.widget.ActivityChooserModel;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53071a = 620;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53072b = "MemoryUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f53073c = new Object();

    private static int a(Map<Long, List<String>> map, String str) {
        int i10;
        int size = 0;
        if (map != null) {
            Iterator<List<String>> it = map.values().iterator();
            while (true) {
                i10 = size;
                if (!it.hasNext()) {
                    break;
                }
                size = it.next().size() + i10;
            }
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            Logger.d(f53072b, "clear CIs from memory " + str + " - countItemsInTsMap returned " + i10);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.util.Map<?, ?> r6, java.lang.String r7, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType r8, java.lang.String r9) {
        /*
            r2 = 0
            java.util.Collection r0 = r6.values()
            java.util.Iterator r4 = r0.iterator()
            r1 = r2
        La:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r4.next()
            r3 = 0
            boolean r5 = r0 instanceof com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
            if (r5 == 0) goto L4a
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r0 = (com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo) r0
        L1b:
            if (r0 == 0) goto La7
            java.lang.String r3 = r0.Q()
            if (r3 == 0) goto La7
            java.lang.String r3 = r0.Q()
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto La7
            com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType r3 = r0.K()
            if (r3 != 0) goto L35
            if (r8 == 0) goto L45
        L35:
            com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType r3 = r0.K()
            if (r3 == 0) goto La7
            com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType r0 = r0.K()
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto La7
        L45:
            int r1 = r1 + 1
            r0 = r1
        L48:
            r1 = r0
            goto La
        L4a:
            boolean r5 = r0 instanceof java.util.List
            if (r5 == 0) goto La9
            java.util.List r0 = (java.util.List) r0
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto La9
            java.lang.Object r5 = r0.get(r2)
            boolean r5 = r5 instanceof com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
            if (r5 == 0) goto La9
            java.lang.Object r0 = r0.get(r2)
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r0 = (com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo) r0
            goto L1b
        L65:
            if (r1 <= 0) goto La3
            java.lang.String r2 = "MemoryUtils"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "clear CIs from memory "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r3 = " get CI count returned "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = " for SdkPackage "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r3 = ", adType "
            java.lang.StringBuilder r3 = r0.append(r3)
            if (r8 == 0) goto La4
            java.lang.String r0 = r8.name()
        L98:
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            com.safedk.android.utils.Logger.d(r2, r0)
        La3:
            return r1
        La4:
            java.lang.String r0 = "null"
            goto L98
        La7:
            r0 = r1
            goto L48
        La9:
            r0 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.e.a(java.util.Map, java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType, java.lang.String):int");
    }

    public static long a(Context context) {
        return Runtime.getRuntime().freeMemory();
    }

    private static long a(File file) {
        long blockSize;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            } else {
                blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            }
            return blockSize;
        } catch (Throwable th2) {
            Logger.e(f53072b, "error in getAvailableMemoryInPath");
            return 0L;
        }
    }

    public static String a() {
        try {
            return a(a(Environment.getDataDirectory()));
        } catch (Throwable th2) {
            Logger.e(f53072b, "error in getHumanReadableFreeInternalMemory()");
            return "";
        }
    }

    private static String a(double d10) {
        return new DecimalFormat("#.##").format(d10);
    }

    public static String a(long j10) {
        long j11 = 1024 * 1024;
        long j12 = j11 * 1024;
        long j13 = j12 * 1024;
        long j14 = j13 * 1024;
        long j15 = j14 * 1024;
        return j10 < 1024 ? a(j10) + " byte" : (j10 < 1024 || j10 >= j11) ? (j10 < j11 || j10 >= j12) ? (j10 < j12 || j10 >= j13) ? (j10 < j13 || j10 >= j14) ? (j10 < j14 || j10 >= j15) ? j10 >= j15 ? a(j10 / j15) + " Eb" : "???" : a(j10 / j14) + " Pb" : a(j10 / j13) + " Tb" : a(j10 / j12) + " Gb" : a(j10 / j11) + " Mb" : a(j10 / 1024) + " Kb";
    }

    private static String a(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp.getTime()));
    }

    public static void a(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(f53072b, "loaded from prefs: " + strA);
        Logger.d(f53072b, "available heap size: " + strA2);
        if (b(SafeDK.getInstance().l())) {
            Logger.e(f53072b, "android low memory!");
        }
    }

    private static void a(Map<?, ?> map, String str, int i10, String str2) {
        int i11;
        for (String str3 : CreativeInfoManager.i()) {
            for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
                Map<Long, List<String>> mapB = b(map, str3, adType, str2);
                int iA = a(mapB, str2);
                if (iA > i10 && (i11 = iA - i10) > 0) {
                    ArrayList arrayList = new ArrayList(mapB.keySet());
                    Collections.sort(arrayList);
                    Logger.d(f53072b, "clear CIs from memory (oldest) " + str2 + " - after clean iteration itemsToBeRemovedList = " + arrayList);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        int i12 = i11;
                        if (!it.hasNext()) {
                            break;
                        }
                        List<String> list = mapB.get((Long) it.next());
                        if (list != null) {
                            for (String str4 : list) {
                                if (map.containsKey(str4)) {
                                    map.remove(str4);
                                    Logger.d(f53072b, "clear CIs from memory (oldest) " + str2 + " - after clean removed adId: " + str4 + ", itemsToBeRemovedCount: " + i12);
                                    i12--;
                                    if (i12 <= 0) {
                                        return;
                                    }
                                }
                            }
                        }
                        i11 = i12;
                    }
                }
            }
        }
    }

    private static void a(Map<?, ?> map, String str, int i10, String str2, boolean z10) {
        List list;
        HashSet hashSet = new HashSet();
        if (z10) {
            for (String str3 : CreativeInfoManager.i()) {
                for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
                    int iA = a(map, str3, adType, str2);
                    if (iA > i10) {
                        hashSet.add(str3 + "_" + adType.name());
                        if (iA > 0) {
                            Logger.d(f53072b, "clear CIs from memory (expired) " + str2 + " - for " + str + ", adType: " + adType.name() + ", sdkPackageName: " + str3 + ", item count: " + iA + ", max items: " + i10);
                        }
                    }
                }
            }
        }
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            CreativeInfo creativeInfo = null;
            if (next != null && next.getValue() != null) {
                if (next.getValue() instanceof CreativeInfo) {
                    creativeInfo = (CreativeInfo) next.getValue();
                } else if ((next.getValue() instanceof List) && (list = (List) next.getValue()) != null && list.size() > 0 && (list.get(0) instanceof CreativeInfo)) {
                    creativeInfo = (CreativeInfo) list.get(0);
                }
            }
            if (creativeInfo != null) {
                String strQ = creativeInfo.Q();
                BrandSafetyUtils.AdType adTypeK = creativeInfo.K();
                a(z10, str2, hashSet, it, creativeInfo, next.getKey().toString());
                if (a(map, strQ, adTypeK, str2) <= i10) {
                    return;
                }
            }
        }
    }

    public static void a(Map<?, ?> map, String str, boolean z10) {
        int iR;
        if (map != null && map.size() > (iR = SafeDK.getInstance().R())) {
            String string = UUID.randomUUID().toString();
            try {
                a(map, str, iR, string, z10);
                a(map, str, iR, string);
            } catch (Throwable th2) {
                Logger.d(f53072b, "Exception in clear CIs from memory " + string + " - " + th2.getMessage(), th2);
            }
        }
    }

    private static void a(boolean z10, String str, Set<String> set, Iterator<? extends Map.Entry<?, ?>> it, CreativeInfo creativeInfo, String str2) {
        if (creativeInfo != null && CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (creativeInfo.Y() == null || !creativeInfo.Y().before(new Timestamp(jCurrentTimeMillis))) {
                return;
            }
            if (!z10) {
                Logger.d(f53072b, "clear CIs from memory " + str + " - removing CI item. expiration time: " + a(creativeInfo.Y()) + ", sdk: " + creativeInfo.Q() + ", adType = " + creativeInfo.K() + ", key: " + str2);
                it.remove();
            } else if (set.contains(creativeInfo.Q() + "_" + creativeInfo.K().name())) {
                Logger.d(f53072b, "clear CIs from memory " + str + " - removing list item. expiration time: " + a(creativeInfo.Y()) + ", sdk: " + creativeInfo.Q() + ", adType = " + creativeInfo.K() + ", key: " + str2);
                it.remove();
            }
        }
    }

    private static boolean a(CreativeInfo creativeInfo, String str, BrandSafetyUtils.AdType adType, String str2) {
        return creativeInfo != null && creativeInfo.Q() != null && creativeInfo.Q().equals(str) && ((creativeInfo.K() == null && adType == null) || (creativeInfo.K() != null && creativeInfo.K().equals(adType)));
    }

    public static long b() {
        return a(Environment.getDataDirectory());
    }

    public static String b(long j10) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) new Date(j10));
    }

    private static Map<Long, List<String>> b(Map<?, ?> map, String str, BrandSafetyUtils.AdType adType, String str2) {
        HashMap map2 = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            CreativeInfo creativeInfo = null;
            if (entry.getValue() instanceof CreativeInfo) {
                creativeInfo = (CreativeInfo) entry.getValue();
            } else if (entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                    creativeInfo = (CreativeInfo) list.get(0);
                }
            }
            if (a(creativeInfo, str, adType, str2)) {
                List arrayList = (List) map2.get(Long.valueOf(creativeInfo.ab()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(Long.valueOf(creativeInfo.ab()), arrayList);
                }
                arrayList.add(entry.getKey().toString());
            }
        }
        if (map2.size() > 0) {
            Logger.d(f53072b, "clear CIs from memory " + str2 + " get TS CI count returned " + map2.size() + " items for SdkPackage " + str + ", adType " + (adType != null ? adType.name() : "null"));
        }
        return map2;
    }

    public static void b(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(f53072b, "saved in prefs: " + strA);
        boolean zB = b(SafeDK.getInstance().l());
        Logger.d(f53072b, "available heap size: " + strA2);
        if (zB) {
            Logger.e(f53072b, "android low memory!");
        }
    }

    public static boolean b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static long c() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}
