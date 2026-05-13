package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import up.b;
import up.f;

/* JADX INFO: compiled from: VideoAdLookEntity.kt */
/* JADX INFO: loaded from: classes3.dex */
@f(name = VideoAdLookEntity.TABLE_NAME)
public final class VideoAdLookEntity extends BaseObservable {

    @NotNull
    public static final String CONTENT = "CONTENT";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TABLE_NAME = "VIDEO_AD_LOOK";

    @NotNull
    public static final String VIDEOLOOKTIME = "VIDEOLOOKTIME";

    @b(name = "CONTENT")
    @Nullable
    private String content;

    @b(name = VIDEOLOOKTIME)
    private long videoLookTime;

    /* JADX INFO: compiled from: VideoAdLookEntity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final long getVideoLookTime() {
        return this.videoLookTime;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setVideoLookTime(long j10) {
        this.videoLookTime = j10;
    }

    @NotNull
    public String toString() {
        return "VideoAdLookEntity{content='" + this.content + "'}";
    }
}
