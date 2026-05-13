package s0;

import com.android.cast.dlna.dmr.RenderState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RenderControl.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface a {
    long getCurrentPosition();

    long getDuration();

    @NotNull
    RenderState getState();

    void stop();
}
