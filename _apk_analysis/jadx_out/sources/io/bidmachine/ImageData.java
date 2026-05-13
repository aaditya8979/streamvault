package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface ImageData {
    @Nullable
    Drawable getImage();

    @Nullable
    Uri getLocalUri();

    @Nullable
    String getRemoteUrl();
}
