package com.mgs.carparking.dbtable;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import up.b;
import up.f;

/* JADX INFO: compiled from: VideoDownloadEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@f(name = VideoDownloadEntity.TABLE_NAME)
public final class VideoDownloadEntity implements Serializable {

    @NotNull
    public static final String AUDIO_TYPE = "audio_type";

    @NotNull
    public static final String COLLECTION = "collection";

    @NotNull
    public static final String COMPLETE = "complete";

    @NotNull
    public static final String COMPLETE_NAME = "complete_name";

    @NotNull
    public static final String COVER_URL = "coverUrl";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String DOWN_URL = "down_url";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String LAST_NAME = "last_name";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String ORGINAL_URL = "orginal_url";

    @NotNull
    public static final String SIZE = "size";

    @NotNull
    public static final String STATUS = "status";

    @NotNull
    public static final String STREAMID = "streamid";

    @NotNull
    public static final String TABLE_NAME = "video_download";

    @NotNull
    public static final String UPDATE_TIME = "updateTime";

    @NotNull
    public static final String URL = "url";

    @NotNull
    public static final String VIDEO_POSITION = "video_position";

    @NotNull
    public static final String VIDEO_TYPE = "videoType";

    @b(name = AUDIO_TYPE)
    private int audio_type;

    @b(name = "collection")
    private int collection;

    @b(name = "complete")
    private int complete;

    @b(name = COMPLETE_NAME)
    @Nullable
    private String complete_name;

    @b(name = "coverUrl")
    @Nullable
    private String coverUrl;

    @b(name = DOWN_URL)
    @Nullable
    private String down_url;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f43852id;
    private boolean isCheck;

    @b(name = LAST_NAME)
    @Nullable
    private String lastName;

    @b(name = "name")
    @Nullable
    private String name;

    @b(name = ORGINAL_URL)
    @Nullable
    private String orginal_url;

    @b(name = "size")
    private long size;

    @b(name = "status")
    private int status;

    @b(name = STREAMID)
    @Nullable
    private String streamid;

    @b(name = "updateTime")
    private long updateTime;

    @b(name = "url")
    @Nullable
    private String url;

    @b(name = "videoType")
    private int videoType;

    @b(name = VIDEO_POSITION)
    private int video_position;

    /* JADX INFO: compiled from: VideoDownloadEntity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final int getAudio_type() {
        return this.audio_type;
    }

    public final int getCollection() {
        return this.collection;
    }

    public final int getComplete() {
        return this.complete;
    }

    @Nullable
    public final String getComplete_name() {
        return this.complete_name;
    }

    @Nullable
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @Nullable
    public final String getDown_url() {
        return this.down_url;
    }

    public final int getId() {
        return this.f43852id;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOrginal_url() {
        return this.orginal_url;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStreamid() {
        return this.streamid;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final int getVideo_position() {
        return this.video_position;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setAudio_type(int i10) {
        this.audio_type = i10;
    }

    public final void setCheck(boolean z10) {
        this.isCheck = z10;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setComplete(int i10) {
        this.complete = i10;
    }

    public final void setComplete_name(@Nullable String str) {
        this.complete_name = str;
    }

    public final void setCoverUrl(@Nullable String str) {
        this.coverUrl = str;
    }

    public final void setDown_url(@Nullable String str) {
        this.down_url = str;
    }

    public final void setId(int i10) {
        this.f43852id = i10;
    }

    public final void setLastName(@Nullable String str) {
        this.lastName = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOrginal_url(@Nullable String str) {
        this.orginal_url = str;
    }

    public final void setSize(long j10) {
        this.size = j10;
    }

    public final void setStatus(int i10) {
        this.status = i10;
    }

    public final void setStreamid(@Nullable String str) {
        this.streamid = str;
    }

    public final void setUpdateTime(long j10) {
        this.updateTime = j10;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }

    public final void setVideo_position(int i10) {
        this.video_position = i10;
    }

    @NotNull
    public String toString() {
        return "VideoDownloadEntity{id=" + this.f43852id + ", name='" + this.name + "', lastName='" + this.lastName + "', coverUrl='" + this.coverUrl + "', videoType=" + this.videoType + ", updateTime=" + this.updateTime + ", url='" + this.url + "', complete=" + this.complete + ", size=" + this.size + ", complete_name='" + this.complete_name + "', streamid='" + this.streamid + "', status=" + this.status + ", orginal_url='" + this.orginal_url + "', collection=" + this.collection + ", down_url='" + this.down_url + "', video_position=" + this.video_position + '}';
    }
}
