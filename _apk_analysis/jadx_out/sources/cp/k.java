package cp;

import bp.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f59390a;

    public k(z zVar) {
        this.f59390a = zVar;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f59390a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        this.f59390a.j(i10, str);
    }
}
