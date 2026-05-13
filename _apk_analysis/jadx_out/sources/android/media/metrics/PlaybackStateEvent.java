package android.media.metrics;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PlaybackStateEvent extends Event implements Parcelable {

    /* JADX INFO: loaded from: classes10.dex */
    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        @NonNull
        public native /* synthetic */ PlaybackStateEvent build();

        @NonNull
        public native /* synthetic */ Builder setState(int i10);

        @NonNull
        public native /* synthetic */ Builder setTimeSinceCreatedMillis(long j10);
    }

    static {
        throw new NoClassDefFoundError();
    }
}
