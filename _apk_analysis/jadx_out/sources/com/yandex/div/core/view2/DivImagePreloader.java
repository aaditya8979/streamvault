package com.yandex.div.core.view2;

import bn.r;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivImagePreloader.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DivImagePreloader {

    @NotNull
    private final DivImageLoader imageLoader;

    /* JADX INFO: compiled from: DivImagePreloader.kt */
    public final class PreloadVisitor extends DivVisitor<r> {

        @NotNull
        private final DivPreloader.DownloadCallback callback;

        @NotNull
        private final DivPreloader.PreloadFilter preloadFilter;

        @NotNull
        private final ArrayList<LoadReference> references = new ArrayList<>();

        @NotNull
        private final ExpressionResolver resolver;
        private final boolean visitContainers;

        public PreloadVisitor(@NotNull DivPreloader.DownloadCallback downloadCallback, @NotNull ExpressionResolver expressionResolver, @NotNull DivPreloader.PreloadFilter preloadFilter, boolean z10) {
            this.callback = downloadCallback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
            this.visitContainers = z10;
        }

        private final void visitBackground(Div div, ExpressionResolver expressionResolver) {
            List<DivBackground> background = div.b().getBackground();
            if (background != null) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                for (DivBackground divBackground : background) {
                    if ((divBackground instanceof DivBackground.b) && this.preloadFilter.shouldPreloadBackground(divBackground, expressionResolver)) {
                        divImagePreloader.preloadImage(((DivBackground.b) divBackground).c().f55735e.evaluate(expressionResolver).toString(), this.callback, this.references);
                    }
                }
            }
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r defaultVisit(Div div, ExpressionResolver expressionResolver) {
            defaultVisit2(div, expressionResolver);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
            visitBackground(div, expressionResolver);
        }

        @NotNull
        public final List<LoadReference> preload(@NotNull Div div) {
            visit(div, this.resolver);
            return this.references;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.b bVar, ExpressionResolver expressionResolver) {
            visit2(bVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.d dVar, ExpressionResolver expressionResolver) {
            visit2(dVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
            return r.f5635a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ r visit(Div.g gVar, ExpressionResolver expressionResolver) {
            visit2(gVar, expressionResolver);
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
        public /* bridge */ /* synthetic */ r visit(Div.q qVar, ExpressionResolver expressionResolver) {
            visit2(qVar, expressionResolver);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.b bVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) bVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(bVar.c(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.d dVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) dVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(dVar.c(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.e eVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) eVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(eVar, expressionResolver)) {
                DivImagePreloader.this.preloadImageBytes(eVar.c().f55527u.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.f fVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) fVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(fVar.c()).iterator();
                while (it.hasNext()) {
                    visit((Div) it.next(), expressionResolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.g gVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) gVar, expressionResolver);
            if (this.preloadFilter.shouldPreloadContent(gVar, expressionResolver)) {
                DivImagePreloader.this.preloadImage(gVar.c().B.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.j jVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) jVar, expressionResolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(jVar.c(), expressionResolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.n nVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) nVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = nVar.c().I.iterator();
                while (it.hasNext()) {
                    Div div = ((DivState.State) it.next()).f57194c;
                    if (div != null) {
                        visit(div, expressionResolver);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.p pVar, @NotNull ExpressionResolver expressionResolver) {
            defaultVisit2((Div) pVar, expressionResolver);
            if (this.visitContainers) {
                Iterator<T> it = pVar.c().f57409q.iterator();
                while (it.hasNext()) {
                    visit(((DivTabs.Item) it.next()).f57421a, expressionResolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(@NotNull Div.q qVar, @NotNull ExpressionResolver expressionResolver) {
            List<DivText.Image> list;
            defaultVisit2((Div) qVar, expressionResolver);
            if (!this.preloadFilter.shouldPreloadContent(qVar, expressionResolver) || (list = qVar.c().F) == null) {
                return;
            }
            DivImagePreloader divImagePreloader = DivImagePreloader.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divImagePreloader.preloadImage(((DivText.Image) it.next()).f57673i.evaluate(expressionResolver).toString(), this.callback, this.references);
            }
        }
    }

    public DivImagePreloader(@NotNull DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImage(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImage(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImageBytes(String str, DivPreloader.DownloadCallback downloadCallback, ArrayList<LoadReference> arrayList) {
        arrayList.add(this.imageLoader.loadImageBytes(str, downloadCallback, -1));
        downloadCallback.onSingleLoadingStarted();
    }

    @NotNull
    public List<LoadReference> preloadImage(@NotNull Div div, @NotNull ExpressionResolver expressionResolver, @NotNull DivPreloader.PreloadFilter preloadFilter, @NotNull DivPreloader.DownloadCallback downloadCallback) {
        return new PreloadVisitor(downloadCallback, expressionResolver, preloadFilter, false).preload(div);
    }
}
