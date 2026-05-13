package nj;

import io.bidmachine.media3.extractor.BinarySearchSeeker;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.FlacFrameReader;
import io.bidmachine.media3.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends BinarySearchSeeker {

    /* JADX INFO: renamed from: nj.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class C0899b implements BinarySearchSeeker.TimestampSeeker {
        private final FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        private C0899b(FlacStreamMetadata flacStreamMetadata, int i10) {
            this.flacStreamMetadata = flacStreamMetadata;
            this.frameStartMarker = i10;
            this.sampleNumberHolder = new FlacFrameReader.SampleNumberHolder();
        }

        private long findNextFrame(ExtractorInput extractorInput) throws IOException {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() < extractorInput.getLength() - 6) {
                return this.sampleNumberHolder.sampleNumber;
            }
            extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
            return this.flacStreamMetadata.totalSamples;
        }

        @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public /* bridge */ /* synthetic */ void onSeekFinished() {
            super.onSeekFinished();
        }

        @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j10) throws IOException {
            long position = extractorInput.getPosition();
            long jFindNextFrame = findNextFrame(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(Math.max(6, this.flacStreamMetadata.minFrameSize));
            long jFindNextFrame2 = findNextFrame(extractorInput);
            return (jFindNextFrame > j10 || jFindNextFrame2 <= j10) ? jFindNextFrame2 <= j10 ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(jFindNextFrame2, extractorInput.getPeekPosition()) : BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jFindNextFrame, position) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final FlacStreamMetadata flacStreamMetadata, int i10, long j10, long j11) {
        super(new BinarySearchSeeker.SeekTimestampConverter() { // from class: nj.a
            @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j12) {
                return flacStreamMetadata.getSampleNumber(j12);
            }
        }, new C0899b(flacStreamMetadata, i10), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j10, j11, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
