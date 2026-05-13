package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import up.b;
import up.f;

/* JADX INFO: compiled from: VideoLookHistoryEntry.kt */
/* JADX INFO: loaded from: classes8.dex */
@f(name = VideoLookHistoryEntry.TABLE_NAME)
public final class VideoLookHistoryEntry extends BaseObservable {

    @NotNull
    public static final String AUDIOTYPE = "audiotype";

    @NotNull
    public static final String COLLECTION = "collection";

    @NotNull
    public static final String CONTENNT_POSITION = "contentPosition";

    @NotNull
    public static final String COVER_URL = "coverUrl";

    @NotNull
    public static final String CURRNET = "current";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String DURATION = "duration";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String ISNOTSHARE = "is_not_share";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String SUBTITLETYPE = "subtitletype";

    @NotNull
    public static final String TABLE_NAME = "video_history";

    @NotNull
    public static final String UPDATE_TIME = "updateTime";

    @NotNull
    public static final String URL = "url";

    @NotNull
    public static final String VIDEO_DESC = "videoDesc";

    @NotNull
    public static final String VIDEO_TYPE = "videoType";

    @b(name = "collection")
    private int collection;

    @b(name = CONTENNT_POSITION)
    private long contentPosition;

    @b(name = "coverUrl")
    @Nullable
    private String coverUrl;

    @b(name = CURRNET)
    private int current;

    @b(name = "duration")
    private long duration;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f43853id;

    @b(name = ISNOTSHARE)
    private int is_not_share;

    @b(name = "name")
    @Nullable
    private String name;

    @b(name = "updateTime")
    private long updateTime;

    @b(name = "url")
    @Nullable
    private String url;

    @b(name = VIDEO_DESC)
    @Nullable
    private String videoDesc;

    @b(name = "videoType")
    private int videoType;

    @b(name = AUDIOTYPE)
    @NotNull
    private String audiotype = "";

    @b(name = SUBTITLETYPE)
    @NotNull
    private String subtitletype = "";

    /* JADX INFO: compiled from: VideoLookHistoryEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @NotNull
    public final String getAudiotype() {
        return this.audiotype;
    }

    public final int getCollection() {
        return this.collection;
    }

    public final long getContentPosition() {
        return this.contentPosition;
    }

    @Nullable
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.f43853id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSubtitletype() {
        return this.subtitletype;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getVideoDesc() {
        return this.videoDesc;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final int is_not_share() {
        return this.is_not_share;
    }

    public final void setAudiotype(@NotNull String str) {
        p.k(str, "<set-?>");
        this.audiotype = str;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setContentPosition(long j10) {
        this.contentPosition = j10;
    }

    public final void setCoverUrl(@Nullable String str) {
        this.coverUrl = str;
    }

    public final void setCurrent(int i10) {
        this.current = i10;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setId(int i10) {
        this.f43853id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSubtitletype(@NotNull String str) {
        p.k(str, "<set-?>");
        this.subtitletype = str;
    }

    public final void setUpdateTime(long j10) {
        this.updateTime = j10;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setVideoDesc(@Nullable String str) {
        this.videoDesc = str;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }

    public final void set_not_share(int i10) {
        this.is_not_share = i10;
    }

    @NotNull
    public String toString() {
        return "VideoLookHistoryEntry{id=" + this.f43853id + ", name='" + this.name + "', coverUrl='" + this.coverUrl + "', videoType=" + this.videoType + ", videoDesc='" + this.videoDesc + "', updateTime=" + this.updateTime + ", url='" + this.url + "', current=" + this.current + ", contentPosition=" + this.contentPosition + ", duration=" + this.duration + ", is_not_share=" + this.is_not_share + ", collection=" + this.collection + '}';
    }
}
