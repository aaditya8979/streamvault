package so;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import tn.x;
import uo.d;
import uo.k;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class g<T> extends wo.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KClass<T> f84450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<? extends Annotation> f84451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final bn.g f84452c;

    public g(@NotNull KClass<T> kClass) {
        tn.p.k(kClass, "baseClass");
        this.f84450a = kClass;
        this.f84451b = cn.w.m();
        this.f84452c = kotlin.b.a(LazyThreadSafetyMode.PUBLICATION, new sn.a() { // from class: so.e
            @Override // sn.a
            public final Object invoke() {
                return g.i(this.f84448b);
            }
        });
    }

    public static final SerialDescriptor i(final g gVar) {
        return uo.b.c(uo.j.d("kotlinx.serialization.Polymorphic", d.a.f85741a, new SerialDescriptor[0], new sn.l() { // from class: so.f
            @Override // sn.l
            public final Object invoke(Object obj) {
                return g.j(this.f84449b, (uo.a) obj);
            }
        }), gVar.f());
    }

    public static final bn.r j(g gVar, uo.a aVar) {
        tn.p.k(aVar, "$this$buildSerialDescriptor");
        uo.a.b(aVar, "type", to.a.J(x.f85368a).getDescriptor(), null, false, 12, null);
        uo.a.b(aVar, "value", uo.j.e("kotlinx.serialization.Polymorphic<" + gVar.f().getSimpleName() + '>', k.a.f85771a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        aVar.h(gVar.f84451b);
        return bn.r.f5635a;
    }

    @Override // wo.b
    @NotNull
    public KClass<T> f() {
        return this.f84450a;
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f84452c.getValue();
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + f() + ')';
    }
}
