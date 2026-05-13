package com.yandex.div.core;

import android.graphics.drawable.PictureDrawable;
import bn.r;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.DivVideoSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivPreloader.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DivPreloader {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Callback NO_CALLBACK = new Callback() { // from class: ag.e
        @Override // com.yandex.div.core.DivPreloader.Callback
        public final void finish(boolean z10) {
            DivPreloader.NO_CALLBACK$lambda$0(z10);
        }
    };

    @NotNull
    private final DivCustomContainerViewAdapter customContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    @Nullable
    private final DivImagePreloader imagePreloader;

    @NotNull
    private final PreloadFilter preloadFilter;

    @NotNull
    private final DivPlayerPreloader videoPreloader;

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface Callback {
        void finish(boolean z10);
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Callback getNO_CALLBACK$div_release() {
            return DivPreloader.NO_CALLBACK;
        }
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public static final class DownloadCallback extends DivImageDownloadCallback {

        @NotNull
        private final Callback callback;
        private int downloadsLeftCount;
        private int failures;
        private boolean started;

        public DownloadCallback(@NotNull Callback callback) {
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void done() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$done$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.downloadsLeftCount--;
                        if (this.this$0.downloadsLeftCount == 0 && this.this$0.started) {
                            this.this$0.callback.finish(this.this$0.failures != 0);
                        }
                    }
                });
                return;
            }
            this.downloadsLeftCount--;
            if (this.downloadsLeftCount == 0 && this.started) {
                this.callback.finish(this.failures != 0);
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onError() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onError$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.failures++;
                        this.this$0.done();
                    }
                });
            } else {
                this.failures++;
                done();
            }
        }

        public final void onFullPreloadStarted() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onFullPreloadStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.started = true;
                        if (this.this$0.downloadsLeftCount == 0) {
                            this.this$0.callback.finish(this.this$0.failures != 0);
                        }
                    }
                });
                return;
            }
            this.started = true;
            if (this.downloadsLeftCount == 0) {
                this.callback.finish(this.failures != 0);
            }
        }

        public final void onSingleLoadingStarted() {
            if (UiThreadHandler.isMainThread()) {
                this.downloadsLeftCount++;
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onSingleLoadingStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.downloadsLeftCount++;
                    }
                });
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            done();
        }
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface PreloadFilter {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        @NotNull
        public static final PreloadFilter ONLY_PRELOAD_REQUIRED_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$ONLY_PRELOAD_REQUIRED_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull DivBackground divBackground, @NotNull ExpressionResolver expressionResolver) {
                if (divBackground instanceof DivBackground.b) {
                    return ((DivBackground.b) divBackground).c().f55736f.evaluate(expressionResolver).booleanValue();
                }
                return false;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
                if (!(div instanceof Div.q)) {
                    if (div instanceof Div.r) {
                        return ((Div.r) div).c().A.evaluate(expressionResolver).booleanValue();
                    }
                    if (div instanceof Div.g) {
                        return ((Div.g) div).c().H.evaluate(expressionResolver).booleanValue();
                    }
                    if (div instanceof Div.e) {
                        return ((Div.e) div).c().E.evaluate(expressionResolver).booleanValue();
                    }
                    return false;
                }
                List<DivText.Image> list = ((Div.q) div).c().F;
                if (list == null || list.isEmpty()) {
                    return false;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((DivText.Image) it.next()).f57669e.evaluate(expressionResolver).booleanValue()) {
                        return true;
                    }
                }
                return false;
            }
        };

        @NotNull
        public static final PreloadFilter PRELOAD_ALL_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$PRELOAD_ALL_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull DivBackground divBackground, @NotNull ExpressionResolver expressionResolver) {
                return true;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
                return true;
            }
        };

        /* JADX INFO: compiled from: DivPreloader.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        boolean shouldPreloadBackground(@NotNull DivBackground divBackground, @NotNull ExpressionResolver expressionResolver);

        boolean shouldPreloadContent(@NotNull Div div, @NotNull ExpressionResolver expressionResolver);
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface PreloadReference {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: DivPreloader.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final PreloadReference EMPTY = new PreloadReference() { // from class: ag.f
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public final void cancel() {
                    DivPreloader.PreloadReference.Companion.EMPTY$lambda$0();
                }
            };

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EMPTY$lambda$0() {
            }

            @NotNull
            public final PreloadReference getEMPTY() {
                return EMPTY;
            }
        }

        void cancel();
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public final class PreloadVisitor extends DivVisitor<r> {

        @NotNull
        private final Callback callback;

        @NotNull
        private final DownloadCallback downloadCallback;

        @NotNull
        private final PreloadFilter preloadFilter;

        @NotNull
        private final ExpressionResolver resolver;

        @NotNull
        private final TicketImpl ticket = new TicketImpl();

        public PreloadVisitor(@NotNull DownloadCallback downloadCallback, @NotNull Callback callback, @NotNull ExpressionResolver expressionResolver, @NotNull PreloadFilter preloadFilter) {
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r defaultVisit(Div div, ExpressionResolver expressionResolver) {
            defaultVisit2(div, expressionResolver);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
            List<LoadReference> listPreloadImage;
            DivImagePreloader divImagePreloader = DivPreloader.this.imagePreloader;
            if (divImagePreloader != null && (listPreloadImage = divImagePreloader.preloadImage(div, expressionResolver, this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = listPreloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivPreloader.this.extensionController.preprocessExtensions(div.b(), expressionResolver);
        }

        @NotNull
        public final Ticket preload(@NotNull Div div) {
            visit(div, this.resolver);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.b bVar, ExpressionResolver expressionResolver) {
            visit2(bVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.d dVar, ExpressionResolver expressionResolver) {
            visit2(dVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.j jVar, ExpressionResolver expressionResolver) {
            visit2(jVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.n nVar, ExpressionResolver expressionResolver) {
            visit2(nVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.p pVar, ExpressionResolver expressionResolver) {
            visit2(pVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.r rVar, ExpressionResolver expressionResolver) {
            visit2(rVar, expressionResolver);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.b bVar, @NotNull ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(bVar.c(), expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Div) bVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.c cVar, @NotNull ExpressionResolver expressionResolver) {
            List<Div> list = cVar.c().f55026q;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    visit((Div) it.next(), expressionResolver);
                }
            }
            this.ticket.addReference(DivPreloader.this.customContainerViewAdapter.preload(cVar.c(), this.callback));
            defaultVisit2((Div) cVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.d dVar, @NotNull ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(dVar.c(), expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Div) dVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.f fVar, @NotNull ExpressionResolver expressionResolver) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(fVar.c()).iterator();
            while (it.hasNext()) {
                visit((Div) it.next(), expressionResolver);
            }
            defaultVisit2((Div) fVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.j jVar, @NotNull ExpressionResolver expressionResolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(jVar.c(), expressionResolver)) {
                visit(divItemBuilderResult.component1(), divItemBuilderResult.component2());
            }
            defaultVisit2((Div) jVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.n nVar, @NotNull ExpressionResolver expressionResolver) {
            Iterator<T> it = nVar.c().I.iterator();
            while (it.hasNext()) {
                Div div = ((DivState.State) it.next()).f57194c;
                if (div != null) {
                    visit(div, expressionResolver);
                }
            }
            defaultVisit2((Div) nVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.p pVar, @NotNull ExpressionResolver expressionResolver) {
            Iterator<T> it = pVar.c().f57409q.iterator();
            while (it.hasNext()) {
                visit(((DivTabs.Item) it.next()).f57421a, expressionResolver);
            }
            defaultVisit2((Div) pVar, expressionResolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.r rVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) rVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(rVar, expressionResolver)) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = rVar.c().Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DivVideoSource) it.next()).f58183d.evaluate(expressionResolver));
                }
                this.ticket.addReference(DivPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public interface Ticket {
        void cancel();
    }

    /* JADX INFO: compiled from: DivPreloader.kt */
    public static final class TicketImpl implements Ticket {

        @NotNull
        private final List<PreloadReference> refs = new ArrayList();

        private final PreloadReference toPreloadReference(final LoadReference loadReference) {
            return new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public void cancel() {
                    loadReference.cancel();
                }
            };
        }

        public final void addImageReference(@NotNull LoadReference loadReference) {
            this.refs.add(toPreloadReference(loadReference));
        }

        public final void addReference(@NotNull PreloadReference preloadReference) {
            this.refs.add(preloadReference);
        }

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }
    }

    public DivPreloader(@Nullable DivImagePreloader divImagePreloader, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull DivPlayerPreloader divPlayerPreloader, @NotNull PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z10) {
    }

    @NotNull
    public Ticket preload(@NotNull Div div, @NotNull ExpressionResolver expressionResolver, @NotNull Callback callback) {
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        Ticket ticketPreload = new PreloadVisitor(downloadCallback, callback, expressionResolver, this.preloadFilter).preload(div);
        downloadCallback.onFullPreloadStarted();
        return ticketPreload;
    }
}
