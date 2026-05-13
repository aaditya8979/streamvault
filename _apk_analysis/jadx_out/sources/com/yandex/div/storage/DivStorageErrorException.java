package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivStorageErrorException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivStorageErrorException extends StorageException {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: DivStorageErrorException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String getMessage(java.lang.String r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                if (r4 == 0) goto L1d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = " Card id: "
                r3.append(r1)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                if (r3 != 0) goto L1f
            L1d:
                java.lang.String r3 = ""
            L1f:
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.storage.DivStorageErrorException.Companion.getMessage(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public DivStorageErrorException() {
        this(null, null, null, 7, null);
    }

    public DivStorageErrorException(@NotNull String str, @Nullable Throwable th2, @Nullable String str2) {
        super(Companion.getMessage(str, str2), th2, str2);
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th2, String str2, int i10, i iVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str2);
    }
}
