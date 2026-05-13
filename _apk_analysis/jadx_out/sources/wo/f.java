package wo;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class f<E> extends w<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer);
        tn.p.k(kSerializer, "element");
        this.f86505b = new e(kSerializer.getDescriptor());
    }

    @Override // wo.v, kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86505b;
    }

    @Override // wo.v
    public void insert(@NotNull ArrayList<E> arrayList, int i10, E e10) {
        tn.p.k(arrayList, "<this>");
        arrayList.add(i10, e10);
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> b() {
        return new ArrayList<>();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull ArrayList<E> arrayList) {
        tn.p.k(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull ArrayList<E> arrayList, int i10) {
        tn.p.k(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> l(@NotNull List<? extends E> list) {
        tn.p.k(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public List<E> m(@NotNull ArrayList<E> arrayList) {
        tn.p.k(arrayList, "<this>");
        return arrayList;
    }
}
