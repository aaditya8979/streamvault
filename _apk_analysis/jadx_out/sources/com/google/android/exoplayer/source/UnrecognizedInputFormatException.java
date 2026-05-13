package com.google.android.exoplayer.source;

import android.net.Uri;
import com.google.android.exoplayer.ParserException;

/* JADX INFO: loaded from: classes6.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str);
        this.uri = uri;
    }
}
