package tn;

import java.util.Collection;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Class<?> f85362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f85363c;

    public s(@NotNull Class<?> cls, @NotNull String str) {
        p.k(cls, "jClass");
        p.k(str, "moduleName");
        this.f85362b = cls;
        this.f85363c = str;
    }

    @Override // tn.f
    @NotNull
    public Class<?> a() {
        return this.f85362b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && p.f(a(), ((s) obj).a());
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        throw new KotlinReflectionNotSupportedError();
    }

    public int hashCode() {
        return a().hashCode();
    }

    @NotNull
    public String toString() {
        return a() + " (Kotlin reflection is not available)";
    }
}
