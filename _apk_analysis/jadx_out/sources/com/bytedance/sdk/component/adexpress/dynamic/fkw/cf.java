package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.vt;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cf {
    private static final Set<String> ouw = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String vt;

    private static vt.lh ouw(vt.lh lhVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            lhVar.ouw = 0.0f;
            lhVar.vt = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = ouw(str);
            }
            if (!TextUtils.isEmpty(str3)) {
                return ouw(str3, str2);
            }
            lhVar.ouw = 0.0f;
            lhVar.vt = 0.0f;
        }
        return lhVar;
    }

    private static vt.lh ouw(String str, String str2) {
        vt.lh lhVar = new vt.lh();
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str2);
            int[] iArrOuw = ouw(str, (float) vt(str2), false);
            int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iArrOuw[1]);
            lhVar.ouw = new int[]{com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iArrOuw[0]), iVt}[0];
            lhVar.vt = iVt;
            if (jSONObjectJsonObjectInit.optDouble("lineHeight", 1.0d) == 0.0d) {
                lhVar.vt = 0.0f;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return lhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0488 A[Catch: Exception -> 0x0498, TryCatch #3 {Exception -> 0x0498, blocks: (B:225:0x047e, B:227:0x0488, B:232:0x0491), top: B:284:0x047e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.fkw.vt.lh ouw(java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, boolean r23, int r24, com.bytedance.sdk.component.adexpress.dynamic.yu.pno r25, double r26, int r28, double r29, com.bytedance.sdk.component.adexpress.vt.mwh r31) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.yu.pno, double, int, double, com.bytedance.sdk.component.adexpress.vt.mwh):com.bytedance.sdk.component.adexpress.dynamic.fkw.vt$lh");
    }

    public static String ouw() {
        return vt;
    }

    public static String ouw(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    public static int[] ouw(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.yu.ouw());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    private static double vt(String str) {
        try {
            return Double.parseDouble(PangleVideoBridge.jsonObjectInit(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static boolean vt() {
        return !TextUtils.isEmpty(vt);
    }
}
