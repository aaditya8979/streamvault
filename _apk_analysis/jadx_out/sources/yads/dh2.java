package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@so.k
public final class dh2 {

    @NotNull
    public static final ch2 Companion = new ch2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f88854b = {new wo.f(gh2.f89985a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88855a;

    public /* synthetic */ dh2(int i10, List list) {
        if (1 != (i10 & 1)) {
            wo.c2.a(i10, 1, bh2.f88010a.getDescriptor());
        }
        this.f88855a = list;
    }

    public dh2(List list) {
        this.f88855a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh2) && tn.p.f(this.f88855a, ((dh2) obj).f88855a);
    }

    public final int hashCode() {
        return this.f88855a.hashCode();
    }

    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.f88855a + ")";
    }
}
