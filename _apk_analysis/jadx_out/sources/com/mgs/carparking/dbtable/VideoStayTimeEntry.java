package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import up.b;
import up.f;

/* JADX INFO: compiled from: VideoStayTimeEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
@f(name = VideoStayTimeEntry.TABLE_NAME)
public final class VideoStayTimeEntry extends BaseObservable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String DURATION = "duration";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String TABLE_NAME = "video_stay";

    @b(name = "duration")
    private long duration;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f43856id;

    @b(name = "name")
    @Nullable
    private String name;

    /* JADX INFO: compiled from: VideoStayTimeEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.f43856id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setId(int i10) {
        this.f43856id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "VideoStayTimeEntry{id=" + this.f43856id + ", name='" + this.name + "', duration=" + this.duration + '}';
    }
}
