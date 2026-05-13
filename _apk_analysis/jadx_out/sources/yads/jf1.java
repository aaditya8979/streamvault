package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f91206a;

    public /* synthetic */ jf1(Context context, io2 io2Var) {
        this(new r0(context.getApplicationContext(), io2Var));
    }

    public jf1(r0 r0Var) {
        this.f91206a = r0Var;
    }

    public static String a(String str, JSONObject jSONObject) throws z02 {
        if (!jSONObject.has(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        return strOptString;
    }

    public final if1 a(JSONObject jSONObject, kn knVar) {
        int i10;
        ArrayList arrayList;
        List listA;
        Object objM7534constructorimpl;
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            int i11 = 0;
            while (i11 < length) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                r0 r0Var = this.f91206a;
                r0Var.getClass();
                String strOptString = jSONObject2.optString("type");
                if (strOptString == null || strOptString.length() == 0 || tn.p.f(strOptString, "null")) {
                    throw new z02("Native Ad json has not required attributes");
                }
                Map mapM = r0Var.f94241f;
                if (mapM == null) {
                    Pair pairA = bn.h.a("adtune", new tc(r0Var.f94237b, r0Var.f94238c));
                    Pair pairA2 = bn.h.a("divkit_adtune", new th0(r0Var.f94239d, r0Var.f94240e, r0Var.f94238c, knVar.f91662b));
                    Pair pairA3 = bn.h.a("close", new bw());
                    Context context = r0Var.f94236a;
                    sa3 sa3Var = r0Var.f94237b;
                    jSONArray = jSONArrayOptJSONArray;
                    mapM = kotlin.collections.a.m(pairA, pairA2, pairA3, bn.h.a("deeplink", new za0(sa3Var, new vg2(context, sa3Var), new l83())), bn.h.a("feedback", new iu0(r0Var.f94237b)));
                    r0Var.f94241f = mapM;
                } else {
                    jSONArray = jSONArrayOptJSONArray;
                }
                q0 q0Var = (q0) mapM.get(strOptString);
                if (q0Var != null) {
                    arrayList2.add(q0Var.a(jSONObject2));
                }
                i11++;
                jSONArrayOptJSONArray = jSONArray;
            }
            i10 = 0;
            arrayList = arrayList2;
        } else {
            i10 = 0;
            arrayList = null;
        }
        String strA = a("falseClickUrl", jSONObject);
        dr0 dr0Var = strA != null ? new dr0(strA, jSONObject.optLong("falseClickInterval", 0L)) : null;
        Set setB = cn.v0.b();
        String strA2 = a("trackingUrl", jSONObject);
        if (strA2 != null) {
            setB.add(strA2);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("trackingUrls");
        if (jSONArrayOptJSONArray2 != null) {
            List listC = cn.v.c();
            int length2 = jSONArrayOptJSONArray2.length();
            while (i10 < length2) {
                try {
                    Result.a aVar = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(jSONArrayOptJSONArray2.getString(i10));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
                    listC.add((String) objM7534constructorimpl);
                }
                i10++;
            }
            listA = cn.v.a(listC);
        } else {
            listA = null;
        }
        if (listA != null) {
            setB.addAll(listA);
        }
        return new if1(arrayList, dr0Var, cn.f0.g1(cn.v0.a(setB)), a("url", jSONObject), jSONObject.optLong("clickableDelay", 0L));
    }
}
