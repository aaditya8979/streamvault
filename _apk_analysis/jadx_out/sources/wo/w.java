package wo;

import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class w<E, C extends Collection<? extends E>, B> extends v<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer, null);
        tn.p.k(kSerializer, "element");
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator<E> e(@NotNull C c10) {
        tn.p.k(c10, "<this>");
        return c10.iterator();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull C c10) {
        tn.p.k(c10, "<this>");
        return c10.size();
    }
}
