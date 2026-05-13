package io.bidmachine.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.SystemFeatureAvailability;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MraidNativeFeatureManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f69253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f69254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f69255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f69256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f69257e;

    public MraidNativeFeatureManager(@NonNull Context context, @Nullable List<String> list) {
        SystemFeatureAvailability systemFeatureAvailability = new SystemFeatureAvailability(context);
        this.f69253a = a("sms", list) && systemFeatureAvailability.hasTelephony();
        this.f69254b = a("tel", list) && systemFeatureAvailability.hasTelephony();
        this.f69255c = a(MraidNativeFeature.FEATURE_INLINE_VIDEO, list);
        this.f69256d = a("calendar", list);
        this.f69257e = a("storePicture", list);
    }

    public MraidNativeFeatureManager(@NonNull Context context, @Nullable String[] strArr) {
        this(context, (List<String>) (strArr != null ? Arrays.asList(strArr) : null));
    }

    private boolean a(String str, List list) {
        return list != null && list.contains(str);
    }

    public boolean isCalendarFeatureAvailable() {
        return this.f69256d;
    }

    public boolean isInlineVideoFeatureAvailable() {
        return this.f69255c;
    }

    public boolean isSmsFeatureAvailable() {
        return this.f69253a;
    }

    public boolean isStorePictureFeatureAvailable() {
        return this.f69257e;
    }

    public boolean isTelFeatureAvailable() {
        return this.f69254b;
    }
}
