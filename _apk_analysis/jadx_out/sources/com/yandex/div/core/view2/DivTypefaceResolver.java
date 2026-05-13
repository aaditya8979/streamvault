package com.yandex.div.core.view2;

import com.yandex.div.core.font.DivTypefaceProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTypefaceResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
public class DivTypefaceResolver {

    @NotNull
    private final DivTypefaceProvider defaultTypeface;

    @NotNull
    private final Map<String, DivTypefaceProvider> typefaceProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTypefaceResolver(@NotNull Map<String, ? extends DivTypefaceProvider> map, @NotNull DivTypefaceProvider divTypefaceProvider) {
        this.typefaceProviders = map;
        this.defaultTypeface = divTypefaceProvider;
    }

    @NotNull
    public DivTypefaceProvider getTypefaceProvider(@Nullable String str) {
        DivTypefaceProvider divTypefaceProvider;
        return (str == null || (divTypefaceProvider = this.typefaceProviders.get(str)) == null) ? this.defaultTypeface : divTypefaceProvider;
    }
}
