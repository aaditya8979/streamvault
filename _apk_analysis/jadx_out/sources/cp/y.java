package cp;

import bp.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f59419a;

    public y(b bVar) {
        this.f59419a = bVar;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f59419a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        this.f59419a.j(i10, str);
    }
}
