package com.yandex.div.svg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.PictureDrawable;
import bn.r;
import bo.a0;
import bo.d0;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import hn.c;
import in.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import on.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.h0;
import p000do.i;
import p000do.l0;
import p000do.w0;
import sn.p;

/* JADX INFO: compiled from: SvgDivImageLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SvgDivImageLoader implements DivImageLoader {

    @NotNull
    private final Context context;

    @NotNull
    private final OkHttpClient httpClient = new OkHttpClient.Builder().build();

    @NotNull
    private final l0 coroutineScope = d.b();

    @NotNull
    private final SvgDecoder svgDecoder = new SvgDecoder(false, 1, null);

    @NotNull
    private final SvgCacheManager svgCacheManager = new SvgCacheManager();

    /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2, reason: invalid class name */
    /* JADX INFO: compiled from: SvgDivImageLoader.kt */
    @jn.d(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {36}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ Call $call;
        public final /* synthetic */ DivImageDownloadCallback $callback;
        public final /* synthetic */ String $imageUrl;
        public int label;
        public final /* synthetic */ SvgDivImageLoader this$0;

        /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: SvgDivImageLoader.kt */
        @jn.d(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super PictureDrawable>, Object> {
            public final /* synthetic */ Call $call;
            public final /* synthetic */ String $imageUrl;
            public int label;
            public final /* synthetic */ SvgDivImageLoader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Call call, SvgDivImageLoader svgDivImageLoader, String str, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$call = call;
                this.this$0 = svgDivImageLoader;
                this.$imageUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super PictureDrawable> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                PictureDrawable pictureDrawableDecode;
                a.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Call call = this.$call;
                byte[] imageData = call == null ? this.this$0.getImageData(this.$imageUrl) : this.this$0.downloadImage(call);
                if (imageData == null || (pictureDrawableDecode = this.this$0.svgDecoder.decode(new ByteArrayInputStream(imageData))) == null) {
                    return null;
                }
                this.this$0.svgCacheManager.set(this.$imageUrl, pictureDrawableDecode);
                return pictureDrawableDecode;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DivImageDownloadCallback divImageDownloadCallback, Call call, SvgDivImageLoader svgDivImageLoader, String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$callback = divImageDownloadCallback;
            this.$call = call;
            this.this$0 = svgDivImageLoader;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass2(this.$callback, this.$call, this.this$0, this.$imageUrl, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            r rVar = null;
            if (i10 == 0) {
                kotlin.c.b(obj);
                h0 h0VarB = w0.b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, null);
                this.label = 1;
                obj = g.g(h0VarB, anonymousClass1, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            PictureDrawable pictureDrawable = (PictureDrawable) obj;
            if (pictureDrawable != null) {
                this.$callback.onSuccess(pictureDrawable);
                rVar = r.f5635a;
            }
            if (rVar == null) {
                this.$callback.onError();
            }
            return r.f5635a;
        }
    }

    public SvgDivImageLoader(@NotNull Context context) {
        this.context = context;
    }

    private final Call createCallOrNull(String str) {
        if (!a0.W(str, "http://", false, 2, null) && !a0.W(str, "https://", false, 2, null)) {
            return null;
        }
        return this.httpClient.newCall(new Request.Builder().url(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] downloadImage(Call call) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            ResponseBody responseBodyBody = call.execute().body();
            objM7534constructorimpl = Result.m7534constructorimpl(responseBodyBody != null ? responseBodyBody.bytes() : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return (byte[]) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getImageData(String str) throws IOException {
        AssetManager assets;
        InputStream inputStreamOpen;
        String strL0 = d0.L0(str, "file:///android_asset/");
        Context applicationContext = this.context.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null || (inputStreamOpen = assets.open(strL0)) == null) {
            return null;
        }
        try {
            byte[] bArrC = on.a.c(inputStreamOpen);
            b.a(inputStreamOpen, null);
            return bArrC;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1(Call call) {
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String str, @NotNull DivImageDownloadCallback divImageDownloadCallback) {
        final Call callCreateCallOrNull = createCallOrNull(str);
        PictureDrawable pictureDrawable = this.svgCacheManager.get(str);
        if (pictureDrawable != null) {
            divImageDownloadCallback.onSuccess(pictureDrawable);
            return new LoadReference() { // from class: zg.b
                @Override // com.yandex.div.core.images.LoadReference
                public final void cancel() {
                    SvgDivImageLoader.loadImage$lambda$0();
                }
            };
        }
        i.d(this.coroutineScope, null, null, new AnonymousClass2(divImageDownloadCallback, callCreateCallOrNull, this, str, null), 3, null);
        return new LoadReference() { // from class: zg.c
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$1(callCreateCallOrNull);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull final String str, @NotNull final DivImageDownloadCallback divImageDownloadCallback) {
        return new LoadReference() { // from class: zg.a
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                this.f98274a.loadImage(str, divImageDownloadCallback);
            }
        };
    }
}
