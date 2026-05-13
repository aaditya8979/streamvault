package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oz2 implements t22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy1 f93361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aq2 f93362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9 f93363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wy f93364d;

    public oz2(fy1 fy1Var, aq2 aq2Var, n9 n9Var, wy wyVar) {
        this.f93361a = fy1Var;
        this.f93362b = aq2Var;
        this.f93363c = n9Var;
        this.f93364d = wyVar;
    }

    @Override // yads.t22
    public final fo2 a(v9 v9Var, d4 d4Var, d12 d12Var) {
        aq2 aq2Var = this.f93362b;
        fy1 fy1Var = this.f93361a;
        fo2 fo2VarA = aq2Var.a(v9Var, d4Var);
        if (d12Var != null) {
            List listA = aq2Var.f87776b.a(d12Var);
            if (!listA.isEmpty()) {
                fo2VarA.a(listA, "image_sizes");
            }
        }
        fo2VarA.b(fy1Var.f89728c, CreativeInfo.f52474c);
        Map map = fy1Var.f89737l;
        if (map != null) {
            fo2VarA.f89652a.putAll(map);
        }
        return go2.a(go2.a(fo2VarA, this.f93363c.a(d4Var.f88744e)), this.f93364d.a(d4Var));
    }
}
