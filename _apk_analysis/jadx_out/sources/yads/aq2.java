package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class aq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gq2 f87775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g12 f87776b;

    public /* synthetic */ aq2() {
        this(new gq2(), new g12());
    }

    public aq2(gq2 gq2Var, g12 g12Var) {
        this.f87775a = gq2Var;
        this.f87776b = g12Var;
    }

    public final fo2 a(v9 v9Var, d4 d4Var) {
        String str;
        String str2;
        String str3;
        Map map;
        e00 e00Var;
        fo2 fo2Var = new fo2(new LinkedHashMap(), 2);
        if (v9Var == null || !v9Var.f96014y) {
            fo2Var.b(v9Var != null ? v9Var.f95991b : null, "ad_type_format");
            fo2Var.b(v9Var != null ? v9Var.f95993d : null, "product_type");
        }
        if (v9Var == null || (str = v9Var.f95994e) == null) {
            str = d4Var.f88742c.f90339a;
        }
        fo2Var.b(str, "ad_unit_id");
        fo2Var.b(v9Var != null ? v9Var.f96001l : null, "ad_source");
        if (v9Var == null || (e00Var = v9Var.f95990a) == null || (str2 = e00Var.f89049b) == null) {
            str2 = d4Var.f88740a.f89049b;
        }
        fo2Var.b(str2, "ad_type");
        fo2Var.a(v9Var != null ? v9Var.f96000k : null, "design");
        List list = v9Var != null ? v9Var.f95997h : null;
        if (list != null && (!list.isEmpty())) {
            fo2Var.f89652a.put("active_experiments", list);
        }
        fo2Var.a(v9Var != null ? v9Var.f96004o : null, "server_log_id");
        this.f87775a.getClass();
        if ((v9Var != null ? v9Var.f96006q : null) != null) {
            str3 = "mediation";
        } else {
            str3 = (v9Var != null ? v9Var.f96009t : null) != null ? "ad" : "empty";
        }
        fo2Var.b(str3, "response_type");
        if (v9Var != null && (map = v9Var.f96010u) != null) {
            fo2Var.f89652a.putAll(map);
        }
        fo2Var.f89653b = v9Var != null ? v9Var.f95998i : null;
        return fo2Var;
    }

    public final fo2 b(v9 v9Var, d4 d4Var) {
        List listM;
        fo2 fo2VarA = a(v9Var, d4Var);
        d12 d12Var = v9Var != null ? (d12) v9Var.f96009t : null;
        if (d12Var != null) {
            this.f87776b.getClass();
            listM = g12.b(d12Var);
        } else {
            listM = cn.w.m();
        }
        fo2VarA.b(cn.f0.v0(listM), CreativeInfo.f52474c);
        fo2VarA.b(listM.isEmpty() ^ true ? listM : null, "ad_ids");
        return fo2VarA;
    }
}
