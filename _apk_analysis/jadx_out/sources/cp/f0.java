package cp;

import bp.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f59380a;

    public f0(g0 g0Var) {
        this.f59380a = g0Var;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f59380a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        this.f59380a.j(i10, str);
    }
}
