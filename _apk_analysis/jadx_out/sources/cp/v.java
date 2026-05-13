package cp;

import bp.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f59417a;

    public v(h hVar) {
        this.f59417a = hVar;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f59417a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        this.f59417a.j(i10, str);
    }
}
