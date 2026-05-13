package com.unity3d.ads.network.model;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpBody.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface HttpBody {

    /* JADX INFO: compiled from: HttpBody.kt */
    public static final class ByteArrayBody implements HttpBody {

        @NotNull
        private final byte[] content;

        public ByteArrayBody(@NotNull byte[] bArr) {
            p.k(bArr, "content");
            this.content = bArr;
        }

        @NotNull
        public final byte[] getContent() {
            return this.content;
        }
    }

    /* JADX INFO: compiled from: HttpBody.kt */
    public static final class EmptyBody implements HttpBody {

        @NotNull
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* JADX INFO: compiled from: HttpBody.kt */
    public static final class StringBody implements HttpBody {

        @NotNull
        private final String content;

        public StringBody(@NotNull String str) {
            p.k(str, "content");
            this.content = str;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }
    }
}
