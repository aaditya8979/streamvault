package kotlinx.serialization.json;

import kn.a;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ClassDiscriminatorMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ClassDiscriminatorMode[] f73469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f73470c;
    public static final ClassDiscriminatorMode NONE = new ClassDiscriminatorMode(Constraint.NONE, 0);
    public static final ClassDiscriminatorMode ALL_JSON_OBJECTS = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
    public static final ClassDiscriminatorMode POLYMORPHIC = new ClassDiscriminatorMode("POLYMORPHIC", 2);

    static {
        ClassDiscriminatorMode[] classDiscriminatorModeArrD = d();
        f73469b = classDiscriminatorModeArrD;
        f73470c = kotlin.enums.a.a(classDiscriminatorModeArrD);
    }

    public ClassDiscriminatorMode(String str, int i10) {
    }

    public static final /* synthetic */ ClassDiscriminatorMode[] d() {
        return new ClassDiscriminatorMode[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    @NotNull
    public static a<ClassDiscriminatorMode> getEntries() {
        return f73470c;
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) f73469b.clone();
    }
}
