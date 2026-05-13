package co;

import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f6778a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<DecimalFormat>[] f6779b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f6779b = threadLocalArr;
    }

    public static final boolean a() {
        return f6778a;
    }
}
