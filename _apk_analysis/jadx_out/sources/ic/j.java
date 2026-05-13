package ic;

import com.mgs.carparking.dbtable.VideoDownloadEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DownloadCompleteListEvent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<VideoDownloadEntity> f64060a;

    public j(@NotNull List<VideoDownloadEntity> list) {
        tn.p.k(list, "downloadEntityList");
        this.f64060a = list;
    }

    @NotNull
    public final List<VideoDownloadEntity> a() {
        return this.f64060a;
    }
}
