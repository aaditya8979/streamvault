package cp;

import bp.s0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f59367a;

    public d(i iVar) {
        this.f59367a = iVar;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f59367a.l(((Integer) objArr[0]).intValue(), (JSONArray) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (JSONArray) objArr[4]);
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        this.f59367a.j(i10, str);
    }
}
