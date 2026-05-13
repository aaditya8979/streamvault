package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.mp3.Mp3Extractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@UnstableApi
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    @Nullable
    private Extractor extractor;

    @Nullable
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$init$0(Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(io.bidmachine.media3.common.DataReader r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, io.bidmachine.media3.extractor.ExtractorOutput r15) throws java.io.IOException {
        /*
            r7 = this;
            io.bidmachine.media3.extractor.DefaultExtractorInput r6 = new io.bidmachine.media3.extractor.DefaultExtractorInput
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.extractorInput = r6
            io.bidmachine.media3.extractor.Extractor r8 = r7.extractor
            if (r8 == 0) goto L10
            return
        L10:
            io.bidmachine.media3.extractor.ExtractorsFactory r8 = r7.extractorsFactory
            io.bidmachine.media3.extractor.Extractor[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            com.google.common.collect.ImmutableList$a r10 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r10)
            int r13 = r8.length
            r14 = 0
            r0 = 1
            if (r13 != r0) goto L25
            r8 = r8[r14]
            r7.extractor = r8
            goto L80
        L25:
            int r13 = r8.length
            r1 = r14
        L27:
            if (r1 >= r13) goto L7c
            r2 = r8[r1]
            boolean r3 = r2.sniff(r6)     // Catch: java.lang.Throwable -> L4e java.io.EOFException -> L63
            if (r3 == 0) goto L3a
            r7.extractor = r2     // Catch: java.lang.Throwable -> L4e java.io.EOFException -> L63
            io.bidmachine.media3.common.util.Assertions.checkState(r0)
            r6.resetPeekPosition()
            goto L7c
        L3a:
            java.util.List r2 = r2.getSniffFailureDetails()     // Catch: java.lang.Throwable -> L4e java.io.EOFException -> L63
            r10.k(r2)     // Catch: java.lang.Throwable -> L4e java.io.EOFException -> L63
            io.bidmachine.media3.extractor.Extractor r2 = r7.extractor
            if (r2 != 0) goto L72
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L70
            goto L72
        L4e:
            r8 = move-exception
            io.bidmachine.media3.extractor.Extractor r9 = r7.extractor
            if (r9 != 0) goto L5b
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L5c
        L5b:
            r14 = r0
        L5c:
            io.bidmachine.media3.common.util.Assertions.checkState(r14)
            r6.resetPeekPosition()
            throw r8
        L63:
            io.bidmachine.media3.extractor.Extractor r2 = r7.extractor
            if (r2 != 0) goto L72
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L70
            goto L72
        L70:
            r2 = r14
            goto L73
        L72:
            r2 = r0
        L73:
            io.bidmachine.media3.common.util.Assertions.checkState(r2)
            r6.resetPeekPosition()
            int r1 = r1 + 1
            goto L27
        L7c:
            io.bidmachine.media3.extractor.Extractor r11 = r7.extractor
            if (r11 == 0) goto L86
        L80:
            io.bidmachine.media3.extractor.Extractor r8 = r7.extractor
            r8.init(r15)
            return
        L86:
            io.bidmachine.media3.exoplayer.source.UnrecognizedInputFormatException r11 = new io.bidmachine.media3.exoplayer.source.UnrecognizedInputFormatException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            y7.f r13 = y7.f.g(r13)
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.copyOf(r8)
            aj.a r14 = new aj.a
            r14.<init>()
            java.util.List r8 = com.google.common.collect.Lists.m(r8, r14)
            java.lang.String r8 = r13.d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = io.bidmachine.media3.common.util.Assertions.checkNotNull(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            com.google.common.collect.ImmutableList r10 = r10.m()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.source.BundledExtractorsAdapter.init(io.bidmachine.media3.common.DataReader, android.net.Uri, java.util.Map, long, long, io.bidmachine.media3.extractor.ExtractorOutput):void");
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        return ((Extractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), positionHolder);
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j10, long j11) {
        ((Extractor) Assertions.checkNotNull(this.extractor)).seek(j10, j11);
    }
}
