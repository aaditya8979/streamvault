package yh;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.IabUtils;

/* JADX INFO: compiled from: MraidParams.java */
/* JADX INFO: loaded from: classes4.dex */
public class m extends UnifiedParams {

    @NonNull
    public final CacheControl cacheControl;

    @Nullable
    public final IabElementStyle closeableViewStyle;

    @Nullable
    public final IabElementStyle countDownStyle;

    @Nullable
    public final String creativeAdm;
    public final int height;
    public final boolean omsdkEnabled;
    public final float placeholderTimeoutSec;
    public final int progressDuration;

    @Nullable
    public final IabElementStyle progressStyle;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final boolean f97871r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public final boolean f97872r2;
    public final int skipOffset;

    @Nullable
    public final String storeUrl;
    public final boolean useNativeClose;
    public final int width;

    public m(@NonNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.creativeAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_CREATIVE_ADM);
        this.width = unifiedMediationParams.getInteger("width");
        this.height = unifiedMediationParams.getInteger("height");
        this.cacheControl = IabUtils.toCacheControl(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_CACHE_CONTROL));
        this.placeholderTimeoutSec = unifiedMediationParams.getFloat(UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC);
        this.skipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_SKIP_OFFSET);
        this.useNativeClose = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_USE_NATIVE_CLOSE);
        this.omsdkEnabled = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_OM_SDK_ENABLED, true);
        this.f97871r1 = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_R1);
        this.f97872r2 = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_R2);
        this.storeUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_STORE_URL);
        this.progressDuration = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_PROGRESS_DURATION);
        Object objectOrNull = unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_CLOSE_BUTTON_CONTROL_ASSET);
        this.closeableViewStyle = objectOrNull instanceof AdExtension.ControlAsset ? IabUtils.transform((AdExtension.ControlAsset) objectOrNull) : null;
        Object objectOrNull2 = unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_COUNTDOWN_CONTROL_ASSET);
        this.countDownStyle = objectOrNull2 instanceof AdExtension.ControlAsset ? IabUtils.transform((AdExtension.ControlAsset) objectOrNull2) : null;
        Object objectOrNull3 = unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_PROGRESS_CONTROL_ASSET);
        this.progressStyle = objectOrNull3 instanceof AdExtension.ControlAsset ? IabUtils.transform((AdExtension.ControlAsset) objectOrNull3) : null;
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.creativeAdm)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(UnifiedMediationParams.KEY_CREATIVE_ADM));
            return false;
        }
        if (this.width == 0) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("width"));
            return false;
        }
        if (this.height != 0) {
            return true;
        }
        unifiedAdCallback.onAdLoadFailed(BMError.notFound("height"));
        return false;
    }
}
