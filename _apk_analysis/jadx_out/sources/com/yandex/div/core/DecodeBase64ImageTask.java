package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.PictureDrawable;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import bn.r;
import bo.a0;
import bo.d0;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.logging.Severity;
import com.yandex.div.svg.SvgDecoder;
import java.io.ByteArrayInputStream;
import org.jetbrains.annotations.NotNull;
import sn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DecodeBase64ImageTask.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DecodeBase64ImageTask implements Runnable {

    @NotNull
    private final l<ImageRepresentation, r> onDecoded;

    @NotNull
    private String rawBase64string;
    private final boolean synchronous;

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeBase64ImageTask(@NotNull String str, boolean z10, @NotNull l<? super ImageRepresentation, r> lVar) {
        this.rawBase64string = str;
        this.synchronous = z10;
        this.onDecoded = lVar;
    }

    /* JADX INFO: renamed from: asImageRepresentation-9g2PFUk, reason: not valid java name */
    private final PictureDrawable m7371asImageRepresentation9g2PFUk(PictureDrawable pictureDrawable) {
        return ImageRepresentation.PictureDrawable.m7389constructorimpl(pictureDrawable);
    }

    /* JADX INFO: renamed from: asImageRepresentation-Mlk_otY, reason: not valid java name */
    private final Bitmap m7372asImageRepresentationMlk_otY(Bitmap bitmap) {
        return ImageRepresentation.Bitmap.m7383constructorimpl(bitmap);
    }

    private final Bitmap decodeToBitmap(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (!kLog.isAtLeast(Severity.ERROR)) {
                return null;
            }
            kLog.print(6, "Div", "Problem with decoding base-64 preview image occurred");
            return null;
        }
    }

    private final PictureDrawable decodeToPictureDrawable(byte[] bArr) {
        return new SvgDecoder(false, 1, null).decode(new ByteArrayInputStream(bArr));
    }

    private final String extractFromDataUrl(String str) {
        if (!a0.W(str, "data:", false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(d0.q0(str, ',', 0, false, 6, null) + 1);
        p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final boolean isSvg(String str) {
        return a0.W(str, "data:image/svg", false, 2, null);
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        try {
            byte[] bArrDecode = Base64.decode(extractFromDataUrl(this.rawBase64string), 0);
            final ImageRepresentation imageRepresentationM7382boximpl = null;
            if (isSvg(this.rawBase64string)) {
                PictureDrawable pictureDrawableDecodeToPictureDrawable = decodeToPictureDrawable(bArrDecode);
                PictureDrawable pictureDrawableM7371asImageRepresentation9g2PFUk = pictureDrawableDecodeToPictureDrawable != null ? m7371asImageRepresentation9g2PFUk(pictureDrawableDecodeToPictureDrawable) : null;
                if (pictureDrawableM7371asImageRepresentation9g2PFUk != null) {
                    imageRepresentationM7382boximpl = ImageRepresentation.PictureDrawable.m7388boximpl(pictureDrawableM7371asImageRepresentation9g2PFUk);
                }
            } else {
                Bitmap bitmapDecodeToBitmap = decodeToBitmap(bArrDecode);
                Bitmap bitmapM7372asImageRepresentationMlk_otY = bitmapDecodeToBitmap != null ? m7372asImageRepresentationMlk_otY(bitmapDecodeToBitmap) : null;
                if (bitmapM7372asImageRepresentationMlk_otY != null) {
                    imageRepresentationM7382boximpl = ImageRepresentation.Bitmap.m7382boximpl(bitmapM7372asImageRepresentationMlk_otY);
                }
            }
            if (this.synchronous) {
                this.onDecoded.invoke(imageRepresentationM7382boximpl);
            } else {
                UiThreadHandler.INSTANCE.postOnMainThread(new a<r>() { // from class: com.yandex.div.core.DecodeBase64ImageTask.run.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // sn.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DecodeBase64ImageTask.this.onDecoded.invoke(imageRepresentationM7382boximpl);
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.ERROR)) {
                kLog.print(6, "Div", "Bad base-64 image preview");
            }
        }
    }
}
