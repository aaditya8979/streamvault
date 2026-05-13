package com.yandex.div.internal.parser;

import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: TypeHelpers.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface TypeHelper<T> {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TypeHelpers.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final <T> TypeHelper<T> from(@NotNull final T t10, @NotNull final l<Object, Boolean> lVar) {
            return new TypeHelper<T>(t10, lVar) { // from class: com.yandex.div.internal.parser.TypeHelper$Companion$from$1
                public final /* synthetic */ l<Object, Boolean> $validator;

                @NotNull
                private final T typeDefault;

                {
                    this.$validator = lVar;
                    this.typeDefault = t10;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                @NotNull
                public T getTypeDefault() {
                    return this.typeDefault;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public boolean isTypeValid(@NotNull Object obj) {
                    return this.$validator.invoke(obj).booleanValue();
                }
            };
        }
    }

    T getTypeDefault();

    boolean isTypeValid(@NotNull Object obj);
}
