package o0;

import com.applovin.sdk.AppLovinEventTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&R\u001c\u0010\u000f\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lo0/q;", "", "", "tag", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "message", "", "throwable", "Lbn/r;", "a", "getLevel", "()I", "setLevel", "(I)V", AppLovinEventTypes.USER_COMPLETED_LEVEL, "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface q {
    void a(@NotNull String str, int i10, @Nullable String str2, @Nullable Throwable th2);

    int getLevel();
}
