package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div2.DivData;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f91972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh0 f91973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jh0 f91974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ii0 f91975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hn f91976e;

    public /* synthetic */ li0(io2 io2Var) {
        this(io2Var, new hh0(io2Var), new jh0(), new ii0(), new hn());
    }

    public li0(io2 io2Var, hh0 hh0Var, jh0 jh0Var, ii0 ii0Var, hn hnVar) {
        this.f91972a = io2Var;
        this.f91973b = hh0Var;
        this.f91974c = jh0Var;
        this.f91975d = ii0Var;
        this.f91976e = hnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gi0 a(xf0 xf0Var, boolean z10) {
        DivData divDataA;
        eg0[] eg0VarArr = eg0.f89242b;
        CachingTemplateProvider cachingTemplateProvider = null;
        Object[] objArr = 0;
        if (tn.p.f("divkit", xf0Var.f96752a)) {
            try {
                String str = xf0Var.f96753b;
                String strA = xf0Var.f96754c;
                if (z10) {
                    this.f91976e.getClass();
                    strA = hn.a(strA);
                }
                JSONObject jSONObject = new JSONObject(strA);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                List list = xf0Var.f96755d;
                hh0 hh0Var = this.f91973b;
                hh0Var.getClass();
                try {
                    si0 si0Var = hh0Var.f90414b;
                    ParsingErrorLogger parsingErrorLogger = ParsingErrorLogger.LOG;
                    si0Var.getClass();
                    DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(parsingErrorLogger, cachingTemplateProvider, 2, objArr == true ? 1 : 0);
                    if (jSONObject3 != null) {
                        divParsingEnvironment.parseTemplates(jSONObject3);
                    }
                    hh0Var.f90415c.getClass();
                    divDataA = DivData.f55077j.a(divParsingEnvironment, jSONObject2);
                } catch (Throwable th2) {
                    hh0Var.f90413a.reportError("Failed to create DivData", th2);
                    divDataA = null;
                }
                this.f91974c.getClass();
                DivDataTag divDataTag = new DivDataTag(UUID.randomUUID().toString());
                Set setA = this.f91975d.a(jSONObject2);
                if (divDataA != null) {
                    return new gi0(str, jSONObject2, jSONObject3, list, divDataA, divDataTag, setA, new yf0(xf0Var.f96756e));
                }
            } catch (Throwable th3) {
                this.f91972a.reportError("Failed to parse DivKit design", th3);
            }
        }
        return null;
    }
}
