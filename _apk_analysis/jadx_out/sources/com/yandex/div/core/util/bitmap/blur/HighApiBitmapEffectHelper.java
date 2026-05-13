package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.RenderNode;
import androidx.annotation.RequiresApi;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: HighApiBitmapEffectHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class HighApiBitmapEffectHelper extends BitmapEffectHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private HardwareRenderer cachedHardwareRenderer;

    @Nullable
    private RenderNode cachedRenderNode;

    /* JADX INFO: compiled from: HighApiBitmapEffectHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:12:0x0065, B:17:0x0074, B:19:0x007c, B:30:0x00a4, B:20:0x0081, B:22:0x008b, B:24:0x0091, B:25:0x0093, B:26:0x0098, B:28:0x009e, B:29:0x00a0), top: B:36:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Bitmap blur(android.graphics.Bitmap r9, float r10, boolean r11) {
        /*
            r8 = this;
            android.graphics.HardwareRenderer r0 = r8.getOrCreateHardwareRenderer()
            android.graphics.RenderNode r1 = r8.getOrCreateRenderNode()
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            r4 = 1
            r5 = 1
            r6 = 768(0x300, double:3.794E-321)
            android.media.ImageReader r2 = x0.a.a(r2, r3, r4, r5, r6)
            android.view.Surface r3 = r2.getSurface()
            r0.setSurface(r3)
            r0.setContentRoot(r1)
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            r5 = 0
            r1.setPosition(r5, r5, r3, r4)
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r10 = r10 / r3
            if (r11 == 0) goto L36
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.DECAL
            goto L38
        L36:
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.MIRROR
        L38:
            android.graphics.RenderEffect r10 = android.graphics.RenderEffect.createBlurEffect(r10, r10, r3)
            androidx.compose.ui.platform.q.a(r1, r10)
            android.graphics.RecordingCanvas r10 = r1.beginRecording()
            r3 = 0
            r4 = 0
            r10.drawBitmap(r9, r3, r3, r4)
            r1.endRecording()
            android.graphics.HardwareRenderer$FrameRenderRequest r10 = r0.createRenderRequest()
            r0 = 1
            android.graphics.HardwareRenderer$FrameRenderRequest r10 = r10.setWaitForPresent(r0)
            r10.syncAndDraw()
            android.media.Image r10 = r2.acquireNextImage()
            if (r10 != 0) goto L5e
            return r9
        L5e:
            android.hardware.HardwareBuffer r0 = x0.b.a(r10)
            if (r0 != 0) goto L65
            return r9
        L65:
            android.graphics.Bitmap r1 = x0.c.a(r0, r4)     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L72
            r0.close()
            r10.close()
            return r9
        L72:
            if (r11 == 0) goto L81
            android.graphics.Bitmap$Config r11 = r1.getConfig()     // Catch: java.lang.Throwable -> Lae
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.Throwable -> Lae
            if (r11 == r2) goto L81
            android.graphics.Bitmap r9 = r1.copy(r2, r5)     // Catch: java.lang.Throwable -> Lae
            goto La4
        L81:
            android.graphics.Bitmap$Config r11 = r1.getConfig()     // Catch: java.lang.Throwable -> Lae
            android.graphics.Bitmap$Config r2 = r9.getConfig()     // Catch: java.lang.Throwable -> Lae
            if (r11 == r2) goto L98
            android.graphics.Bitmap$Config r9 = r9.getConfig()     // Catch: java.lang.Throwable -> Lae
            if (r9 != 0) goto L93
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lae
        L93:
            android.graphics.Bitmap r9 = r1.copy(r9, r5)     // Catch: java.lang.Throwable -> Lae
            goto La4
        L98:
            android.graphics.Bitmap$Config r9 = r1.getConfig()     // Catch: java.lang.Throwable -> Lae
            if (r9 != 0) goto La0
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lae
        La0:
            android.graphics.Bitmap r9 = r1.copy(r9, r5)     // Catch: java.lang.Throwable -> Lae
        La4:
            r1.recycle()     // Catch: java.lang.Throwable -> Lae
            r0.close()
            r10.close()
            return r9
        Lae:
            r9 = move-exception
            r0.close()
            r10.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.bitmap.blur.HighApiBitmapEffectHelper.blur(android.graphics.Bitmap, float, boolean):android.graphics.Bitmap");
    }

    private final HardwareRenderer getOrCreateHardwareRenderer() {
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            return hardwareRenderer;
        }
        HardwareRenderer hardwareRenderer2 = new HardwareRenderer();
        this.cachedHardwareRenderer = hardwareRenderer2;
        return hardwareRenderer2;
    }

    private final RenderNode getOrCreateRenderNode() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("BlurEffect");
        this.cachedRenderNode = renderNode2;
        return renderNode2;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurBitmap(@NotNull Bitmap bitmap, float f10) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10) ? bitmap : blur(bitmap, f10, false);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurShadow(@NotNull Bitmap bitmap, float f10) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f10) ? bitmap : blur(bitmap, f10, true);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float f10) {
        return 1.0f;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float f10) {
        return f10;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.cachedRenderNode = null;
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.cachedHardwareRenderer = null;
    }
}
