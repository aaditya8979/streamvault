package ol;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f76460a = new f("CONDITION_FALSE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Object f76461b = new f("ALREADY_REMOVED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Object f76462c = new f("LIST_EMPTY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Object f76463d = new f("REMOVE_PREPARED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Object f76464e = new f("NO_DECISION");

    @NotNull
    public static final c a(@NotNull Object obj) {
        c cVar;
        p.k(obj, "<this>");
        e eVar = obj instanceof e ? (e) obj : null;
        return (eVar == null || (cVar = eVar.f76468a) == null) ? (c) obj : cVar;
    }
}
