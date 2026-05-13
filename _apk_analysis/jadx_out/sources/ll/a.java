package ll;

import androidx.core.view.InputDeviceCompat;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import wl.b;
import wl.f;

/* JADX INFO: compiled from: ByteBufferPool.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f<ByteBuffer> f73871a = new b(2048, InputDeviceCompat.SOURCE_TOUCHSCREEN);

    @NotNull
    public static final f<ByteBuffer> a() {
        return f73871a;
    }
}
