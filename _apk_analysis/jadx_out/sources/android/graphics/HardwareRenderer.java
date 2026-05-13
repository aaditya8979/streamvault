package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.view.Surface;

/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class HardwareRenderer {

    /* JADX INFO: loaded from: classes8.dex */
    public final /* synthetic */ class FrameRenderRequest {
        static {
            throw new NoClassDefFoundError();
        }

        @NonNull
        public native /* synthetic */ FrameRenderRequest setWaitForPresent(boolean z10);

        public native /* synthetic */ int syncAndDraw();
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ FrameRenderRequest createRenderRequest();

    public native /* synthetic */ void destroy();

    public native /* synthetic */ void setContentRoot(@Nullable RenderNode renderNode);

    public native /* synthetic */ void setSurface(@Nullable Surface surface);
}
