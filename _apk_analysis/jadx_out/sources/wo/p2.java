package wo;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class p2<ElementKlass, Element extends ElementKlass> extends v<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KClass<ElementKlass> f86586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(@NotNull KClass<ElementKlass> kClass, @NotNull KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        tn.p.k(kClass, "kClass");
        tn.p.k(kSerializer, "eSerializer");
        this.f86586b = kClass;
        this.f86587c = new d(kSerializer.getDescriptor());
    }

    @Override // wo.v, kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86587c;
    }

    @Override // wo.v
    public void insert(@NotNull ArrayList<Element> arrayList, int i10, Element element) {
        tn.p.k(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> b() {
        return new ArrayList<>();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull ArrayList<Element> arrayList) {
        tn.p.k(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull ArrayList<Element> arrayList, int i10) {
        tn.p.k(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> e(@NotNull Element[] elementArr) {
        tn.p.k(elementArr, "<this>");
        return tn.b.a(elementArr);
    }

    @Override // wo.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull Element[] elementArr) {
        tn.p.k(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> l(@NotNull Element[] elementArr) {
        tn.p.k(elementArr, "<this>");
        return new ArrayList<>(cn.p.f(elementArr));
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Element[] m(@NotNull ArrayList<Element> arrayList) {
        tn.p.k(arrayList, "<this>");
        return (Element[]) a2.q(arrayList, this.f86586b);
    }
}
