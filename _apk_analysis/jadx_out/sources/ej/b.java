package ej;

import io.bidmachine.media3.extractor.text.SimpleSubtitleDecoder;
import io.bidmachine.media3.extractor.text.Subtitle;
import io.bidmachine.media3.extractor.text.SubtitleParser;

/* JADX INFO: compiled from: DelegatingSubtitleDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends SimpleSubtitleDecoder {
    private final SubtitleParser subtitleParser;

    public b(String str, SubtitleParser subtitleParser) {
        super(str);
        this.subtitleParser = subtitleParser;
    }

    @Override // io.bidmachine.media3.extractor.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.subtitleParser.reset();
        }
        return this.subtitleParser.parseToLegacySubtitle(bArr, 0, i10);
    }
}
