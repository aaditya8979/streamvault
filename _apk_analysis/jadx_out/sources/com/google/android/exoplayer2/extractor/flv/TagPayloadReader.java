package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import i6.b0;
import s7.a0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f21558a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(b0 b0Var) {
        this.f21558a = b0Var;
    }

    public final boolean a(a0 a0Var, long j10) throws ParserException {
        return b(a0Var) && c(a0Var, j10);
    }

    public abstract boolean b(a0 a0Var) throws ParserException;

    public abstract boolean c(a0 a0Var, long j10) throws ParserException;
}
