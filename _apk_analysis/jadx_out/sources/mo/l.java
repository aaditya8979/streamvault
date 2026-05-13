package mo;

import io.b0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class l extends b0<l> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f74835f;

    public l(long j10, @Nullable l lVar, int i10) {
        super(j10, lVar, i10);
        this.f74835f = new AtomicReferenceArray(k.f74834f);
    }

    @Override // io.b0
    public int r() {
        return k.f74834f;
    }

    @Override // io.b0
    public void s(int i10, @Nullable Throwable th2, @NotNull kotlin.coroutines.d dVar) {
        v().set(i10, k.f74833e);
        t();
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.f68504d + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f74835f;
    }
}
