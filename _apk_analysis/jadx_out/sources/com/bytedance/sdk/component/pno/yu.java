package com.bytedance.sdk.component.pno;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.C3978d4;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static AtomicInteger f12769lh = new AtomicInteger(0);
    public static final String[] ouw = {g.f53147u, "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] vt = {"tt_pangle", "bd_tracker"};
    private static int yu = 0;
    private static int fkw = 0;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12770lh;
        public int ouw = 1;
        public String vt;
        public String yu;

        public ouw(String str, String str2, String str3) {
            this.f12770lh = str;
            this.yu = str2;
            this.vt = str3;
        }

        public final String toString() {
            return "ThreadModel{times=" + this.ouw + ", name='" + this.vt + "', lastStackStack='" + this.f12770lh + "'}";
        }
    }

    public static void ouw() {
        int i10;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        String str;
        String str2 = "\n";
        try {
            lh lhVarFkw = le.fkw();
            if (lhVarFkw != null) {
                int i11 = 1;
                int iAddAndGet = f12769lh.addAndGet(1);
                int i12 = le.f12753lh;
                if (i12 >= 0 && iAddAndGet % i12 == 0 && Looper.getMainLooper() != Looper.myLooper()) {
                    Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                    HashMap map = new HashMap();
                    if (allStackTraces != null) {
                        boolean zOuw = ko.ouw();
                        int size = allStackTraces.size();
                        if (size > fkw) {
                            fkw = size;
                        }
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = allStackTraces.entrySet().iterator();
                        int i13 = 0;
                        int i14 = 0;
                        while (it2.hasNext()) {
                            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                            i14 += i11;
                            Thread key = next.getKey();
                            StackTraceElement[] value = next.getValue();
                            StringBuilder sb2 = new StringBuilder(str2);
                            if (zOuw) {
                                sb2.append("Thread Name is : " + key.getName());
                                sb2.append(str2);
                            }
                            String str3 = null;
                            int length = value.length;
                            int i15 = 0;
                            while (i15 < length) {
                                String string = value[i15].toString();
                                if (zOuw) {
                                    it = it2;
                                    sb2.append(string + str2);
                                } else {
                                    it = it2;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    if (ouw(string, ouw)) {
                                        str = str2;
                                    } else {
                                        str = str2;
                                        if (ouw(key.getName(), vt)) {
                                        }
                                    }
                                    i13++;
                                    str3 = string;
                                } else {
                                    str = str2;
                                }
                                i15++;
                                it2 = it;
                                str2 = str;
                            }
                            String str4 = str2;
                            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it2;
                            if (zOuw) {
                                if (TextUtils.isEmpty(str3)) {
                                    i10 = 1;
                                } else {
                                    String str5 = str3 + C3978d4.j.f31381c + key.getName();
                                    ouw ouwVar = (ouw) map.get(str5);
                                    if (ouwVar != null) {
                                        i10 = 1;
                                        ouwVar.ouw++;
                                    } else {
                                        i10 = 1;
                                        ouwVar = new ouw(str5, sb2.toString(), key.getName());
                                    }
                                    map.put(str5, ouwVar);
                                }
                                if (!TextUtils.isEmpty(sb2.toString())) {
                                    Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                                    Log.w("PoolTaskStatistics", sb2.toString());
                                }
                            } else {
                                i10 = 1;
                            }
                            i11 = i10;
                            it2 = it3;
                            str2 = str4;
                        }
                        if (i13 > yu) {
                            yu = i13;
                        }
                        if (zOuw) {
                            Log.e("PoolTaskStatistics", "SDK current threads=" + i13 + ", SDK Max threads=" + yu + ", Application threads = " + size + ", Application max threads = " + fkw);
                            Iterator it4 = map.entrySet().iterator();
                            while (it4.hasNext()) {
                                Log.i("PoolTaskStatistics", ((ouw) ((Map.Entry) it4.next()).getValue()).toString());
                            }
                        }
                        lhVarFkw.ouw(new com.bytedance.sdk.component.pno.vt.ouw(i13, yu, size, fkw));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean ouw(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
