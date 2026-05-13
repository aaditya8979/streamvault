package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import up.b;
import up.f;

/* JADX INFO: compiled from: VideoShareEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
@f(name = VideoShareEntry.TABLE_NAME)
public final class VideoShareEntry extends BaseObservable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String TABLE_NAME = "video_share";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f43854id;

    @b(name = "name")
    @Nullable
    private String name;

    /* JADX INFO: compiled from: VideoShareEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final int getId() {
        return this.f43854id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setId(int i10) {
        this.f43854id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "VideoShareEntry{id=" + this.f43854id + ", name='" + this.name + "'}";
    }
}
