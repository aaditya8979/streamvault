package wo;

import kotlin.KotlinNothingValueException;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    @NotNull
    public static final Void a(@Nullable String str, @NotNull KClass<?> kClass) {
        String str2;
        tn.p.k(kClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + kClass.getSimpleName() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    @NotNull
    public static final Void b(@NotNull KClass<?> kClass, @NotNull KClass<?> kClass2) {
        tn.p.k(kClass, "subClass");
        tn.p.k(kClass2, "baseClass");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(kClass);
        }
        a(simpleName, kClass2);
        throw new KotlinNothingValueException();
    }
}
