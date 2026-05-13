package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@so.k
public final class m40 {

    @NotNull
    public static final l40 Companion = new l40();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KSerializer[] f92257c = {new wo.f(s40.f94698a), new wo.f(f40.f89475a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92259b;

    public /* synthetic */ m40(int i10, List list, List list2) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, k40.f91476a.getDescriptor());
        }
        this.f92258a = list;
        this.f92259b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return tn.p.f(this.f92258a, m40Var.f92258a) && tn.p.f(this.f92259b, m40Var.f92259b);
    }

    public final int hashCode() {
        return this.f92259b.hashCode() + (this.f92258a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.f92258a + ", bidding=" + this.f92259b + ")";
    }
}
