package yads;

import android.content.Context;
import com.ironsource.C4306ve;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg1 f90487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fr0 f90488b;

    public hr0(Context context) {
        this(ug1.a(context, "FalseClickDataStorage"));
    }

    public /* synthetic */ hr0(rg1 rg1Var) {
        this(rg1Var, new fr0());
    }

    public hr0(rg1 rg1Var, fr0 fr0Var) {
        this.f90487a = rg1Var;
        this.f90488b = fr0Var;
    }

    public final void a(long j10) {
        ((tg1) this.f90487a).d(String.valueOf(j10));
    }

    public final void a(er0 er0Var) throws JSONException {
        String string;
        String strValueOf = String.valueOf(er0Var.f89362b);
        fr0 fr0Var = this.f90488b;
        fr0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_type", er0Var.f89361a.f89049b);
        jSONObject.put("start_time", er0Var.f89362b);
        jSONObject.put("type", er0Var.f89363c.f90192b);
        ir0 ir0Var = fr0Var.f89667a;
        dr0 dr0Var = er0Var.f89364d;
        ir0Var.getClass();
        String string2 = null;
        if (dr0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", dr0Var.f88960c);
            jSONObject2.put("url", dr0Var.f88959b);
            string = jSONObject2.toString();
        } else {
            string = null;
        }
        jSONObject.put("false_click", string);
        jSONObject.put("report_data", new JSONObject(er0Var.f89365e));
        d dVar = fr0Var.f89668b;
        c cVar = er0Var.f89366f;
        dVar.getClass();
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C4306ve.f34270d, cVar.f88252a);
            jSONObject3.put("test_ids", cVar.f88253b);
            string2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", string2);
        ((tg1) this.f90487a).a(strValueOf, jSONObject.toString());
    }
}
