package o0;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import k0.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HardwareBitmaps.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lo0/m;", "", "Lk0/g;", "size", "", "a", "b", "<init>", "()V", "Lo0/o;", "Lo0/p;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public abstract class m {
    public m() {
    }

    public /* synthetic */ m(tn.i iVar) {
        this();
    }

    @MainThread
    public abstract boolean a(@NotNull Size size);

    @WorkerThread
    public abstract boolean b();
}
