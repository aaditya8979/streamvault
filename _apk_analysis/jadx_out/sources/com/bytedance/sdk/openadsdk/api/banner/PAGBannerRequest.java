package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes8.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize ouw;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.ouw = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.ouw;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.ouw = pAGBannerSize;
    }
}
