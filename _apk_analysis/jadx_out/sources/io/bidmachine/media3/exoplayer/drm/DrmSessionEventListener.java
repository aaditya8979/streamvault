package io.bidmachine.media3.exoplayer.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
@UnstableApi
public interface DrmSessionEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<a> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public static final class a {
            public Handler handler;
            public DrmSessionEventListener listener;

            public a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(CopyOnWriteArrayList<a> copyOnWriteArrayList, int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysLoaded$1(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysRemoved$4(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysRestored$3(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionAcquired$0(DrmSessionEventListener drmSessionEventListener, int i10) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionManagerError$2(DrmSessionEventListener drmSessionEventListener, Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionReleased$5(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new a(handler, drmSessionEventListener));
        }

        public void drmKeysLoaded() {
            for (a aVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: ti.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85281b.lambda$drmKeysLoaded$1(drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            for (a aVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: ti.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85293b.lambda$drmKeysRemoved$4(drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            for (a aVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: ti.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85289b.lambda$drmKeysRestored$3(drmSessionEventListener);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int i10) {
            for (a aVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: ti.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85286b.lambda$drmSessionAcquired$0(drmSessionEventListener, i10);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            for (a aVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: ti.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85283b.lambda$drmSessionManagerError$2(drmSessionEventListener, exc);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            for (a aVar : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = aVar.listener;
                Util.postOrRun(aVar.handler, new Runnable() { // from class: ti.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85291b.lambda$drmSessionReleased$5(drmSessionEventListener);
                    }
                });
            }
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            for (a aVar : this.listenerAndHandlers) {
                if (aVar.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(aVar);
                }
            }
        }

        @CheckResult
        public EventDispatcher withParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i10, mediaPeriodId);
        }
    }

    default void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Deprecated
    default void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i11) {
    }

    default void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    default void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
