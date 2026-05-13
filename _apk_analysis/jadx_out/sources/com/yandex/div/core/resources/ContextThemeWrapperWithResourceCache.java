package com.yandex.div.core.resources;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import bn.g;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: ContextThemeWrapperWithResourceCache.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ContextThemeWrapperWithResourceCache extends ContextThemeWrapper {

    @NotNull
    private final g resourceCache$delegate;

    public ContextThemeWrapperWithResourceCache(@NotNull Context context, @StyleRes int i10) {
        super(context, i10);
        this.resourceCache$delegate = b.b(new a<PrimitiveResourceCache>() { // from class: com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache$resourceCache$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final PrimitiveResourceCache invoke() {
                return new PrimitiveResourceCache(super/*androidx.appcompat.view.ContextThemeWrapper*/.getResources());
            }
        });
    }

    private final Resources getResourceCache() {
        return (Resources) this.resourceCache$delegate.getValue();
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        return getResourceCache();
    }
}
