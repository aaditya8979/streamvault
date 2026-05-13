package com.google.zxing;

/* JADX INFO: loaded from: classes8.dex */
public final class NotFoundException extends ReaderException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NotFoundException f23647b;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f23647b = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return f23647b;
    }
}
