package wo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor[] f86478a = new SerialDescriptor[0];

    @NotNull
    public static final Set<String> a(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "<this>");
        if (serialDescriptor instanceof n) {
            return ((n) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int iE = serialDescriptor.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(serialDescriptor.f(i10));
        }
        return hashSet;
    }

    @NotNull
    public static final SerialDescriptor[] b(@Nullable List<? extends SerialDescriptor> list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f86478a : serialDescriptorArr;
    }

    @NotNull
    public static final KClass<Object> c(@NotNull KType kType) {
        tn.p.k(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    @NotNull
    public static final String d(@NotNull String str) {
        tn.p.k(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @NotNull
    public static final String e(@NotNull KClass<?> kClass) {
        tn.p.k(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return d(simpleName);
    }

    @NotNull
    public static final Void f(@NotNull KClass<?> kClass) {
        tn.p.k(kClass, "<this>");
        throw new SerializationException(e(kClass));
    }

    @NotNull
    public static final KType g(@NotNull KTypeProjection kTypeProjection) {
        tn.p.k(kTypeProjection, "<this>");
        KType type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
    }
}
