package yo;

import kotlinx.serialization.json.internal.WriteMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 {
    public static final <T> T a(@NotNull xo.a aVar, @NotNull so.c<? extends T> cVar, @NotNull f0 f0Var) {
        tn.p.k(aVar, "json");
        tn.p.k(cVar, "deserializer");
        tn.p.k(f0Var, "reader");
        b1 b1VarB = c1.b(aVar, f0Var, null, 4, null);
        try {
            T t10 = (T) new e1(aVar, WriteMode.OBJ, b1VarB, cVar.getDescriptor(), null).A(cVar);
            b1VarB.x();
            return t10;
        } finally {
            b1VarB.V();
        }
    }

    public static final <T> void b(@NotNull xo.a aVar, @NotNull g0 g0Var, @NotNull so.l<? super T> lVar, T t10) {
        tn.p.k(aVar, "json");
        tn.p.k(g0Var, "writer");
        tn.p.k(lVar, "serializer");
        new f1(g0Var, aVar, WriteMode.OBJ, new xo.r[WriteMode.getEntries().size()]).z(lVar, t10);
    }
}
