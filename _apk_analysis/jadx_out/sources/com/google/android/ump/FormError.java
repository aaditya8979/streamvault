package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes7.dex */
public class FormError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23047b;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f23046a = i10;
        this.f23047b = str;
    }

    public int getErrorCode() {
        return this.f23046a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f23047b;
    }
}
