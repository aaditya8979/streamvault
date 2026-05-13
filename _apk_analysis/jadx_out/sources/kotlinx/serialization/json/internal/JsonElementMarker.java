package kotlinx.serialization.json.internal;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import tn.p;
import wo.d0;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JsonElementMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d0 f73474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f73475b;

    public JsonElementMarker(@NotNull SerialDescriptor serialDescriptor) {
        p.k(serialDescriptor, "descriptor");
        this.f73474a = new d0(serialDescriptor, new JsonElementMarker$origin$1(this));
    }

    public final boolean b() {
        return this.f73475b;
    }

    public final void c(int i10) {
        this.f73474a.a(i10);
    }

    public final int d() {
        return this.f73474a.d();
    }

    public final boolean e(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = !serialDescriptor.i(i10) && serialDescriptor.d(i10).b();
        this.f73475b = z10;
        return z10;
    }
}
