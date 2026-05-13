package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class hi0 extends Lambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ii0 f90427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f90428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(ii0 ii0Var, ArrayList arrayList) {
        super(2);
        this.f90427b = ii0Var;
        this.f90428c = arrayList;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        xh0 xh0Var = (xh0) obj2;
        this.f90427b.getClass();
        String str = null;
        if (jSONObject.has("view_name")) {
            try {
                obj3 = jSONObject.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.f90428c.add(new wh0(xh0Var, str));
        }
        return bn.r.f5635a;
    }
}
