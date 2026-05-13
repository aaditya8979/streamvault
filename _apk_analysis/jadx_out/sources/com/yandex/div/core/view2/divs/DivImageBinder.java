package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import bn.r;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivFadeTransition;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivImageScale;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivImageBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivImageBinder extends DivViewBinder<Div.g, DivImage, DivImageView> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final DivPlaceholderLoader placeholderLoader;

    public DivImageBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivImageLoader divImageLoader, @NotNull DivPlaceholderLoader divPlaceholderLoader, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFiltersAndSetBitmap(final DivImageView divImageView, BindingContext bindingContext, List<? extends DivFilter> list) {
        Bitmap currentBitmapWithoutFilters$div_release = divImageView.getCurrentBitmapWithoutFilters$div_release();
        if (currentBitmapWithoutFilters$div_release == null) {
            divImageView.setImageBitmap(null);
        } else {
            BaseDivViewExtensionsKt.applyBitmapFilters(divImageView, bindingContext, currentBitmapWithoutFilters$div_release, list, new l<Bitmap, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyFiltersAndSetBitmap.1
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Bitmap bitmap) {
                    divImageView.setImageBitmap(bitmap);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyImage(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final Uri uriEvaluate = divImage.B.evaluate(expressionResolver);
        if (p.f(uriEvaluate, divImageView.getImageUrl$div_release())) {
            return false;
        }
        boolean zIsHighPriorityShow = isHighPriorityShow(expressionResolver, divImageView, divImage);
        divImageView.resetImageLoaded();
        clearTint(divImageView);
        LoadReference loadReference$div_release = divImageView.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        applyPlaceholders(divImageView, bindingContext, divImage, zIsHighPriorityShow, errorCollector);
        divImageView.setImageUrl$div_release(uriEvaluate);
        DivImageLoader divImageLoader = this.imageLoader;
        String string = uriEvaluate.toString();
        final Div2View divView = bindingContext.getDivView();
        LoadReference loadReferenceLoadImage = divImageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divImageView.setImageUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                if (!this.isVectorCompatible(divImage)) {
                    onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, uriEvaluate, null, 2, null));
                    return;
                }
                super.onSuccess(pictureDrawable);
                divImageView.setImageDrawable(pictureDrawable);
                this.applyLoadingFade(divImageView, divImage, expressionResolver, null);
                divImageView.imageLoaded();
                divImageView.invalidate();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                divImageView.setCurrentBitmapWithoutFilters$div_release(cachedBitmap.getBitmap());
                this.applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.f55717t);
                this.applyLoadingFade(divImageView, divImage, expressionResolver, cachedBitmap.getFrom());
                divImageView.imageLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                Expression<Integer> expression = divImage.P;
                divImageBinder.applyTint(divImageView2, expression != null ? expression.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
                divImageView.invalidate();
            }
        });
        bindingContext.getDivView().addLoadReference(loadReferenceLoadImage, divImageView);
        divImageView.setLoadReference$div_release(loadReferenceLoadImage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImageScale(DivImageView divImageView, DivImageScale divImageScale) {
        divImageView.setImageScale(DivUtilKt.toImageScale(divImageScale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLoadingFade(DivImageView divImageView, DivImage divImage, ExpressionResolver expressionResolver, BitmapSource bitmapSource) {
        divImageView.animate().cancel();
        DivFadeTransition divFadeTransition = divImage.f55706i;
        float fDoubleValue = (float) divImage.getAlpha().evaluate(expressionResolver).doubleValue();
        if (divFadeTransition == null || bitmapSource == BitmapSource.MEMORY) {
            divImageView.setAlpha(fDoubleValue);
            return;
        }
        long jLongValue = divFadeTransition.b().evaluate(expressionResolver).longValue();
        Interpolator androidInterpolator = DivUtilKt.getAndroidInterpolator(divFadeTransition.c().evaluate(expressionResolver));
        divImageView.setAlpha((float) divFadeTransition.f55253a.evaluate(expressionResolver).doubleValue());
        divImageView.animate().alpha(fDoubleValue).setDuration(jLongValue).setInterpolator(androidInterpolator).setStartDelay(divFadeTransition.d().evaluate(expressionResolver).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, boolean z10, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression<String> expression = divImage.K;
        divPlaceholderLoader.applyPlaceholder(divImageView, errorCollector, expression != null ? expression.evaluate(expressionResolver) : null, divImage.G.evaluate(expressionResolver).intValue(), z10, new l<Drawable, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyPlaceholders.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Drawable drawable) {
                invoke2(drawable);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Drawable drawable) {
                if (divImageView.isImageLoaded() || divImageView.isImagePreview()) {
                    return;
                }
                divImageView.setPlaceholder(drawable);
            }
        }, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyPlaceholders.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ImageRepresentation imageRepresentation) {
                if (divImageView.isImageLoaded()) {
                    return;
                }
                if (!(imageRepresentation instanceof ImageRepresentation.Bitmap)) {
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        divImageView.previewLoaded();
                        divImageView.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m7393unboximpl());
                        return;
                    }
                    return;
                }
                divImageView.setCurrentBitmapWithoutFilters$div_release(((ImageRepresentation.Bitmap) imageRepresentation).m7387unboximpl());
                this.applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.f55717t);
                divImageView.previewLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                Expression<Integer> expression2 = divImage.P;
                divImageBinder.applyTint(divImageView2, expression2 != null ? expression2.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTint(LoadableImageView loadableImageView, Integer num, DivBlendMode divBlendMode) {
        if ((loadableImageView.isImageLoaded() || loadableImageView.isImagePreview()) && num != null) {
            loadableImageView.setColorFilter(num.intValue(), DivUtilKt.toPorterDuffMode(divBlendMode));
        } else {
            clearTint(loadableImageView);
        }
    }

    private final void bindContentAlignment(final DivImageView divImageView, final DivImage divImage, DivImage divImage2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.f55712o, divImage2 != null ? divImage2.f55712o : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.f55713p, divImage2 != null ? divImage2.f55713p : null)) {
                return;
            }
        }
        applyContentAlignment(divImageView, divImage.f55712o.evaluate(expressionResolver), divImage.f55713p.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divImage.f55712o) && ExpressionsKt.isConstant(divImage.f55713p)) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyContentAlignment(divImageView, divImage.f55712o.evaluate(expressionResolver), divImage.f55713p.evaluate(expressionResolver));
            }
        };
        divImageView.addSubscription(divImage.f55712o.observe(expressionResolver, lVar));
        divImageView.addSubscription(divImage.f55713p.observe(expressionResolver, lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindFilters(final com.yandex.div.core.view2.divs.widgets.DivImageView r9, final com.yandex.div.core.view2.BindingContext r10, final com.yandex.div2.DivImage r11, com.yandex.div2.DivImage r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivImageBinder.bindFilters(com.yandex.div.core.view2.divs.widgets.DivImageView, com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivImage, com.yandex.div2.DivImage):void");
    }

    private final void bindImageScale(final DivImageView divImageView, DivImage divImage, DivImage divImage2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.N, divImage2 != null ? divImage2.N : null)) {
            return;
        }
        applyImageScale(divImageView, divImage.N.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divImage.N)) {
            return;
        }
        divImageView.addSubscription(divImage.N.observe(expressionResolver, new l<DivImageScale, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.bindImageScale.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(DivImageScale divImageScale) {
                invoke2(divImageScale);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DivImageScale divImageScale) {
                DivImageBinder.this.applyImageScale(divImageView, divImageScale);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindPreviewAndImage(final com.yandex.div.core.view2.divs.widgets.DivImageView r11, final com.yandex.div.core.view2.BindingContext r12, final com.yandex.div2.DivImage r13, com.yandex.div2.DivImage r14, final com.yandex.div.core.view2.errors.ErrorCollector r15) {
        /*
            r10 = this;
            com.yandex.div.json.expressions.Expression<android.net.Uri> r0 = r13.B
            r1 = 0
            if (r14 == 0) goto L8
            com.yandex.div.json.expressions.Expression<android.net.Uri> r2 = r14.B
            goto L9
        L8:
            r2 = r1
        L9:
            boolean r0 = com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r0, r2)
            r2 = 1
            r0 = r0 ^ r2
            com.yandex.div.json.expressions.Expression<java.lang.String> r3 = r13.K
            if (r14 == 0) goto L16
            com.yandex.div.json.expressions.Expression<java.lang.String> r4 = r14.K
            goto L17
        L16:
            r4 = r1
        L17:
            boolean r3 = com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r3, r4)
            r4 = 0
            if (r3 == 0) goto L2d
            com.yandex.div.json.expressions.Expression<java.lang.Integer> r3 = r13.G
            if (r14 == 0) goto L24
            com.yandex.div.json.expressions.Expression<java.lang.Integer> r1 = r14.G
        L24:
            boolean r14 = com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r3, r1)
            if (r14 != 0) goto L2b
            goto L2d
        L2b:
            r14 = r4
            goto L2e
        L2d:
            r14 = r2
        L2e:
            com.yandex.div.json.expressions.Expression<java.lang.String> r1 = r13.K
            boolean r1 = com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1)
            if (r1 == 0) goto L40
            com.yandex.div.json.expressions.Expression<java.lang.Integer> r1 = r13.G
            boolean r1 = com.yandex.div.json.expressions.ExpressionsKt.isConstant(r1)
            if (r1 == 0) goto L40
            r1 = r2
            goto L41
        L40:
            r1 = r4
        L41:
            boolean r3 = r11.isImageLoaded()
            if (r3 != 0) goto L4b
            if (r14 == 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = r4
        L4c:
            if (r14 == 0) goto L53
            if (r1 != 0) goto L53
            r10.observePlaceholders(r11, r12, r13, r15)
        L53:
            if (r0 == 0) goto L5e
            com.yandex.div.json.expressions.Expression<android.net.Uri> r0 = r13.B
            boolean r0 = com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r0)
            if (r0 != 0) goto L5e
            r4 = r2
        L5e:
            if (r4 == 0) goto L78
            com.yandex.div.json.expressions.Expression<android.net.Uri> r0 = r13.B
            com.yandex.div.json.expressions.ExpressionResolver r1 = r12.getExpressionResolver()
            com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1 r9 = new com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r15
            r3.<init>()
            com.yandex.div.core.Disposable r0 = r0.observe(r1, r9)
            r11.addSubscription(r0)
        L78:
            boolean r0 = r10.applyImage(r11, r12, r13, r15)
            r0 = r0 ^ r2
            if (r0 == 0) goto L91
            if (r14 == 0) goto L91
            com.yandex.div.json.expressions.ExpressionResolver r14 = r12.getExpressionResolver()
            boolean r4 = r10.isHighPriorityShow(r14, r11, r13)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r0.applyPlaceholders(r1, r2, r3, r4, r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivImageBinder.bindPreviewAndImage(com.yandex.div.core.view2.divs.widgets.DivImageView, com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivImage, com.yandex.div2.DivImage, com.yandex.div.core.view2.errors.ErrorCollector):void");
    }

    private final void bindTint(final DivImageView divImageView, final DivImage divImage, DivImage divImage2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.P, divImage2 != null ? divImage2.P : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.Q, divImage2 != null ? divImage2.Q : null)) {
                return;
            }
        }
        Expression<Integer> expression = divImage.P;
        applyTint(divImageView, expression != null ? expression.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(divImage.P) && ExpressionsKt.isConstant(divImage.Q)) {
            return;
        }
        l<? super Integer, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindTint$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivImageBinder divImageBinder = this.this$0;
                DivImageView divImageView2 = divImageView;
                Expression<Integer> expression2 = divImage.P;
                divImageBinder.applyTint(divImageView2, expression2 != null ? expression2.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
            }
        };
        Expression<Integer> expression2 = divImage.P;
        divImageView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
        divImageView.addSubscription(divImage.Q.observe(expressionResolver, lVar));
    }

    private final void clearTint(ImageView imageView) {
        imageView.setColorFilter((ColorFilter) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHighPriorityShow(ExpressionResolver expressionResolver, DivImageView divImageView, DivImage divImage) {
        return !divImageView.isImageLoaded() && divImage.f55721x.evaluate(expressionResolver).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVectorCompatible(DivImage divImage) {
        if (divImage.P == null) {
            List<DivFilter> list = divImage.f55717t;
            if (list == null || list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final void observePlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, final ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observePlaceholders$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                if (divImageView.isImageLoaded()) {
                    return;
                }
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                BindingContext bindingContext2 = bindingContext;
                DivImage divImage2 = divImage;
                divImageBinder.applyPlaceholders(divImageView2, bindingContext2, divImage2, divImageBinder.isHighPriorityShow(expressionResolver, divImageView2, divImage2), errorCollector);
            }
        };
        Expression<String> expression = divImage.K;
        divImageView.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        divImageView.addSubscription(divImage.G.observe(expressionResolver, lVar));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivImageView divImageView, @NotNull BindingContext bindingContext, @NotNull DivImage divImage, @Nullable DivImage divImage2) {
        BaseDivViewExtensionsKt.applyDivActions(divImageView, bindingContext, divImage.f55696b, divImage.f55700d, divImage.D, divImage.f55715r, divImage.f55723z, divImage.f55722y, divImage.J, divImage.I, divImage.f55698c, divImage.f55710m);
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(divImageView, divImage.f55707j, divImage2 != null ? divImage2.f55707j : null, expressionResolver);
        bindImageScale(divImageView, divImage, divImage2, expressionResolver);
        bindContentAlignment(divImageView, divImage, divImage2, expressionResolver);
        bindPreviewAndImage(divImageView, bindingContext, divImage, divImage2, orCreate);
        bindTint(divImageView, divImage, divImage2, expressionResolver);
        bindFilters(divImageView, bindingContext, divImage, divImage2);
    }
}
