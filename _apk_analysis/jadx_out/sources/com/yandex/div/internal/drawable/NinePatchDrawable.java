package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: NinePatchDrawable.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NinePatchDrawable extends Drawable {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private Bitmap bitmap;
    private int bottom;
    private int left;

    @Nullable
    private NinePatch ninePatch;

    @NotNull
    private final Paint paint = new Paint(3);
    private int right;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private int f53987top;

    /* JADX INFO: compiled from: NinePatchDrawable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final NinePatch buildNinePatchFromBitmap(Bitmap bitmap) {
        return new NinePatch(bitmap, getChunkByteArray(bitmap.getWidth(), bitmap.getHeight(), this.bottom, this.left, this.right, this.f53987top));
    }

    private final byte[] getChunkByteArray(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i11 - i12;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i13);
        byteBufferOrder.putInt(i10 - i14);
        byteBufferOrder.putInt(i15);
        byteBufferOrder.putInt(i16);
        for (int i17 = 0; i17 < 9; i17++) {
            byteBufferOrder.putInt(1);
        }
        return byteBufferOrder.array();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        NinePatch ninePatch = this.ninePatch;
        if (ninePatch != null) {
            ninePatch.draw(canvas, new Rect(0, 0, getBounds().width(), getBounds().height()), this.paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
        this.ninePatch = bitmap != null ? buildNinePatchFromBitmap(bitmap) : null;
        invalidateSelf();
    }

    public final void setBottom(int i10) {
        this.bottom = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setLeft(int i10) {
        this.left = i10;
        invalidateSelf();
    }

    public final void setRight(int i10) {
        this.right = i10;
        invalidateSelf();
    }

    public final void setTop(int i10) {
        this.f53987top = i10;
        invalidateSelf();
    }
}
