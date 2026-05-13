package com.yandex.div.core;

import android.net.Uri;
import com.yandex.div.core.images.LoadReference;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivRequestExecutor.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface DivRequestExecutor {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public interface Callback {
    }

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public static final class Header {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public Header(@NotNull String str, @NotNull String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    /* JADX INFO: compiled from: DivRequestExecutor.kt */
    public static final class Request {

        @NotNull
        private final String body;

        @Nullable
        private final List<Header> headers;

        @NotNull
        private final String method;

        @NotNull
        private final Uri url;

        public Request(@NotNull Uri uri, @NotNull String str, @Nullable List<Header> list, @NotNull String str2) {
            this.url = uri;
            this.method = str;
            this.headers = list;
            this.body = str2;
        }
    }

    @NotNull
    LoadReference execute(@NotNull Request request, @Nullable Callback callback);
}
