package wo;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n2 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f86574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final uo.e f86575b;

    public n2(@NotNull String str, @NotNull uo.e eVar) {
        tn.p.k(str, "serialName");
        tn.p.k(eVar, "kind");
        this.f86574a = str;
        this.f86575b = eVar;
    }

    public final Void a() {
        throw new IllegalStateException("Primitive descriptor " + h() + " does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(@NotNull String str) {
        tn.p.k(str, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor d(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return tn.p.f(h(), n2Var.h()) && tn.p.f(getKind(), n2Var.getKind());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String f(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> g(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return this.f86574a;
    }

    public int hashCode() {
        return h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public uo.e getKind() {
        return this.f86575b;
    }

    @NotNull
    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }
}
