package co;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a extends i, Comparable<a> {

    /* JADX INFO: renamed from: co.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class C0131a {
        public static int a(@NotNull a aVar, @NotNull a aVar2) {
            p.k(aVar2, "other");
            return b.i(aVar.h(aVar2), b.f6773c.c());
        }
    }

    long h(@NotNull a aVar);
}
