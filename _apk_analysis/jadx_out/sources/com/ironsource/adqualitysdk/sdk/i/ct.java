package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ct extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1544 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1545 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1546 = 25;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5860(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f728) {
            char[] cArr2 = new char[i10];
            b.f726 = 0;
            while (true) {
                int i13 = b.f726;
                if (i13 >= i10) {
                    break;
                }
                b.f727 = cArr[i13];
                cArr2[b.f726] = (char) (b.f727 + i12);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f1546);
                b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i17 = b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m5861(cq cqVar, List<Object> list) {
        boolean zBooleanValue;
        JSONObject jSONObject;
        String str = (String) cz.m5927(list, 0, String.class);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cqVar.m5759());
        sb2.append(m5860("\u0000", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, Color.argb(0, 0, 0, 0) + 1, ((Process.getThreadPriority(0) + 20) >> 6) + 83).intern());
        sb2.append(Integer.toHexString(str.hashCode()));
        String string = sb2.toString();
        Throwable th2 = (Throwable) cz.m5927(list, 1, Throwable.class);
        if ((list.size() > 2 ? (char) 20 : 'O') != 20) {
            kd.m6951(cqVar.m5759(), str, string, th2, null, false);
        } else {
            if ((cz.m5926(list, 2, JSONObject.class) ? (char) 21 : ']') != ']') {
                int i10 = f1545 + 51;
                f1544 = i10 % 128;
                int i11 = i10 % 2;
                JSONObject jSONObject2 = (JSONObject) cz.m5927(list, 2, JSONObject.class);
                if (list.size() > 3) {
                    int i12 = f1544 + 113;
                    f1545 = i12 % 128;
                    int i13 = i12 % 2;
                    if (cz.m5926(list, 3, Boolean.class)) {
                        int i14 = f1545 + 107;
                        f1544 = i14 % 128;
                        zBooleanValue = ((Boolean) (i14 % 2 == 0 ? cz.m5927(list, 2, Boolean.class) : cz.m5927(list, 3, Boolean.class))).booleanValue();
                    }
                }
                zBooleanValue = zBooleanValue;
                jSONObject = jSONObject2;
            } else {
                zBooleanValue = cz.m5926(list, 2, Boolean.class) ? false : true ? false : ((Boolean) cz.m5927(list, 2, Boolean.class)).booleanValue();
                jSONObject = null;
            }
            kd.m6951(cqVar.m5759(), str, string, th2, jSONObject, zBooleanValue);
        }
        return null;
    }
}
