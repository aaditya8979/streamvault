package yads;

import android.content.Context;
import java.util.UUID;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes8.dex */
public final class mw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f92588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn.g f92589b = kotlin.b.b(new lw0(this));

    public mw0(Context context) {
        this.f92588a = context;
    }

    public final Object a(String str, nw0 nw0Var) {
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(nw0Var), 1);
        cVar.K();
        hr hrVar = new hr(str, new jw0(cVar), new kw0(cVar));
        hrVar.f93677j = false;
        UUID uuidRandomUUID = UUID.randomUUID();
        hrVar.f93684q = uuidRandomUUID;
        ((cp2) this.f92589b.getValue()).a(hrVar);
        cVar.P(new iw0(this, uuidRandomUUID));
        Object objB = cVar.B();
        if (objB == in.a.g()) {
            jn.f.c(nw0Var);
        }
        return objB;
    }
}
