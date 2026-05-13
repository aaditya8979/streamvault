package p000do;

import io.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f59892a = new e0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e0 f59893b = new e0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final e0 f59894c = new e0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e0 f59895d = new e0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e0 f59896e = new e0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b1 f59897f = new b1(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b1 f59898g = new b1(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        return obj instanceof o1 ? new p1((o1) obj) : obj;
    }

    @Nullable
    public static final Object h(@Nullable Object obj) {
        o1 o1Var;
        p1 p1Var = obj instanceof p1 ? (p1) obj : null;
        return (p1Var == null || (o1Var = p1Var.f59879a) == null) ? obj : o1Var;
    }
}
