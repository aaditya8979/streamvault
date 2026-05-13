package com.google.android.exoplayer.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.TrackGroup;
import g5.l;
import g5.m;
import java.util.List;

/* JADX INFO: compiled from: TrackSelection.java */
/* JADX INFO: loaded from: classes10.dex */
public interface c {

    /* JADX INFO: compiled from: TrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroup f20874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f20875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Object f20877d;

        public a(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0, null);
        }

        public a(TrackGroup trackGroup, int[] iArr, int i10, @Nullable Object obj) {
            this.f20874a = trackGroup;
            this.f20875b = iArr;
            this.f20876c = i10;
            this.f20877d = obj;
        }
    }

    /* JADX INFO: compiled from: TrackSelection.java */
    public interface b {
        c[] a(a[] aVarArr, y5.c cVar);
    }

    void a(long j10, long j11, long j12, List<? extends l> list, m[] mVarArr);

    int b(Format format);

    boolean blacklist(int i10, long j10);

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends l> list);

    Format getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    TrackGroup getTrackGroup();

    int indexOf(int i10);

    int length();

    default void onDiscontinuity() {
    }

    void onPlaybackSpeed(float f10);
}
