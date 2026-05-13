package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes5.dex */
public class InneractiveVideoError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Error f16258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f16259b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        Error(String str, boolean z10) {
            this.errorString = str;
            this.isFatal = z10;
        }

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f16258a = error;
    }

    public InneractiveVideoError(Error error, Throwable th2) {
        this(error);
        this.f16259b = th2;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f16259b == null) {
            return this.f16258a.getErrorString();
        }
        return this.f16258a.getErrorString() + ": " + this.f16259b;
    }

    public Throwable getCause() {
        return this.f16259b;
    }

    public Error getPlayerError() {
        return this.f16258a;
    }
}
