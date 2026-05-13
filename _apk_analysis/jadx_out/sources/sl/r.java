package sl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteWriteChannelOperations.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final io.ktor.utils.io.a f84420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.g f84421b;

    public r(@NotNull io.ktor.utils.io.a aVar, @NotNull kotlinx.coroutines.g gVar) {
        tn.p.k(aVar, "channel");
        tn.p.k(gVar, "job");
        this.f84420a = aVar;
        this.f84421b = gVar;
    }

    @Override // sl.i
    @NotNull
    public kotlinx.coroutines.g a() {
        return this.f84421b;
    }

    @NotNull
    public final io.ktor.utils.io.a b() {
        return this.f84420a;
    }
}
