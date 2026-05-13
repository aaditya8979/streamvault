package ic;

import com.mgs.carparking.dbtable.VideoSkipEntry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VideoSkipEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public VideoSkipEntry f64058a;

    public g0(@NotNull VideoSkipEntry videoSkipEntry) {
        tn.p.k(videoSkipEntry, "entry");
        this.f64058a = videoSkipEntry;
    }

    @NotNull
    public final VideoSkipEntry a() {
        return this.f64058a;
    }
}
