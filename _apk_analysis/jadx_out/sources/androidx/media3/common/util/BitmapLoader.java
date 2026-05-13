package androidx.media3.common.util;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public interface BitmapLoader {
    c8.i<Bitmap> decodeBitmap(byte[] bArr);

    c8.i<Bitmap> loadBitmap(Uri uri);

    @Nullable
    default c8.i<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }

    boolean supportsMimeType(String str);
}
