package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import wo.w2;

/* JADX INFO: loaded from: classes.dex */
@so.k
public final class t80 {

    @NotNull
    public static final s80 Companion = new s80();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f95099d = {null, null, new wo.f(w2.f86635a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f95102c;

    public /* synthetic */ t80(int i10, String str, boolean z10, List list) {
        if (7 != (i10 & 7)) {
            wo.c2.a(i10, 7, r80.f94323a.getDescriptor());
        }
        this.f95100a = str;
        this.f95101b = z10;
        this.f95102c = list;
    }

    public t80(boolean z10, List list) {
        this.f95100a = "7.18.1";
        this.f95101b = z10;
        this.f95102c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return tn.p.f(this.f95100a, t80Var.f95100a) && this.f95101b == t80Var.f95101b && tn.p.f(this.f95102c, t80Var.f95102c);
    }

    public final int hashCode() {
        return this.f95102c.hashCode() + ((Boolean.hashCode(this.f95101b) + (this.f95100a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelSdkData(version=" + this.f95100a + ", isIntegratedSuccess=" + this.f95101b + ", integrationMessages=" + this.f95102c + ")";
    }
}
