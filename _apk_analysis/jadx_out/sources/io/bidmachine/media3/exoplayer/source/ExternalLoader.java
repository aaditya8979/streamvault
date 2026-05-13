package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import c8.i;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface ExternalLoader {

    public static final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }

    i<?> load(LoadRequest loadRequest);
}
