package uo;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f85738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KClass<?> f85739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f85740c;

    public c(@NotNull SerialDescriptor serialDescriptor, @NotNull KClass<?> kClass) {
        p.k(serialDescriptor, "original");
        p.k(kClass, "kClass");
        this.f85738a = serialDescriptor;
        this.f85739b = kClass;
        this.f85740c = serialDescriptor.h() + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return this.f85738a.b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(@NotNull String str) {
        p.k(str, "name");
        return this.f85738a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor d(int i10) {
        return this.f85738a.d(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f85738a.e();
    }

    public boolean equals(@Nullable Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && p.f(this.f85738a, cVar.f85738a) && p.f(cVar.f85739b, this.f85739b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String f(int i10) {
        return this.f85738a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> g(int i10) {
        return this.f85738a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f85738a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public k getKind() {
        return this.f85738a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return this.f85740c;
    }

    public int hashCode() {
        return (this.f85739b.hashCode() * 31) + h().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f85738a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f85738a.isInline();
    }

    @NotNull
    public String toString() {
        return "ContextDescriptor(kClass: " + this.f85739b + ", original: " + this.f85738a + ')';
    }
}
