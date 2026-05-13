package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import org.jetbrains.annotations.NotNull;
import tn.i;
import up.b;
import up.f;

/* JADX INFO: compiled from: VideoSkipEntry.kt */
/* JADX INFO: loaded from: classes8.dex */
@f(name = VideoSkipEntry.TABLE_NAME)
public final class VideoSkipEntry extends BaseObservable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String PROGRESS_END = "progress_end";

    @NotNull
    public static final String PROGRESS_HEAD = "progress_head";

    @NotNull
    public static final String TABLE_NAME = "video_skip";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f43855id;

    @b(name = PROGRESS_END)
    private int progress_end;

    @b(name = PROGRESS_HEAD)
    private int progress_head;

    /* JADX INFO: compiled from: VideoSkipEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final int getId() {
        return this.f43855id;
    }

    public final int getProgress_end() {
        return this.progress_end;
    }

    public final int getProgress_head() {
        return this.progress_head;
    }

    public final void setId(int i10) {
        this.f43855id = i10;
    }

    public final void setProgress_end(int i10) {
        this.progress_end = i10;
    }

    public final void setProgress_head(int i10) {
        this.progress_head = i10;
    }
}
