package w2;

import android.util.Patterns;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import bo.d0;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.ironsource.Gc;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: FeatureExtractor.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0002J0\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J(\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002J+\u0010\"\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0002J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0002J(\u0010-\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\r2\n\u0010+\u001a\u00060)j\u0002`*2\n\u0010,\u001a\u00060)j\u0002`*H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010(\u001a\u00020\rH\u0002R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010/R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010/R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u00103R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00105¨\u00069"}, d2 = {"Lw2/a;", "", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/io/File;", C3978d4.i.f31327b, "Lbn/r;", "d", "", "buttonText", "activityName", "appName", "c", "Lorg/json/JSONObject;", "viewHierarchy", "", "a", "node", "i", "Lorg/json/JSONArray;", "siblings", "screenName", "formFieldsJSON", "h", "language", "event", "textType", "matchText", "l", "pattern", CampaignEx.JSON_KEY_AD_K, "", "indicators", "values", "g", "([Ljava/lang/String;[Ljava/lang/String;)Z", "j", "b", InneractiveMediationDefs.GENDER_MALE, "e", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "textSB", "hintSB", "n", "", "Ljava/util/Map;", "languageInfo", "eventInfo", "textTypeInfo", "Lorg/json/JSONObject;", "rules", "Z", "initialized", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f86289a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static Map<String, String> languageInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static Map<String, String> eventInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static Map<String, String> textTypeInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static JSONObject rules;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static boolean initialized;

    @Nullable
    public static final float[] a(@NotNull JSONObject viewHierarchy, @NotNull String appName) {
        if (c3.a.d(a.class)) {
            return null;
        }
        try {
            p.k(viewHierarchy, "viewHierarchy");
            p.k(appName, "appName");
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                p.j(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW).toString());
                String strOptString = viewHierarchy.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                a aVar = f86289a;
                aVar.j(jSONObject, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject));
                JSONObject jSONObjectB = aVar.b(jSONObject);
                if (jSONObjectB == null) {
                    return null;
                }
                p.j(strOptString, "screenName");
                String string = jSONObject.toString();
                p.j(string, "viewTree.toString()");
                aVar.m(fArr, aVar.h(jSONObjectB, jSONArray, strOptString, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
            return null;
        }
    }

    @NotNull
    public static final String c(@NotNull String buttonText, @NotNull String activityName, @NotNull String appName) {
        if (c3.a.d(a.class)) {
            return null;
        }
        try {
            p.k(buttonText, "buttonText");
            p.k(activityName, "activityName");
            p.k(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            p.j(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
            return null;
        }
    }

    public static final void d(@Nullable File file) {
        if (c3.a.d(a.class)) {
            return;
        }
        try {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, bo.c.f5639b));
                languageInfo = kotlin.collections.a.m(bn.h.a("ENGLISH", "1"), bn.h.a("GERMAN", "2"), bn.h.a("SPANISH", ExifInterface.GPS_MEASUREMENT_3D), bn.h.a("JAPANESE", "4"));
                eventInfo = kotlin.collections.a.m(bn.h.a("VIEW_CONTENT", "0"), bn.h.a("SEARCH", "1"), bn.h.a("ADD_TO_CART", "2"), bn.h.a("ADD_TO_WISHLIST", ExifInterface.GPS_MEASUREMENT_3D), bn.h.a("INITIATE_CHECKOUT", "4"), bn.h.a("ADD_PAYMENT_INFO", CampaignEx.CLICKMODE_ON), bn.h.a("PURCHASE", "6"), bn.h.a("LEAD", Gc.f29437e), bn.h.a("COMPLETE_REGISTRATION", "8"));
                textTypeInfo = kotlin.collections.a.m(bn.h.a("BUTTON_TEXT", "1"), bn.h.a("PAGE_TITLE", "2"), bn.h.a("RESOLVED_DOCUMENT_LINK", ExifInterface.GPS_MEASUREMENT_3D), bn.h.a("BUTTON_ID", "4"));
                initialized = true;
            } catch (Throwable th2) {
                c3.a.b(th2, a.class);
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean f() {
        if (c3.a.d(a.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
            return false;
        }
    }

    public final JSONObject b(JSONObject view) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            if (view.optBoolean("is_interacted")) {
                return view;
            }
            JSONArray jSONArrayOptJSONArray = view.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int i10 = 0;
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                    p.j(jSONObject, "children.getJSONObject(i)");
                    JSONObject jSONObjectB = b(jSONObject);
                    if (jSONObjectB != null) {
                        return jSONObjectB;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
        return null;
    }

    public final boolean e(JSONObject node) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            return ((node.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final boolean g(String[] indicators, String[] values) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            int length = indicators.length;
            int i10 = 0;
            while (i10 < length) {
                String str = indicators[i10];
                i10++;
                int length2 = values.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = values[i11];
                    i11++;
                    if (d0.c0(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final float[] h(JSONObject node, JSONArray siblings, String screenName, String formFieldsJSON, String appName) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = siblings.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = siblings.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject jSONObject = siblings.getJSONObject(i11);
                        p.j(jSONObject, "siblings.getJSONObject(i)");
                        if (e(jSONObject)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i12 >= length2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str = screenName + '|' + appName;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            n(node, sb3, sb2);
            String string = sb2.toString();
            p.j(string, "hintSB.toString()");
            String string2 = sb3.toString();
            p.j(string2, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str) ? 1.0f : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
            fArr[18] = d0.c0(formFieldsJSON, HintConstants.AUTOFILL_HINT_PASSWORD, false, 2, null) ? 1.0f : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", formFieldsJSON) ? 1.0f : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", formFieldsJSON) ? 1.0f : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", formFieldsJSON) ? 1.0f : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str) ? 1.0f : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str) ? 1.0f : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final float[] i(JSONObject node) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String strOptString = node.optString("text");
            p.j(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            p.j(lowerCase, "(this as java.lang.String).toLowerCase()");
            String strOptString2 = node.optString("hint");
            p.j(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            p.j(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String strOptString3 = node.optString("classname");
            p.j(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            p.j(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int iOptInt = node.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", C3978d4.i.f31347l}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{HintConstants.AUTOFILL_HINT_PASSWORD, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{AppLovinEventTypes.USER_EXECUTED_SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 3 || iOptInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (d0.c0(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (d0.c0(lowerCase3, "radio", false, 2, null) && d0.c0(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = node.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                        p.j(jSONObject, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final boolean j(JSONObject node, JSONArray siblings) {
        boolean z10;
        if (c3.a.d(this)) {
            return false;
        }
        try {
            if (node.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = node.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (jSONArrayOptJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                        z10 = true;
                        break;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
                z10 = false;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            JSONArray jSONArray = new JSONArray();
            if (z10) {
                int length2 = jSONArrayOptJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        siblings.put(jSONArrayOptJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            } else {
                int length3 = jSONArrayOptJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i14);
                        p.j(jSONObject, "child");
                        if (j(jSONObject, siblings)) {
                            jSONArray.put(jSONObject);
                            z11 = true;
                        }
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                node.put("childviews", jSONArray);
            }
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final boolean k(String pattern, String matchText) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(pattern).matcher(matchText).find();
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final boolean l(String language, String event, String textType, String matchText) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        if (c3.a.d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = rules;
            String strOptString = null;
            if (jSONObject == null) {
                p.C("rules");
                throw null;
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject5 == null) {
                jSONObjectOptJSONObject = null;
            } else {
                Map<String, String> map = languageInfo;
                if (map == null) {
                    p.C("languageInfo");
                    throw null;
                }
                jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject(map.get(language));
            }
            if (jSONObjectOptJSONObject == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rulesForEvent")) == null) {
                jSONObjectOptJSONObject3 = null;
            } else {
                Map<String, String> map2 = eventInfo;
                if (map2 == null) {
                    p.C("eventInfo");
                    throw null;
                }
                jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(map2.get(event));
            }
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("positiveRules")) != null) {
                Map<String, String> map3 = textTypeInfo;
                if (map3 == null) {
                    p.C("textTypeInfo");
                    throw null;
                }
                strOptString = jSONObjectOptJSONObject4.optString(map3.get(textType));
            }
            if (strOptString == null) {
                return false;
            }
            return k(strOptString, matchText);
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final void m(float[] fArr, float[] fArr2) {
        if (c3.a.d(this)) {
            return;
        }
        int i10 = 0;
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                fArr[i10] = fArr[i10] + fArr2[i10];
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (c3.a.d(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            p.j(strOptString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = strOptString.toLowerCase();
            p.j(lowerCase, "(this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", "");
            p.j(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            p.j(lowerCase2, "(this as java.lang.String).toLowerCase()");
            boolean z10 = true;
            int i10 = 0;
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(Z7.f30794r);
            }
            if (lowerCase2.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                sb3.append(lowerCase2);
                sb3.append(Z7.f30794r);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    p.j(jSONObject2, "currentChildView");
                    n(jSONObject2, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }
}
