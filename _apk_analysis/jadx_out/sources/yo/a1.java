package yo;

import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.k;

/* JADX INFO: compiled from: Polymorphic.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: compiled from: Polymorphic.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void b(@NotNull uo.k kVar) {
        tn.p.k(kVar, "kind");
        if (kVar instanceof k.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kVar instanceof uo.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kVar instanceof uo.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    @NotNull
    public static final String c(@NotNull SerialDescriptor serialDescriptor, @NotNull xo.a aVar) {
        tn.p.k(serialDescriptor, "<this>");
        tn.p.k(aVar, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof xo.e) {
                return ((xo.e) annotation).discriminator();
            }
        }
        return aVar.e().e();
    }

    @NotNull
    public static final Void d(@Nullable String str, @NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + tn.t.b(jsonElement.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final void e(so.l<?> lVar, so.l<?> lVar2, String str) {
        if ((lVar instanceof so.i) && wo.w0.a(lVar2.getDescriptor()).contains(str)) {
            String strH = ((so.i) lVar).getDescriptor().h();
            throw new IllegalStateException(("Sealed class '" + lVar2.getDescriptor().h() + "' cannot be serialized as base class '" + strH + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
