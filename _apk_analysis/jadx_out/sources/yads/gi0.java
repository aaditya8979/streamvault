package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f89989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f89990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f89991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DivData f89992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivDataTag f89993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f89994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf0 f89995h;

    public gi0(String str, JSONObject jSONObject, JSONObject jSONObject2, List list, DivData divData, DivDataTag divDataTag, Set set, yf0 yf0Var) {
        this.f89988a = str;
        this.f89989b = jSONObject;
        this.f89990c = jSONObject2;
        this.f89991d = list;
        this.f89992e = divData;
        this.f89993f = divDataTag;
        this.f89994g = set;
        this.f89995h = yf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi0)) {
            return false;
        }
        gi0 gi0Var = (gi0) obj;
        return tn.p.f(this.f89988a, gi0Var.f89988a) && tn.p.f(this.f89989b, gi0Var.f89989b) && tn.p.f(this.f89990c, gi0Var.f89990c) && tn.p.f(this.f89991d, gi0Var.f89991d) && tn.p.f(this.f89992e, gi0Var.f89992e) && tn.p.f(this.f89993f, gi0Var.f89993f) && tn.p.f(this.f89994g, gi0Var.f89994g) && tn.p.f(this.f89995h, gi0Var.f89995h);
    }

    public final int hashCode() {
        int iHashCode = (this.f89989b.hashCode() + (this.f89988a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f89990c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List list = this.f89991d;
        return this.f89995h.hashCode() + ((this.f89994g.hashCode() + ((this.f89993f.hashCode() + ((this.f89992e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.f89988a + ", card=" + this.f89989b + ", templates=" + this.f89990c + ", images=" + this.f89991d + ", divData=" + this.f89992e + ", divDataTag=" + this.f89993f + ", divAssets=" + this.f89994g + ", designAnalytics=" + this.f89995h + ")";
    }
}
