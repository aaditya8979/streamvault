package o6;

import com.google.android.exoplayer2.ParserException;
import i6.l;
import java.io.IOException;

/* JADX INFO: compiled from: EbmlProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public interface b {
    void a(int i10, int i11, l lVar) throws IOException;

    void endMasterElement(int i10) throws ParserException;

    void floatElement(int i10, double d10) throws ParserException;

    int getElementType(int i10);

    void integerElement(int i10, long j10) throws ParserException;

    boolean isLevel1Element(int i10);

    void startMasterElement(int i10, long j10, long j11) throws ParserException;

    void stringElement(int i10, String str) throws ParserException;
}
