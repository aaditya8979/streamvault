package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
        this.width = i11;
        this.height = i12;
        this.bitdepthLuma = i13;
        this.bitdepthChroma = i14;
        this.colorSpace = i15;
        this.colorRange = i16;
        this.colorTransfer = i17;
        this.pixelWidthHeightRatio = f10;
        this.maxNumReorderPics = i18;
        this.codecs = str;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        int i10;
        int i11;
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < unsignedByte2; i14++) {
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i15 = 0; i15 < unsignedShort; i15++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i13 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String strBuildHevcCodecString = null;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = 0;
            int i25 = 0;
            while (i24 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i26 = i12;
                while (i26 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i27 = unsignedByte2;
                    System.arraycopy(bArr2, i12, bArr, i25, bArr2.length);
                    int length = i25 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i26 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        int i28 = h265SpsNalUnit.width;
                        i17 = h265SpsNalUnit.height;
                        i18 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i19 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i29 = h265SpsNalUnit.colorSpace;
                        int i30 = h265SpsNalUnit.colorRange;
                        int i31 = h265SpsNalUnit.colorTransfer;
                        float f11 = h265SpsNalUnit.pixelWidthHeightRatio;
                        int i32 = h265SpsNalUnit.maxNumReorderPics;
                        i10 = unsignedByte3;
                        i11 = unsignedShort3;
                        i16 = i28;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                        i21 = i30;
                        i20 = i29;
                        i23 = i32;
                        f10 = f11;
                        i22 = i31;
                    } else {
                        i10 = unsignedByte3;
                        i11 = unsignedShort3;
                    }
                    i25 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i26++;
                    unsignedByte2 = i27;
                    unsignedByte3 = i10;
                    unsignedShort3 = i11;
                    i12 = 0;
                }
                i24++;
                i12 = 0;
            }
            return new HevcConfig(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), unsignedByte + 1, i16, i17, i18, i19, i20, i21, i22, f10, i23, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e10);
        }
    }
}
