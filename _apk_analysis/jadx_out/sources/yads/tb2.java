package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tb2 implements ra3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hq1 f95132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fm0 f95133b = new fm0();

    public tb2(hq1 hq1Var) {
        this.f95132a = hq1Var;
    }

    @Override // yads.ra3
    public final String a(Context context, d4 d4Var, ox2 ox2Var) {
        Map map = this.f95132a.f90485c;
        uu0 uu0VarA = vu0.a(context, d4Var, ox2Var);
        if (map != null) {
            uu0VarA.f95812i.putAll(map);
        }
        return this.f95133b.a(context, new yu0(uu0VarA).toString());
    }

    @Override // yads.ra3
    public final String a(d4 d4Var) {
        String str = d4Var.f88741b.f94197a.f91281e;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // yads.ra3
    public final qa3 a() {
        return qa3.f93965c;
    }
}
