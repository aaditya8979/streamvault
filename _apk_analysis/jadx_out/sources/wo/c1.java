package wo;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c1<E> extends w<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86482b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer);
        tn.p.k(kSerializer, "eSerializer");
        this.f86482b = new b1(kSerializer.getDescriptor());
    }

    @Override // wo.v, kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86482b;
    }

    @Override // wo.v
    public void insert(@NotNull LinkedHashSet<E> linkedHashSet, int i10, E e10) {
        tn.p.k(linkedHashSet, "<this>");
        linkedHashSet.add(e10);
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> b() {
        return new LinkedHashSet<>();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull LinkedHashSet<E> linkedHashSet) {
        tn.p.k(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull LinkedHashSet<E> linkedHashSet, int i10) {
        tn.p.k(linkedHashSet, "<this>");
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> l(@NotNull Set<? extends E> set) {
        tn.p.k(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Set<E> m(@NotNull LinkedHashSet<E> linkedHashSet) {
        tn.p.k(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
