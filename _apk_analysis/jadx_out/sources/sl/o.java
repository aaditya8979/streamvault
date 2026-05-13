package sl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteReadChannelOperations.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f84415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.g f84416b;

    public o(@NotNull f fVar, @NotNull kotlinx.coroutines.g gVar) {
        tn.p.k(fVar, "channel");
        tn.p.k(gVar, "job");
        this.f84415a = fVar;
        this.f84416b = gVar;
    }

    @Override // sl.i
    @NotNull
    public kotlinx.coroutines.g a() {
        return this.f84416b;
    }

    @NotNull
    public final f b() {
        return this.f84415a;
    }
}
