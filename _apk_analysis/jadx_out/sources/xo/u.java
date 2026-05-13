package xo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u {
    @NotNull
    public static final a a(@NotNull a aVar, @NotNull sn.l<? super d, bn.r> lVar) {
        tn.p.k(aVar, TypedValues.TransitionType.S_FROM);
        tn.p.k(lVar, "builderAction");
        d dVar = new d(aVar);
        lVar.invoke(dVar);
        return new t(dVar.a(), dVar.b());
    }

    public static /* synthetic */ a b(a aVar, sn.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = a.f87008d;
        }
        return a(aVar, lVar);
    }
}
