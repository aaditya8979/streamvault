package com.google.android.exoplayer.extractor.flv;

import a6.t;
import com.google.android.exoplayer.ParserException;
import k4.u;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f20136a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(u uVar) {
        this.f20136a = uVar;
    }

    public final boolean a(t tVar, long j10) throws ParserException {
        return b(tVar) && c(tVar, j10);
    }

    public abstract boolean b(t tVar) throws ParserException;

    public abstract boolean c(t tVar, long j10) throws ParserException;
}
