package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PictureKt {
    @NotNull
    public static final Picture record(@NotNull Picture picture, int i10, int i11, @NotNull sn.l<? super Canvas, bn.r> lVar) {
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        try {
            lVar.invoke(canvasBeginRecording);
            return picture;
        } finally {
            tn.n.b(1);
            picture.endRecording();
            tn.n.a(1);
        }
    }
}
