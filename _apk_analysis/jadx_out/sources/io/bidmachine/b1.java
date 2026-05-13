package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.App;

/* JADX INFO: compiled from: AppReleaseParams.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b1 {
    @NonNull
    private Context.App.Release buildReleaseInfo(@NonNull android.content.Context context) {
        BuildInfo buildInfoObtain = BuildInfo.obtain(context);
        Context.App.Release.Builder builderNewBuilder = Context.App.Release.newBuilder();
        builderNewBuilder.setType(getBuildType(buildInfoObtain));
        String sha1Signature = buildInfoObtain.getSha1Signature(context);
        if (!TextUtils.isEmpty(sha1Signature)) {
            builderNewBuilder.setSignatureSHA1(sha1Signature);
        }
        String sha256Signature = buildInfoObtain.getSha256Signature(context);
        if (!TextUtils.isEmpty(sha256Signature)) {
            builderNewBuilder.setSignatureSHA256(sha256Signature);
        }
        return builderNewBuilder.build();
    }

    @NonNull
    private String getBuildType(@NonNull BuildInfo buildInfo) {
        return buildInfo.isDebuggable() ? "debug" : "release";
    }

    public void build(@NonNull android.content.Context context, @NonNull Context.App.Builder builder) {
        builder.setRelease(buildReleaseInfo(context));
    }

    public void build(@NonNull android.content.Context context, @NonNull App.Builder builder) {
        builder.setRelease(buildReleaseInfo(context));
    }
}
