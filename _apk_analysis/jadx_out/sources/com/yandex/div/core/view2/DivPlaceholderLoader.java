package com.yandex.div.core.view2;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import bn.r;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: DivPlaceholderLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivPlaceholderLoader {

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final Div2ImageStubProvider imageStubProvider;

    public DivPlaceholderLoader(@NotNull Div2ImageStubProvider div2ImageStubProvider, @NotNull ExecutorService executorService) {
        this.imageStubProvider = div2ImageStubProvider;
        this.executorService = executorService;
    }

    private Future<?> decodeBase64(String str, boolean z10, l<? super ImageRepresentation, r> lVar) {
        DecodeBase64ImageTask decodeBase64ImageTask = new DecodeBase64ImageTask(str, z10, lVar);
        if (!z10) {
            return this.executorService.submit(decodeBase64ImageTask);
        }
        decodeBase64ImageTask.run();
        return null;
    }

    private void enqueueDecoding(String str, final LoadableImage loadableImage, boolean z10, final l<? super ImageRepresentation, r> lVar) {
        Future<?> loadingTask = loadableImage.getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        Future<?> futureDecodeBase64 = decodeBase64(str, z10, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$enqueueDecoding$future$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ImageRepresentation imageRepresentation) {
                lVar.invoke(imageRepresentation);
                loadableImage.cleanLoadingTask();
            }
        });
        if (futureDecodeBase64 != null) {
            loadableImage.saveLoadingTask(futureDecodeBase64);
        }
    }

    @MainThread
    public void applyPlaceholder(@NotNull LoadableImage loadableImage, @NotNull final ErrorCollector errorCollector, @Nullable String str, final int i10, boolean z10, @NotNull final l<? super Drawable, r> lVar, @NotNull final l<? super ImageRepresentation, r> lVar2) {
        r rVar;
        if (str != null) {
            enqueueDecoding(str, loadableImage, z10, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$applyPlaceholder$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(ImageRepresentation imageRepresentation) {
                    invoke2(imageRepresentation);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable ImageRepresentation imageRepresentation) {
                    if (imageRepresentation != null) {
                        lVar2.invoke(imageRepresentation);
                    } else {
                        errorCollector.logWarning(new Throwable("Preview doesn't contain base64 image"));
                        lVar.invoke(this.imageStubProvider.getImageStubDrawable(i10));
                    }
                }
            });
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            lVar.invoke(this.imageStubProvider.getImageStubDrawable(i10));
        }
    }
}
