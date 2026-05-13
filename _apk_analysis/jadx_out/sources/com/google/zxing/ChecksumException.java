package com.google.zxing;

/* JADX INFO: loaded from: classes11.dex */
public final class ChecksumException extends ReaderException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ChecksumException f23643b;

    static {
        ChecksumException checksumException = new ChecksumException();
        f23643b = checksumException;
        checksumException.setStackTrace(ReaderException.NO_TRACE);
    }

    private ChecksumException() {
    }

    public ChecksumException(Throwable th2) {
        super(th2);
    }

    public static ChecksumException getChecksumInstance() {
        return ReaderException.isStackTrace ? new ChecksumException() : f23643b;
    }

    public static ChecksumException getChecksumInstance(Throwable th2) {
        return ReaderException.isStackTrace ? new ChecksumException(th2) : f23643b;
    }
}
