package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ep1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f89344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ox2 f89345b;

    public /* synthetic */ ep1(d4 d4Var) {
        this(d4Var, new ox2());
    }

    public ep1(d4 d4Var, ox2 ox2Var) {
        this.f89344a = d4Var;
        this.f89345b = ox2Var;
    }

    public Map a(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g9 g9Var = this.f89344a.f88744e;
        if (g9Var != null) {
            Map map = g9Var.f89883g;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String str = g9Var.f89878b;
            if (str != null) {
                linkedHashMap.put("age", str);
            }
            List list = g9Var.f89881e;
            if (list != null) {
                linkedHashMap.put("context_tags", list);
            }
            String str2 = g9Var.f89879c;
            if (str2 != null) {
                linkedHashMap.put("gender", str2);
            }
            Object obj = dw2.f89000j;
            Boolean boolB = cw2.a().b();
            if (boolB != null) {
                linkedHashMap.put("age_restricted_user", boolB);
            }
            nt2 nt2VarA = cw2.a().a(context);
            Boolean bool = nt2VarA != null ? nt2VarA.W : null;
            if (bool != null) {
                linkedHashMap.put("user_consent", bool);
            }
        }
        td tdVar = this.f89344a.f88741b.f94198b.f94376a;
        boolean zB = this.f89345b.b(context);
        if (tdVar != null) {
            boolean z10 = tdVar.f95148b;
            String str3 = tdVar.f95147a;
            if (!zB && !z10 && str3 != null) {
                linkedHashMap.put("google_aid", str3);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(this.f89344a.f88741b.f94197a.f91282f));
        linkedHashMap.put("sdk_version", "7.18.1");
        return linkedHashMap;
    }
}
