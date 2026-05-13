package io.bidmachine.displays.mapper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bo.c;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeAssetPosition;
import io.bidmachine.LabelData;
import io.bidmachine.PositionData;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: LabelDataMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/bidmachine/displays/mapper/LabelDataMapper;", "", "positionDataMapper", "Lio/bidmachine/displays/mapper/PositionDataMapper;", "(Lio/bidmachine/displays/mapper/PositionDataMapper;)V", "map", "Lio/bidmachine/LabelData;", "data", "Lcom/explorestack/protobuf/adcom/Ad$Display$Native$Asset$LabelAsset;", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LabelDataMapper {

    @NotNull
    private final PositionDataMapper positionDataMapper;

    public LabelDataMapper(@NotNull PositionDataMapper positionDataMapper) {
        p.k(positionDataMapper, "positionDataMapper");
        this.positionDataMapper = positionDataMapper;
    }

    @Nullable
    public final LabelData map(@NotNull Ad.Display.Native.Asset.LabelAsset data) {
        p.k(data, "data");
        try {
            PositionDataMapper positionDataMapper = this.positionDataMapper;
            NativeAssetPosition pos = data.getPos();
            p.j(pos, "data.pos");
            PositionData map = positionDataMapper.map(pos);
            if (map == null) {
                return null;
            }
            String content = data.getContent();
            p.j(content, "data.content");
            byte[] bytes = content.getBytes(c.f5639b);
            p.j(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDecodeBase64$default = UtilsKt.decodeBase64$default(bytes, 0, 1, (Object) null);
            if (bArrDecodeBase64$default == null) {
                return null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecodeBase64$default, 0, bArrDecodeBase64$default.length);
            float w10 = data.getW();
            float h10 = data.getH();
            p.j(bitmapDecodeByteArray, "image");
            return new LabelData(w10, h10, bitmapDecodeByteArray, map);
        } catch (Throwable unused) {
            return null;
        }
    }
}
