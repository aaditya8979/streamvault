package yo;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import org.jetbrains.annotations.NotNull;
import uo.k;
import uo.l;

/* JADX INFO: compiled from: JsonSerializersModuleValidator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements zo.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97979c;

    public q0(@NotNull xo.f fVar) {
        tn.p.k(fVar, com.safedk.android.utils.i.f53156c);
        this.f97977a = fVar.e();
        this.f97978b = fVar.p();
        this.f97979c = fVar.f() != ClassDiscriminatorMode.NONE;
    }

    @Override // zo.f
    public <T> void a(@NotNull KClass<T> kClass, @NotNull sn.l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar) {
        tn.p.k(kClass, "kClass");
        tn.p.k(lVar, IronSourceConstants.EVENTS_PROVIDER);
    }

    @Override // zo.f
    public <Base> void b(@NotNull KClass<Base> kClass, @NotNull sn.l<? super Base, ? extends so.l<? super Base>> lVar) {
        tn.p.k(kClass, "baseClass");
        tn.p.k(lVar, "defaultSerializerProvider");
    }

    @Override // zo.f
    public <Base> void d(@NotNull KClass<Base> kClass, @NotNull sn.l<? super String, ? extends so.c<? extends Base>> lVar) {
        tn.p.k(kClass, "baseClass");
        tn.p.k(lVar, "defaultDeserializerProvider");
    }

    @Override // zo.f
    public <Base, Sub extends Base> void f(@NotNull KClass<Base> kClass, @NotNull KClass<Sub> kClass2, @NotNull KSerializer<Sub> kSerializer) {
        tn.p.k(kClass, "baseClass");
        tn.p.k(kClass2, "actualClass");
        tn.p.k(kSerializer, "actualSerializer");
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        i(descriptor, kClass2);
        if (this.f97978b || !this.f97979c) {
            return;
        }
        h(descriptor, kClass2);
    }

    public final void h(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        int iE = serialDescriptor.e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = serialDescriptor.f(i10);
            if (tn.p.f(strF, this.f97977a)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void i(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        uo.k kind = serialDescriptor.getKind();
        if ((kind instanceof uo.d) || tn.p.f(kind, k.a.f85771a)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.f97978b && this.f97979c) {
            if (tn.p.f(kind, l.b.f85774a) || tn.p.f(kind, l.c.f85775a) || (kind instanceof uo.e) || (kind instanceof k.b)) {
                throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }
}
