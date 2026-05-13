package com.trello.rxlifecycle2.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("No instances.");
    }

    public static <T> T checkNotNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
