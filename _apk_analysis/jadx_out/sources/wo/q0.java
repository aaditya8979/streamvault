package wo;

import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class q0<E> extends w<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86591b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer);
        tn.p.k(kSerializer, "eSerializer");
        this.f86591b = new p0(kSerializer.getDescriptor());
    }

    @Override // wo.v, kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86591b;
    }

    @Override // wo.v
    public void insert(@NotNull HashSet<E> hashSet, int i10, E e10) {
        tn.p.k(hashSet, "<this>");
        hashSet.add(e10);
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet<E> b() {
        return new HashSet<>();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull HashSet<E> hashSet) {
        tn.p.k(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull HashSet<E> hashSet, int i10) {
        tn.p.k(hashSet, "<this>");
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public HashSet<E> l(@NotNull Set<? extends E> set) {
        tn.p.k(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Set<E> m(@NotNull HashSet<E> hashSet) {
        tn.p.k(hashSet, "<this>");
        return hashSet;
    }
}
