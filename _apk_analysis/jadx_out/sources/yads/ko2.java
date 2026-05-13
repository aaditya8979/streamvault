package yads;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ko2 extends lo2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f91679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pl2 f91680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vz2 f91681h;

    public ko2(long j10, mx0 mx0Var, p51 p51Var, gx2 gx2Var, ArrayList arrayList) {
        super(mx0Var, p51Var, gx2Var, arrayList);
        Uri.parse(((uo) p51Var.get(0)).f95730a);
        pl2 pl2VarB = gx2Var.b();
        this.f91680g = pl2VarB;
        this.f91679f = null;
        this.f91681h = pl2VarB == null ? new vz2(new pl2(null, 0L, -1L)) : null;
    }

    @Override // yads.lo2
    public final String c() {
        return this.f91679f;
    }

    @Override // yads.lo2
    public final i30 d() {
        return this.f91681h;
    }

    @Override // yads.lo2
    public final pl2 e() {
        return this.f91680g;
    }
}
