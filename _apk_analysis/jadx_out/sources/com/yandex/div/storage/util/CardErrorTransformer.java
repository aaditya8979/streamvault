package com.yandex.div.storage.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CardErrorTransformer.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface CardErrorTransformer {

    /* JADX INFO: compiled from: CardErrorTransformer.kt */
    public static final class Composite implements CardErrorTransformer {

        @NotNull
        private final CardErrorTransformer[] transformers;

        public Composite(@NotNull CardErrorTransformer... cardErrorTransformerArr) {
            this.transformers = cardErrorTransformerArr;
        }
    }
}
