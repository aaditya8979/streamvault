package wo;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements KType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KType f86639b;

    public x0(@NotNull KType kType) {
        tn.p.k(kType, "origin");
        this.f86639b = kType;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        KType kType = this.f86639b;
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        if (!tn.p.f(kType, x0Var != null ? x0Var.f86639b : null)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            KType kType2 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return tn.p.f(rn.a.a((KClass) classifier), rn.a.a((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f86639b.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.f86639b.getArguments();
    }

    @Override // kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return this.f86639b.getClassifier();
    }

    public int hashCode() {
        return this.f86639b.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f86639b.isMarkedNullable();
    }

    @NotNull
    public String toString() {
        return "KTypeWrapper: " + this.f86639b;
    }
}
