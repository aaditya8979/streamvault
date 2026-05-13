package io.bidmachine.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;

/* JADX INFO: loaded from: classes2.dex */
public class IabUtils {

    @NonNull
    private static final CacheControl DEFAULT_CACHE_CONTROL = CacheControl.FullLoad;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod;

        static {
            int[] iArr = new int[CreativeLoadingMethod.values().length];
            $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod = iArr;
            try {
                iArr[CreativeLoadingMethod.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod[CreativeLoadingMethod.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.bidmachine.utils.BMError mapError(@androidx.annotation.NonNull io.bidmachine.iab.IabError r3) {
        /*
            int r0 = r3.getCode()
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L19
            r1 = 6
            if (r0 == r1) goto L16
            r1 = 7
            if (r0 == r1) goto L1c
            io.bidmachine.utils.BMError r1 = io.bidmachine.utils.BMError.InternalUnknownError
            goto L21
        L16:
            io.bidmachine.utils.BMError r1 = io.bidmachine.utils.BMError.Expired
            goto L21
        L19:
            io.bidmachine.utils.BMError r1 = io.bidmachine.utils.BMError.PlaceholderTimeout
            goto L21
        L1c:
            io.bidmachine.utils.BMError r1 = io.bidmachine.utils.BMError.NoFill
            goto L21
        L1f:
            io.bidmachine.utils.BMError r1 = io.bidmachine.utils.BMError.NoConnection
        L21:
            io.bidmachine.utils.BMError r2 = new io.bidmachine.utils.BMError
            java.lang.String r3 = r3.getMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.utils.IabUtils.mapError(io.bidmachine.iab.IabError):io.bidmachine.utils.BMError");
    }

    @NonNull
    public static CacheControl toCacheControl(@Nullable Object obj) {
        if (obj == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        if (obj instanceof CacheControl) {
            return (CacheControl) obj;
        }
        CreativeLoadingMethod creativeLoadingMethodValueOf = null;
        if (obj instanceof CreativeLoadingMethod) {
            creativeLoadingMethodValueOf = (CreativeLoadingMethod) obj;
        } else if (obj instanceof String) {
            try {
                creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf((String) obj);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (creativeLoadingMethodValueOf == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        int i10 = a.$SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod[creativeLoadingMethodValueOf.ordinal()];
        return i10 != 1 ? i10 != 2 ? DEFAULT_CACHE_CONTROL : CacheControl.PartialLoad : CacheControl.Stream;
    }

    @Nullable
    public static IabElementStyle transform(@Nullable AdExtension.ControlAsset controlAsset) {
        if (controlAsset == null) {
            return null;
        }
        try {
            IabElementStyle iabElementStyle = new IabElementStyle();
            iabElementStyle.setMargin(controlAsset.getMargin());
            iabElementStyle.setPadding(controlAsset.getPadding());
            iabElementStyle.setContent(controlAsset.getContent());
            iabElementStyle.setFillColor(Utils.safeParseColor(controlAsset.getFill()));
            iabElementStyle.setFontStyle(Integer.valueOf(controlAsset.getFontStyle()));
            iabElementStyle.setWidth(Integer.valueOf(controlAsset.getWidth()));
            iabElementStyle.setHeight(Integer.valueOf(controlAsset.getHeight()));
            iabElementStyle.setHideAfter(Float.valueOf(controlAsset.getHideafter()));
            iabElementStyle.setHorizontalPosition(Utils.parseHorizontalPosition(controlAsset.getX()));
            iabElementStyle.setVerticalPosition(Utils.parseVerticalPosition(controlAsset.getY()));
            iabElementStyle.setOpacity(Float.valueOf(controlAsset.getOpacity()));
            iabElementStyle.setOutlined(Boolean.valueOf(controlAsset.getOutlined()));
            iabElementStyle.setStrokeColor(Utils.safeParseColor(controlAsset.getStroke()));
            iabElementStyle.setStrokeWidth(Float.valueOf(controlAsset.getStrokeWidth()));
            iabElementStyle.setStyle(controlAsset.getStyle());
            iabElementStyle.setVisible(Boolean.valueOf(controlAsset.getVisible()));
            return iabElementStyle;
        } catch (Exception unused) {
            return null;
        }
    }
}
