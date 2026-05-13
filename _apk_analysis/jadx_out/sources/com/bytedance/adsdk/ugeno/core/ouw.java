package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11643le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public List<C0176ouw> f11644lh;
    public String ouw;
    public float vt;
    public long yu;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ouw$ouw, reason: collision with other inner class name */
    public static class C0176ouw {
        public String bly;
        public String fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public float f11645le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11646lh;
        public long ouw;
        public float[] pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public float f11647ra;
        public String tlj;
        public float vt;
        public long yu;

        public static C0176ouw ouw(JSONObject jSONObject, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
            if (jSONObject == null) {
                return null;
            }
            C0176ouw c0176ouw = new C0176ouw();
            c0176ouw.ouw = jSONObject.optLong("duration");
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0176ouw.vt = -1.0f;
            } else {
                try {
                    c0176ouw.vt = Float.parseFloat(strOptString);
                } catch (NumberFormatException unused) {
                    c0176ouw.vt = 0.0f;
                }
            }
            c0176ouw.f11646lh = jSONObject.optString("loopMode");
            String strOptString2 = jSONObject.optString("type");
            c0176ouw.fkw = strOptString2;
            if (TextUtils.equals(strOptString2, "ripple")) {
                c0176ouw.tlj = jSONObject.optString("rippleColor");
            }
            T t10 = lhVar.fkw;
            Context context = t10 != 0 ? t10.getContext() : null;
            if (TextUtils.equals(c0176ouw.fkw, "backgroundColor")) {
                String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("valueTo"), lhVar.yu);
                int iOuw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(jSONObject.optString("valueFrom"), ViewCompat.MEASURED_STATE_MASK);
                int iOuw2 = com.bytedance.adsdk.ugeno.ra.ouw.ouw(strOuw, ViewCompat.MEASURED_STATE_MASK);
                c0176ouw.f11645le = iOuw;
                c0176ouw.f11647ra = iOuw2;
            } else if ((TextUtils.equals(c0176ouw.fkw, "translateX") || TextUtils.equals(c0176ouw.fkw, "translateY")) && context != null) {
                try {
                    float fOuw = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) jSONObject.optDouble("valueFrom"));
                    float fOuw2 = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) jSONObject.optDouble("valueTo"));
                    c0176ouw.f11645le = fOuw;
                    c0176ouw.f11647ra = fOuw2;
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0176ouw.f11645le = (float) jSONObject.optDouble("valueFrom");
                c0176ouw.f11647ra = (float) jSONObject.optDouble("valueTo");
            }
            c0176ouw.bly = jSONObject.optString("interpolator");
            String strOuw2 = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("startDelay"), lhVar.yu);
            Log.d("TAG", "createAnimationModel: ");
            c0176ouw.yu = com.bytedance.adsdk.ugeno.ra.lh.ouw(strOuw2);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0176ouw.fkw, "translateX") || TextUtils.equals(c0176ouw.fkw, "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) ouw.ouw(jSONArrayOptJSONArray.optString(i10), lhVar.yu));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) ouw.ouw(jSONArrayOptJSONArray.optString(i10), lhVar.yu);
                        i10++;
                    }
                }
                c0176ouw.pno = fArr;
            }
            return c0176ouw;
        }
    }

    public static double ouw(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.ra.lh.vt(com.bytedance.adsdk.ugeno.lh.vt.ouw((String) obj, jSONObject));
        }
        return 0.0d;
    }

    public static ouw ouw(String str, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ouw(new JSONObject(str), null, lhVar);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static ouw ouw(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (jSONObject == null) {
            return null;
        }
        ouw ouwVar = new ouw();
        ouwVar.ouw = jSONObject.optString("ordering");
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            ouwVar.vt = -1.0f;
        } else {
            try {
                ouwVar.vt = Float.parseFloat(strOptString);
            } catch (NumberFormatException unused) {
                ouwVar.vt = 0.0f;
            }
        }
        ouwVar.yu = jSONObject.optLong("duration", 0L);
        ouwVar.fkw = com.bytedance.adsdk.ugeno.ra.lh.ouw(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("startDelay"), lhVar.yu));
        ouwVar.f11643le = jSONObject.optString("loopMode");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.ra.vt.ouw(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0176ouw.ouw(jSONObjectOptJSONObject, lhVar));
            }
            ouwVar.f11644lh = arrayList;
        }
        return ouwVar;
    }
}
