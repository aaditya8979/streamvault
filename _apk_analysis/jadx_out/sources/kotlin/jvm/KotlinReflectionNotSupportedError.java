package kotlin.jvm;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinReflectionNotSupportedError.kt */
/* JADX INFO: loaded from: classes12.dex */
public class KotlinReflectionNotSupportedError extends Error {
    public KotlinReflectionNotSupportedError() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public KotlinReflectionNotSupportedError(@Nullable String str) {
        super(str);
    }

    public KotlinReflectionNotSupportedError(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public KotlinReflectionNotSupportedError(@Nullable Throwable th2) {
        super(th2);
    }
}
