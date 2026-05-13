package o0;

import k0.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HardwareBitmaps.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lo0/o;", "Lo0/m;", "Lk0/g;", "size", "", "a", "b", "Z", "allowHardware", "<init>", "(Z)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean allowHardware;

    public o(boolean z10) {
        super(null);
        this.allowHardware = z10;
    }

    @Override // o0.m
    public boolean a(@NotNull Size size) {
        return this.allowHardware;
    }

    @Override // o0.m
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowHardware() {
        return this.allowHardware;
    }
}
