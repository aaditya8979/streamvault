package io.bidmachine.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, c> mediaSourceByMediaPeriod;
    private final ImmutableList<c> mediaSourceHolders;

    @Nullable
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    public static final class Builder {
        private int index;

        @Nullable
        private MediaItem mediaItem;

        @Nullable
        private MediaSource.Factory mediaSourceFactory;
        private final ImmutableList.a<c> mediaSourceHoldersBuilder = ImmutableList.builder();

        public Builder add(MediaItem mediaItem) {
            return add(mediaItem, -9223372036854775807L);
        }

        public Builder add(MediaItem mediaItem, long j10) {
            Assertions.checkNotNull(mediaItem);
            if (j10 == -9223372036854775807L) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                if (clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                    j10 = Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs);
                }
            }
            Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j10);
        }

        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, -9223372036854775807L);
        }

        public Builder add(MediaSource mediaSource, long j10) {
            Assertions.checkNotNull(mediaSource);
            Assertions.checkState(((mediaSource instanceof ProgressiveMediaSource) && j10 == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            ImmutableList.a<c> aVar = this.mediaSourceHoldersBuilder;
            int i10 = this.index;
            this.index = i10 + 1;
            aVar.a(new c(mediaSource, i10, Util.msToUs(j10)));
            return this;
        }

        public ConcatenatingMediaSource2 build() {
            Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.m());
        }

        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }
    }

    public static final class b extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final ImmutableList<Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;

        @Nullable
        private final Object manifest;
        private final MediaItem mediaItem;
        private final ImmutableList<Long> periodOffsetsInWindowUs;
        private final ImmutableList<Timeline> timelines;

        public b(MediaItem mediaItem, ImmutableList<Timeline> immutableList, ImmutableList<Integer> immutableList2, ImmutableList<Long> immutableList3, boolean z10, boolean z11, long j10, long j11, @Nullable Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = immutableList;
            this.firstPeriodIndices = immutableList2;
            this.periodOffsetsInWindowUs = immutableList3;
            this.isSeekable = z10;
            this.isDynamic = z11;
            this.durationUs = j10;
            this.defaultPositionUs = j11;
            this.manifest = obj;
        }

        private int getChildIndexByPeriodIndex(int i10) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i10 + 1), false, false);
        }

        private long getPeriodDurationUs(Timeline.Period period, int i10) {
            if (period.durationUs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return (i10 == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : this.periodOffsetsInWindowUs.get(i10 + 1).longValue()) - this.periodOffsetsInWindowUs.get(i10).longValue();
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i10);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i10 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue(), period, z10);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i10).longValue();
            period.durationUs = getPeriodDurationUs(period, i10);
            if (z10) {
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = this.timelines.get(childIndex);
            int iIntValue = this.firstPeriodIndices.get(childIndex).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(iIntValue).longValue();
            period.durationUs = getPeriodDurationUs(period, iIntValue);
            period.uid = obj;
            return period;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Object getUidOfPeriod(int i10) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i10);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i10 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue()));
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public static final class c {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public c(MediaSource mediaSource, int i10, long j10) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i10;
            this.initialPlaceholderDurationUs = j10;
        }
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, ImmutableList<c> immutableList) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = immutableList;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    private void disableUnusedMediaSources() {
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            c cVar = this.mediaSourceHolders.get(i10);
            if (cVar.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(cVar.index));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j10, int i10) {
        return (int) (j10 % ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static long getChildWindowSequenceNumber(long j10, int i10, int i11) {
        return (j10 * ((long) i10)) + ((long) i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i10, Object obj) {
        return Pair.create(Integer.valueOf(i10), obj);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j10, int i10) {
        return j10 / ((long) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    @Nullable
    private b maybeCreateConcatenatedTimeline() {
        c cVar;
        boolean z10;
        boolean z11;
        Object obj;
        int i10;
        long j10;
        long j11;
        Timeline.Window window;
        boolean z12;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        Timeline.Window window2 = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        ImmutableList.a aVarBuilder2 = ImmutableList.builder();
        ImmutableList.a aVarBuilder3 = ImmutableList.builder();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z13 = true;
        boolean z14 = true;
        int i11 = 0;
        Object obj2 = null;
        int periodCount = 0;
        boolean z15 = false;
        boolean z16 = false;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (i11 < size) {
            c cVar2 = concatenatingMediaSource2.mediaSourceHolders.get(i11);
            Timeline timeline = cVar2.mediaSource.getTimeline();
            Assertions.checkArgument(!timeline.isEmpty(), "Can't concatenate empty child Timeline.");
            aVarBuilder.a(timeline);
            aVarBuilder2.a(Integer.valueOf(periodCount));
            periodCount += timeline.getPeriodCount();
            int i12 = 0;
            while (i12 < timeline.getWindowCount()) {
                timeline.getWindow(i12, window2);
                if (!z15) {
                    obj2 = window2.manifest;
                    z15 = true;
                }
                if (z13 && Util.areEqual(obj2, window2.manifest)) {
                    cVar = cVar2;
                    z10 = true;
                } else {
                    cVar = cVar2;
                    z10 = false;
                }
                long j15 = window2.durationUs;
                c cVar3 = cVar;
                if (j15 == -9223372036854775807L) {
                    j15 = cVar3.initialPlaceholderDurationUs;
                    if (j15 == -9223372036854775807L) {
                        return null;
                    }
                }
                j12 += j15;
                if (cVar3.index == 0 && i12 == 0) {
                    z11 = z10;
                    obj = obj2;
                    j13 = window2.defaultPositionUs;
                    j14 = -window2.positionInFirstPeriodUs;
                } else {
                    z11 = z10;
                    obj = obj2;
                }
                z14 &= window2.isSeekable || window2.isPlaceholder;
                z16 |= window2.isDynamic;
                int i13 = window2.firstPeriodIndex;
                while (i13 <= window2.lastPeriodIndex) {
                    aVarBuilder3.a(Long.valueOf(j14));
                    timeline.getPeriod(i13, period, true);
                    int i14 = periodCount;
                    long j16 = period.durationUs;
                    if (j16 == -9223372036854775807L) {
                        Assertions.checkArgument(window2.firstPeriodIndex == window2.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j16 = window2.positionInFirstPeriodUs + j15;
                    }
                    Object obj3 = obj;
                    if (!(i13 == window2.firstPeriodIndex && !(cVar3.index == 0 && i12 == 0)) || j16 == -9223372036854775807L) {
                        i10 = size;
                        j10 = j15;
                        j11 = 0;
                    } else {
                        i10 = size;
                        j10 = j15;
                        j11 = -window2.positionInFirstPeriodUs;
                        j16 += j11;
                    }
                    Object objCheckNotNull = Assertions.checkNotNull(period.uid);
                    int i15 = i10;
                    if (cVar3.activeMediaPeriods == 0 || !cVar3.periodTimeOffsetsByUid.containsKey(objCheckNotNull)) {
                        window = window2;
                    } else {
                        window = window2;
                        if (!cVar3.periodTimeOffsetsByUid.get(objCheckNotNull).equals(Long.valueOf(j11))) {
                            z12 = false;
                        }
                        Assertions.checkArgument(z12, "Can't handle windows with changing offset in first period.");
                        cVar3.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j11));
                        j14 += j16;
                        i13++;
                        periodCount = i14;
                        obj = obj3;
                        j15 = j10;
                        size = i15;
                        window2 = window;
                    }
                    z12 = true;
                    Assertions.checkArgument(z12, "Can't handle windows with changing offset in first period.");
                    cVar3.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j11));
                    j14 += j16;
                    i13++;
                    periodCount = i14;
                    obj = obj3;
                    j15 = j10;
                    size = i15;
                    window2 = window;
                }
                i12++;
                cVar2 = cVar3;
                z13 = z11;
                obj2 = obj;
            }
            i11++;
            concatenatingMediaSource2 = this;
        }
        return new b(getMediaItem(), aVarBuilder.m(), aVarBuilder2.m(), aVarBuilder3.m(), z14, z16, j12, j13, z13 ? obj2 : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((Handler) Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        b bVarMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (bVarMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(bVarMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        c cVar = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), cVar.index));
        enableChildSource(Integer.valueOf(cVar.index));
        cVar.activeMediaPeriods++;
        long jLongValue = mediaPeriodId.isAd() ? 0L : ((Long) Assertions.checkNotNull(cVar.periodTimeOffsetsByUid.get(mediaPeriodIdCopyWithWindowSequenceNumber.periodUid))).longValue();
        f fVar = new f(cVar.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j10 - jLongValue), jLongValue);
        this.mediaSourceByMediaPeriod.put(fVar, cVar);
        disableUnusedMediaSources();
        return fVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Long l10;
        return (j10 == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.isAd() || (l10 = this.mediaSourceHolders.get(num.intValue()).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j10 : j10 + Util.usToMs(l10.longValue());
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i10) {
        return 0;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: aj.d
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f3942b.handleMessage(message);
            }
        });
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            prepareChildSource(Integer.valueOf(i10), this.mediaSourceHolders.get(i10).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((c) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod))).mediaSource.releasePeriod(((f) mediaPeriod).getWrappedMediaPeriod());
        r0.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }
}
