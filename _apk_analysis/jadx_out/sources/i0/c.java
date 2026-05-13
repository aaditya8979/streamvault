package i0;

import androidx.annotation.MainThread;
import kotlin.Metadata;

/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Li0/c;", "", "Lbn/r;", "shutdown", "", "a", "()Z", "isOnline", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface c {

    /* JADX INFO: compiled from: NetworkObserver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Li0/c$a;", "", "", "isOnline", "Lbn/r;", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public interface a {
        @MainThread
        void a(boolean z10);
    }

    boolean a();

    void shutdown();
}
