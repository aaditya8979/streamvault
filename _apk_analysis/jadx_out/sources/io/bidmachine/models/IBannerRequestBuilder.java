package io.bidmachine.models;

import androidx.annotation.NonNull;
import io.bidmachine.banner.BannerSize;

/* JADX INFO: loaded from: classes4.dex */
public interface IBannerRequestBuilder<SelfType> {
    SelfType setSize(@NonNull BannerSize bannerSize);
}
