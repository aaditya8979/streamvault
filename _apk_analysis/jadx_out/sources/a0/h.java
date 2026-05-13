package a0;

import android.graphics.Paint;
import androidx.exifinterface.media.ExifInterface;
import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExifUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"La0/h;", "", "", "mimeType", "Lokio/BufferedSource;", "source", "Lcoil/decode/ExifOrientationPolicy;", "policy", "La0/f;", "a", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "PAINT", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f3454a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Paint PAINT = new Paint(3);

    @NotNull
    public final f a(@Nullable String mimeType, @NotNull BufferedSource source, @NotNull ExifOrientationPolicy policy) {
        if (!i.c(policy, mimeType)) {
            return f.f3449d;
        }
        ExifInterface exifInterface = new ExifInterface(new g(source.peek().inputStream()));
        return new f(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r8, @org.jetbrains.annotations.NotNull a0.f r9) {
        /*
            r7 = this;
            boolean r0 = r9.getIsFlipped()
            if (r0 != 0) goto Ld
            boolean r0 = a0.i.a(r9)
            if (r0 != 0) goto Ld
            return r8
        Ld:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            boolean r2 = r9.getIsFlipped()
            if (r2 == 0) goto L2d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r4, r1, r3)
        L2d:
            boolean r2 = a0.i.a(r9)
            if (r2 == 0) goto L3b
            int r2 = r9.getRotationDegrees()
            float r2 = (float) r2
            r0.postRotate(r2, r1, r3)
        L3b:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r2 = r1.left
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L58
            r3 = r5
            goto L59
        L58:
            r3 = r6
        L59:
            if (r3 == 0) goto L65
            float r3 = r1.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L62
            goto L63
        L62:
            r5 = r6
        L63:
            if (r5 != 0) goto L6c
        L65:
            float r2 = -r2
            float r1 = r1.top
            float r1 = -r1
            r0.postTranslate(r2, r1)
        L6c:
            boolean r9 = a0.i.b(r9)
            java.lang.String r1 = "createBitmap(width, height, config)"
            if (r9 == 0) goto L88
            int r9 = r8.getHeight()
            int r2 = r8.getWidth()
            android.graphics.Bitmap$Config r3 = o0.a.c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            tn.p.j(r9, r1)
            goto L9b
        L88:
            int r9 = r8.getWidth()
            int r2 = r8.getHeight()
            android.graphics.Bitmap$Config r3 = o0.a.c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            tn.p.j(r9, r1)
        L9b:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r9)
            android.graphics.Paint r2 = a0.h.PAINT
            r1.drawBitmap(r8, r0, r2)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.h.b(android.graphics.Bitmap, a0.f):android.graphics.Bitmap");
    }
}
