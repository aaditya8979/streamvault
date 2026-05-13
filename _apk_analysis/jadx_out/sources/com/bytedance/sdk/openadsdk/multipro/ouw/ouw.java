package com.bytedance.sdk.openadsdk.multipro.ouw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.le;
import com.bytedance.sdk.openadsdk.core.fkw;
import com.bytedance.sdk.openadsdk.multipro.yu;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ouw {
    public static le ouw;
    private static final ConcurrentHashMap<String, Object> vt = new ConcurrentHashMap<>();

    public static int ouw(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (ouw(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    return fkw.ouw(context).ouw().ouw(str, contentValues, str2, strArr);
                }
                le leVarOuw = ouw(context);
                if (leVarOuw != null) {
                    return leVarOuw.ouw(Uri.parse(ouw() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static int ouw(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (ouw(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                return fkw.ouw(context).ouw().ouw(str, str2, strArr);
            }
            le leVarOuw = ouw(context);
            if (leVarOuw != null) {
                return leVarOuw.ouw(Uri.parse(ouw() + str), str2, strArr);
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.le.ouw.le ouw(android.content.Context r1) {
        /*
            if (r1 != 0) goto L5
            com.bytedance.sdk.openadsdk.core.zih.ouw()     // Catch: java.lang.Throwable -> L26
        L5:
            com.bytedance.sdk.component.le.ouw.le r1 = com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2b
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.vt.lh()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            com.bytedance.sdk.openadsdk.multipro.aidl.ouw r1 = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw()     // Catch: java.lang.Throwable -> L26
            r0 = 5
            android.os.IBinder r1 = r1.ouw(r0)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.component.le.ouw.le r1 = com.bytedance.sdk.component.le.ouw.le.ouw.ouw(r1)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L1f:
            com.bytedance.sdk.openadsdk.multipro.aidl.ouw.le r1 = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.le.vt()     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            java.lang.String r1 = "binder error"
            com.bytedance.sdk.openadsdk.utils.uoy.le(r1)
        L2b:
            com.bytedance.sdk.component.le.ouw.le r1 = com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(android.content.Context):com.bytedance.sdk.component.le.ouw.le");
    }

    private static Object ouw(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = vt;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (ouw.class) {
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new Object();
                concurrentHashMap.put(str, obj);
            }
        }
        return obj;
    }

    private static String ouw() {
        return yu.vt + "/t_db/ttopensdk.db/";
    }

    public static Map<String, List<String>> ouw(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (ouw(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                return ouw(fkw.ouw(context).ouw().ouw(str, strArr, str2, strArr2, str3, str4, str5));
            }
            le leVarOuw = ouw(context);
            if (leVarOuw != null) {
                return leVarOuw.ouw(Uri.parse(ouw() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> ouw(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
            } catch (Throwable unused) {
            }
            cursor.close();
        }
        return map;
    }

    public static void ouw(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (ouw(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                fkw.ouw(context).ouw().ouw(str, (String) null, contentValues);
                return;
            }
            le leVarOuw = ouw(context);
            if (leVarOuw != null) {
                leVarOuw.ouw(Uri.parse(ouw() + str), contentValues);
            }
        }
    }
}
