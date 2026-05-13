package yads;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir0 f89667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f89668b;

    public /* synthetic */ fr0() {
        this(new ir0(), new d());
    }

    public fr0(ir0 ir0Var, d dVar) {
        this.f89667a = ir0Var;
        this.f89668b = dVar;
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next));
            }
            Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return map;
    }
}
