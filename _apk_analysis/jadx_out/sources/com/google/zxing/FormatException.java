package com.google.zxing;

/* JADX INFO: loaded from: classes12.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FormatException f23646b;

    static {
        FormatException formatException = new FormatException();
        f23646b = formatException;
        formatException.setStackTrace(ReaderException.NO_TRACE);
    }

    private FormatException() {
    }

    public FormatException(Throwable th2) {
        super(th2);
    }

    public static FormatException getFormatInstance() {
        return ReaderException.isStackTrace ? new FormatException() : f23646b;
    }

    public static FormatException getFormatInstance(Throwable th2) {
        return ReaderException.isStackTrace ? new FormatException(th2) : f23646b;
    }
}
