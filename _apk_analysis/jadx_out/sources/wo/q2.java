package wo;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class q2 implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f86596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Set<String> f86597c;

    public q2(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "original");
        this.f86595a = serialDescriptor;
        this.f86596b = serialDescriptor.h() + '?';
        this.f86597c = b2.a(serialDescriptor);
    }

    @Override // wo.n
    @NotNull
    public Set<String> a() {
        return this.f86597c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(@NotNull String str) {
        tn.p.k(str, "name");
        return this.f86595a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor d(int i10) {
        return this.f86595a.d(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f86595a.e();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2) && tn.p.f(this.f86595a, ((q2) obj).f86595a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String f(int i10) {
        return this.f86595a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> g(int i10) {
        return this.f86595a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f86595a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public uo.k getKind() {
        return this.f86595a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return this.f86596b;
    }

    public int hashCode() {
        return this.f86595a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f86595a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f86595a.isInline();
    }

    @NotNull
    public final SerialDescriptor j() {
        return this.f86595a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f86595a);
        sb2.append('?');
        return sb2.toString();
    }
}
