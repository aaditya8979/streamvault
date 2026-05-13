package m3;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FyberSdkWrapper.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f73962a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static i f73963b = new a();

    /* JADX INFO: compiled from: FyberSdkWrapper.kt */
    public static final class a implements i {
        @Override // m3.i
        public boolean isInitialized() {
            return InneractiveAdManager.wasInitialized();
        }
    }

    @NotNull
    public static final i a() {
        return f73963b;
    }
}
