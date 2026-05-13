package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import up.b;
import up.f;

/* JADX INFO: compiled from: VideoCollectionEntry.kt */
/* JADX INFO: loaded from: classes5.dex */
@f(name = VideoCollectionEntry.TABLE_NAME)
public final class VideoCollectionEntry extends BaseObservable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String TABLE_NAME = "video_collection";

    @NotNull
    public static final String TYPE_PID = "type_pid";

    @NotNull
    public static final String VOD_ACTOR = "vod_actor";

    @NotNull
    public static final String VOD_AREA = "vod_area";

    @NotNull
    public static final String VOD_DIRECTOR = "vod_director";

    @NotNull
    public static final String VOD_DOUBAN_SCORE = "vod_douban_score";

    @NotNull
    public static final String VOD_NAME = "vod_name";

    @NotNull
    public static final String VOD_PIC = "vod_pic";

    @NotNull
    public static final String VOD_YEAR = "vod_year";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f43851id;

    @b(name = TYPE_PID)
    private int type_pid;

    @b(name = VOD_ACTOR)
    @Nullable
    private String vod_actor;

    @b(name = VOD_AREA)
    @Nullable
    private String vod_area;

    @b(name = VOD_DIRECTOR)
    @Nullable
    private String vod_director;

    @b(name = VOD_DOUBAN_SCORE)
    @Nullable
    private String vod_douban_score;

    @b(name = VOD_NAME)
    @Nullable
    private String vod_name;

    @b(name = VOD_PIC)
    @Nullable
    private String vod_pic;

    @b(name = VOD_YEAR)
    @Nullable
    private String vod_year;

    /* JADX INFO: compiled from: VideoCollectionEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final int getId() {
        return this.f43851id;
    }

    public final int getType_pid() {
        return this.type_pid;
    }

    @Nullable
    public final String getVod_actor() {
        return this.vod_actor;
    }

    @Nullable
    public final String getVod_area() {
        return this.vod_area;
    }

    @Nullable
    public final String getVod_director() {
        return this.vod_director;
    }

    @Nullable
    public final String getVod_douban_score() {
        return this.vod_douban_score;
    }

    @Nullable
    public final String getVod_name() {
        return this.vod_name;
    }

    @Nullable
    public final String getVod_pic() {
        return this.vod_pic;
    }

    @Nullable
    public final String getVod_year() {
        return this.vod_year;
    }

    public final void setId(int i10) {
        this.f43851id = i10;
    }

    public final void setType_pid(int i10) {
        this.type_pid = i10;
    }

    public final void setVod_actor(@Nullable String str) {
        this.vod_actor = str;
    }

    public final void setVod_area(@Nullable String str) {
        this.vod_area = str;
    }

    public final void setVod_director(@Nullable String str) {
        this.vod_director = str;
    }

    public final void setVod_douban_score(@Nullable String str) {
        this.vod_douban_score = str;
    }

    public final void setVod_name(@Nullable String str) {
        this.vod_name = str;
    }

    public final void setVod_pic(@Nullable String str) {
        this.vod_pic = str;
    }

    public final void setVod_year(@Nullable String str) {
        this.vod_year = str;
    }

    @NotNull
    public String toString() {
        return "VideoCollectionEntry{id=" + this.f43851id + ", vod_name='" + this.vod_name + "', vod_pic='" + this.vod_pic + "', type_pid='" + this.type_pid + "', vod_year='" + this.vod_year + "', vod_area='" + this.vod_area + "', vod_director='" + this.vod_director + "', vod_douban_score='" + this.vod_douban_score + "', vod_actor='" + this.vod_actor + "'}";
    }
}
