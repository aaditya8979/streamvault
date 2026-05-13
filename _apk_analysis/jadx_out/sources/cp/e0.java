package cp;

import bp.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f59374a;

    public e0(w wVar) {
        this.f59374a = wVar;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f59374a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        this.f59374a.j(i10, str);
    }
}
