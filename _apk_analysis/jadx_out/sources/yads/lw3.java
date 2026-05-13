package yads;

import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WindowManager f92133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f92134b = {VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f92135c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(VastAttributes.HORIZONTAL_POSITION, i10 / f92135c);
            jSONObject.put(VastAttributes.VERTICAL_POSITION, i11 / f92135c);
            jSONObject.put("width", i12 / f92135c);
            jSONObject.put("height", i13 / f92135c);
        } catch (JSONException e10) {
            tw3.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (f92133a != null) {
            Point point = new Point(0, 0);
            f92133a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f92135c;
            float f14 = f12 / f13;
            f11 = point.y / f13;
            f10 = f14;
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + C3978d4.j.f31385e, e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!(jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) && (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!c(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            r0 = 1
            if (r10 != 0) goto L6
            if (r11 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r10 == 0) goto Lad
            if (r11 != 0) goto Ld
            goto Lad
        Ld:
            java.lang.String[] r2 = yads.lw3.f92134b
            r3 = 4
            r4 = r1
        L11:
            if (r4 >= r3) goto L26
            r5 = r2[r4]
            double r6 = r10.optDouble(r5)
            double r8 = r11.optDouble(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L23
            goto Lab
        L23:
            int r4 = r4 + 1
            goto L11
        L26:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r10.optString(r2, r3)
            java.lang.String r2 = r11.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "noOutputDevice"
            boolean r4 = r10.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r11.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r10.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r11.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r10.optJSONArray(r2)
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r4 != 0) goto L77
            if (r2 != 0) goto L77
            goto La4
        L77:
            if (r4 != 0) goto L7c
            if (r2 != 0) goto L7c
            goto L8b
        L7c:
            if (r4 == 0) goto Lab
            if (r2 != 0) goto L81
            goto Lab
        L81:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto Lab
        L8b:
            r5 = r1
        L8c:
            int r6 = r4.length()
            if (r5 >= r6) goto La4
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto La1
            goto Lab
        La1:
            int r5 = r5 + 1
            goto L8c
        La4:
            boolean r10 = b(r10, r11)
            if (r10 == 0) goto Lab
            goto Lac
        Lab:
            r0 = r1
        Lac:
            return r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lw3.c(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
