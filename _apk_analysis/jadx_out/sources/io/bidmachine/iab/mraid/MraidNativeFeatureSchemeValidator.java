package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MraidNativeFeatureSchemeValidator {

    @NonNull
    public static final String SCHEME_CALENDAR = "calendar";

    @NonNull
    public static final String SCHEME_SMS = "sms";

    @NonNull
    public static final String SCHEME_STORE_PICTURE = "storePicture";

    @NonNull
    public static final String SCHEME_TEL = "tel";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MraidNativeFeatureManager f69258a;

    public MraidNativeFeatureSchemeValidator(MraidNativeFeatureManager mraidNativeFeatureManager) {
        this.f69258a = mraidNativeFeatureManager;
    }

    public boolean a(String str) {
        if (str == null) {
            return true;
        }
        if (str.startsWith("sms")) {
            return this.f69258a.isSmsFeatureAvailable();
        }
        if (str.startsWith("tel")) {
            return this.f69258a.isTelFeatureAvailable();
        }
        if (str.startsWith("calendar")) {
            return this.f69258a.isCalendarFeatureAvailable();
        }
        if (str.startsWith("storePicture")) {
            return this.f69258a.isStorePictureFeatureAvailable();
        }
        return true;
    }
}
