package android.graphics;

import android.annotation.NonNull;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class RenderEffect {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f10, float f11, @NonNull RenderEffect renderEffect, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f10, float f11, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f10, float f11);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f10, float f11, @NonNull RenderEffect renderEffect);
}
