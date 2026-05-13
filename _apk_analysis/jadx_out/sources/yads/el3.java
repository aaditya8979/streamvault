package yads;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class el3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f89312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3 f89313b;

    public el3(Context context) {
        this(oy2.a(new oy2(), context, "ViewSizeInfoStorage"), new cl3());
    }

    public el3(SharedPreferences sharedPreferences, cl3 cl3Var) {
        this.f89312a = sharedPreferences;
        this.f89313b = cl3Var;
    }

    public static String a(fl3 fl3Var) {
        return fl3Var.a() + "-" + fl3Var.b();
    }

    public final void a(fl3 fl3Var, bl3 bl3Var) throws JSONException {
        String strA = a(fl3Var);
        this.f89313b.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", bl3Var.f88066a.f87741a);
        jSONObject2.put("height", bl3Var.f88066a.f87742b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", bl3Var.f88067b.f87678a);
        jSONObject3.put("height", bl3Var.f88067b.f87679b);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", bl3Var.f88068c.f91248a.f91608a);
        String strName = bl3Var.f88068c.f91248a.f91609b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        jSONObject4.put(C3978d4.a.f31224t, lowerCase);
        jSONObject5.put("value", bl3Var.f88068c.f91249b.f91608a);
        String lowerCase2 = bl3Var.f88068c.f91249b.f91609b.name().toLowerCase(locale);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        jSONObject5.put(C3978d4.a.f31224t, lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(bl3Var.f88069d);
        jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String string = jSONObject.toString();
        SharedPreferences.Editor editorEdit = this.f89312a.edit();
        editorEdit.putString(strA, string);
        editorEdit.apply();
    }
}
