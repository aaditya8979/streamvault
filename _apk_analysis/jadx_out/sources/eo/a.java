package eo;

import android.os.Looper;
import io.s;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p000do.y1;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements s {
    @Override // io.s
    public int a() {
        return 1073741823;
    }

    @Override // io.s
    @NotNull
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // io.s
    @NotNull
    public y1 c(@NotNull List<? extends s> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
