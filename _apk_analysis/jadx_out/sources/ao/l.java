package ao;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
public class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sn.p f5214a;

        public a(sn.p pVar) {
            this.f5214a = pVar;
        }

        @Override // ao.i
        public Iterator<T> iterator() {
            return l.a(this.f5214a);
        }
    }

    @NotNull
    public static final <T> Iterator<T> a(@NotNull sn.p<? super k<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        tn.p.k(pVar, "block");
        j jVar = new j();
        jVar.j(IntrinsicsKt__IntrinsicsJvmKt.b(pVar, jVar, jVar));
        return jVar;
    }

    @NotNull
    public static final <T> i<T> b(@NotNull sn.p<? super k<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        tn.p.k(pVar, "block");
        return new a(pVar);
    }
}
